package com.example.entity;

import org.apache.ibatis.type.Alias;

@Alias("User")
public class UserEntity {

    private Long id;
    private String username;
    private String password;
    private String nickname;
    private String createTime;

    public UserEntity() {
    }

    public UserEntity(Long id, String username, String password, String nickname, String createTime) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.createTime = createTime;
    }

    public UserEntity(String username, String password, String nickname, String createTime) {

        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.createTime = createTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
