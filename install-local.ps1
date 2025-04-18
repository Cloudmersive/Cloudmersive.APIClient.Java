# install-local.ps1 ----------------------------------------------------------
# Installs the newest cloudmersive-java-api-client-*.jar found in build\libs
# into your local Maven repository ( %USERPROFILE%\.m2\repository ).
# ---------------------------------------------------------------------------

Set-StrictMode -Version Latest
function Fail([string]$msg) { Write-Error $msg; exit 1 }

# 1. Script location and JAR discovery --------------------------------------
$scriptRoot = $PSScriptRoot                         # ← robust, no Split‑Path needed
$jarDir      = Join-Path $scriptRoot 'build\libs'

if (-not (Test-Path -LiteralPath $jarDir)) {
    Fail "Folder '$jarDir' not found.  Run this script from the project root."
}

$jar = Get-ChildItem -Path $jarDir -Filter 'cloudmersive-java-api-client-*.jar' |
       Sort-Object LastWriteTime -Descending |
       Select-Object -First 1

if (-not $jar) { Fail "No cloudmersive‑java‑api‑client JAR found in $jarDir." }

$JarPath    = $jar.FullName
$ArtifactId = 'cloudmersive-java-api-client'
$GroupId    = 'com.cloudmersive'

# Extract version from file name: cloudmersive-java-api-client-<ver>.jar
$regex  = [regex]::Escape($ArtifactId) + '-(?<ver>.+)\.jar$'
$match  = [regex]::Match($jar.Name, $regex)
if (-not $match.Success) { Fail "Cannot extract version from '$($jar.Name)'." }
$Version = $match.Groups['ver'].Value

# 2. Maven presence check ----------------------------------------------------
if (-not (Get-Command mvn -ErrorAction SilentlyContinue)) {
    Fail "'mvn' executable not found.  Install Maven or add it to PATH."
}

# 3. Install into local Maven cache -----------------------------------------
Write-Host "Installing ${GroupId}:${ArtifactId}:${Version} …`n"

$mvnArgs = @(
    'install:install-file',
    "-Dfile=$JarPath",
    "-DgroupId=$GroupId",
    "-DartifactId=$ArtifactId",
    "-Dversion=$Version",
    '-Dpackaging=jar'
)

& mvn @mvnArgs
$exitCode = $LASTEXITCODE

if ($exitCode -eq 0) {
    $repoPath = Join-Path "$Env:USERPROFILE\.m2\repository" `
                ((($GroupId -replace '\.', '\') + "\$ArtifactId\$Version").TrimStart('\'))
    Write-Host "`n✅  Successfully installed to:"
    Write-Host "   $repoPath"
} else {
    Fail "Maven exited with code $exitCode."
}
