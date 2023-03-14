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
 * @ClassName Cwa
 * @verson 1.0
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cwa {
    private int epNum;
    private String eName;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date work_date;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date work_start;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date work_end;
    private String work_description;
    private static SimpleDateFormat simpleDateFormat;
}
