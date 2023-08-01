package com.keafmd.entity;

import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author lz
 * @Date 2023/3/21 16:11
 * @Version 1.0
 */
@Service( "securityCheckNone" )
public class Dog extends Animal{

    public Dog(){
        System.out.println("***************DOG*************************");

    }

    @Override
    public String getName() {
        return "这是Dog！！！！！！！！！！！！！！！！！！！！！！";
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
