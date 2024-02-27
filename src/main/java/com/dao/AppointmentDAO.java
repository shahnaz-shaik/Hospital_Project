package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.Appointment;

public class AppointmentDAO {

	private Connection conn;

	public AppointmentDAO(Connection conn) {
		super();
		this.conn = conn;
	}

	public boolean addAppointment(Appointment ap) {
		boolean f = false;

		try {

			String sql = "insert into appointment(user_id,firstname,lastname,gender,age,appoint_date,appoint_time,email,phno,diseases,doctor_id,address,status) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, ap.getUserId());
			ps.setString(2, ap.getFirstName());
			ps.setString(3, ap.getLastName());
			ps.setString(4, ap.getGender());
			ps.setString(5, ap.getAge());
			ps.setString(6, ap.getAppoinDate());
			ps.setString(7, ap.getAppoinTime());
			ps.setString(8, ap.getEmail());
			ps.setString(9, ap.getPhNo());
			ps.setString(10, ap.getDiseases());
			ps.setInt(11, ap.getDoctorId());
			ps.setString(12, ap.getAddress());
			ps.setString(13, ap.getStatus());

			int i = ps.executeUpdate();
			if (i == 1) {
				f = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}

	public List<Appointment> getAllAppointmentByLoginUser(int userId) {
		List<Appointment> list = new ArrayList<Appointment>();
		Appointment ap = null;

		try {

			String sql = "select * from appointment where user_id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, userId);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ap = new Appointment();
				ap.setId(rs.getInt(1));
				ap.setUserId(rs.getInt(2));
				ap.setFirstName(rs.getString(3));
				ap.setLastName(rs.getString(4));
				ap.setGender(rs.getString(5));
				ap.setAge(rs.getString(6));
				ap.setAppoinDate(rs.getString(7));
				ap.setAppoinTime(rs.getString(8));
				ap.setEmail(rs.getString(9));
				ap.setPhNo(rs.getString(10));
				ap.setDiseases(rs.getString(11));
				ap.setDoctorId(rs.getInt(12));
				ap.setAddress(rs.getString(13));
				ap.setStatus(rs.getString(14));
				list.add(ap);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public List<Appointment> getAllAppointmentByDoctorLogin(int doctorId) {
		List<Appointment> list = new ArrayList<Appointment>();
		Appointment ap = null;

		try {

			String sql = "select * from appointment where doctor_id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, doctorId);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ap = new Appointment();
				ap.setId(rs.getInt(1));
				ap.setUserId(rs.getInt(2));
				ap.setFirstName(rs.getString(3));
				ap.setLastName(rs.getString(4));
				ap.setGender(rs.getString(5));
				ap.setAge(rs.getString(6));
				ap.setAppoinDate(rs.getString(7));
				ap.setAppoinTime(rs.getString(8));
				ap.setEmail(rs.getString(9));
				ap.setPhNo(rs.getString(10));
				ap.setDiseases(rs.getString(11));
				ap.setDoctorId(rs.getInt(12));
				ap.setAddress(rs.getString(13));
				ap.setStatus(rs.getString(14));
				list.add(ap);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public Appointment getAppointmentById(int id) {

		Appointment ap = null;

		try {

			String sql = "select * from appointment where id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ap = new Appointment();
				ap.setId(rs.getInt(1));
				ap.setUserId(rs.getInt(2));
				ap.setFirstName(rs.getString(3));
				ap.setLastName(rs.getString(4));
				ap.setGender(rs.getString(5));
				ap.setAge(rs.getString(6));
				ap.setAppoinDate(rs.getString(7));
				ap.setAppoinTime(rs.getString(8));
				ap.setEmail(rs.getString(9));
				ap.setPhNo(rs.getString(10));
				ap.setDiseases(rs.getString(11));
				ap.setDoctorId(rs.getInt(12));
				ap.setAddress(rs.getString(13));
				ap.setStatus(rs.getString(14));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return ap;
	}

	public boolean updateCommentStatus(int id, int doctId, String comm) {
		boolean f = false;
		try {
			String sql = "update appointment set status=? where id=? and doctor_id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, comm);
			ps.setInt(2, id);
			ps.setInt(3, doctId);

			int i = ps.executeUpdate();
			if (i == 1) {
				f = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}

	public List<Appointment> getAllAppointment() {
		List<Appointment> list = new ArrayList<Appointment>();
		Appointment ap = null;

		try {

			String sql = "select * from appointment order by id desc";
			PreparedStatement ps = conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ap = new Appointment();
				ap.setId(rs.getInt(1));
				ap.setUserId(rs.getInt(2));
				ap.setFirstName(rs.getString(3));
				ap.setLastName(rs.getString(4));
				ap.setGender(rs.getString(5));
				ap.setAge(rs.getString(6));
				ap.setAppoinDate(rs.getString(7));
				ap.setAppoinTime(rs.getString(8));
				ap.setEmail(rs.getString(9));
				ap.setPhNo(rs.getString(10));
				ap.setDiseases(rs.getString(11));
				ap.setDoctorId(rs.getInt(12));
				ap.setAddress(rs.getString(13));
				ap.setStatus(rs.getString(14));
				list.add(ap);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

}