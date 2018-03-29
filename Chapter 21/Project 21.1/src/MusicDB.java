import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class MusicDB {
	private Connection getConnection() throws SQLException {
		String dbUrl = "jdbc:sqlite:music_artist.sqlite";
		Connection connection = DriverManager.getConnection(dbUrl);
		return connection;
	}
}
