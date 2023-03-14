package com.example.demo.service.impl;

import com.example.demo.Entity.Leave;
import com.example.demo.mapper.LeaveInfoMapper;
import com.example.demo.service.LeaveInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class LeaveInfoServiceImpI implements LeaveInfoService {

    @Autowired
    LeaveInfoMapper leaveInfoMapper;

    @Override
    public List<Leave> queryLeaveInfo(int id) {
        return leaveInfoMapper.queryLeaveInfo(id);
    }

    @Override
    public void insertLeaveInfo(Map<String, Object> map) {

    }

    @Override
    public void deleteLeaveInfo(int id, Date date) {

    }

    @Override
    public List<Leave> queryLeaveCheckList(int id) {
        return leaveInfoMapper.queryLeaveCheckList(id);
    }

    @Override
    public void insertCheckInfo(String name, String desc, int type, int id, String date) {

    }
}
