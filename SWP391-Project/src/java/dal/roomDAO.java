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
                            rs.getBoolean(6),
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
                            rs.getBoolean(6),
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
    public int updateRoom(String rname, String desc, String owner,Boolean status, String area,String bednum,String price,String rating,String placeID,String typeID,int id){
        
            String sql="Update Room set [Name]=?,\n" +
            "  [Description]=?,\n" +
            "  [OwnerID]=?,\n" +
            "  [Status]=?,\n" +
            "  [Area]=?,\n" +
            "  [BedNumber]=?,\n" +
            "  [Price]=?,\n" +
            "  [Rating]=?,\n" +
            "  [PlaceId]=?,\n" +
            "  [TypeId] = ?\n" +
            "  where [RoomID]=?";
            try{
                PreparedStatement st= connection.prepareStatement(sql);
                st.setString(1, rname);
                st.setString(2,desc);
                st.setString(3, owner);
                st.setBoolean(4, status);
                st.setString(5, area);
                st.setString(6, bednum);
                st.setString(7, price);
                st.setString(8, rating);
                st.setString(9, placeID);
                st.setString(10, typeID);                
                st.setInt(11, id);
                return st.executeUpdate();
                
            }catch(SQLException ex){
                System.out.println(ex);
            }
            return 0;
    }

    public static void main(String[] args) {
        roomDAO dao = new roomDAO();
//        List<Room> list = dao.getAllAccount();
//        for (Room room : list) {
//            System.out.println(room);
//        }
//        dao.updateRoom("The Galaxy Home", "??V??? tr?? r???t ?????p v?? thu???n ti???n ??? qu???n C???u Gi???y\n" +
//"\n" +
//"??G???n c??ng vi??n C???u Gi???y, Lotteria, trung t??m mua s???m v???i m??i tr?????ng ngo??i tr???i y??n t??nh\n" +
//"\n" +
//"??B???n ho??n to??n c?? th??? tr???i nghi???m nh???ng d???ch v??? cao c???p t???i ????y", "1", "Available", "62", "1", "750000", "", "1", "2", 3);
    }
}
