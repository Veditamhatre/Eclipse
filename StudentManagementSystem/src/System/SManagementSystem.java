package System;
import java.io.*;
import java.sql.*;
import java.util.Scanner;

import com.student.sm.Student;
import com.student.sm.StudentDao;

public class SManagementSystem {

	public static void main(String[] args) throws Exception {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			Scanner sc= new Scanner(System.in);	
			
			System.out.println("Enter  username:"  );
			String Username = sc.nextLine();

		
			System.out.println("Enter your Password :");
			String Password = sc.nextLine();
	
			if(Username.equals("admin")){
				if(Password.equals("admin")) {
					System.out.println("Login Successfully");
					System.out.println("Welcome To Student Management System" );
			}else {
				System.out.println("Wrong Password..Try Again!");
			
			
			
			}
			}
			
			while(true) {
				System.out.println("PRESS 1 to ADD student");
				System.out.println("PRESS 2 to DELETE student");
				System.out.println("PRESS 3 to DISPLAY student");
				System.out.println("PRESS 4 to UPDATE student");
				System.out.println("PRESS 5 to EXIT App");
				
				int c = Integer.parseInt(br.readLine());
				
				
				if(c == 1) {
					
					
					System.out.println("Enter Student ID: ");
					String s_id =br.readLine();
					
					System.out.println("Enter Student Name: ");
					String s_name =br.readLine();
					
					System.out.println("Enter Student Contact: ");
					String s_contact =br.readLine();
					
					System.out.println("Enter Student City: ");
					String s_city =br.readLine();
					
					System.out.println("Enter Student Course: ");
					String s_course =br.readLine();
					
					Student st = new Student(s_id,s_name,s_contact,s_city,s_course);
					boolean ans = StudentDao.insertStudentRecordToDB(st);
					if(ans) {
						System.out.println("Student record Inserted Successfully...");
						System.out.println("Student Record:" + st);
					}else {
						System.out.println("Some error Occured While Inserting...Please try Again!");
					}
					
				}
				else if(c == 2) {
					//Delete student
					System.out.println("Enter Student ID To Delete: ");
					int s_id = Integer.parseInt(br.readLine());
					boolean f = StudentDao.deleteStudentRecordFromDB(s_id);
					if(f) {
						System.out.println("Student Of ID " + s_id + " Record Deleted... ");
					}else {
						System.out.println("Something Went Wrong.. Please try Again!");
					}
				}
				else if(c == 3) {
					//Display student
					StudentDao.showAllStudentRecords();
				}
				else if(c == 4) {
					//Update student
				
					System.out.println("PRESS 1 to UPDATE id");
					System.out.println("PRESS 2 to UPDATE name");
					System.out.println("PRESS 3 to UPDATE contact");
					System.out.println("PRESS 4 to UPDATE city");
					System.out.println("PRESS 5 to UPDATE course");
					
					
					int val = Integer.parseInt(br.readLine());
					
					if(val == 1) {
						//Update id
						System.out.println("Enter name to UPDATE Id...");
						String s_id = br.readLine();
						System.out.println("Enter ID to identify student!");
						int S_id = Integer.parseInt(br.readLine());
						Student st = new Student(s_id, s_id, s_id, s_id, s_id);
						st.setS_name(s_id);
						boolean f = StudentDao.updateStudentRecord(val,Username,S_id, st);
						
						if(f) {
							System.out.println("Student Name Updated Successfully...");
						}else {
							System.out.println("Something Went Wrong Please try Again!");
						}
					}
					
					if(val == 2) {
						//Update Name
						System.out.println("Enter name to UPDATE...");
						String s_name = br.readLine();
						System.out.println("Enter ID to identify student!");
						int S_id = Integer.parseInt(br.readLine());
						Student st = new Student(s_name, s_name, s_name, s_name, s_name);
						st.setS_name(s_name);
						boolean f = StudentDao.updateStudentRecord(val,s_name,S_id, st);
						
						if(f) {
							System.out.println("Student Name Updated Successfully...");
						}else {
							System.out.println("Something Went Wrong Please try Again!");
						}
					}
					else if(val == 3) {
						//Update Phone
						System.out.println("Enter phone to UPDATE...");
						String s_contact = br.readLine();
						System.out.println("Enter ID to identify student!");
						int s_id = Integer.parseInt(br.readLine());
						Student st = new Student(s_contact, s_contact, s_contact, s_contact, s_contact);
						st.setS_contact(s_contact);
						boolean f = StudentDao.updateStudentRecord(val,s_contact,s_id,st);
						if(f) {
							System.out.println("Student Phone Updated Successfully...");
						}else {
							System.out.println("Something Went Wrong Please try Again!");
						}
					}

					else if(val == 4) {
						//Update city
						System.out.println("Enter city to UPDATE...");
						String s_city = br.readLine();
						System.out.println("Enter ID to identify student!");
						int id = Integer.parseInt(br.readLine());
						Student st = new Student(s_city, s_city, s_city, s_city, s_city);
						st.setS_city(s_city);
						boolean f = StudentDao.updateStudentRecord(val,s_city,id,st);
						if(f) {
							System.out.println("Student City Updated Successfully...");
						}else {
							System.out.println("Something Went Wrong Please try Again!");
						}
					}
					else {
						System.out.println("Hey You have not updated Anything... Please choose option Correctly!");
					}
					
				}
								
				else if(c == 5) {
					//Exit
					
//					System.out.println("Thank You For Using Application...If You Enjoyed, Please Experience It Again!" + Username);
//					break;
                        }
				else {
					
				}
				
			}
	}
		}
					
				