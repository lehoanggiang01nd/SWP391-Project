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
import model.Report;
import model.Room;

/**
 *
 * @author MY LAPTOP
 */
public class reportDAO extends DBContext{
    public List<Report> getReport() {
        List<Report> list = new ArrayList<>();
        String sql =" select * from Report\n" +
                    "  Order by ReportID DESC";
            try {
                PreparedStatement st = connection.prepareStatement(sql);
                ResultSet rs = st.executeQuery();
                while(rs.next()){
                    list.add(new Report(rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getInt(4),
                            rs.getString(5)));
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        return list;
        }
    public static void main(String[] args) {
        reportDAO dao = new reportDAO();
        List<Report> list = dao.getReport();
        for (Report report : list) {
            System.out.println(report);
        }
    }
}
