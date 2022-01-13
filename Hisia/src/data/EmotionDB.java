package data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmotionDB {
    
    ConnectionDB conecction = new ConnectionDB();
     
    public ResultSet getEmotion(String emotion) throws ClassNotFoundException, SQLException{
        
        Statement statement = conecction.openConnection().createStatement();
        String query = String.format("SELECT * FROM Emotion "
                + "WHERE nameEmotion = '%s'", emotion);
 
        return statement.executeQuery(query);
    }
}