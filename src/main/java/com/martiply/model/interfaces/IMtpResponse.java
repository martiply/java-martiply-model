package com.martiply.model.interfaces;

import java.util.List;

public interface IMtpResponse<T>  {

    public boolean isSuccess();

    public String getError();

    public IImgFormat getImgFormat();

    public List<T> getData();

}
