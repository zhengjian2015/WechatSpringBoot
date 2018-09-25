package com.imooc.demo.service;

import com.imooc.demo.entity.Area;

import java.util.List;

public interface AreaService {
    List<Area> queryArea();

    Area getAreaById(int areaId);

    boolean addArea(Area area);

    boolean updateArea(Area area);

    boolean deleteArea(int areaId);
}
