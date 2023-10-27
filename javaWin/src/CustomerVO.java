import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CustomerVO {
//	public static void main(String[] args) {
//		creatCustomer("test");
//	}
	
	public static void creatTable() {
		try {
			Connection con = getConnection();
			PreparedStatement createTable = con.prepareStatement(
					"CREATE TABLE IF NOT EXISTS " +
					"customer(id int not null Auto_increment, "
					+ "name varChar(255),"
					+ "primary key(id))");
			createTable.execute();
			System.out.println("creatTable success");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}finally {
			System.out.println("creatTable success Final");
		}
	}
	
	public static void creatCustomer(String name) {
		try {
			Connection con = getConnection();
			PreparedStatement insertCustomer = con.prepareStatement(
					"insert into customer(name) value ('"+name+"') ");
			insertCustomer.executeUpdate();
			System.out.println("creatTable success");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}finally {
			System.out.println("creatTable success Final");
		}
	}
	
	public static Connection getConnection(){
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/javaWin";
			String user = "root";
			String password = "1234";
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("con success");
			return con;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("con fail");
			return null;
		}
		
	}

}
