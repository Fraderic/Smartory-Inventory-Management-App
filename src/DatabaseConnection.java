import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
//LAB
public class DatabaseConnection {

	public Connection connection;
	public Statement statement;
	public ResultSet resultSet;
	public ResultSetMetaData resultSetMetaData;
	public PreparedStatement preparedStatement;
	
	
	public DatabaseConnection(){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/group3","root","");
			
			statement = connection.createStatement();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (null !=connection) {
			try {
				resultSet.close();
				statement.close();
				
				connection.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}	
	
	
	

	public ResultSet executeQuery(String query) {
		try {
			resultSet = statement.executeQuery(query);
			resultSetMetaData = resultSet.getMetaData();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return resultSet;
	}
	
	public ResultSet getitemsData() {
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM items");
			
			resultSet = preparedStatement.executeQuery();
			resultSetMetaData = resultSet.getMetaData();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultSet;
	
	}
	
	
	
	
	
	// ini masih salah
//	public void insertNewitem(int itemId,String item, String kategori, int stok, int barangmasuk,  String supply) {
//		try {
//			preparedStatement = connection.prepareStatement(
//			"INSERT INTO `items` (`itemId`, `item`,`kategori`,`stok`,`barangmasuk`,`supply)"
//			+ "VALUES (?,?,?,?,?,?)");
//			
//		
//			preparedStatement.setInt(1, itemId);
//			preparedStatement.setString(3, item);
//			preparedStatement.setString(4, kategori);
//			preparedStatement.setInt(5, stok);
//			preparedStatement.setInt(6, barangmasuk);
//			preparedStatement.setString(7, supply);
//
//			preparedStatement.execute();
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	
	
	
	
}
