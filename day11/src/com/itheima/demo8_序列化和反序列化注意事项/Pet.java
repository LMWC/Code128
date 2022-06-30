package com.itheima.demo8_序列化和反序列化注意事项;

import java.io.Serializable;

public class Pet implements Serializable {
    String name;

    public Pet(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }
}
