package com.javatraining.elasticbeanstalk.controller;

import com.javatraining.elasticbeanstalk.dto.MenuDTO;
import com.javatraining.elasticbeanstalk.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MenuController {

    private final MenuService service;

    @GetMapping("/health")
    public String healthCheck() {
        return "cloud health check test!!";
    }

    @GetMapping("/menus/{menuCode}")
    public MenuDTO findByMenuCode(@PathVariable("menuCode") int menuCode) {

        MenuDTO resultMenu = service.findByMenuCode(menuCode);

        return resultMenu;
    }
}
