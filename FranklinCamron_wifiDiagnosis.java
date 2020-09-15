import java.util.Scanner;
/**Camron Franklin, CMSC 203
Synthesis of Wi-Fi Diagnostic Program
*/

public class FranklinCamron_wifiDiagnosis {
	public static void main(String[] args) {
		
		
		   //Declare scanner variable, programmer tag, and fixed condition
		   Scanner input = new Scanner(System.in);
		   boolean fixed = false;
		   String tag = "Written by: Camron Franklin";
		   
		   
		   System.out.println("Welcome to Wi-Fi Diagnosis\n\n");
		   
		   
		   System.out.println("Please reboot your device at this time.\nPress enter to continue...");
		   input.nextLine();
		   //first diagnostic check
		   System.out.println("Is your device connected to the Wi-Fi? (enter true or false)");
		   fixed = input.nextBoolean();
		   
		   //get rid of residual newline character
		   input.nextLine();
		   
		   if (fixed) {
			   
			   System.out.println("Diagnosis Complete. Thank you.\n" + tag);
		   }
		   else
		   {
			   System.out.println("\nPlease reboot your Wi-Fi router at this time.\nPress enter to continue...");
			   input.nextLine();
			   
			   System.out.println("Is your device connected to the Wi-Fi? (enter true or false)");
			   fixed = input.nextBoolean();
			   
			   //get rid of residual newline character
			   input.nextLine();
			   
			   if (fixed) {
				   System.out.println("Diagnosis Complete. Thank you.\n" + tag);
			   }
			   else
			   {
				   System.out.println("\nPlease check the cable connections on your Wi-Fi router at this time.\nPress enter to continue...");
				   input.nextLine();
				   
				   System.out.println("Is your device connected to the Wi-Fi? (enter true or false)");
				   fixed = input.nextBoolean();
				   
				   //get rid of residual newline character
				   input.nextLine();
				   
				   if (fixed) {
					   System.out.println("Diagnosis Complete. Thank you.\n" + tag);
				   }
				   else 
				   {
					   System.out.println("\nPlease move closer to your Wi-Fi router at this time.\nPress enter to continue...");
					   input.nextLine();
					   
					   System.out.println("Is your device connected to the Wi-Fi? (enter true or false)");
					   fixed = input.nextBoolean();
					   
					   //get rid of residual newline character
					   input.nextLine();
					   
					   if (fixed) {
						   System.out.println("Diagnosis Complete. Thank you.\n" + tag);
					   }
					   else
					   {
						   System.out.println("Troubleshooting error. Please contact your ISP (Internet Service Provider)");
						   System.out.println("Diagnosis Complete. Thank you.\n" + tag);
					   }
				   }
			   }
		   }
		   input.close();
	   }
}