package com.haha.controller;

//import com.haha.info.TAclMenu;
//import org.nutz.dao.Dao;
//import org.nutz.dao.util.Daos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MainSetup {
    //@Autowired
    //private Dao nutDao;

    @PostConstruct
    private void init() {
        //Daos.FORCE_WRAP_COLUMN_NAME = true;
        //Daos.createTablesInPackage(nutDao, TAclMenu.class, false);
        //Daos.migration(nutDao, TAclMenu.class.getPackage().getName(), true, false);

    }
}
