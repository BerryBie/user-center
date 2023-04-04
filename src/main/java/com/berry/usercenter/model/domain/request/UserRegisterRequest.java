package com.berry.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Berry
 * @version 1.0
 * 用户注册请求体
 */

@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = 4119340904331948839L;

    private String userAccount;

    private String userPassword;

    private String checkPassword;

    private String planetCode;

}
