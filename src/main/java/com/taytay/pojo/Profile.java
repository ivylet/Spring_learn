package com.taytay.pojo;

public class Profile {
    private int uid;
    private String nickname;

    @Override
    public String toString() {
        return "Profile{" +
                "uid=" + uid +
                ", nickname='" + nickname + '\'' +
                '}';
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
