package com.akisan.akicloud.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "test", description = "测试用pojo类")
public class test {
    @Schema(name = "id", description = "测试id")
    private int id;
    @Schema(name = "name",description = "测试字段")
    private String name;
}
