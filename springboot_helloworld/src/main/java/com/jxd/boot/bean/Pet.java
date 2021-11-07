package com.jxd.boot.bean;

/**
 * @author jxd
 * @date 2021/11/6 22:42
 */
public class Pet {
    private String name;

    public Pet() {
    }

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
