package com.tony.dp.builder;

/**
 * @author: Tony.Chen
 * Create Time : 2020/12/7 14:28
 * Description: 构建器对象
 */
public interface TerrainBuilder {
    TerrainBuilder buildWall();
    TerrainBuilder buildFort();
    TerrainBuilder buildMine();
    Terrain build();
}
