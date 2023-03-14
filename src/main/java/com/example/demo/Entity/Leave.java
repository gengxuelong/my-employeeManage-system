package com.example.demo.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @auther GengXuelong
 * @mail 3349495429@qq.com
 * @Date 2022/9/26
 * @ClassName Leave
 * @verson 1.0
 * @Description:
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Leave {
    private int epnum;
    private int l_type;
    private String l_start;
    private String l_end;
    private int l_total;
    private String l_descrip;
    private int l_mark;
    private String leave_confirm_person;
    private String leave_comfirm_descrip;
    private String apply_time;
}
