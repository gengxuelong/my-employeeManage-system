package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @auther GengXuelong
 * @mail 3349495429@qq.com
 * @Date 2022/9/26
 * @ClassName Admin
 * @verson 1.0
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {
    private int adNum;
    private String adName;
    private String pwd;
    private int sex;
    private int dep_num;
}
