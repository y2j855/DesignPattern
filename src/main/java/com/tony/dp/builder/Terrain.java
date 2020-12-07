package com.tony.dp.builder;

/**
 * @author: Tony.Chen
 * Create Time : 2020/12/7 14:24
 * Description: builder模式
 * 地形对象
 */
public class Terrain {
    Wall w;
    Fort f;
    Mine m;
}

/**
 * 墙
 */
class Wall {
    int x, y, w, h;

    public Wall(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
}

/**
 * 地堡
 */
class Fort {
    int x, y, w, h;

    public Fort(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
}

/**
 * 矿
 */
class Mine {
    int x, y, w, h;

    public Mine(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
}
