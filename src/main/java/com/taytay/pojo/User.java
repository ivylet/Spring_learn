package com.taytay.pojo;


public class User {
    private Profile profile;
    private String repo;
    private String shop;

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public String getRepo() {
        return repo;
    }

    public void setRepo(String repo) {
        this.repo = repo;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    @Override
    public String toString() {
        return "User{" +
                "profile=" + profile +
                ", repo='" + repo + '\'' +
                ", shop='" + shop + '\'' +
                '}';
    }
}
