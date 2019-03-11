package com.bluesgao.cowboy.facade.entity.user;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class UserRich implements Serializable {
    private UserVo userVo;
    private UserDegreeVo userDegreeVo;
}
