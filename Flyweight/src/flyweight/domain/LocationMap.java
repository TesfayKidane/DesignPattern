/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight.domain;

/**
 *
 * @author Tesfay
 */
public class LocationMap {
    
    private String city;
    private String url;
    private java.awt.Image cityMap;
    private int xPos;
    private int yPos;

    public java.awt.Image getCityMap() {
        return cityMap;
    }

    public void setCityMap(java.awt.Image cityMap) {
        this.cityMap = cityMap;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    @Override
    public String toString() {
        return "Image{" + "city=" + city + ", url=" + url + ", xPos=" + xPos + ", yPos=" + yPos + '}';
    }
    
    
    
}
