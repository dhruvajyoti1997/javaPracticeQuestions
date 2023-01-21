package ThirdRepo;

import java.util.Arrays;
import java.util.HashSet;

public class Test9 {
public static void main(String[] args) {
	
	 		int arr[] = {1, 2, 3, 5, 4, 7, 10};
	 		//sort all the odd numbers in descending and even numbers in ascending
	 		//-7 -2 -1 -3 -5 -10 -4
	 		
	 		//approach 1. make all the odd numbers negative 2. sort the array 
	 		//3. revert the negative changes and make it as original ( postive number)
	 		for(int i=0; i < arr.length; i++) {
	 			if(arr[i]%2 != 0) {
	 			arr[i] = arr[i] * -1;
	 			}
	 			System.out.println("negative number -->"+arr[i]);
	 		}
	 		Arrays.sort(arr);
	 		System.out.println("After sorting all the numbers -->"+Arrays.toString(arr));
	 		for(int i=0; i < arr.length; i++) {
	 			if(arr[i]%2 != 0) {
	 			arr[i] = arr[i] * -1;
	 			}
	 		}
	 		
	 		System.out.println("result after sorting -->"+Arrays.toString(arr));
	 		
	 		//sub array
	 		
//	 		int subArr[] = {15,-2,2,-8,1,7,10,23};
//	 		int sum =0;
//	 		int maxLenght=0;
//	 		int n=subArr.length;
//	 		for (int i=0; i <n; i++) //This loop will select start element
//	 		{
//	 		for (int j=i; j<n; j++)   //This loop will select end element
//	 		{
//	 		for (int k=i; k<=j; k++) //This loop will print element from start to end
//	 		 
//	 		{
//	 			sum = sum +subArr[k];
//	 			if(sum ==0) {
////	 		    System.out.print( subArr.length);
////	 		    break;
//	 				if(maxLenght < j-i+1) {
//	 					maxLenght = j-i+1;
//	 				}
//	 			}
//	 		}
//	 		//System.out.println();
//	 		}
//	 		}
//	 		System.out.println(maxLenght);
	 		
	 		// Missing Number Question
	 		int missingArray[] = {1,2,4,5};
	 		int n = missingArray.length+1; // we are adding 1 beacause we know , the number is missing
	 		int totalSum =  ((n)*(n+1))/2; // need to calculate sum of first n natural numbers.
	 		int missingSum=0;
	 		System.out.println(totalSum);
	 		
//	 		for(int i=0; i < n ; i++) {
//	 			
//	 		}
	 		
	 		missingSum = Arrays.stream(missingArray).sum();
	 		int missingResult = totalSum-missingSum;
	 		//System.out.println(missingSum);
	 		System.out.println("missing sum is -->"+missingResult) ;
	 		
	 		//check the sum in a array is equal to sum.
	 		int arraySum[] = {3, 4, 7, 1, 2, 9, 8};
	 		HashSet<Integer> hs = new HashSet<>();
	 		
	 		for(int i=0; i< arraySum.length; i++) {
	 			for(int j= i+1; j < arraySum.length; j++) {
	 				
	 				if(hs.contains(arraySum[i]+ arraySum[j])) {
	 					System.out.println("1");
	 					
	 				}
	 				else {
	 				hs.add(arraySum[i]+ arraySum[j]);
	 				}
	 			}
	 		}
	 		
	 		
}
}
