package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Turma;

public class TurmaDAO {
    

    public static List<Turma> getTurmas() {
        Connection conn = DBConnection.getInstance().getConnection();
        List<Turma> retorno = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement("select * from turmas");
            ResultSet resultSet = ps.executeQuery();
            //resultSet.first();
            while (resultSet.next()) {
                Turma tmp = new Turma(resultSet.getInt("idTurmas"), resultSet.getString("apelido"),
                resultSet.getInt("capacidade"),resultSet.getInt("ucs_iducs"));
                retorno.add(tmp);
                
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return retorno;
    }
    public static Turma salvarTurma(Turma turma) {
        Connection conn = DBConnection.getInstance().getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("insert into turmas (apelido, capacidade, ucs_iducs) values (?, ?, ?)");
            ps.setString(1, turma.getApelido());
            ps.setInt(2, turma.getCapacidade());
            ps.setInt(3, turma.getUcs_iducs());
            //ps.setInt(2, null);
            ps.executeUpdate();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
    
}
