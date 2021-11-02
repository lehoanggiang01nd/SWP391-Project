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
        String sql= "Select top 18 * from Place";
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
                rs.getString("Picture"), rs.getInt("OwnerID"), rs.getBoolean("Status"), rs.getInt("Area"), 
                        rs.getInt("BedNumber"), rs.getDouble("Price"), rs.getFloat("Rating"), rs.getInt("PlaceID"),
                rs.getInt("TypeID")));
            }
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return list;
    }
//    public int[] numberOfBed(){
//        int[] a= new int[100];
//        String sql="select distinct BedNumber from Room ";
//        try{
//            PreparedStatement st= connection.prepareStatement(sql);
//            ResultSet rs= st.executeQuery();
//            while(rs.next()){
//                a[a.length]=rs.getInt("BedNumber");
//            }
//        }catch(SQLException e){
//            System.out.println(e);
//        }
//        return a;
//    }
//    
    public List<Room> searchRoom(String placeId, String typeId, String bedNum, String search, String orderBy){
        List<Room> list= new ArrayList<>();
        String sql="select * from Room where 1=1 ";
        if(Integer.parseInt(placeId)>0){
            sql += " and PlaceID="+placeId;
        }
        if(Integer.parseInt(typeId)>0){
            sql += " and TypeID="+typeId;
        }
        if(Integer.parseInt(bedNum)>0){
            sql += " and BedNumber="+bedNum;
        }
         if(search !=null){
            sql += " and room.Name like N'%"+search+"%'";
        }
        if(!orderBy.equalsIgnoreCase("0")){
            sql += " order by "+orderBy;
        }
        try{
            PreparedStatement st= connection.prepareStatement(sql);
            ResultSet rs= st.executeQuery();
            while(rs.next()){
                list.add(new Room(rs.getInt("RoomID"), rs.getString("Name"), rs.getString("Description"),
                rs.getString("Picture"), rs.getInt("OwnerID"), rs.getBoolean("Status"), rs.getInt("Area"), 
                        rs.getInt("BedNumber"), rs.getDouble("Price"), rs.getFloat("Rating"), rs.getInt("PlaceID"),
                rs.getInt("TypeID")));
            }
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return list;
    }
//    public ArrayList<Feedback> get3Feedback(){
//        ArrayList<Feedback> list= new ArrayList<>();
//        return list;
//    }
    public int AddPlace(String pName,String pimg){
        String sql="insert into Place\n" +
                   "  values(?,?)";
            try{
                PreparedStatement st= connection.prepareStatement(sql);
                st.setString(1, pName);
                st.setString(2, pimg);
                st.executeUpdate();
                return st.executeUpdate();
            }catch(SQLException ex){
                System.out.println(ex);
            }
            return 0;
    }
    public int AddType(String tName,String timg){
        String sql="insert into Type\n" +
                   "  values(?,?)";
            try{
                PreparedStatement st= connection.prepareStatement(sql);
                st.setString(1, tName);
                st.setString(2, timg);
                st.executeUpdate();
                return st.executeUpdate();
            }catch(SQLException ex){
                System.out.println(ex);
            }
            return 0;
    }
    public Place getPlaceById(int pid){
        String sql="Select * from Place where PlaceID=?";
        try{
            PreparedStatement st= connection.prepareStatement(sql);
            st.setInt(1, pid);
            ResultSet rs= st.executeQuery();
            while(rs.next()){
                return new Place(rs.getInt("PlaceID"), rs.getString("Place"),
                rs.getString("img"));
            }
        }catch(SQLException ex){
            System.out.print(ex);
        }
        return null;
    }
    public Type getTypeById(int tid){
        String sql="Select * from Type where TypeID = ?";
        try{
            PreparedStatement st= connection.prepareStatement(sql);
            st.setInt(1, tid);
            ResultSet rs= st.executeQuery();
            while(rs.next()){
                return new Type(rs.getInt("TypeID"), rs.getString("Type"),
                rs.getString("img"));
            }
        }catch(SQLException ex){
            System.out.print(ex);
        }
        return null;
    }
    public List<Room> getRoonPlace(int pid, String search, String sort){
        List<Room> list= new ArrayList<>();
        String sql="Select * from Room where PlaceID=?";
         if(search !=null){
            sql += " and Name like N'%"+search+"%'";
        }
        if(!sort.equalsIgnoreCase("0")){
            sql += " order by "+sort;
        }
        try{
            PreparedStatement st= connection.prepareStatement(sql);
            st.setInt(1,pid);
            ResultSet rs= st.executeQuery();
            while(rs.next()){
                list.add(new Room(rs.getInt("RoomID"), rs.getString("Name"), rs.getString("Description"),
                rs.getString("Picture"), rs.getInt("OwnerID"), rs.getBoolean("Status"), rs.getInt("Area"), 
                        rs.getInt("BedNumber"), rs.getDouble("Price"), rs.getFloat("Rating"), rs.getInt("PlaceID"),
                rs.getInt("TypeID")));
            }
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return list;
    }
    public List<Room> getRoonType(int tid, String search, String sort){
        List<Room> list= new ArrayList<>();
        String sql="Select * from Room where TypeID=?";
         if(search !=null){
            sql += " and Name like N'%"+search+"%'";
        }
        if(!sort.equalsIgnoreCase("0")){
            sql += " order by "+sort;
        }
        try{
            PreparedStatement st= connection.prepareStatement(sql);
            st.setInt(1,tid);
            ResultSet rs= st.executeQuery();
            while(rs.next()){
                list.add(new Room(rs.getInt("RoomID"), rs.getString("Name"), rs.getString("Description"),
                rs.getString("Picture"), rs.getInt("OwnerID"), rs.getBoolean("Status"), rs.getInt("Area"), 
                        rs.getInt("BedNumber"), rs.getDouble("Price"), rs.getFloat("Rating"), rs.getInt("PlaceID"),
                rs.getInt("TypeID")));
            }
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return list;
    }
    public static void main(String[] args){
        GeneralDAO db= new GeneralDAO();
      System.out.println(db.getTypeById(1).getType());
    }
}
