package com.ex.functional;

public class ForEach {
	public static void main(String[] arg)
		{
			{
				int[] marks = { 125, 132, 95, 116, 110 };
				
				int highest_marks = maximum(marks);
				System.out.println("The highest score is " + highest_marks);
			}
		}
		public static int maximum(int[] numbers)
		{
			int maxSoFar = numbers[0];
			
			// for each loop
			for (int num : numbers)
			{
//				System.out.println(num);
//				if (num == maxSoFar) 
//			    {
//			        return num ;  // do not know the index of num
//			    }
				if (num > maxSoFar)
				{
					maxSoFar = num;
				}
			}
		return maxSoFar;
		}
	}

