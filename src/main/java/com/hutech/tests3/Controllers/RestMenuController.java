package com.hutech.tests3.Controllers;

import com.hutech.tests3.Entities.Menu;
import com.hutech.tests3.Services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/menu")
public class RestMenuController {
    @Autowired
    private MenuService menuService;
    @RequestMapping()
    public List<Menu> listAllMenu(){
        return menuService.getMenus();

    }
}
