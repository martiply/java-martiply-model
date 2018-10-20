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

    public void setId(String id);
    public String getId();

    public void setOwnerId(int ownerId);
    public int getOwnerId();

    public void setIdCustom(String idCustom);
    public String getIdCustom();

    public void setGtin(String gtin);
    public String getGrin();

    public void setDescription(String description);
    public String getDescription();

    public void setName(String name);
    public String getName();

    public void setCategory(Category category);
    public Category getCategory();

    public void setBrand(String brand);
    public String getBrand();

    public void setIdType(IdType idType);
    public IdType getIdType();

    public void setHits(int hits);
    public int getHits();

    public void setCondition(String condition);
    public String getCondition();

    public void setApparelExtension(IApparelExtension apparelExtension);
    public IApparelExtension getApparelExtension();

    public void setUrl(String url);
    public String getUrl();

    public void setSale(ISale sale);
    public ISale getSale();

    public void setImg(IImg img);
    public IImg getImg();

}
