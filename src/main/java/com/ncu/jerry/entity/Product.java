package com.ncu.jerry.entity;

import java.io.Serializable;

/**
 * Created by Jiacheng on 2017/7/8.
 */
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;

    private long id;
    private String name;
    private long price;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
