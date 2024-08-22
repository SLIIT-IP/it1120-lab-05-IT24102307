import java.util.Scanner;

public class IT24102307Lab5Q3
{
    public static void main(String[] args)
    {

	final double ROOM_CHARGE = 48000.0;
	final double DIS_3to4_DAYS = 0.1;
	final double DIS_5_OR_MORE = 0.2;
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter Start Date (1-31):");
	int startdate = scanner.nextInt();
	System.out.print("Enter End Date (1-31):");
	int enddate = scanner.nextInt();

	if (startdate>31 || startdate<1 || enddate>31 || enddate<1) {
	    System.out.println("Error: Days must be between 1 and 31");
	    return;
	}
	if (startdate > enddate) {
	    System.out.println("Error: Start Date must be less than End Date");
	    return;
	}

	int numofdays = enddate - startdate;
	double totalamount = numofdays * ROOM_CHARGE;

	if (numofdays>1 && numofdays<3) 
	    totalamount = totalamount;

	if (numofdays==3 || numofdays==4) 
	    totalamount = totalamount - (totalamount * DIS_3to4_DAYS);

	if (numofdays>4) 
	    totalamount = totalamount - (totalamount * DIS_5_OR_MORE);

	System.out.println();
	System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE+ "/=");
	System.out.println("Number of Days Reserved: " + numofdays);
	System.out.println("Total Amount to be paid: " + totalamount);

    }
}