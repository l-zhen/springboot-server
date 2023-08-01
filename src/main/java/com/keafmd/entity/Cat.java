package com.keafmd.entity;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author lz
 * @Date 2023/3/21 16:11
 * @Version 1.0
 */
@Service( "securityCheckBar" )
public class Cat extends Animal{

    public Cat(){
        System.out.println("***************CAT*************************");
    }

    @Override
    public String getName() {
        return "这是Cat！！！！！！！！！！！！！！！！！！！！";
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void play() {
        super.play();
    }
}
