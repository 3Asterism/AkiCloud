package com.akisan.akicloud.service.Impl;

import com.akisan.akicloud.service.getTestAutoConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class getTestAutoConfigImpl implements getTestAutoConfig {
    @Value("${pattern.dateformat}")
    private String dateformat;

    @Override
    public String getAutoConfig() {
        return dateformat;
    }
}
