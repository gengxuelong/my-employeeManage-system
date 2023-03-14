package com.example.demo.service;

import java.util.Map;

/**
 * @auther GengXuelong
 * @mail 3349495429@qq.com
 * @Date 2022/9/26
 * @ClassName CwaService
 * @verson 1.0
 * @Description:
 */
public interface CwaService {
    void insertCwa(Map<String, Object> cwa);

    void updateCwa(Map<String, Object> cwa);

    void updateCwaEnd(Map<String, Object> map);
}
