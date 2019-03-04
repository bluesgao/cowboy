package com.bluesgao.cowboy.facade.entity.user;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@ToString
@Setter
@Getter
public class UserDegree implements Serializable {
    private String id;
    private int degree;
    private String degreeDesc;
}
