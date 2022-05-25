package com.test.service.impl;

import com.test.domain.Menu;
import com.test.mapper.MenuMapper;
import com.test.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("menuSer")
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuMapper menuMapper;
    @Override
    public List<Menu> findAllList() {
        final List<Menu> allList = menuMapper.findAllList();
        return allList;
    }

    @Override
    public int insert(Menu menu) {
        menu.preInsert();
        menuMapper.insert(menu);
        return 0;
    }

    @Override
    public int delete(Menu menu) {
        menuMapper.delete(menu);
        return 0;
    }
}
