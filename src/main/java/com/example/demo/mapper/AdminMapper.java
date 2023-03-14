package com.example.demo.mapper;

import com.example.demo.Entity.Admin;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @auther GengXuelong
 * @mail 3349495429@qq.com
 * @Date 2022/9/26
 * @ClassName AdminMapper
 * @verson 1.0
 * @Description:
 */
@Repository
public interface AdminMapper {
    List<Admin> queryAdminList();
}
