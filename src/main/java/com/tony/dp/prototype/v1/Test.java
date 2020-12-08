package com.tony.dp.prototype.v1;

/**
 * @author: Tony.Chen
 * Create Time : 2020/12/8 10:44
 * Description: prototype模式
 * 浅克隆
 * 如果对象中有引用对象，浅克隆不会对子对象进行克隆，导致修改扩散问题。
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person();
        Person p2 = (Person) p1.clone();
        System.out.println(p2.age + " "+p2.score);
        System.out.println(p2.location);

        System.out.println(p1.location == p2.location);
        p1.location.street = "sh";
        System.out.println(p2.location);
    }

}

class Person implements Cloneable {
    int age = 8;
    int score = 100;

    Location location = new Location("bj", 22);

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Location {
    String street;
    int roomNo;

    public Location(String street, int roomNo) {
        this.street = street;
        this.roomNo = roomNo;
    }

    @Override
    public String toString() {
        return "Location{" +
                "street='" + street + '\'' +
                ", roomNo=" + roomNo +
                '}';
    }
}
