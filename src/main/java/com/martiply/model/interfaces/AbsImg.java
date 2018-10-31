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

    public static String urlOf(AbsImg img, int which, Size size){
        StringBuilder sb = new StringBuilder(img.getImgHost());
        if (!img.getImgHost().endsWith("/")){
            sb.append("/");
        }
        sb.append(img.getRoot());
        sb.append("/");
        sb.append(img.getUrls().get(which));
        sb.append(size);
        sb.append(".jpg");
        return sb.toString();
    }


}
