package com.lastma.dtos.responses;

public class ApiRespone {

    private boolean status;
    private Object data;

    public ApiRespone(Boolean status, Object data){
        this.status = status;
        this.data = data;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
