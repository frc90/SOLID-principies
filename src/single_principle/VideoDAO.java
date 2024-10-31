package single_principle;

import java.sql.*;

public class VideoDAO {
    public void persist(Video video) throws SQLException {
        String url = "jdbc:mysql://localhost:3000/videos";
        Connection conn = new ConnectionDAO().createConnection();
        Statement stmt = conn.createStatement();
        String sql = "INSERT INTO Video (Title, Time, Likes, Views) VALUES (" +
                video.getTitle() + "," +video.getTime() + "," + video.getLikes() + "," +
                video.getViews() + ")";
    }
}
