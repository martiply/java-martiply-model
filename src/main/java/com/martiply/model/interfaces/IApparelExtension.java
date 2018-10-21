package com.martiply.model.interfaces;

public interface IApparelExtension {

    public static enum Gender {
        male,
        female,
        unisex
    }

    public static enum Age {
        children,
        adult
    }

    public static enum SizeSystem {
        US,
        UK,
        EU,
        CM,
        SML,
        ETC
    }

    public String getId();

    public String getGroupId();

    public Gender getGender();

    public Age getAge();

    public SizeSystem getSizeSystem();

    public String getSize();

    public String getColor();

    public String getMaterial();

    public String getFeature();

}
