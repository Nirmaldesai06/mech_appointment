package mechanic;




	/*import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.Statement;*/
	import java.util.Scanner;



	public class Mech_Appointment{

		
		private static Scanner sc;

		public static void main(String[] args)throws Exception{
			sc = new Scanner(System.in);
			int ch;
			do {
			
				System.out.println("^^^^^^^^^^^^^^^^ WELCOME ,YOU ARE NOW IN THE MAIN MENU ^^^^^^^^^^^^^");
				System.out.println(" ^^^^^^^^^ SELECT ANY ONE OF THE FOLLOWING ^^^^^^^^^");
				System.out.println("                     1.Customer                       ");
				System.out.println("                     2.Mechanic                        ");
				System.out.println("                     3.Appointment                    ");
				System.out.println("                     0.Exit                          ");
			
				customer_menu cust = new customer_menu();
		    ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				int ch1;
				System.out.println("^^^^^^^^^^^^^ CUSTOMER MENU ^^^^^^^^^^^^");
				do {
				System.out.println("^^^^^^  SELECT ANY ONE FROM THE FOLLOWING ^^^^^^");
				System.out.println("               1.Register a Customer             ");
				System.out.println("               2.Modify Customer details      ");
				System.out.println("               3.Delete Record of Customer        ");
				System.out.println("               4.View Single Record            ");
				System.out.println("               5.View all Records              ");
				System.out.println("               0.Exit to Main Menu       ");
				
				
				ch1=sc.nextInt();
				
				switch(ch1)
				      {
				case 1:
					cust.RegisterCustomer();
					
					break;
				
					
				case 2:
					cust.ModifyCustomerDetails();
					
					break;
					
					
				case 3:
					cust.DeleteCustomerRecord();					
					
					break;
					
					
				case 4:
					
					cust.ViewSingleRecord();
					
		            break;
		            
				case 5:
					cust.ViewAllRecords();
					break;
			        
				case 0:
					
					break;
					
				default :
					
					System.out.println("Enter a valid key");
					break;
					
				      }
				
				}while(ch1 !=0);
				
				break;
				
				
			case 2:
				int I2;
				do {
				System.out.println("^^^^^^^^ YOU ARE NOW IN MECHANIC MENU ^^^^^^^^");
				System.out.println("^^^^  SELECT ANY ONE FROM THE FOLLOWING ^^^^");
				System.out.println("                  1.View Single Record");
				System.out.println("                  2.View all Records");
				System.out.println("                  0.Exit to Main Menu");
				
				mechanic_menu mech = new mechanic_menu();
				I2=sc.nextInt();
				switch(I2)
				{
				case 1:
					mech.viewSingleRecord();
					
		            break;
		            
				case 2:
					 mech.viewAllRecords();
				}
				
				}while(I2 != 0);
				break;
				
			case 3:
				int I3;
				do {
				
				System.out.println("^^^^^^^^ YOU ARE NOW IN APPOINTMENT MENU ^^^^^^^^");
				System.out.println("^^^^  SELECT ANY ONE FROM THE FOLLOWING OPTIONS ^^^^");
				System.out.println("                1.Book an Appointment             ");
				System.out.println("                2.Modify Appointment details      ");
				System.out.println("                3.Delete an Appointment           ");
				System.out.println(" 		4.View Single Record              ");
				System.out.println(" 		5.View all Records                ");
				System.out.println("                0.Exit to Main Menu               ");	
				appointment_menu app = new appointment_menu();
				I3=sc.nextInt();
				switch(I3)
				{
				case 1:
					app.BookAppointment();
				 break;
				case 2:
					app.ModifyAppointmentDetails();
								
					break;
				
				case 3:
					
					app.DeleteAppointment();
					 break;
					
			    case 4:
			    	app.ViewSingleRecord();
				             break;
			    case 5:
			    	app.ViewAllRecords();
			    	break;
				case 0:
					System.out.println("exiting from appintment menu");
					break;
				default:
				    System.out.println("enter a valid input");
				    break;
				
				}
				
				}while(I3!=0);
				break;
				
				
			
			case 0:
				System.out.println("Thank You, please visit again.");
				break;
			
			}
			
	}while(ch != 0);
		}

	}
