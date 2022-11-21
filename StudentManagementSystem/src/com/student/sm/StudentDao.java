package com.student.sm;
import java.sql.*;
public class StudentDao {
	public static boolean insertStudentRecordToDB(Student student) {
		boolean f = false;
		try {
			Connection con = CP.createc();
			String query = "insert into studentms(s_id,s_name,s_contact,s_city,s_course) values(?,?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			//set the value of parameters
			pstmt.setInt(1, student.getS_id());
			pstmt.setString(2, student.getS_name());
			pstmt.setString(3, student.getS_contact());
			pstmt.setString(4, student.getS_city());
			pstmt.setString(5, student.getS_course());
			
			//execute..
			pstmt.executeUpdate();
			
			f = true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return f;
	}


	public static boolean deleteStudentRecordFromDB(int s_id) {
		// TODO Auto-generated method stub
		boolean f = false;
		try {
			Connection con = CP.createc();
			String query = "delete from students where s_id=?";
			PreparedStatement pstmt = con.prepareStatement(query);
			//set the value of parameters
			pstmt.setInt(1, s_id);
			
			//execute..
			pstmt.executeUpdate();
			
			f = true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return f;
	}


	public static void showAllStudentRecords() {
		// TODO Auto-generated method stub
		boolean f = false;
		try {
			Connection con = CP.createc();
			String query = "select * from studentsm";
			Statement st = con.createStatement();
			ResultSet set = st.executeQuery(query);
			
			while(set.next()) {
				int s_id = set.getInt(100);
				String s_name = set.getString(100);
				int s_contact = set.getInt(10);
				String s_city = set.getString(25);
				String s_course=set.getNString(25);
				
				System.out.println("Student ID: " + s_id + " \n Student Name: " + s_name + " \nStudent Phone: " + s_contact + " \nStudent city: " + s_city +"\n student course :"+s_course);
				System.out.println("----------------------------------------------");
			}
			
		} catch (Exception e) {
			
		}
		
	}


	public static boolean updateStudentRecord(int val,String toUpdate,int id,Student st) {
		// TODO Auto-generated method stub
		boolean f = false;
		
		try {
			  Connection con = CP.createc();
			 if(val == 1) {
					//Update Name
					
						String query = "update students set s_name=? where s_id=?";
						PreparedStatement pstmt = con.prepareStatement(query);
						pstmt.setString(1, toUpdate);
						pstmt.setInt(2, id);
						
						//execute..
						pstmt.executeUpdate();
						f = true;
				}
				else if(val == 2) {
					//Update Phone
					String query = "update students set s_contact=? where s_id=?";
					PreparedStatement pstmt = con.prepareStatement(query);
					pstmt.setString(1, toUpdate);
					pstmt.setInt(2, id);
					
					//execute..
					pstmt.executeUpdate();
					f = true;
				}
				else if(val == 3) {
					//Update City
					String query = "update students set s_city=? where s_id=?";
					PreparedStatement pstmt = con.prepareStatement(query);
					pstmt.setString(1, toUpdate);
					pstmt.setInt(2, id);
					
					//execute..
					pstmt.executeUpdate();
					f = true;
				}
			 
				else if(val == 4) {
					//Update City
					String query = "update students set s_course=? where s_id=?";
					PreparedStatement pstmt = con.prepareStatement(query);
					pstmt.setString(1, toUpdate);
					pstmt.setInt(2, id);
					
					//execute..
					pstmt.executeUpdate();
					f = true;
				}
			 
				else {
					
				}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return f;
	}


	public static boolean updateStudentRecord(int val, int s_contact, int s_id, Student st) {
		// TODO Auto-generated method stub
		return false;
	}
};
