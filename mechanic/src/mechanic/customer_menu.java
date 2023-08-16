package mechanic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class customer_menu {
	private static final String DB_URL = "jdbc:mysql://localhost:3306/first";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "Nirmal@0602";
    Scanner sc = new Scanner(System.in);
    
    public void RegisterCustomer() {
    	System.out.println("Enter user id:-");
		int cust_id=sc.nextInt();
		System.out.println("Enter user name");
		String cust_name =sc.next();
		System.out.println("Enter ur mobile number");
		String cust_mobile=sc.next();
		System.out.println("Enter ur email id");
		String cust_email=sc.next();
		System.out.println("Enter ur vehicle brand");
		String vehicle_brand= sc.next();
		System.out.println("Enter ur vehicle model");
		String vehicle_model= sc.next();
		System.out.println("Enter ur vehicle number");
		String vehicle_no= sc.next();
		System.out.println("Enter ur address");
		String cust_address= sc.next();
		
		
		try {
			Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            Statement st = con.createStatement();

            String insertQuery = "insert into customers values('" + cust_id + "','" + cust_name + "','" + cust_mobile + "','" + cust_email + "','" + vehicle_brand + "','" + vehicle_model + "','" + vehicle_no + "','" + cust_address + "')";

            int res = st.executeUpdate(insertQuery);
            if (res == 0) {
                System.out.println("Record not inserted.");
            } else {
                System.out.println("Record inserted.");
            }

            st.close();
            con.close();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
    public void ModifyCustomerDetails() {
    	try {
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	/*Connection con3 = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
		Statement st3=con3.createStatement();*/
		System.out.println("Enter customer id to update:-");
		int a2=sc.nextInt();
		int I11;
		do {
			System.out.println("What do you want to update now?");
		System.out.println("      1.Name               ");
		System.out.println("      2.Mobile number      ");
		System.out.println("      3.Email id           ");
		System.out.println("      4.Vehicle brand      ");
		System.out.println("      5.Vehicle model      ");
		System.out.println("      6.Vehicle number     ");
		System.out.println("      7.Address            ");
		System.out.println("      0.exit to Customer Menu              ");
		
		I11=sc.nextInt();
		String updateQuery = "";
	    switch(I11) {
	    case 1:
	    	Connection con6 = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			Statement st6=con6.createStatement();
	    	System.out.println("Enter the name :-");
			String a21=sc.next();
			
			updateQuery="update customers set cust_name= '"+a21+"' where cust_id= '"+a2+"'";
			
			int res6=st6.executeUpdate(updateQuery);
			
			if(res6==0)
			{
				System.out.println("Record not updated");
			}
			else
			{ 
				System.out.println("Record  updated");
			}	
			
			
			
			st6.close();
			con6.close();
			break;
			
		case 2:
			Connection con7 = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			Statement st7=con7.createStatement();
	    	System.out.println("Enter the mobile number :-");
			String a22=sc.next();
			
			updateQuery="update customers set cust_name= '"+a22+"' where cust_id= '"+a2+"'";
			int res7=st7.executeUpdate(updateQuery);
			
			if(res7==0)
			{
				System.out.println("Record not updated");
			}
			else
			{ 
				System.out.println("Record  updated");
			}	
				
			
			
			st7.close();
			con7.close();
			break;
			
	    case 3:
	    	Connection con8 = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			Statement st8=con8.createStatement();
	    	System.out.println("Enter the email id :-");
			String a23=sc.next();
			
			updateQuery="update customers set cust_email= '"+a23+"' where cust_id= '"+a2+"'";
			int res8=st8.executeUpdate(updateQuery);
			
			if(res8==0)
			{
				System.out.println("Record not updated");
			}
			else
			{ 
				System.out.println("Record  updated");
			}	
				
			
			
			st8.close();
			con8.close();
			break;
	    case 4:
	    	Connection con9 = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			Statement st9=con9.createStatement();
	    	System.out.println("Enter the vehice brand :-");
			String a24=sc.next();
			
			updateQuery="update customers set vehicle_brand= '"+a24+"' where cust_id= '"+a2+"'";
			int res9=st9.executeUpdate(updateQuery);
			
			if(res9==0)
			{
				System.out.println("Record not updated");
			}
			else
			{ 
				System.out.println("Record  updated");
			}	
				
			
			
			st9.close();
			con9.close();
			break;
	    case 5:
	    	Connection con10 = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			Statement st10=con10.createStatement();
	    	System.out.println("Enter the vehicle model :-");
			String a25=sc.next();
			
			updateQuery="update customers set vehicle_model= '"+a25+"' where cust_id= '"+a2+"'";
			int res10=st10.executeUpdate(updateQuery);
			
			if(res10==0)
			{
				System.out.println("Record not updated");
			}
			else
			{ 
				System.out.println("Record  updated");
			}	
				
			
			
			st10.close();
			con10.close();
			break;
	    case 6:
	    	Connection con11 = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			Statement st11=con11.createStatement();
	    	System.out.println("Enter the vehicle number :-");
			String a26=sc.next();
			
			updateQuery="update customers set vehicle_no= '"+a26+"' where cust_id= '"+a2+"'";
			int res11=st11.executeUpdate(updateQuery);
			
			if(res11==0)
			{
				System.out.println("Record not updated");
			}
			else
			{ 
				System.out.println("Record  updated");
			}	
				
			
			
			st11.close();
			con11.close();
			break;
	    case 7:
	    	Connection con12 = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			Statement st12=con12.createStatement();
	    	System.out.println("Enter the address :-");
			String a27=sc.next();
			
			updateQuery="update customers set cust_address= '"+a27+"' where cust_id= '"+a2+"'";
			int res12=st12.executeUpdate(updateQuery);
			
			if(res12==0)
			{
				System.out.println("Record not updated");
			}
			else
			{ 
				System.out.println("Record  updated");
			}	
				
			
			
			st12.close();
			con12.close();
			break;
	    case 0:
			break;
			
		default :
			System.out.println("Enter valid input");
	    }
	    
		
		
		}while(I11 != 0);
		
		
		}catch (Exception e) {
	        System.out.println("An error occurred: " + e.getMessage());
	    }
    }
    public void DeleteCustomerRecord() {
    	try {
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection con2 = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
		Statement st2=con2.createStatement();
        
		System.out.println("Enter customer id to delete:-");
		int a=sc.nextInt();
		
		String deleteQuery="delete from customers where cust_id= '"+a+"'";
		
		int res2=st2.executeUpdate(deleteQuery);
		
		if(res2==0)
		{
			System.out.println("Record not deleted");
		}
		else
		{ 
			System.out.println("Record  deleted");
		}	
			
		
		
		st2.close();
		con2.close();
    	}catch (Exception e) {
	        System.out.println("An error occurred: " + e.getMessage());
	    }
    }
    public void ViewSingleRecord() {
    	try {
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection con4 = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
		Statement st4=con4.createStatement();
        
		System.out.println("Enter customer id to print values:-");
		int a4=sc.nextInt();
		
		String selectQuery="select * from customers where cust_id= ?";
		PreparedStatement preparedStatement=con4.prepareStatement(selectQuery);
		preparedStatement.setInt(1, a4);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
            int custId = resultSet.getInt("cust_id");
            String custName = resultSet.getString("cust_name");
            String custmobno= resultSet.getString("cust_mobile");
            String custEmail=resultSet.getString("cust_email");
            String vehicleBrand=resultSet.getString("vehicle_brand");
            String vehicleModel=resultSet.getString("vehicle_model");
            String vehicleNo=resultSet.getString("vehicle_no");
            String address=resultSet.getString("cust_address");

            System.out.println("Customer ID: " + custId);
            System.out.println("Customer Name: " + custName);
            System.out.println("customer mobile number"+custmobno);
            System.out.println("customer email"+custEmail);
            System.out.println("vehicle Brand: " + vehicleBrand);
            System.out.println("vehicle Model: " + vehicleModel);
            System.out.println("vehicle Number: " + vehicleNo);
            System.out.println("Customer address: " + address);
            System.out.println();
            
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
    	Connection con5 = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

        String selectQuery1 = "SELECT * FROM customers";
        PreparedStatement preparedStatement1 = con5.prepareStatement(selectQuery1);

        ResultSet resultSet1 = preparedStatement1.executeQuery();

        while (resultSet1.next()) {
        	int custId = resultSet1.getInt("cust_id");
            String custName = resultSet1.getString("cust_name");
            String custmobno= resultSet1.getString("cust_mobile");
            String custEmail=resultSet1.getString("cust_email");
            String vehicleBrand=resultSet1.getString("vehicle_brand");
            String vehicleModel=resultSet1.getString("vehicle_model");
            String vehicleNo=resultSet1.getString("vehicle_no");
            String addr=resultSet1.getString("cust_address");

            System.out.println("Customer ID: " + custId);
            System.out.println("Customer Name: " + custName);
            System.out.println("customer mobile number: "+custmobno);
            System.out.println("customer email: "+custEmail);
            System.out.println("vehicle Brand: " + vehicleBrand);
            System.out.println("vehicle Model: " + vehicleModel);
            System.out.println("vehicle Number: " + vehicleNo);
            System.out.println("Customer address: " + addr);
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

