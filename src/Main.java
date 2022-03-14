
import java.sql.SQLException;
import java.util.Vector;

public class Main {

	public Vector<User> userVector = new Vector <>();
	
	private DatabaseConnection db;
	
	public Main() {
		// TODO Auto-generated constructor stub
		
		Login login = new Login(userVector);
		db = new DatabaseConnection();
		
		
		try {
			db.resultSet = db.executeQuery("SELECT * FROM items");
			
			while (db.resultSet.next()) {
				System.out.println(String.valueOf(db.resultSet.getObject(1)));
				System.out.println(String.valueOf(db.resultSet.getObject(2)));
				System.out.println(String.valueOf(db.resultSet.getObject(3)));
				System.out.println(String.valueOf(db.resultSet.getObject(4)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
