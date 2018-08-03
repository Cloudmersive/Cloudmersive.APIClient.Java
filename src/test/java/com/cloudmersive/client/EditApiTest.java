package com.cloudmersive.client;

import com.cloudmersive.client.invoker.ApiClient;
import com.cloudmersive.client.model.DrawRectangleRequest;
import com.cloudmersive.client.model.DrawTextRequest;
import java.io.File;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EditApi
 */
public class EditApiTest {

    private EditApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(EditApi.class);
    }

    /**
     * Composite two images together
     *
     * Composites two input images together; a layered image onto a base image.  The first image you input is the base image.  The second image (the layered image) will be composited on top of this base image.  Supports PNG transparency.  To control padding you can include transparent pixels at the border(s) of your layered images as appropriate.
     */
    @Test
    public void editCompositeBasicTest() {
        String location = null;
        File baseImage = null;
        File layeredImage = null;
        // Object response = api.editCompositeBasic(location, baseImage, layeredImage);

        // TODO: test validations
    }
    /**
     * Draw rectangle onto an image
     *
     * Draw one or more rectangles, with customized visuals, onto an image
     */
    @Test
    public void editDrawRectangleTest() {
        DrawRectangleRequest request = null;
        // Object response = api.editDrawRectangle(request);

        // TODO: test validations
    }
    /**
     * Draw text onto an image
     *
     * Draw one or more pieces of text, with customized visuals, onto an image
     */
    @Test
    public void editDrawTextTest() {
        DrawTextRequest request = null;
        // Object response = api.editDrawText(request);

        // TODO: test validations
    }
}
