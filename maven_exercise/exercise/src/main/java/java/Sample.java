package com.exercise;

import java.util.Scanner;

public class Sample {

	
	public static int getInteger(int[] arr, int n)
	{
		for(int i = 0; i < arr.length; i++)
			if(arr[i]==n)
				return i+1;
		return -1;
	}

	public static void printArray(int[] arr)
	{
		System.out.println("Contents of the array:-");
		for(int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}
	
	public static int findMin(int[] arr)
	{
		int min = 1000;
		for(int i = 0; i < arr.length; i++)
			if(arr[i] < min)
				min = arr[i];
		return min;
	}

	public static int findMax(int[] arr)
	{
		int max = -1000;
		for(int i = 0; i < arr.length; i++)
			if(max < arr[i])
				max = arr[i];
		return max;
	}

	public static int[] reverseArray(int[] arr)
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

	public static int[] sortIntegers(int[] arr)
	{
		int n = arr.length;
		for(int i = 0; i < n; i++)
			for(int j = i + 1; j < n; j++ )
			if(arr[i]<=arr[j])
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		return arr;
	}

	public static int[] inputarray(int[] arr, int n)
	{
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		return arr;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[20];
		int n;
		System.out.println("Array Operation:- \n1. Enter Array: \n2. Output Array \n3. Get array index\n4. Find Min\n5. Find Max\n6. Reverse\n7. Sort\n8. Exit\n Enter your choice: ");
		n = sc.nextInt();
		do{

		
		switch(n)
		{
			case 1: System.out.println("Enter the input array length: "); int j = sc.nextInt(); arr = inputarray(arr, j);
					System.out.println("Array Operation:- \n1. Enter Array: \n2. Output Array \n3. Get array index\n4. Find Min\n5. Find Max\n6. Reverse\n7. Sort\n8. Exit\n Enter your choice: ");
					n = sc.nextInt();
					break;
			case 2: printArray(arr);
					System.out.println("Array Operation:- \n1. Enter Array: \n2. Output Array \n3. Get array index\n4. Find Min\n5. Find Max\n6. Reverse\n7. Sort\n8. Exit\n Enter your choice: ");
					n = sc.nextInt();
					break;
			case 3: System.out.println("Enter the value to be searched: "); 
					int i = sc.nextInt(); 
					System.out.println("Index of the element: " + getInteger(arr, i));
					System.out.println("\n\nArray Operation:- \n1. Enter Array: \n2. Output Array \n3. Get array index\n4. Find Min\n5. Find Max\n6. Reverse\n7. Sort\n8. Exit\n Enter your choice: ");
					n = sc.nextInt();
					break;
			case 4: System.out.println("Minimum value in the array: " + findMin(arr));
					System.out.println("\n\nArray Operation:- \n1. Enter Array: \n2. Output Array \n3. Get array index\n4. Find Min\n5. Find Max\n6. Reverse\n7. Sort\n8. Exit\n Enter your choice: ");
					n = sc.nextInt();
					break;
			case 5: System.out.println("Maximum value in the array: " + findMax(arr));
					System.out.println("\n\nArray Operation:- \n1. Enter Array: \n2. Output Array \n3. Get array index\n4. Find Min\n5. Find Max\n6. Reverse\n7. Sort\n8. Exit\n Enter your choice: ");
					n = sc.nextInt();
					break;
			case 6: System.out.println("Array reversed!!!");
					arr = reverseArray(arr);
					System.out.println("\n\nArray Operation:- \n1. Enter Array: \n2. Output Array \n3. Get array index\n4. Find Min\n5. Find Max\n6. Reverse\n7. Sort\n8. Exit\n Enter your choice: ");
					n = sc.nextInt();
					break;
			case 7: System.out.println("Array sorted!!!");
					arr = sortIntegers(arr);
					System.out.println("\n\nArray Operation:- \n1. Enter Array: \n2. Output Array \n3. Get array index\n4. Find Min\n5. Find Max\n6. Reverse\n7. Sort\n8. Exit\n Enter your choice: ");
					n = sc.nextInt();
					break;
			case 8: System.exit(0);
			default: System.out.println("Congratulations for messing with me!!!!!\n\nArray Operation:- \n1. Enter Array: \n2. Output Array \n3. Get array index\n4. Find Min\n5. Find Max\n6. Reverse\n7. Sort\n8. Exit\n Enter your choice: ");
					 n = sc.nextInt();
					 break;
		}
	}while(n!=8);


		System.out.println("Hello sample world!");
	}
}
