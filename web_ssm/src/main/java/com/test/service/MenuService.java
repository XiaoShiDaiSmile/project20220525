package com.test.service;

import com.test.domain.Menu;

import java.util.List;

public interface MenuService {
    public List<Menu> findAllList();
    public int insert(Menu menu);
    public int delete(Menu menu);
}
