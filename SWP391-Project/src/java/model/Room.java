/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author MY LAPTOP
 */
public class Room {
    private int rid;
    private String rName;
    private String desc;
    private String picture;
    private int OwnerId;
    private String status;
    private int Area;
    private int bedNum;
    private double price;
    private float rating;
    private int placeId;
    private int typeId;

    public Room() {
    }

    public Room(int rid, String rName, String desc, String picture, int OwnerId, String status, int Area, int bedNum, double price, float rating, int placeId, int typeId) {
        this.rid = rid;
        this.rName = rName;
        this.desc = desc;
        this.picture = picture;
        this.OwnerId = OwnerId;
        this.status = status;
        this.Area = Area;
        this.bedNum = bedNum;
        this.price = price;
        this.rating = rating;
        this.placeId = placeId;
        this.typeId = typeId;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public int getOwnerId() {
        return OwnerId;
    }

    public void setOwnerId(int OwnerId) {
        this.OwnerId = OwnerId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getArea() {
        return Area;
    }

    public void setArea(int Area) {
        this.Area = Area;
    }

    public int getBedNum() {
        return bedNum;
    }

    public void setBedNum(int bedNum) {
        this.bedNum = bedNum;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double Price) {
        this.price = Price;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getPlaceId() {
        return placeId;
    }

    public void setPlaceId(int placeId) {
        this.placeId = placeId;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    @Override
    public String toString() {
        return "Room{" + "rid=" + rid + ", rName=" + rName + ", desc=" + desc + ", picture=" + picture + ", OwnerId=" + OwnerId + ", status=" + status + ", Area=" + Area + ", bedNum=" + bedNum + ", Price=" + price + ", rating=" + rating + ", placeId=" + placeId + ", typeId=" + typeId + '}';
    }
    
    
}
