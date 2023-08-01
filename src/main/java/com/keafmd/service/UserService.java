package com.keafmd.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.keafmd.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author leizhen
 * @since 2022-03-09
 */
public interface UserService extends IService<User> {
    Page pageList(Page page , User user);
}
