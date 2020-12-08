package com.tony.dp.prototype.v4;

/**
 * @author: Tony.Chen
 * Create Time : 2020/12/8 11:06
 * Description: prototype模式
 * 深克隆，String类型的引用对象是需要克隆的。
 * 比如StringBuilder，如果想做到克隆的值不会让被克隆的修改值操作影响，我们就直接传一份新值给克隆对象
 */
public class Test {
    public static void main(String[] args) throws Exception {
        Person p1 = new Person();
        Person p2 = (Person)p1.clone();
        System.out.println("p1.loc == p2.loc? " + (p1.loc == p2.loc));

        p1.loc.street.reverse();
        System.out.println(p2.loc.street);
    }

}
class Person implements Cloneable {
    int age = 8;
    int score = 100;

    Location loc = new Location(new StringBuilder("bj"), 22);

    @Override
    public Object clone() throws CloneNotSupportedException {
        Person p = (Person) super.clone();
        p.loc = (Location) loc.clone();
        return p;
    }
}

class Location implements Cloneable {
    StringBuilder street;
    int roomNo;

    @Override
    public String toString() {
        return "Location{" +
                "street='" + street + '\'' +
                ", roomNo=" + roomNo +
                '}';
    }

    public Location(StringBuilder street, int roomNo) {
        this.street = street;
        this.roomNo = roomNo;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Location l = (Location) super.clone();
        l.street = new StringBuilder(street.toString());
        return l;
    }
}
