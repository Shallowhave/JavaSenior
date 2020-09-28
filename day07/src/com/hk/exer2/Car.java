package com.hk.exer2;

import java.util.Objects;

/**
 * 创建Car类，包含name，price属性，构造器等方法，创建测试类，在main方法中创建Set接口的实现类，
 * 添加5个以上的Car对象，遍历集合元素，验证重复元素是否过滤了；如果没有过滤，实现过滤功能；
 * 把每个小车的price降10000元，再遍历，查看price是否已改变
 * @author: memory
 * @create: 2020-09-28 20:24
 */
public class Car {
    private String name;
    private double price;

    public Car() {
    }

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 &&
                Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
