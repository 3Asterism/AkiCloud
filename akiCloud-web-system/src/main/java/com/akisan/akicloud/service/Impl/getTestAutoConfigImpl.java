package com.akisan.akicloud.service.Impl;

import com.akisan.akicloud.service.getTestAutoConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Service
@RefreshScope
public class getTestAutoConfigImpl implements getTestAutoConfig {
    @Value("${pattern.dateformat}")
    private String dateformat;

    @Override
    public String getAutoConfig() {
        return dateformat;
    }
}
