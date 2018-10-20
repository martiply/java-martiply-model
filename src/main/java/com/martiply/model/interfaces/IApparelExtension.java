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

    public void setId(String id);
    public String getId();

    public void setGroupId(String groupId);
    public String getGroupId();

    public void setGender(Gender gender);
    public Gender getGender();

    public void setAge(Age age);
    public Age getAge();

    public void setSizeSystem(SizeSystem sizeSystem);
    public SizeSystem getSizeSystem();

    public void setSize(String size);
    public String getSize();

    public void setColor(String color);
    public String getColor();

    public void setMaterial(String material);
    public String getMaterial();

    public void setFeature(String feature);
    public String getFeature();

}
