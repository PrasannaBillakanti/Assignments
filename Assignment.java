package flowcontrol;

import java.util.Scanner;

public class Assignment {
	Scanner Scan = new Scanner(System.in);// Scanner class object
	// Q1:Write a java program to get a no.from user to print whether it is positive
	// or negative

	public void posorneg() {
		int num;// declaring the variable
		System.out.println("Enter a number");
		// reading input from user
		num = Scan.nextInt();
		// checking whether the given no. is positive or negative
		if (num >= 0)
			System.out.println("It is a Positive number");
		else
			System.out.println("It is a negative number");
	}

	// Q2:write a program to print the greatest number among 3 numbers
	public void greatest() {
		int a, b, c;// declaring variables
		System.out.println("Enter first number:");
		a = Scan.nextInt();// reading first no. from user
		System.out.println("Enter second number:");
		b = Scan.nextInt();// reading second no.from user
		System.out.println("Enter third number:");
		c = Scan.nextInt();// reading third no.from user
		if (a > b && a > c)// prints a if the condition is true
			System.out.println("First no. is greatest number ");
		else if (b > c)// prints b if the condition is true
			System.out.println("Second no. is greatest number");
		else
			// prints c ,if the condition defined in both above cases is false
			System.out.println("Third no. is greatest number");
	}

	// Q3:write a program that prints the name of weekday by taking inputno. from
	// the user between 1-7
	public void weekday() {
		int num;// declaring the variable
		// reading input from user
		System.out.println("Enter a number:");
		num = Scan.nextInt();
		switch (num) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid number");
			break;
		}
	}

	// Q4:write a program in java to input 5 numbers from keyboard and find their
	// sum and average
	public void sumandavg() {
		// declaring and initializing the variables
		int sum = 0, n = 0;
		double avg;
		System.out.println("Enter 5 numbers");
		for (int i = 0; i < 5; i++)// loop executes until the condition is false
		{
			n = Scan.nextInt();// reading input from the user
			sum = sum + n;// adding n value to the sum variable

		}
		System.out.println("Sum of 5 numbers is:" + sum);// printing sum

		avg = sum / 5;
		System.out.println("Average of 5 numbers is:" + avg);// printing average
	}

	// Q5:write a program to display the first 10 natural numbers
	public void natural() {
		// prints the first 10 natural numbers
		System.out.println("The first 10 natural numbers are:");
		for (int i = 1; i <= 10; i++)// loop executes until the condition becomes false
		{
			System.out.println(i);
		}
	}

	// Q6:write a program to take product information using scanner like
	// productid,productname,productprice,quantity,category,brand and display
	public void product() {
		// declaring the variables
		int id, quantity, n;
		String name, category, brand;
		float price;
		System.out.println("Enter the no. of products:");
		n = Scan.nextInt();
		for (int i = 0; i < n; i++)// loop executes until the condition is false
		{
			// reading product details from user
			System.out.println("Enter Product id");
			id = Scan.nextInt();
			System.out.println("Enter product name");
			name = Scan.next();
			System.out.println("Enter category");
			category = Scan.next();
			System.out.println("Enter brand");
			brand = Scan.next();
			System.out.println("Enter price");
			price = Scan.nextFloat();
			// displaying product information
			System.out.println("Product id" + id);
			System.out.println("Product name" + name);
			System.out.println("Product category" + category);
			System.out.println("Product brand" + brand);
			System.out.println("Product price" + price);
		}
	}

	public static void main(String[] args) {
		int a;// declaring variable
		Assignment obj = new Assignment();// object creation
		// list of choices to enter
		System.out.println("1.check whether the given no. is positive or negative ");
		System.out.println("2.finding the greatest number ");
		System.out.println("3.Displaying the name of weekday by selecting the numbers between 1-7");
		System.out.println("4.Finding the Sum and Average");
		System.out.println("5.Displaying the first 10 natural numbers");
		System.out.println("6.Displaying Product information");
		System.out.println("7.Exit");
		while (true)// loop exeecutes infinite no.of times
		{
			Scanner sc = new Scanner(System.in);// Scanner class object
			System.out.println("Enter your choice between 1-7");
			a = sc.nextInt();
			switch (a) {
			case 1:
				obj.posorneg();
				break;
			case 2:
				obj.greatest();
				break;
			case 3:
				obj.weekday();
				break;
			case 4:
				obj.sumandavg();
				break;
			case 5:
				obj.natural();
				break;
			case 6:
				obj.product();
				break;
			case 7:
				System.exit(a);
				break;
			default:
				System.out.println("Invalid choice");
			}
		}
	}

}
