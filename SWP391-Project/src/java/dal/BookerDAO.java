/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Booking;
import model.Room;

/**
 *
 * @author ADMIN
 */
public class BookerDAO extends DBContext {
    public List<Booking> getAllBooking(int uid, String search,String status, String orderBy){
        List<Booking> list= new ArrayList<>();
        String sql= "select * from Booking join Room on Booking.RoomID= Room.RoomID where IDCustomer=?";
        if(search !=null){
            sql += " and room.Name like N'%"+search+"%'";
        }
        if(!status.equalsIgnoreCase("0")){
           sql += " and Booking.Status like '"+status+"'"; 
        }
        if(!orderBy.equalsIgnoreCase("0")){
            sql += " order by "+orderBy;
        }
        try{
            PreparedStatement st= connection.prepareStatement(sql);
            st.setInt(1, uid);
            ResultSet rs= st.executeQuery();
            while(rs.next()){
                Room room= new Room(rs.getInt("RoomID"), rs.getString("Name"), rs.getString("Description"),
                rs.getString("Picture"), rs.getInt("OwnerID"), rs.getBoolean("Status"), rs.getInt("Area"), 
                        rs.getInt("BedNumber"), rs.getDouble("Price"), rs.getFloat("Rating"), rs.getInt("PlaceID"),
                rs.getInt("TypeID"));
                list.add(new Booking(rs.getInt("BookingID"), rs.getInt("IDCustomer"), rs.getInt("IDOwner"),
                rs.getDate("CheckIn"), rs.getDate("CheckOut"), rs.getFloat("TotalPrice"),
                rs.getString("Status"), room));
            }
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return list;
    }
    public static void main(String[] args){
        BookerDAO db= new BookerDAO();
        System.out.println(db.getAllBooking(2, null, "0", "price desc").size());
    }
}
