package com.test.demo;

import com.test.domain.Menu;
import com.test.service.MenuService;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext.xml")
public class DemoTest{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private MenuService menuService;

    @Test
    public void Test2(){
        System.out.println(StringUtils.isBlank(null));
        final List<Menu> allList = menuService.findAllList();
        for(Menu menu:allList){
            System.out.println(menu.getId());
        }
    }
    @Test
    public void Test(){
        final List<Menu> allMenu = jdbcTemplate.query("select * from sys_menu", new BeanPropertyRowMapper<Menu>(Menu.class));
        System.out.println(allMenu);
        System.out.println(UUID.randomUUID().toString().replace("-",""));
    }
}
