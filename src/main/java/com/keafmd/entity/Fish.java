package com.keafmd.entity;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author lz
 * @Date 2023/3/21 16:11
 * @Version 1.0
 */
@Service( "securityCheck" )
@DependsOn( { "securityCheckBar" , "securityCheckNone" } )
public class Fish extends Animal{

//    @Override
//    public String getName() {
//        return "这是Fish！！！！！！！！！！！！！！！！！！！！！！！！！！1";
//    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void play() {
        super.play();
    }
}
