/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin 88
 */
public class Booking {

    private int bookingID;
    private int cusID;
    private Room room;
    private String date;
    private String checkin;
    private String checkout;
    private double total;

    public Booking() {
    }

    public Booking(int bookingID, int cusID, Room room, String date, String checkin, String checkout, double total) {
        this.bookingID = bookingID;
        this.cusID = cusID;
        this.room = room;
        this.date = date;
        this.checkin = checkin;
        this.checkout = checkout;
        this.total = total;
    }

    public Booking(int cusID, Room room, String date, String checkin, String checkout, double total) {
        this.bookingID = bookingID;
        this.cusID = cusID;
        this.room = room;
        this.date = date;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Booking(int cusID, Room room, String date, String checkin, String checkout) {
        this.bookingID = bookingID;
        this.cusID = cusID;
        this.room = room;
        this.date = date;
        this.checkin = checkin;
        this.checkout = checkout;
        this.total = total;
    }

    public Booking(Account cusid, Room roomByID, String date, String checkin, String checkout, double total) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Booking(Account cusid, Room roomByID, String date, String checkin, String checkout) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public int getCusID() {
        return cusID;
    }

    public void setCusID(int cusID) {
        this.cusID = cusID;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
