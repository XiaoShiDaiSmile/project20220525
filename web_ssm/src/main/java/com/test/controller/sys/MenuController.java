package com.test.controller.sys;

import com.test.domain.Menu;
import com.test.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("sys")
public class MenuController {
    @Autowired
    private MenuService menuService;

    @RequestMapping(value={"list"})
    public String list(Model model){
        final List<Menu> allList = menuService.findAllList();
        model.addAttribute("list",allList);
        return "sys/menuList";
    }
}
