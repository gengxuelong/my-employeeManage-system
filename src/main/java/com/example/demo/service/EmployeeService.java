package com.example.demo.service;

import com.example.demo.Entity.Employee;

import java.util.List;

/**
 * @auther GengXuelong
 * @mail 3349495429@qq.com
 * @Date 2022/9/26
 * @ClassName EmployeeService
 * @verson 1.0
 * @Description:
 */
public interface EmployeeService {
    List<Employee> queryEmployeeList();

    void insertEmployee(Employee employee);

    String queryNameById(int id);

    void updateEmployeeInfo(int id, int nId, String nName, int ndNum, String nPwd, int nsNum, int nMark);

}
