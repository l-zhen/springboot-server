package com.keafmd.mapper;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author lz
 * @Date 2023/3/21 16:07
 * @Version 1.0
 */
@Service( "securityCheck" )
@ConditionalOnMissingBean( name = "securityCheck" )
public interface Pet {

    String getName();
    void setName(String name);
    void play();
}
