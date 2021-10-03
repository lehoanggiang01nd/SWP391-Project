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
import model.Feedback;
import model.Place;
import model.Room;
import model.Type;

/**
 *
 * @author ADMIN
 */
public class GeneralDAO extends DBContext {

    public ArrayList<Place> getAllPlace(){
        ArrayList<Place> list= new ArrayList<>();
        String sql= "Select * from Place";
        try{
            PreparedStatement st= connection.prepareStatement(sql);
            ResultSet rs= st.executeQuery();
            while(rs.next()){
                list.add(new Place(rs.getInt("PlaceID"), rs.getString("Place"), rs.getString("img")));
            }
            return list;
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return null;
    }

    public ArrayList<Type> getAllType(){
        ArrayList<Type> list= new ArrayList<>();
        String sql= "Select * from Type";
        try{
            PreparedStatement st= connection.prepareStatement(sql);
            ResultSet rs= st.executeQuery();
            while(rs.next()){
                list.add(new Type(rs.getInt("TypeID"), rs.getString("Type"), rs.getString("img")));
            }
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return list;
    }

    
    
    public ArrayList<Room> get6Room(){
        ArrayList<Room> list= new ArrayList<>();
        String sql= "select top 6 * from Room order by Rating";
        try{
            PreparedStatement st= connection.prepareStatement(sql);
            ResultSet rs= st.executeQuery();
            while(rs.next()){
                list.add(new Room(rs.getInt("RoomID"), rs.getString("Name"), rs.getString("Description"),
                rs.getString("Picture"), rs.getInt("OwnerID"), rs.getInt("Status"), rs.getInt("Area"), 
                        rs.getInt("BedNumber"), rs.getDouble("Price"), rs.getFloat("Rating"), rs.getInt("PlaceID"),
                rs.getInt("TypeID")));
            }
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return list;
    }
    public int[] numberOfBed(){
        int[] a= new int[100];
        String sql="select distinct BedNumber from Room ";
        try{
            PreparedStatement st= connection.prepareStatement(sql);
            ResultSet rs= st.executeQuery();
            while(rs.next()){
                a[a.length]=rs.getInt("BedNumber");
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return a;
    }
    public ArrayList<Feedback> get3Feedback(){
        ArrayList<Feedback> list= new ArrayList<>();
        return list;
    }
    public static void main(String[] args){
        GeneralDAO db= new GeneralDAO();
        int[] arr=db.numberOfBed();
        System.out.println(arr[1]);
    }
}
