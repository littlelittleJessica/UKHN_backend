package com.UKHN.server.dto;


import java.util.HashSet;

public class LoginUserDto {

     //id
    private String id;

     //登陆名
    private String loginName;

     //昵称
    private String name;

    //登录标识
    private String token;

    //所有资源中的请求，用于后端接口拦截
    private HashSet<String> requests;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public HashSet<String> getRequests() {
        return requests;
    }

    public void setRequests(HashSet<String> requests) {
        this.requests = requests;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LoginUserDto{");
        sb.append("id='").append(id).append('\'');
        sb.append(", loginName='").append(loginName).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", token='").append(token).append('\'');
        sb.append(", requests=").append(requests);
        sb.append('}');
        return sb.toString();
    }
}
