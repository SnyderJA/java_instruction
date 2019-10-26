package db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import biz.User;

public class UserDB {

	private Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/prs?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String username = "prs_user";
		String pwd = "sesame";
		Connection con = DriverManager.getConnection(dbURL, username, pwd);
		return con;

	}

	public List<User> list() throws SQLException {
		Statement stmt = getConnection().createStatement();
		String sql = "Select * FROM User";
		List<User> users = new ArrayList<>();
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			User u = createUserFromResultSet(rs);

			users.add(u);

		}
		rs.close();
		return users;

	}

	public int addUser(User u) {
		int rowCount = 0;
		String sql = "insert into user (UserName, Password, FirstName, LastName, PhoneNumber, Email, IsReviewer, IsAdmin) VALUES"
				+ "(?,?,?,?,?,?,?,?);";
		try (PreparedStatement ps = getConnection().prepareStatement(sql);) {
			ps.setString(1, u.getUserName());
			ps.setString(2, u.getPassword());
			ps.setString(3, u.getFirstName());
			ps.setString(4, u.getLastName());
			ps.setString(5, u.getPhoneNumber());
			ps.setString(6, u.getEmail());
			ps.setBoolean(7, u.isReviewer());
			ps.setBoolean(8, u.isAdmin());

			rowCount = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rowCount;
	}
	
	public int updateUser(int id, String pwd) {
		int rowCount = 0;
		String sql = "update user SET " + " Password =  ? " +
		"WHERE id = ?";
		try (PreparedStatement ps = getConnection().prepareStatement(sql);) {
			ps.setString(1, pwd);
			ps.setInt(2, id);
			rowCount = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rowCount;
	}

	public User get(int id) throws SQLException {
		Statement stmt = getConnection().createStatement();
		String sql = "Select * FROM User" + "WHERE ID =  " + id;
		User user = null;
		// List<User> users = new ArrayList<>();
		ResultSet rs = stmt.executeQuery(sql);
		if (rs.next()) {
			user = createUserFromResultSet(rs);

		}

		rs.close();
		return user;
	}

	private User createUserFromResultSet(ResultSet rs) throws SQLException {
		// parse user row in to a user pojo
		int id = rs.getInt("ID");
		String uname = rs.getString("userName");
		String pwd = rs.getString("password");
		String fname = rs.getString("firstName");
		String lname = rs.getString("lastName");
		String phoneNumber = rs.getString("phoneNumber");
		String email = rs.getString("email");
		boolean rvw = rs.getBoolean("isreviewer");
		boolean adm = rs.getBoolean("isadmin");
		User u = new User(id, uname, pwd, lname, fname, phoneNumber, email, rvw, adm);
		return u;
	}
	

}
