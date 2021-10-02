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
import model.Room;


/**
 *
 * @author MY LAPTOP
 */
public class roomDAO extends DBContext{
    public List<Room> getAllRoom() {
        List<Room> list = new ArrayList<>();
        String sql ="select * from Room";
            try {
                PreparedStatement st = connection.prepareStatement(sql);
                ResultSet rs = st.executeQuery();
                while(rs.next()){
                    list.add(new Room(rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getInt(5),
                            rs.getString(6),
                            rs.getInt(7),
                            rs.getInt(8),
                            rs.getDouble(9),
                            rs.getFloat(10),
                            rs.getInt(11),
                            rs.getInt(12)));
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        return list;
        }
    public Room getRoomByID(int id){
        String sql="select * from Room where RoomID = ?";
        try{
            PreparedStatement st= connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs= st.executeQuery();
            while(rs.next()){
                return new Room(rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getInt(5),
                            rs.getString(6),
                            rs.getInt(7),
                            rs.getInt(8),
                            rs.getDouble(9),
                            rs.getFloat(10),
                            rs.getInt(11),
                            rs.getInt(12));
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }

    public static void main(String[] args) {
        roomDAO dao = new roomDAO();
//        List<Room> list = dao.getAllAccount();
//        for (Room room : list) {
//            System.out.println(room);
//        }
        Room r = dao.getRoomByID(3);
        System.out.println(r);
    }
}
