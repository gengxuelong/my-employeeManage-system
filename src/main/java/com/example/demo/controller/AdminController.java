package com.example.demo.controller;

import com.example.demo.Entity.Admin;
import com.example.demo.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @auther GengXuelong
 * @mail 3349495429@qq.com
 * @Date 2022/9/26
 * @ClassName AdminController
 * @verson 1.0
 * @Description:
 */
@CrossOrigin
@RequestMapping("/admin")
@RestController
public class AdminController {
    @Autowired
    AdminMapper adminMapper;

    @GetMapping("/login")
    public int queryAdminList(int account, String password) {
        List<Admin> admins = adminMapper.queryAdminList();
        for (Admin admin : admins) {
            if (admin.getAdNum() == account && admin.getPwd().equals(password)) {
                return admin.getAdNum();
            }
        }
        return 0;
    }

}
