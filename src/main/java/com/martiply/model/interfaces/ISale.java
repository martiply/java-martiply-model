package com.martiply.model.interfaces;

public interface ISale {

    public void setId(String id);
    public String getId();

    public void setSalePrice(float salePrice);
    public float getSalePrice();

    public void setSaleStart(long saleStart);
    public long getSaleStart();

    public void setSaleEnd(long saleEnd);
    public long getSaleEnd();

}
