package com.example.mygmail;

public class MyModel {
    String textAvatar;
    String username;
    String message;
    String time;
    int imageStar;

    public MyModel(String username, String message, String time) {
        this.textAvatar = String.valueOf(username.charAt(0)).toUpperCase();
        this.username = username;
        this.message = message;
        this.time = time;
        this.imageStar = R.drawable.ic_baseline_star_border_24;
    }

    public String getTextAvatar() {
        return textAvatar;
    }

    public void setTextAvatar(String textAvatar) {
        this.textAvatar = textAvatar;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getImageStar() {
        return imageStar;
    }

    public void setImageStar(int imageStar) {
        this.imageStar = imageStar;
    }
}
