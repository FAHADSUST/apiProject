/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author fahad_000
 */
public class AppData {
    int id;
    String appName;
    String appLink;
    String appImgUrl;

    public AppData(int id, String appName, String appLink, String appImgUrl) {
        this.id = id;
        this.appName = appName;
        this.appLink = appLink;
        this.appImgUrl = appImgUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppLink() {
        return appLink;
    }

    public void setAppLink(String appLink) {
        this.appLink = appLink;
    }

    public String getAppImgUrl() {
        return appImgUrl;
    }

    public void setAppImgUrl(String appImgUrl) {
        this.appImgUrl = appImgUrl;
    }
    
    
}
