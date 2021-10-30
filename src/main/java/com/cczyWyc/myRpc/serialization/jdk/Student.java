package com.cczyWyc.myRpc.serialization.jdk;

import java.io.Serializable;

/**
 * student entity
 *
 * @author wangyc
 */
public class Student implements Serializable {
    /** student no */
    private int number;
    /** student name */
    private String name;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}
