package com.keafmd.entity;

import com.keafmd.mapper.Pet;

/**
 * @Description:
 * @Author lz
 * @Date 2023/3/21 16:08
 * @Version 1.0
 */
public abstract class Animal implements Pet {
    @Override
    public String getName() {
        return "这里是animal！！！！！！！！！！！！！！！";
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void play() {

    }
}
