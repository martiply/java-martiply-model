package com.martiply.model.interfaces;

import java.util.List;

public abstract class AbsImg {

    public abstract List<String> getUrls();

    public abstract String getImgHost();

    public abstract Root getRoot();

    public static enum Size {
        x,
        h,
        m,
        l
    }

    public static enum Root {
        i,
        store
    }

    public static String itemUrl(String host, String main, Size size){
        return buildUrl(host, Root.i, main, size);
    }

    public static String storeUrl(String host, String main, Size size){ return buildUrl(host, Root.store, main, size); }

    private static String buildUrl(String host, Root root, String main, Size size) {
        StringBuilder sb = new StringBuilder(host);
        if (!host.endsWith("/")){
            sb.append("/");
        }
        sb.append(root);
        sb.append("/");
        sb.append(main);
        sb.append(size);
        sb.append(".jpg");
        return sb.toString();
    }

}
