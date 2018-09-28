package com.imooc.demo.dao;

import com.imooc.demo.entity.Area;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import java.util.Date;
import java.util.List;

/*
@SpringBootTest(classes=AreaDao.class)
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@WebAppConfiguration   报错
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
public class AreaDaoTest {

    @Autowired
    private AreaDao areaDao;

    @Test
    public void queryArea1() {
        List<Area> mylist = areaDao.queryArea();
        //System.out.println("******");
        System.out.println(mylist);
        TestCase.assertEquals(1,mylist.size());
    }

    @Test
    public void queryAreaById() {
        Area area = areaDao.queryAreaById(1);
        TestCase.assertEquals("东苑",area.getAreaName());
    }

    @Test
    public void insertArea() {
        Area area = new Area();
        area.setAreaName("南苑");
        area.setPriority(1);
        int efeectNum = areaDao.insertArea(area);
        TestCase.assertEquals(1,efeectNum);
    }

    @Test
    public void updateArea() {
        Area area = new Area();
        area.setAreaName("东苑");
        area.setPriority(3);
        area.setLastEditTime(new Date());
        int efeectNum = areaDao.updateArea(area);
        TestCase.assertEquals(1,efeectNum);
    }

    @Test
    public void deleteArea() {
    }
}