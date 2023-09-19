package com.akisan.akicloud.controller;

import com.akisan.akicloud.entity.test;
import com.akisan.akicloud.service.Impl.getTestAutoConfigImpl;
import com.akisan.akicloud.service.Impl.getTestInfoImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@RequestMapping("/systemTest")
@Tag(name = "spring3+springCloud最小单元框架测试", description = "description参数测试")
public class testController {
    @Autowired
    private getTestInfoImpl getTestInfo;
    @Autowired
    private getTestAutoConfigImpl getTestAutoConfig;

    @Operation(summary = "测试查询")
    @GetMapping("test")
    public List<test> testFunction(){
        return getTestInfo.searchAllTest();
    }

    @Operation(summary = "动态获取配置测试")
    @GetMapping("now")
    public String now(){
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(getTestAutoConfig.getAutoConfig()));
    }

}
