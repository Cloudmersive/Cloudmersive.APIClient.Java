/*
 * convertapi
 * Convert API lets you effortlessly convert file formats and types.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.cloudmersive.client;

import java.io.File;
import com.cloudmersive.client.model.XmlAddAttributeWithXPathResult;
import com.cloudmersive.client.model.XmlAddChildWithXPathResult;
import com.cloudmersive.client.model.XmlFilterWithXPathResult;
import com.cloudmersive.client.model.XmlQueryWithXQueryMultiResult;
import com.cloudmersive.client.model.XmlQueryWithXQueryResult;
import com.cloudmersive.client.model.XmlRemoveAllChildrenWithXPathResult;
import com.cloudmersive.client.model.XmlRemoveWithXPathResult;
import com.cloudmersive.client.model.XmlReplaceWithXPathResult;
import com.cloudmersive.client.model.XmlSetValueWithXPathResult;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConvertDataApi
 */
@Ignore
public class ConvertDataApiTest {

    private final ConvertDataApi api = new ConvertDataApi();

    
    /**
     * Convert CSV to JSON conversion
     *
     * Convert a CSV file to a JSON object array
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void convertDataCsvToJsonTest() throws Exception {
        File inputFile = null;
        Boolean columnNamesFromFirstRow = null;
        Object response = api.convertDataCsvToJson(inputFile, columnNamesFromFirstRow);

        // TODO: test validations
    }
    
    /**
     * Convert CSV to XML conversion
     *
     * Convert a CSV file to a XML file
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void convertDataCsvToXmlTest() throws Exception {
        File inputFile = null;
        Boolean columnNamesFromFirstRow = null;
        byte[] response = api.convertDataCsvToXml(inputFile, columnNamesFromFirstRow);

        // TODO: test validations
    }
    
    /**
     * Convert JSON String to XML conversion
     *
     * Convert a JSON object into XML
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void convertDataJsonStringToXmlTest() throws Exception {
        String jsonString = null;
        Object response = api.convertDataJsonStringToXml(jsonString);

        // TODO: test validations
    }
    
    /**
     * Convert JSON Object to XML conversion
     *
     * Convert a JSON object into XML
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void convertDataJsonToXmlTest() throws Exception {
        Object jsonObject = null;
        byte[] response = api.convertDataJsonToXml(jsonObject);

        // TODO: test validations
    }
    
    /**
     * Convert Excel (97-2003) XLS to JSON conversion
     *
     * Convert an Excel (97-2003) XLS file to a JSON object array
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void convertDataXlsToJsonTest() throws Exception {
        File inputFile = null;
        Object response = api.convertDataXlsToJson(inputFile);

        // TODO: test validations
    }
    
    /**
     * Convert Excel XLSX to JSON conversion
     *
     * Convert an Excel XLSX file to a JSON object array
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void convertDataXlsxToJsonTest() throws Exception {
        File inputFile = null;
        byte[] response = api.convertDataXlsxToJson(inputFile);

        // TODO: test validations
    }
    
    /**
     * Convert Excel XLSX to XML conversion
     *
     * Convert an Excel XLSX file to a XML file
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void convertDataXlsxToXmlTest() throws Exception {
        File inputFile = null;
        byte[] response = api.convertDataXlsxToXml(inputFile);

        // TODO: test validations
    }
    
    /**
     * Adds an attribute to all XML nodes matching XPath expression
     *
     * Return the reuslts of editing an XML document by adding an attribute to all of the nodes that match an input XPath expression.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void convertDataXmlEditAddAttributeWithXPathTest() throws Exception {
        File inputFile = null;
        String xpathExpression = null;
        String xmlAttributeName = null;
        String xmlAttributeValue = null;
        XmlAddAttributeWithXPathResult response = api.convertDataXmlEditAddAttributeWithXPath(inputFile, xpathExpression, xmlAttributeName, xmlAttributeValue);

        // TODO: test validations
    }
    
    /**
     * Adds an XML node as a child to XML nodes matching XPath expression
     *
     * Return the reuslts of editing an XML document by adding an XML node as a child to all of the nodes that match an input XPath expression.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void convertDataXmlEditAddChildWithXPathTest() throws Exception {
        File inputFile = null;
        String xpathExpression = null;
        String xmlNodeToAdd = null;
        XmlAddChildWithXPathResult response = api.convertDataXmlEditAddChildWithXPath(inputFile, xpathExpression, xmlNodeToAdd);

        // TODO: test validations
    }
    
    /**
     * Removes, deletes all children of nodes matching XPath expression, but does not remove the nodes
     *
     * Return the reuslts of editing an XML document by removing all child nodes of the nodes that match an input XPath expression.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void convertDataXmlEditRemoveAllChildNodesWithXPathTest() throws Exception {
        File inputFile = null;
        String xpathExpression = null;
        XmlRemoveAllChildrenWithXPathResult response = api.convertDataXmlEditRemoveAllChildNodesWithXPath(inputFile, xpathExpression);

        // TODO: test validations
    }
    
    /**
     * Replaces XML nodes matching XPath expression with new node
     *
     * Return the reuslts of editing an XML document by replacing all of the nodes that match an input XPath expression with a new XML node expression.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void convertDataXmlEditReplaceWithXPathTest() throws Exception {
        File inputFile = null;
        String xpathExpression = null;
        String xmlNodeReplacement = null;
        XmlReplaceWithXPathResult response = api.convertDataXmlEditReplaceWithXPath(inputFile, xpathExpression, xmlNodeReplacement);

        // TODO: test validations
    }
    
    /**
     * Sets the value contents of XML nodes matching XPath expression
     *
     * Return the reuslts of editing an XML document by setting the contents of all of the nodes that match an input XPath expression.  Supports elements and attributes.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void convertDataXmlEditSetValueWithXPathTest() throws Exception {
        File inputFile = null;
        String xpathExpression = null;
        String xmlValue = null;
        XmlSetValueWithXPathResult response = api.convertDataXmlEditSetValueWithXPath(inputFile, xpathExpression, xmlValue);

        // TODO: test validations
    }
    
    /**
     * Filter, select XML nodes using XPath expression, get results
     *
     * Return the reuslts of filtering, selecting an XML document with an XPath expression
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void convertDataXmlFilterWithXPathTest() throws Exception {
        String xpathExpression = null;
        File inputFile = null;
        XmlFilterWithXPathResult response = api.convertDataXmlFilterWithXPath(xpathExpression, inputFile);

        // TODO: test validations
    }
    
    /**
     * Query an XML file using XQuery query, get results
     *
     * Return the reuslts of querying a single XML document with an XQuery expression.  Supports XQuery 3.1 and earlier.  This API is optimized for a single XML document as input.  Provided XML document is automatically loaded as the default context; to access elements in the document, simply refer to them without a document reference, such as bookstore/book
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void convertDataXmlQueryWithXQueryTest() throws Exception {
        File inputFile = null;
        String xquery = null;
        XmlQueryWithXQueryResult response = api.convertDataXmlQueryWithXQuery(inputFile, xquery);

        // TODO: test validations
    }
    
    /**
     * Query multiple XML files using XQuery query, get results
     *
     * Return the reuslts of querying an XML document with an XQuery expression.  Supports XQuery 3.1 and earlier.  This API is optimized for multiple XML documents as input.  You can refer to the contents of a given document by name, for example doc(\&quot;books.xml\&quot;) or doc(\&quot;restaurants.xml\&quot;) if you included two input files named books.xml and restaurants.xml.  If input files contain no file name, they will default to file names input1.xml, input2.xml and so on.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void convertDataXmlQueryWithXQueryMultiTest() throws Exception {
        File inputFile1 = null;
        String xquery = null;
        File inputFile2 = null;
        File inputFile3 = null;
        File inputFile4 = null;
        File inputFile5 = null;
        File inputFile6 = null;
        File inputFile7 = null;
        File inputFile8 = null;
        File inputFile9 = null;
        File inputFile10 = null;
        XmlQueryWithXQueryMultiResult response = api.convertDataXmlQueryWithXQueryMulti(inputFile1, xquery, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10);

        // TODO: test validations
    }
    
    /**
     * Remove, delete XML nodes and items matching XPath expression
     *
     * Return the reuslts of editing an XML document by removing all of the nodes that match an input XPath expression
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void convertDataXmlRemoveWithXPathTest() throws Exception {
        String xpathExpression = null;
        File inputFile = null;
        XmlRemoveWithXPathResult response = api.convertDataXmlRemoveWithXPath(xpathExpression, inputFile);

        // TODO: test validations
    }
    
    /**
     * Convert XML to JSON conversion
     *
     * Convert an XML string or file into JSON
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void convertDataXmlToJsonTest() throws Exception {
        File inputFile = null;
        Object response = api.convertDataXmlToJson(inputFile);

        // TODO: test validations
    }
    
    /**
     * Transform XML document file with XSLT into a new XML document
     *
     * Convert an XML string or file into JSON
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void convertDataXmlTransformWithXsltToXmlTest() throws Exception {
        File inputFile = null;
        File transformFile = null;
        byte[] response = api.convertDataXmlTransformWithXsltToXml(inputFile, transformFile);

        // TODO: test validations
    }
    
}
