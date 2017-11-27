import java.util.Scanner;

public class APArrayChallenges
	{

		public static void main(String[] args)
			{
				//printDessertNums();
				//totalOddAndEvenNums();
				printBackwards();
			}

		public static void printDessertNums()
			{
				//hello this is my comment
				Scanner userInput = new Scanner(System.in);
				System.out.println("Hello, how many favorite desserts do you have?");
				int dessertNum = userInput.nextInt();
				int[] numArray = new int[dessertNum];
				String[] dessert = new String[dessertNum];
				Scanner userInputDessert = new Scanner(System.in);
				for (int i = 0; i < dessertNum; i++)
					{
						System.out.println("What is your favorite dessert?");
						String dessertName = userInputDessert.nextLine();
						dessert[i] = dessertName;
					}
				for (int j = 0; j < dessertNum; j++)
					{
						System.out.println(dessert[j]);
					}
				System.out.println(" ");
			}

		public static void totalOddAndEvenNums()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Hello, please input 8 numbers");

				int[] numArray = new int[8];
				int oddSum = 0;
				int evenSum = 0;
				for (int i = 0; i < 8; i++)
					{
						int userNums = userInput.nextInt();
						numArray[i] = userNums;
						if (userNums % 2 == 1)
							{
								oddSum+=numArray[i];
							}
						if (userNums % 2 == 0)
							{
								evenSum+=numArray[i];
							}

					}
				System.out.println("The sum of all the odd numbers is  " + oddSum + " and the sum of all the even numbers is " + evenSum);

			}
		public static void printBackwards()
		{
			int[]numArray = new int [5];
			for (int i = 0; i<5; i++)
				{
			int randomNumber = (int)(Math.random()*20)+10;
			numArray[i] = randomNumber;
			System.out.println(numArray[i]);
				}
			System.out.println(" ");
			
			for (int j = numArray.length-1; j>=0; j--)
				{
					System.out.println(numArray[j]);
				}
			
		}
	}
