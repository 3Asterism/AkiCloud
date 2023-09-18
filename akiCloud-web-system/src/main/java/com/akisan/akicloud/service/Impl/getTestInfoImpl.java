package com.akisan.akicloud.service.Impl;

import com.akisan.akicloud.entity.test;
import com.akisan.akicloud.mapper.testMapper;
import com.akisan.akicloud.service.getTestInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class getTestInfoImpl implements getTestInfo {
    @Autowired
    private testMapper testMapper;

    @Override
    public List<test> searchAllTest() {
        return testMapper.searchAllTest();
    }
}
