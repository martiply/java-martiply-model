package com.martiply.model.interfaces;

import java.util.List;

public abstract class AbsImg {

    public abstract List<String> getUrls();

    public abstract String getImgHost();

    public abstract Root getRoot();

    public static enum Size {
        xl,
        h,
        m,
        l
    }

    public static enum Root {
        i,
        store
    }

    public static String urlOf(AbsImg img, int which, Size size){
        return urlOf(img.getImgHost(), img.getRoot(), img.getUrls().get(which), size);
    }

    public static String urlOf(String host, Root root, String path, Size size){
        StringBuilder sb = new StringBuilder(host);
        if (!host.endsWith("/")){
            sb.append("/");
        }
        sb.append(root);
        sb.append("/");
        sb.append(path);
        sb.append(size);
        sb.append(".jpg");
        return sb.toString();
    }

}
