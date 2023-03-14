package com.example.demo.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @auther GengXuelong
 * @mail 3349495429@qq.com
 * @Date 2022/9/26
 * @ClassName Employee
 * @verson 1.0
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private int epnum;
    private String ename;
    private String pwd;
    private int sex;
    private int superior_epnum;
    private int dep_num;
    private int superior_mark;

}
