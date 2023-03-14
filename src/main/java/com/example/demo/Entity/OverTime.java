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
 * @ClassName OverTime
 * @verson 1.0
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OverTime {
    private int epnum;
    private int o_type;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date o_start;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date o_end;
    private int o_total;
    private String o_descrip;
    private int o_mark;
    private String o_confirm_person;
    private String o_comfirm_descrip;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date apply_time;
    private static SimpleDateFormat simpleDateFormat;
}
