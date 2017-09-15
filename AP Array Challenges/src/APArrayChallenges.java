import java.util.Scanner;
public class APArrayChallenges
	{

		public static void main(String[] args)
			{
			//printDessertNums();	
			totalOddAndEvenNums();
			}
		public static void printDessertNums()
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Hello, how many favorite desserts do you have?");
			int dessertNum = userInput.nextInt();
			int[]numArray = new int [dessertNum];
			String[]dessert = new String [dessertNum];
			Scanner userInputDessert = new Scanner(System.in);
			for (int i = 0; i<dessertNum; i++)
				{
					System.out.println("What is your favorite dessert?");
					String dessertName = userInputDessert.nextLine();
					dessert[i] = dessertName;
				}
			for (int j = 0; j<dessertNum; j++)
				{
			System.out.println(dessert[j]);
				}
		}
		public static void totalOddAndEvenNums()
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Hello, please input 8 numbers");
			
			int[]numArray = new int [8];
			for (int i = 0; i<8; i++)
				{
					int userNums = userInput.nextInt();
					numArray[i] = userNums;
					int oddNums 
			
			
				}
			
			
				
		}

	}
