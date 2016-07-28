package com.example.sharaki.assi;

/**
 * Created by Sharaki on 7/28/2016.
 */
public class Post {

    /**
     * comments : 7 Comments
     * likes :  Mohamed and 15 Others
     * postImage : https://scontent-mxp1-1.xx.fbcdn.net/t31.0-8/s960x960/13002569_1540212309616544_8029862815822088515_o.jpg
     * postText : Sometimes it needs something
     * postTime : 15 minutes
     * postType : 2
     * shares : 20 Shares
     * userName : Ahmed Ali
     * userPic : https://scontent-mxp1-1.xx.fbcdn.net/v/t1.0-1/p320x320/12933086_1535637210074054_5807795911387928488_n.jpg?oh=04c9166ff9f37b9034c70c725e1b32f2&oe=5825ABC8
     */

    private String comments;
    private String likes;
    private String postImage;
    private String postText;
    private String postTime;
    private int postType;
    private String shares;
    private String userName;
    private String userPic;

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getPostImage() {
        return postImage;
    }

    public void setPostImage(String postImage) {
        this.postImage = postImage;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public String getPostTime() {
        return postTime;
    }

    public void setPostTime(String postTime) {
        this.postTime = postTime;
    }

    public int getPostType() {
        return postType;
    }

    public void setPostType(int postType) {
        this.postType = postType;
    }

    public String getShares() {
        return shares;
    }

    public void setShares(String shares) {
        this.shares = shares;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPic() {
        return userPic;
    }

    public void setUserPic(String userPic) {
        this.userPic = userPic;
    }
}
