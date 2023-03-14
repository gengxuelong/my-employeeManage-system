package com.example.demo.service;

import com.example.demo.Entity.Leave;

import java.sql.Date;
import java.util.List;
import java.util.Map;

/**
 * @auther GengXuelong
 * @mail 3349495429@qq.com
 * @Date 2022/9/26
 * @ClassName LeaveInfoService
 * @verson 1.0
 * @Description:
 */
public interface LeaveInfoService {
    List<Leave> queryLeaveInfo(int id);

    void insertLeaveInfo(Map<String, Object> map);

    void deleteLeaveInfo(int id, Date date);

    List<Leave> queryLeaveCheckList(int id);

    void insertCheckInfo(String name, String desc, int type, int id, String date);
}
