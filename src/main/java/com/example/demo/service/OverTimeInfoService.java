package com.example.demo.service;

import com.example.demo.Entity.OverTime;

import java.util.List;
import java.util.Map;

/**
 * @auther GengXuelong
 * @mail 3349495429@qq.com
 * @Date 2022/9/26
 * @ClassName OverTimeService
 * @verson 1.0
 * @Description:
 */
public interface OverTimeInfoService {
    void insertOvertimeInfo(Map<String, Object> map);

    List<OverTime> queryOvertimeStatus(int id);

    List<OverTime> queryOhistory(int id);

    List<OverTime> getOvertimeCheck(int id); //获取审批表

    void updateovertime(OverTime overTime);
}
