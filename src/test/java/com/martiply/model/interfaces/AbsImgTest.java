package com.martiply.model.interfaces;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AbsImgTest {

    @Test
    public void testUrl(){
        String itemUrl = AbsImg.itemUrl("http://storage.googleapis.com/martiply/", "01547b0bd64c2894bbf85c6450866be5/ddf46", AbsImg.Size.h);
        assertEquals(itemUrl, "http://storage.googleapis.com/martiply/i/01547b0bd64c2894bbf85c6450866be5/ddf46h.jpg");
        String storeUrl = AbsImg.storeUrl("http://storage.googleapis.com/martiply/", "1/b69ad", AbsImg.Size.h);
        assertEquals(storeUrl, "http://storage.googleapis.com/martiply/store/1/b69adh.jpg");
    }

}
