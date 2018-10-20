package com.martiply.model.interfaces;

public interface IStore {

    public int getStoreId();

    public void setStoreId(int storeId);

    public String getName();

    public void setName(String name);

    public String getZip();

    public void setZip(String zip);

    public String getAddress();

    public void setAddress(String address);

    public String getPhone();

    public void setPhone(String phone);

    public double getLng();

    public void setLng(double lng);

    public double getLat();

    public void setLat(double lat);

    public String getOpen();

    public void setOpen(String open);

    public String getClose();

    public void setClose(String close);

    public float getDistance();

    public void setDistance(float distance);

    public String getStory();

    public void setStory(String story);

    public String getCurrency();

    public void setCurrency(String currency);

    public int getTz();

    public void setTz(int tz);

    public String getCity();

    public void setCity(String city);

    public IImg getImg();

    public void setImg(IImg img);

    public String getEmail();

    public void setEmail(String email);

}
