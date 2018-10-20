package com.martiply.model.interfaces;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.martiply.model.implementations.ApparelExtension;
import org.junit.Test;

import java.lang.reflect.Type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ApparelExtensionTest  {

    @Test
    public void testGender(){

        String json = "" +
                "{\n" +
                "  \"id\": \"one\",\n" +
                "  \"gender\": \"male\",\n" +
                "  \"age\": \"children\"\n" +
                "}";

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        Type collectionType = new TypeToken<ApparelExtension>(){}.getType();
        ApparelExtension res = gson.fromJson(json, collectionType);
        assertNotEquals(res.getGender(), IApparelExtension.Gender.female);
        assertEquals(res.getGender(), IApparelExtension.Gender.male);
        assertEquals(res.getAge(), IApparelExtension.Age.children);
    }
}
