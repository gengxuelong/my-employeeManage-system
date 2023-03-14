package com.example.demo.service.impl;

import com.example.demo.mapper.CwaMapper;
import com.example.demo.service.CwaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

@Service
@Transactional
public class CwaServiceImpl implements CwaService {
    @Autowired
    private CwaMapper cwaMapper;

    @Override
    public void insertCwa(Map<String, Object> cwa) {
        cwaMapper.insertCwa(cwa);
    }

    @Override
    public void updateCwa(Map<String, Object> cwa) {
        cwaMapper.updateCwa(cwa);
    }

    @Override
    public void updateCwaEnd(Map<String, Object> map) {
        cwaMapper.updateCwaEd(map);
    }
}
