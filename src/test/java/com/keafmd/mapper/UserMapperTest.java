package com.keafmd.mapper;

import com.keafmd.SpringbootServerApplication;
import com.keafmd.entity.User;
import com.keafmd.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;


/**
 * @Author lz
 * @Date 2022/3/10 16:29
 * @Version 1.0
 */
@SpringBootTest(classes = SpringbootServerApplication.class)
class UserMapperTest {

    @Resource(name = "securityCheck")
    Pet pet;

    @Test
    public void test1(){
        System.out.println( pet.getName());

    }
}