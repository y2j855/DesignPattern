package com.tony.dp.builder;

/**
 * @author: Tony.Chen
 * Create Time : 2020/12/7 14:34
 * Description:
 */
public class Person {
    int id;
    String name;
    int age;
    double weight;
    int score;
    Location location;

    private Person(){}

    public static class PersonBuilder{
        Person p = new Person();
        public PersonBuilder basicInfo(int id,String name,int age){
            p.id = id;
            p.name = name;
            p.age = age;
            return this;
        }

        public PersonBuilder weight(double weight){
            p.weight = weight;
            return this;
        }

        public PersonBuilder score(int score){
            p.score = score;
            return this;
        }

        public PersonBuilder location(String street,String roomNo){
            p.location = new Location(street,roomNo);
            return this;
        }

        public Person build(){
            return p;
        }

    }
}

class Location{
    String street;
    String roomNo;

    public Location(String street, String roomNo) {
        this.street = street;
        this.roomNo = roomNo;
    }
}
