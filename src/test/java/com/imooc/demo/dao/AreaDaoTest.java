package com.imooc.demo.dao;

import com.imooc.demo.entity.Area;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

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
    public void queryArea() {
        List<Area> list = areaDao.queryArea();
        System.out.println("******");
        System.out.println(list);
    }
}