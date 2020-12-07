package com.tony.dp.builder;

/**
 * @author: Tony.Chen
 * Create Time : 2020/12/7 14:32
 * Description:
 */
public class Main {
    public static void main(String[] args) {
        TerrainBuilder builder = new ComplexTerrainBuilder();
        Terrain t = builder.buildWall().buildFort().buildMine().build();

        Person p = new Person.PersonBuilder()
                .basicInfo(1,"zhangsan",18)
//                .score(20)
                .weight(200)
//                .location("bj","123")
                .build();


    }
}
