package com.Retrofit_Rest_Api.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HitsList {
    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("pageURL")
    @Expose
    private String pageURL;

    @SerializedName("type")
    @Expose
    private String type;

    @SerializedName("tags")
    @Expose
    private String tags;

    @SerializedName("previewURL")
    @Expose
    private String previewURL;

    @SerializedName("previewWidth")
    @Expose
    private int previewWidth;

    @SerializedName("previewHeight")
    @Expose
    private int previewHeight;

    @SerializedName("webFormatURL")
    @Expose
    private String webFormatURL;

    @SerializedName("webformatWidth")
    @Expose
    private int webformatWidth;

    @SerializedName("webformatHeight")
    @Expose
    private int webformatHeight;



    @SerializedName("largeImageURL")
    @Expose
    private String largeImageURL;


    @SerializedName("imageWidth")
    @Expose
    private int imageWidth;

    @SerializedName("imageHeight")
    @Expose
    private int imageHeight;

    @SerializedName("imageSize")
    @Expose
    private int imageSize;

    @SerializedName("views")
    @Expose
    private int views;


    @SerializedName("downloads")
    @Expose
    private int downloads;

    @SerializedName("collections")
    @Expose
    private int collections;

    @SerializedName("likes")
    @Expose
    private int likes;

    @SerializedName("comments")
    @Expose
    private int comments;

    @SerializedName("user_id")
    @Expose
    private int user_id;

    @SerializedName("user")
    @Expose
    private String use;

    @SerializedName("userImageURL")
    @Expose
    private String userImageURL;

    public HitsList(int id, String pageURL, String type, String tags, String previewURL, int previewWidth, int previewHeight, String webFormatURL, int webformatWidth, int webformatHeight, String largeImageURL, int imageWidth, int imageHeight, int imageSize, int views, int downloads, int collections, int likes, int comments, int user_id, String use, String userImageURL) {
        this.id = id;
        this.pageURL = pageURL;
        this.type = type;
        this.tags = tags;
        this.previewURL = previewURL;
        this.previewWidth = previewWidth;
        this.previewHeight = previewHeight;
        this.webFormatURL = webFormatURL;
        this.webformatWidth = webformatWidth;
        this.webformatHeight = webformatHeight;
        this.largeImageURL = largeImageURL;
        this.imageWidth = imageWidth;
        this.imageHeight = imageHeight;
        this.imageSize = imageSize;
        this.views = views;
        this.downloads = downloads;
        this.collections = collections;
        this.likes = likes;
        this.comments = comments;
        this.user_id = user_id;
        this.use = use;
        this.userImageURL = userImageURL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPageURL() {
        return pageURL;
    }

    public void setPageURL(String pageURL) {
        this.pageURL = pageURL;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getPreviewURL() {
        return previewURL;
    }

    public void setPreviewURL(String previewURL) {
        this.previewURL = previewURL;
    }

    public int getPreviewWidth() {
        return previewWidth;
    }

    public void setPreviewWidth(int previewWidth) {
        this.previewWidth = previewWidth;
    }

    public int getPreviewHeight() {
        return previewHeight;
    }

    public void setPreviewHeight(int previewHeight) {
        this.previewHeight = previewHeight;
    }

    public String getWebFormatURL() {
        return webFormatURL;
    }

    public void setWebFormatURL(String webFormatURL) {
        this.webFormatURL = webFormatURL;
    }

    public int getWebformatWidth() {
        return webformatWidth;
    }

    public void setWebformatWidth(int webformatWidth) {
        this.webformatWidth = webformatWidth;
    }

    public int getWebformatHeight() {
        return webformatHeight;
    }

    public void setWebformatHeight(int webformatHeight) {
        this.webformatHeight = webformatHeight;
    }

    public String getLargeImageURL() {
        return largeImageURL;
    }

    public void setLargeImageURL(String largeImageURL) {
        this.largeImageURL = largeImageURL;
    }

    public int getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
    }

    public int getImageHeight() {
        return imageHeight;
    }

    public void setImageHeight(int imageHeight) {
        this.imageHeight = imageHeight;
    }

    public int getImageSize() {
        return imageSize;
    }

    public void setImageSize(int imageSize) {
        this.imageSize = imageSize;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getDownloads() {
        return downloads;
    }

    public void setDownloads(int downloads) {
        this.downloads = downloads;
    }

    public int getCollections() {
        return collections;
    }

    public void setCollections(int collections) {
        this.collections = collections;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public String getUserImageURL() {
        return userImageURL;
    }

    public void setUserImageURL(String userImageURL) {
        this.userImageURL = userImageURL;
    }
}
