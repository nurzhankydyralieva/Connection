package kg.megacom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Authors {
    private Connection connect(){
        String url = "jdbc:sqlite:C:\\Users\\Nurzhan\\Desktop\\books\\db\\books.db";
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(url);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return conn;
    }
    public void insert(String name, int books_id){
        String query = "insert into authors(name, book_id)values(?,?)";
        try (Connection conn = this.connect();
             PreparedStatement prev = conn.prepareStatement(query)){
            prev.setString(1, name);
            prev.setInt(2, books_id);
            prev.executeUpdate();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

}
