package com.example.kadeem.recyclertest;

/**
 * Created by Kadeem on 10/6/2017.
 */

public class Dataclass {

    private String dataName;

    public Dataclass(String[] imgUrlList) {
        this.imgUrlList = imgUrlList;
    }

    private String[] imgUrlList;


    public String[] getImgUrlList() {
        return imgUrlList;
    }

    public void setImgUrlList(String[] imgUrlList) {
        this.imgUrlList = imgUrlList;
    }


    public String getDataName() {
        return dataName;
    }

    public void setDataName(String dataName) {
        this.dataName = dataName;
    }

    public Dataclass(String dataName) {
        this.dataName = dataName;
    }
}
