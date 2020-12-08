package com.tony.dp.prototype.v2;

/**
 * @author: Tony.Chen
 * Create Time : 2020/12/8 10:50
 * Description:
 * 深克隆
 * 解决了v1版本，子对象是引用对象，修改值导致扩散问题。
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person();
        Person p2 = (Person) p1.clone();
        System.out.println(p2.age + " " + p2.score);
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
        Person p = (Person) super.clone();
        p.location = (Location) location.clone();
        return p;
    }
}

class Location implements Cloneable{
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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
