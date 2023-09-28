package com.perhitungan.barang_API.model.response;

import java.util.List;

public class ResponseList<T> {
    public String status;
    public String errorCode;
    public String errrorMesage;
    public List<T> data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorcode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrrorMesage() {
        return errrorMesage;
    }

    public void setErrrormesage(String errrorMesage) {
        this.errrorMesage = errrorMesage;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
