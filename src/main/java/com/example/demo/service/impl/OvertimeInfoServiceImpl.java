package com.example.demo.service.impl;

import com.example.demo.Entity.OverTime;
import com.example.demo.mapper.OvertimeInfoMapper;
import com.example.demo.service.OverTimeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class OvertimeInfoServiceImpl implements OverTimeInfoService {
    @Autowired
    private OvertimeInfoMapper overtimeInfoMapper;

    @Override
    public void insertOvertimeInfo(Map<String, Object> map) {

    }

    @Override
    public List<OverTime> queryOvertimeStatus(int id) {
        List<OverTime> overTimes = overtimeInfoMapper.queryOvertimeStatus(id);
        return overTimes;
    }

    @Override
    public List<OverTime> queryOhistory(int id) {
        List<OverTime> overTimes = overtimeInfoMapper.queryOhistory(id);
        return overTimes;
    }

    @Override
    public List<OverTime> getOvertimeCheck(int id) {
        List<OverTime> overTimes = overtimeInfoMapper.getOvertimeCheck(id);
        return overTimes;
    }

    @Override
    public void updateovertime(OverTime overTime) {
        overtimeInfoMapper.updateovertime(overTime);
        return;
    }


}
