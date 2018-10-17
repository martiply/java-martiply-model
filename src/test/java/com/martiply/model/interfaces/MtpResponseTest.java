package com.martiply.model.interfaces;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.martiply.model.implementations.Img;
import com.martiply.model.implementations.MtpResponse;
import com.martiply.model.implementations.Store;
import org.junit.Test;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class MtpResponseTest {

    @Test
    public void testDataSerialize() {
        Store store1 = new Store();
        store1.setStoreId(1);
        store1.setName("one");
        List<String> urls1 = new ArrayList<>();
        urls1.add("www.1");
        urls1.add("www.2");
        Img img1 = new Img();
        img1.setUrls(urls1);
        store1.setImg(img1);

        Store store2 = new Store();
        store2.setStoreId(2);
        store2.setName("two");
        List<String> urls2 = new ArrayList<>();
        urls2.add("www.4");
        urls2.add("www.5");
        Img img2 = new Img();
        img2.setUrls(urls2);
        store2.setImg(img2);

        MtpResponse<Store> res = new MtpResponse<>();
        List<Store> stores = new ArrayList<>();
        stores.add(store1);
        stores.add(store2);
        res.setData(stores);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(res);

        Type collectionType = new TypeToken<MtpResponse<Store>>(){}.getType();
        MtpResponse<Store> object = gson.fromJson(json, collectionType);
        assertEquals(object.getData().size(), 2 );
        assertEquals(object.getData().get(0).getName(), "one");

    }


}
