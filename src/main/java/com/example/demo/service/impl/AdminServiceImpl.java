package com.example.demo.service.impl;

import com.example.demo.Entity.Admin;
import com.example.demo.mapper.AdminMapper;
import com.example.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @auther GengXuelong
 * @mail 3349495429@qq.com
 * @Date 2022/9/26
 * @ClassName AdminServiceImpl
 * @verson 1.0
 * @Description:
 */
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;

    @Override
    public List<Admin> queryAdminList() {
        return adminMapper.queryAdminList();
    }
}
