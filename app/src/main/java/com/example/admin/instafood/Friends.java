package com.example.admin.instafood;

/**
 * Created by Sandeep on 2016-11-15.
 */

public class Friends {
    String name;
    Integer resId;

    public Friends(String name, Integer resId)
    {
        this.name = name;
        this.resId = resId;
    }

    public Integer getResId() {
        return resId;
    }

    public String getName() {
        return name;
    }
}
