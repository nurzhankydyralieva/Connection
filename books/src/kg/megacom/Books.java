package kg.megacom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Books {
    private Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nurzhan\\Desktop\\books\\db\\books.db");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return conn;
    }

    public void insertBook(String name) {
        String query = "insert into books(name)values(?)";
        try (Connection conn = this.connect();
             PreparedStatement prev = conn.prepareStatement(query)) {
            prev.setString(1, name);
            prev.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
