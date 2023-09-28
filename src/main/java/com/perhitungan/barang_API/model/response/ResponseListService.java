package com.perhitungan.barang_API.model.response;

import javax.xml.crypto.Data;
import java.util.Date;

public class ResponseListService<T> {
    public String status;
    public String errorCode;
    public String errrorMesage;
    public T data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrrorMesage() {
        return errrorMesage;
    }

    public void setErrrorMesage(String errrorMesage) {
        this.errrorMesage = errrorMesage;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
