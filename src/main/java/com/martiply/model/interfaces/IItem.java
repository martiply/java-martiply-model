package com.martiply.model.interfaces;

public interface IItem {

    public static enum IdType {
        gtin,
        nogtin,
        custom
    }

    public static enum Category {
        product,
        culinary,
        all
    }

    public static enum Condition {
        USED,
        NEW
    }

    public String getId();

    public int getOwnerId();

    public String getIdCustom();

    public String getGtin();

    public String getDescription();

    public String getName();

    public float getPrice();

    public Category getCategory();

    public String getBrand();

    public IdType getIdType();

    public int getHits();

    public Condition getCondition();

    public IApparelExtension getApparelExtension();

    public String getUrl();

    public ISale getSale();

    public AbsImg getImg();

}
