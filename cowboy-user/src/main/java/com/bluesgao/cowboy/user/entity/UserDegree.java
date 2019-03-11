package com.bluesgao.cowboy.user.entity;

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
