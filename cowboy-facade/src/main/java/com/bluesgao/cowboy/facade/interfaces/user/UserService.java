package com.bluesgao.cowboy.facade.interfaces.user;

import com.bluesgao.cowboy.facade.entity.user.UserRich;

public interface UserService {
    UserRich login(UserRich user);
    UserRich register(UserRich user);
}
