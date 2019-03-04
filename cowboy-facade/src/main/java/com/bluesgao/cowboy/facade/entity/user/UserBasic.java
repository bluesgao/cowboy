package com.bluesgao.cowboy.facade.entity.user;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class UserBasic implements Serializable {
    private long id;//用户id
    private String name;//用户名称
    private String nick;//用户昵称
    private String avatar;//用户头像
    private String phone;//电话
    private String email;//邮箱
}
