package mechanic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class appointment_menu {
	
    Scanner sc = new Scanner(System.in);
    
    public void BookAppointment() {
    	System.out.println("^^^^ YOU ARE NOW BOOKING AN APPOINTMENT ^^^^");
		System.out.println("Enter appointment id:-");
		int a_id=sc.nextInt();
		System.out.println("Enter customer id");
		int c_id =sc.nextInt();
		System.out.println("Enter mechanic id");
		int m_id= sc.nextInt();
		System.out.println("Enter appointment date");
		String a_date=sc.next();
		System.out.println("Enter appointment slot");
		String a_slot= sc.next();
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/first", "root","Nirmal@0602");
		Statement st=con.createStatement();

		String insertQuery="insert into app values('"+a_id+"','"+c_id+"','"+m_id+"','"+a_date+"','"+a_slot+"')";
		
		int res=st.executeUpdate(insertQuery);
		//System.out.println("hello world")
		if(res==0)
		{
			System.out.println("Record not inserted");
		}
		else
		{ 
			System.out.println("Record  inserted");
		}	
			
		//ResultSet rs=st.executeQuery("select * from customer");
		
		st.close();
		con.close();
		} catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public void ModifyAppointmentDetails() {
    	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		/*Connection con4=DriverManager.getConnection("jdbc:mysql://localhost:3306/first", "root","Nirmal@0602");
		Statement st4=con4.createStatement();*/
		
		System.out.println("^^^^ YOU ARE NOW MODIFYING APPOINTMENT DETAILS ^^^^");
		System.out.println("Enter the appointment id to update:-");
		int a2=sc.nextInt();
		int I7;
		do {
			
			
			System.out.println("                  1.Modify Customer ID");
			System.out.println("                  2.Modify Mech ID");
			System.out.println("                  3.Modify Appointment date");
			System.out.println("                  4.Modify Appointment Slot");
			System.out.println("                  0.EXIT to Appointment Menu");
		I7=sc.nextInt();
		String updateQuery = "";
		switch(I7)
		{
		
		case 1:
			Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/first", "root","Nirmal@0602");
			Statement st1=con1.createStatement();
            System.out.println(" YOU ARE NOW MODIFYING CUSTOMER ID");
            System.out.println(" PLEASE ENTER CUSTOMER ID ");
            
            int newname = sc.nextInt();
            updateQuery = "UPDATE app SET cust_id = '" + newname + "' WHERE app_id = " + a2;
            int res1=st1.executeUpdate(updateQuery);
    		if(res1==0)
    		{
    			System.out.println("Record not updated");
    		}
    		else
    		{ 
    			System.out.println("Record  updated");
    		}
    		
    		st1.close();
    		con1.close();
            break;
            
        case 2:
        	Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/first", "root","Nirmal@0602");
    		Statement st2=con2.createStatement();
        	 System.out.println(" YOU ARE NOW MODIFYING MECHANIC ID");
             System.out.println(" PLEASE ENTER THE NEW MECHANIC ID:");
             
             int newveh = sc.nextInt();
             updateQuery = "UPDATE app SET m_id = '" + newveh + "' WHERE a_id = " + a2;
             int res2=st2.executeUpdate(updateQuery);
     		if(res2==0)
     		{
     			System.out.println("Record not updated");
     		}
     		else
     		{ 
     			System.out.println("Record  updated");
     		}
     		
     		st2.close();
     		con2.close();
             
            break;
            
        case 3:
        	Connection con3=DriverManager.getConnection("jdbc:mysql://localhost:3306/first", "root","Nirmal@0602");
    		Statement st3=con3.createStatement();
       	 System.out.println(" YOU ARE NOW MODIFYING APPOINTMENT DATE");
            System.out.println(" PLEASE ENTER THE  NEW APPOINTMENT DATE:");
            
            String newnum = sc.next();
           updateQuery = "UPDATE app SET a_date = '" + newnum + "' WHERE a_id = " + a2;
           int res3=st3.executeUpdate(updateQuery);
   		if(res3==0)
   		{
   			System.out.println("Record not updated");
   		}
   		else
   		{ 
   			System.out.println("Record  updated");
   		}
   		
   		st3.close();
   		con3.close();
            
           break;
        case 4:
        	Connection con4=DriverManager.getConnection("jdbc:mysql://localhost:3306/first", "root","Nirmal@0602");
    		Statement st4=con4.createStatement();
          	 System.out.println(" YOU ARE NOW MODIFYING APPOINTMENT SLOT");
               System.out.println(" PLEASE ENTER THE  NEW SLOT:");
               
               String newadd = sc.next();
              updateQuery = "UPDATE app SET a_slot = '" + newadd + "' WHERE a_id = " + a2;
              int res4=st4.executeUpdate(updateQuery);
      		if(res4==0)
      		{
      			System.out.println("Record not updated");
      		}
      		else
      		{ 
      			System.out.println("Record  updated");
      		}
      		
      		st4.close();
      		con4.close();
             
               
              
              break;
        
        case 0:
			System.out.println(" YOU ARE NOW EXITING APPOINTMENT MODIFYING MENU. ");
			
			break;
			
		default:
			 System.out.println(" Invalid input.Please enter valid key");
			   break;
			   
		}
		
		}while(I7!=0);
    	}catch (Exception e) {
	        System.out.println("An error occurred: " + e.getMessage());
	    }
    }

    public void DeleteAppointment() {
    	System.out.println("^^^^ YOU ARE NOW DELETING AN APPOINTMENT ^^^^");
		System.out.println("  DO YOU REALLY WANT TO DELETE ?");
		System.out.println(" PRESS 1 TO DELETE ");
		System.out.println("PRESS ANY OTHER KEY TO CANCEL");
		
		 int S= sc.nextInt();
		 if(S == 1)
		 {
			 try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con2=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/first", "root","Nirmal@0602");
		Statement st2=con2.createStatement();
        
		System.out.println("Enter appointment id to delete:-");
		int a=sc.nextInt();
		
		String deleteQuery="delete from app where a_id= '"+a+"'";
		
		int res2=st2.executeUpdate(deleteQuery);
		//System.out.println("hello world")
		if(res2==0)
		{
			System.out.println("Record not deleted");
		}
		else
		{ 
			System.out.println("Record  deleted");
		}	
			
		//ResultSet rs=st.executeQuery("select * from customer");
		
		st2.close();
		con2.close();
		 }catch (Exception e) {
		        System.out.println("An error occurred: " + e.getMessage());
		    }
		 }
		 else
		 {
			
		 }
    }

    public void ViewSingleRecord() {
    	System.out.println("YOU ARE NOW PRINTING DETAILS OF AN APPOINTMENT ");
    	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con4=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/first", "root","Nirmal@0602");
		Statement st4=con4.createStatement();
        
		System.out.println("Enter appointment id to print values:-");
		int a4=sc.nextInt();
		
		String selectQuery="select * from app where a_id= ?";
		PreparedStatement preparedStatement=con4.prepareStatement(selectQuery);
		preparedStatement.setInt(1, a4);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
            int appId = resultSet.getInt("a_id");
            int custId  = resultSet.getInt("_id");
            int mechId  = resultSet.getInt("m_id");
            String appDate= resultSet.getString("a_date");
            String appSlot=resultSet.getString("a_slot");

            System.out.println("Appointment ID: " + appId);
            System.out.println("Customer ID: " + custId);
            System.out.println(" mechanic ID: " + mechId);
            System.out.println("appointment date:"+appDate);
            System.out.println("appointment slot: " + appSlot);
            
            
                               }
		st4.close();
		con4.close();

        resultSet.close();
        preparedStatement.close();
    	}catch (Exception e) {
	        System.out.println("An error occurred: " + e.getMessage());
	    }
    }
    public void ViewAllRecords() {
    	try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	Connection con5 = DriverManager.getConnection("jdbc:mysql://localhost:3306/first", "root","Nirmal@0602");

            String selectQuery1 = "SELECT * FROM app";
            PreparedStatement preparedStatement1 = con5.prepareStatement(selectQuery1);

            ResultSet resultSet1 = preparedStatement1.executeQuery();

            while (resultSet1.next()) {
            	int appId = resultSet1.getInt("a_id");
                int custId  = resultSet1.getInt("c_id");
                int mechId  = resultSet1.getInt("m_id");
                String appDate= resultSet1.getString("a_date");
                String appSlot=resultSet1.getString("a_slot");

                System.out.println("Appointment ID: " + appId);
                System.out.println("Customer ID: " + custId);
                System.out.println("mechanic ID: " + mechId);
                System.out.println("appointment date: "+appDate);
                System.out.println("appointment slot: " + appSlot);
                System.out.println();
            }

            resultSet1.close();
            preparedStatement1.close();
            con5.close();
        	}catch (Exception e) {
    	        System.out.println("An error occurred: " + e.getMessage());
    	    }
    }
}

