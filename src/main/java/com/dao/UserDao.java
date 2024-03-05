package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.db.DBConnect;
import com.entity.Doctor;
import com.entity.User;

public class UserDao {

	private Connection conn;

	public UserDao(Connection conn) {
		super();
		this.conn = conn;
	}

	private void storeVerificationCode(String email, String verificationCode) {
	    // Implement logic to store verification code in the database
	    // You need to have a database table to store email and verification code
	    // Perform appropriate database operations using JDBC or your ORM framework
	    // For demonstration purposes, we'll assume the existence of a method in UserDao to store the code
	    UserDao userDao = new UserDao(DBConnect.getConn());
	    userDao.storeVerificationCode(email, verificationCode);
	}

	public boolean register(User u) {
		boolean f = false;

		try {
			String sql = "insert into user_dtls(first_name,last_name,email,password) values(?,?,?,?) ";

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, u.getFirstName());
			ps.setString(2, u.getLastName());
			ps.setString(3, u.getEmail());
			ps.setString(4, u.getPassword());

			int i = ps.executeUpdate();

			if (i == 1) {
				f = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}
	public List<User> getAllUser() {
		List<User> list = new ArrayList<User>();
		User u = null;
		try {

			String sql = "select * from user_dtls order by id";
			PreparedStatement ps = conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				u = new User();
				u.setId(rs.getInt(1));
				u.setFirstName(rs.getString(2));
				u.setLastName(rs.getString(3));
				u.setEmail(rs.getString(4));
				
				list.add(u);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}


public User login(String em, String psw) {
	User u = null;

	try {
		String sql = "select * from user_dtls where email=? and password=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, em);
		ps.setString(2, psw);

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			u = new User();
			u.setId(rs.getInt(1));
			u.setFirstName(rs.getString(2));
			u.setLastName(rs.getString(3));
			u.setEmail(rs.getString(4));
			u.setPassword(rs.getString(5));
		}

	} catch (Exception e) {
		e.printStackTrace();
	}

	return u;
}

public boolean checkOldPassword(int userid, String oldPassword) {
	boolean f = false;

	try {
		String sql = "select * from user_dtls where id=? and password=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, userid);
		ps.setString(2, oldPassword);

		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			f = true;
		}

	} catch (Exception e) {
		e.printStackTrace();
	}

	return f;
}

public boolean changePassword(int userid, String newPassword) {
	boolean f = false;

	try {
		String sql = "update user_dtls set password=? where id=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, newPassword);
		ps.setInt(2, userid);

		int i = ps.executeUpdate();
		if (i == 1) {
			f = true;
		}

	} catch (Exception e) {
		e.printStackTrace();
	}

	return f;
}

}