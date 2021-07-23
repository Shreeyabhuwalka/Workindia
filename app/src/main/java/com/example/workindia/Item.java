package com.example.workindia;

import com.google.gson.annotations.SerializedName;

public class Item {
    @SerializedName("name")
    private String name;

    @SerializedName("price")
    private String price;

    @SerializedName("extra")
    private String extra;

    public Item(String name, String price, String extra) {
        this.name = name;
        this.price = price;
        this.extra = extra;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }
}
