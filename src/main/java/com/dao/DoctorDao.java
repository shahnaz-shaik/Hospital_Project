package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.Doctor;

public class DoctorDao {
	private Connection conn;

	public DoctorDao(Connection conn) {
		super();
		this.conn = conn;
	}

	public boolean registerDoctor(Doctor d) {
		boolean f = false;

		try {
			String sql = "insert into doctor(first_name,last_name,dob,qualification,specialist,email,mobno,password) values(?,?,?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, d.getFirstName());
			ps.setString(2, d.getLastName());
			ps.setString(3, d.getDob());
			ps.setString(4, d.getQualification());
			ps.setString(5, d.getSpecialist());
			ps.setString(6, d.getEmail());
			ps.setString(7, d.getMobNo());
			ps.setString(8, d.getPassword());

			int i = ps.executeUpdate();
			if (i == 1) {
				f = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}

	public List<Doctor> getAllDoctor() {
		List<Doctor> list = new ArrayList<Doctor>();
		Doctor d = null;
		try {

			String sql = "select * from doctor order by id";
			PreparedStatement ps = conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				d = new Doctor();
				d.setId(rs.getInt(1));
				d.setFirstName(rs.getString(2));
				d.setLastName(rs.getString(3));
				d.setDob(rs.getString(4));
				d.setQualification(rs.getString(5));
				d.setSpecialist(rs.getString(6));
				d.setEmail(rs.getString(7));
				d.setMobNo(rs.getString(8));
				d.setPassword(rs.getString(9));
				list.add(d);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public Doctor getDoctorById(int id) {

		Doctor d = null;
		try {

			String sql = "select * from doctor where id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				d = new Doctor();
				d.setId(rs.getInt(1));
				d.setFirstName(rs.getString(2));
				d.setLastName(rs.getString(3));
				d.setDob(rs.getString(4));
				d.setQualification(rs.getString(5));
				d.setSpecialist(rs.getString(6));
				d.setEmail(rs.getString(7));
				d.setMobNo(rs.getString(8));
				d.setPassword(rs.getString(9));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return d;
	}

	public boolean updateDoctor(Doctor d) {
		boolean f = false;

		try {
			String sql = "update doctor set first_name=?,last_name=?,dob=?,qualification=?,specialist=?,email=?,mobno=?,password=? where id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, d.getFirstName());
			ps.setString(2, d.getLastName());
			ps.setString(3, d.getDob());
			ps.setString(4, d.getQualification());
			ps.setString(5, d.getSpecialist());
			ps.setString(6, d.getEmail());
			ps.setString(7, d.getMobNo());
			ps.setString(8, d.getPassword());
			ps.setInt(9, d.getId());
			int i = ps.executeUpdate();

			if (i == 1) {
				f = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}

	public boolean deleteDoctor(int id) {
		boolean f = false;
		try {
			String sql = "delete from doctor where id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);

			int i = ps.executeUpdate();
			if (i == 1) {
				f = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}

	public Doctor login(String email, String psw) {
		Doctor d = null;
		try {

			String sql = "select * from doctor where email=? and password=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, psw);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				d = new Doctor();
				d = new Doctor();
				d.setId(rs.getInt(1));
				d.setFirstName(rs.getString(2));
				d.setLastName(rs.getString(3));
				d.setDob(rs.getString(4));
				d.setQualification(rs.getString(5));
				d.setSpecialist(rs.getString(6));
				d.setEmail(rs.getString(7));
				d.setMobNo(rs.getString(8));
				d.setPassword(rs.getString(9));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return d;
	}

	public int countDoctor() {
		int i = 0;
		try {
			String sql = "select * from doctor";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				i++;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return i;
	}

	public int countAppointment() {
		int i = 0;
		try {
			String sql = "select * from appointment";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				i++;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return i;
	}

	public int countAppointmentByDocotrId(int did) {
		int i = 0;
		try {
			String sql = "select * from appointment where doctor_id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, did);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				i++;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return i;
	}

	public int countUSer() {
		int i = 0;
		try {
			String sql = "select * from user_dtls";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				i++;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return i;
	}

	public int countSpecialist() {
		int i = 0;
		try {
			String sql = "select * from specialist";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				i++;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return i;
	}

	public boolean checkOldPassword(int userid, String oldPassword) {
		boolean f = false;

		try {
			String sql = "select * from doctor where id=? and password=?";
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
			String sql = "update doctor set password=? where id=?";
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

	public boolean editDoctorProfile(Doctor d) {
		boolean f = false;

		try {
			String sql = "update doctor set first_name=?,last_name=?,dob=?,qualification=?,specialist=?,email=?,mobno=? where id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, d.getFirstName());
			ps.setString(2, d.getLastName());
			ps.setString(3, d.getDob());
			ps.setString(4, d.getQualification());
			ps.setString(5, d.getSpecialist());
			ps.setString(6, d.getEmail());
			ps.setString(7, d.getMobNo());
			ps.setInt(8, d.getId());
			int i = ps.executeUpdate();

			if (i == 1) {
				f = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}
	public boolean forgotpass(String em) {
		boolean f = false;

		try {
			String sql = "select * from doctor where email=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, em);
		

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				f = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}
	public boolean newPassword(String email, String newPassword) {
		boolean f = false;

		try {
			String sql = "update doctor set password=? where email=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, newPassword);
			ps.setString(2, email);

			
			  int i = ps.executeUpdate();
			  if (i == 1) {
				  f = true;
				  }
			 

			/*
			 * int rowsAffected = ps.executeUpdate(); if (rowsAffected > 0) { f = true; }
			 */
		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}


}