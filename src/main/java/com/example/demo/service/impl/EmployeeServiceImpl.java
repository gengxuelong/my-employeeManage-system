package com.example.demo.service.impl;

import com.example.demo.Entity.Employee;
import com.example.demo.mapper.EmployeeMapper;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @auther GengXuelong
 * @mail 3349495429@qq.com
 * @Date 2022/9/26
 * @ClassName EmployeeServiceImpl
 * @verson 1.0
 * @Description:
 */
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;

    @Override
    public List<Employee> queryEmployeeList() {
        return employeeMapper.queryEmployeeList();
    }

    @Override
    public void insertEmployee(Employee employee) {

    }

    @Override
    public String queryNameById(int id) {
        return employeeMapper.queryNameById(id);
    }

    @Override
    public void updateEmployeeInfo(int id, int nId, String nName, int ndNum, String nPwd, int nsNum, int nMark) {

    }
}
