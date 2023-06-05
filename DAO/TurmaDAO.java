package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class TurmaDAO {
    

    public static List<Object> getTurmas() {
        Connection conn = DBConnection.getInstance().getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("select * from turmas");
            ResultSet resultSet = ps.executeQuery();
            //resultSet.first();
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id"));
                
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
    
}
