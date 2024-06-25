package com.hutech.tests3.Controllers;

import com.hutech.tests3.Services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestMenuController {
    @Autowired
    private MenuService menuService;
}
