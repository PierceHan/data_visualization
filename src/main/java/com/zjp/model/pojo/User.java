package com.zjp.model.pojo;

import javax.persistence.Table;
import java.util.Date;

@Table(name = "t_user")
public class User extends BaseEntity {
    private String username;
    private String password;
    private Date createTime;
    private Date updateTime;

    @Override
    public String toString() {
        return "User{" +"id='"+super.getId()+"\'"+
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
