package com.itheima.demo3_继承的格式;

public class Teacher extends Person {
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public  void teach(){
        System.out.println("教书...");
    }
}
