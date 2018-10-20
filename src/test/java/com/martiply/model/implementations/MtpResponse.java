package com.martiply.model.implementations;

import com.martiply.model.interfaces.IMtpResponse;

import java.util.List;

public class MtpResponse<T> implements IMtpResponse {

    private List<T> data;

    @Override
    public void setSuccess(boolean success) {

    }

    @Override
    public boolean isSuccess() {
        return false;
    }

    @Override
    public String getError() {
        return null;
    }

    @Override
    public void setError(String e) {

    }

    @Override
    public List<T> getData() {
        return data;
    }

    @Override
    public void setData(List data) {
        this.data = data;
    }
}
