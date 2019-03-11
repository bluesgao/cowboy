package com.bluesgao.cowboy.facade.interfaces.user;

import com.bluesgao.cowboy.facade.entity.user.UserRich;
import com.bluesgao.cowboy.facade.entity.user.UserVo;

public interface UserService {
    UserRich login(UserVo userVo);
    UserRich register(UserVo userVo);
}
