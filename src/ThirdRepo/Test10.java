package ThirdRepo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//equilibrium index
		
		int arr[] = { 1,2,3,4,5,1,3,2,4 };
		
		int right_sum=0; 
		int left_sum=0;
		for(int i=0; i< arr.length; i++) {
			right_sum = right_sum + arr[i];
		}
		for(int i=0; i< arr.length;i++) {
			right_sum= right_sum - arr[i];
			
			if(right_sum == left_sum) {
				int position = i+1;
				System.out.println("equilibrium postion is -->"+ position);
			}
			
			left_sum= left_sum + arr[i];
		}
		
		//find  pairs of a give sum
		
		int [] num = { 8, 7, 2, 5, 3, 1};
		int target = 10;
		
		for(int i=0; i < num.length; i++) {
			for(int j= i+1; j< num.length; j++) {
				int sum_pair = num[i]+ num[j];
				if(sum_pair == target) {
					
					//System.out.printf(" pairs are --> %d , %d" , num[i] , num[j]);
					
				}
			}
		}
		
		//remove duplicate from a sorted array
		
		int[] sorted_array= {1,2,2};
		int[] result = Arrays.stream(sorted_array).distinct().toArray();
		Arrays.stream(result).forEach(System.out:: println);
		
	//List<Employee> list = list.sort(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName));
		//https://howtodoinjava.com/java/sort/sort-on-multiple-fields/
		
		//check the string cases based of first character of string.
		String check = "Qh";
		System.out.println(checkCasesOfString(check));
		
		//pattern searching.
		
		String pattern_search = "geeksforgeeks";
		
		String pattern_tobe_compare = "for";
		
		System.out.println(patternSearching(pattern_search , pattern_tobe_compare));
		
		String s1=  "IndiaVsAustralia";
		String s2 = "AustraliaIndiaVs";
		
		System.out.println("check the rotation-->"+ stringRotationCheck(s1,s2));
		
		String orgstr = "Thisisdemostring";
		char search ='i';
		int count =0;
		
		System.out.println("occurance of character in a string-->"+occuranceOfCharacterInaString(orgstr, search, count));
		
		String S1 = "mounotoain";
		char ch ='o';
		int countVal =3;
		System.out.println("remainingString --->"+ remainingString(S1, ch, countVal));
		
		
		
	}
	
	private static String checkCasesOfString(String var) {
        if(Character.isLowerCase(var.charAt(0))) {
        	 return var.toLowerCase();
        }
        	return  var.toUpperCase();
		
	}

	private static int patternSearching(String search, String compare) {
//	wrong code
		//for(int j=0; j< search.length(); j++) {
//		for(int i=0; i< compare.length(); i++) {
//			if(search.charAt(j) == compare.charAt(i)) {
//				return 1;
//			}
//		}
//	}
//		return 0;
//	}
		return search.contains(compare) ? 1:0;
	}
	
	private static int stringRotationCheck(String s1,  String s2) {
		//we have to concatine the original String then check with the second string
		if(s1.length() != s2.length()) {
			return 0;
		
		}
		
		String concatString = s1.concat(s1);
		
		if(concatString.contains(s2)) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	private static int occuranceOfCharacterInaString(String s, char match, int count) {

//		char [] characterOfString = orgstr.toCharArray();
		for(int i=0; i < s.length(); i++) {
			
			if(s.charAt(i) == match) {
				count++;
			}
		}
		return count;
		
	}
	
	private static String remainingString(String S, char ch ,int count) {
			   
		       int temp=0;
		       if(count==0)
		       {
		           return S;
		       }
		       for(int i=0; i<S.length(); i++)
		       {
		           if(S.charAt(i)==ch)
		           {
		               temp++;
		           }
		           if(temp==count)
		               return S.substring(i+1);
		       }
		       return "Empty string";
		   }
}
