package com.martiply.model.interfaces;

import java.util.List;

public interface MtpResponseI<T>  {

    public void setSuccess(boolean success);

    public boolean isSuccess();

    public String getError();

    public void setError(String e);

    public List<T> getData();

    public void setData(List<T> data);

}
