package com.martiply.model.implementations;

import com.martiply.model.interfaces.IImg;

import java.util.List;

public class Img implements IImg {

    private List<String> urls;

    @Override
    public List<String> getUrls() {
        return urls;
    }

    @Override
    public void setUrls(List urls) {
        this.urls = urls;
    }
}
