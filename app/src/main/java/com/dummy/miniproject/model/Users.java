package com.dummy.miniproject.model;

public class Users {

    // vid 17 firebase somethin
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Users(String email, String name, String profileImage, String uid, String status) {
        this.email = email;
        this.name = name;
        this.profileImage = profileImage;
        this.uid = uid;
        this.status = status;
    }

    private String name;
    private String profileImage;
    private String uid;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String status;

    public Users(){

    }

    public Users(String email, String name, String profileImage, String uid){
        this.email = email;
        this.name = name;
        this.profileImage=profileImage;
        this.uid=uid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}