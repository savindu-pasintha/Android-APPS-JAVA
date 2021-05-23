package com.example.lolacupcake;

public class PModel {
    private String ppName;
    private int imgId;
    private String price;

    public PModel(String pName,String price, int imgID) {
        this.imgId=imgID; this.ppName=pName; this.price=price;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public String getPpName() {
        return ppName;
    }

    public void setPpName(String ppName) {
        this.ppName = ppName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
