package com.exercise;

public class Sample {

	
	int getInteger(int[] arr, int n)
	{
		for(int i = 0; i < arr.length; i++)
			if(arr[i]==n)
				return i;
		return -1;
	}

	void printArray(int[] arr)
	{
		System.out.println("Contents of the array:-");
		for(int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}
	
	int findMin(int[] arr)
	{
		int min = INT_MAX;
		for(int i = 0; i < arr.length; i++)
			if(arr[i] < min)
				min = arr[i];
		return min;
	}

	int findMax(int[] arr)
	{
		int max = INT_MIN;
		for(int i = 0; i < arr.length; i++)
			if(max < arr[i])
				max = arr[i];
		return max;
	}

	int[] reverseArray(int[] arr)
	{
		int n = arr.length - 1;
		for(int i = 0; i < n; i++)
		{
			int temp = arr[i];
			arr[i] = arr[n];
			arr[n] = temp;
			n--;
		}
		return arr;
	}

	int[] sortIntegers(int[] arr)
	{
		int n = arr.length - 1;
		for(int i = 0; i < n; i++)
			if(arr[i+1]<arr[i])
			{
				int temp = arr[i];
				arr[i] = arr[n];
				arr[n] = temp;
				n--;
			}
		return arr;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr[] = {2, 3, 8, 4, 6, 5};
		System.out.println("Array Operation:- \n1. Enter Array: \n2. Output Array \n3. Get array index\n4. Find Min\n5.Find Max\n6. Reverse\n7. Sort\n 8. Exit\n Enter your choice: ");
		System.out.println("Hello sample world!");
	}
}
