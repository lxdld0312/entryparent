package com.lxd.entry.pojo;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {
    /*  uuid */
    private String uuid;
    /*  用户名 */
    private String username;
    /*  密码 */
    private String password;
    /*  昵称 */
    private String nickname;
    /*  性别 */
    private String sex;
    /* 手机 */
    private String phone;
    /* 邮箱 */
    private String email;
    /* 个性签名 */
    private String personalized;
    /*  状态 */
    private Boolean state;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPersonalized() {
        return personalized;
    }

    public void setPersonalized(String personalized) {
        this.personalized = personalized;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(uuid, user.uuid) &&
                Objects.equals(username, user.username) &&
                Objects.equals(password, user.password) &&
                Objects.equals(nickname, user.nickname) &&
                Objects.equals(sex, user.sex) &&
                Objects.equals(phone, user.phone) &&
                Objects.equals(email, user.email) &&
                Objects.equals(personalized, user.personalized) &&
                Objects.equals(state, user.state);
    }

    @Override
    public int hashCode() {

        return Objects.hash(uuid, username, password, nickname, sex, phone, email, personalized, state);
    }

    @Override
    public String toString() {
        return "User{" +
                "uuid='" + uuid + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", personalized='" + personalized + '\'' +
                ", state=" + state +
                '}';
    }
}
