package com.test.controller.sys;

import com.test.domain.Menu;
import com.test.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("sys")
public class MenuController {
    @Autowired
    private MenuService menuService;

    @ModelAttribute("menu")
    public Menu get(){
        return new Menu();
    }

    @RequestMapping(value={"list"})
    public String list(Model model){
        final List<Menu> allList = menuService.findAllList();
        model.addAttribute("list",allList);
        return "sys/menuList";
    }
    
    @RequestMapping(value={"form"})
    public String form(Menu menu,Model model){
        System.out.println(menu);
        return "sys/menuForm";
    }

    @RequestMapping(value={"save"})
    public String save(Menu menu,Model model){
        menuService.insert(menu);
        return "redirect:/sys/list";
    }

    @RequestMapping(value={"delete"})
    public String delete(Menu menu,Model model){
        menuService.delete(menu);
        return "redirect:/sys/list";
    }

    @RequestMapping(value={"login"})
    public String login(){
        return "sys/login";
    }
}
