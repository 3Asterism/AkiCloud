package com.akisan.akicloud.mapper;

import com.akisan.akicloud.entity.test;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface testMapper {
    List<test> searchAllTest();
}
