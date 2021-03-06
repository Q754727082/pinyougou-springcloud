package com.gzst.shopping.model;

/**
 * 品牌类
 */
public class Brand {
    private Integer id;
    private String name;
    private String firstChar;

    public Brand() {
    }

    public Brand(Integer id, String name, String firstChar) {
        this.id = id;
        this.name = name;
        this.firstChar = firstChar;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "id:" + id +
                ", name:'" + name + '\'' +
                ", firstChar:'" + firstChar + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstChar() {
        return firstChar;
    }

    public void setFirstChar(String firstChar) {
        this.firstChar = firstChar;
    }
}
