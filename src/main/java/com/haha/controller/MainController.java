package com.haha.controller;

import com.haha.info.TAclMenu;
import org.nutz.dao.Dao;
import org.nutz.json.Json;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
public class MainController {

    @Autowired
    private Dao nutDao;

    @RequestMapping(value = "/test.do",method = RequestMethod.GET)
    public String index(Model model) {
        List<TAclMenu> list= nutDao.query(TAclMenu.class,null);
        System.out.println(list);
        model.addAttribute("list",list);
        return Json.toJson(list);
    }
}