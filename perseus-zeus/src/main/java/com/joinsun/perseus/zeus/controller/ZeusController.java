package com.joinsun.perseus.zeus.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by ZJX on 2018/2/5.
 */
@RestController
@RequestMapping(value = "zeus")
public class ZeusController {
    @RequestMapping(value = "treelist")
    public String getTreeList(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws Exception {
        return "ssss";
    }
}
