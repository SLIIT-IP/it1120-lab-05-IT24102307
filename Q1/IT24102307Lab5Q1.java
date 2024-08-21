import java.util.Scanner;

public class IT24102307Lab5Q1 
{
    public static void main(String[] args) 
    {

	Scanner input = new Scanner(System.in);

	int number1,number2,number3,largest,smallest;

        System.out.print("Enter First Integer: ");
        number1 = input.nextInt();

        System.out.print("Enter Second Integer: ");
        number2 = input.nextInt();

        System.out.print("Enter Third Integer: ");
        number3 = input.nextInt();

	largest=number1;
	smallest=number1;

	if(number2 > number1)
		largest = number2;
	if(number3 > largest)
		largest = number3;
	if(number2 < smallest)
		smallest = number2;
	if(number3 < smallest)
		smallest = number3;

	System.out.println();
	System.out.println("User entered numbers are : " +number1+" "+number2+" "+number3);
	System.out.println("The Smallest number is " + smallest);
	System.out.println("The Largest number is " + largest);

    }
}