package ThirdRepo;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
		String s1 = "geeks";
		char [] arr = s1.toCharArray();
		HashMap<Character, Integer> map = new LinkedHashMap<>();
		
		for(int i=0; i < s1.length(); i++) {
			
			char ch = arr[i];
		//	System.out.println(ch);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
				
			} else {
				map.put(ch,1);
			}
			
		}
		System.out.println("duplicate elements ->"+ map);
		for(Map.Entry<Character, Integer> mp : map.entrySet()) {
			
			if(mp.getValue() == 1/*2*/) {
				System.out.println("removed the duplicate-->"+mp.getKey()+" ->"+mp.getValue());
			}
		}
		
		//longest non repeated substring
		String s2= "geeks";
		
		char [] arr2 = s2.toCharArray();
		
		String longestSubstring = null;
		int longSubstringLength = 0;
		HashMap<Character, Integer> map2 = new LinkedHashMap<>();
		for(int i=0; i < s2.length(); i++) {
			
			char ch1 = arr2[i];
			
			if(!map2.containsKey(ch1)) {
				map2.put(ch1, i);
			} else {
				i = map2.get(ch1);
				map2.clear();
				//System.out.println("value of i --> "+i);
			
			}
		}
		
		if(map2.size() > longSubstringLength) {
			longSubstringLength = map2.size();
			longestSubstring = map2.keySet().toString();
		}
		
		System.out.println(longestSubstring);
		//leetcode two sum
		int arr3[] = {3, 2,4};
		
		int target =6;
		int val[] = new int[2];
		
		
		for(int i=0; i < arr3.length; i++) {
			for(int j = i+1; j< arr3.length;j++) {
				if(arr3[j] == target - arr3[i]) {
					val[0] = i; //to print the index
					val[1] = j; // to print the index
					
					System.out.println(val[0] + "" + val[1]);
				}
			}
		}
		
		//palindrome question
		int a = 23;
		StringBuffer st = new StringBuffer();
		st.append(23);
		StringBuffer b = st.reverse();
		int b1 =Integer.parseInt(b.toString());
		//System.out.println(rev);
		
		int sum  = a+b1;
		int rev =0;
		int temp = sum;
		int r;
		while ( sum != 0) {
			 r = sum%10;
			rev = rev * 10 + r;
			sum = sum/10;
		}
	//	System.out.println(temp);
		if( rev == temp) {
			System.out.println("Palindrome");
		} else {
			System.out.println(" Not Palindrome");
		}
		
		//worst approach
		int arr4[]= {1,2,3,4};
		
		int sum1=0, sum2=0;
		int result=0;
		for(int i=0; i< arr4.length-2;i++) {
			sum1 = sum1+arr4[i];
			for(int j=i+2;j < arr4.length; j++ ) {
				sum2 = sum2+ arr4[j];
				break;
			}
			
		}
		result = sum1 * sum2; 
		System.out.println("multiply -->"+result);
		//count the occurance of a word from a string
		//1. try to extract the substring from string 2. declare a target of data type String 3. check if the substring and the target are equal 
		//4. if equal increment the count and then print the count
		String chars= "abchelloxyzhelloabchello";
		String result2 = "";
		String target1= "hello";
		int count =0;
		for (int i = 0; i < chars.length(); i++) {
	           for (int j = i+1; j <= chars.length(); j++) {
	            
	            result2=  chars.substring(i, j);
		 if(result2.equals(target1)) {
				count++;
			}
		
	           }}
		System.out.println("count the occurance of hello --> "+count);
		
		//remove duplicate
		
		String duplicate_str = "zvvo";
		
		char dup_chr []= duplicate_str.toCharArray();
		HashSet<Character> hashset = new LinkedHashSet<Character>(duplicate_str.length());
		
		for(Character c: dup_chr) {
			hashset.add(c);
		} 
		String after_duplicate="";
		for(Character s : hashset) {
			
			after_duplicate	 =s.toString();
			System.out.println("remove --->"+after_duplicate);
		}
		
		
		//Min Manipulations to make Strings Anagram
		//https://www.youtube.com/watch?v=33l2qAIgzz4
		String an1 = "rate";
		String an2 = "tars";
		int cnt = 0 ;
		int[] anagram_check = new int[26];
		//It is using a one liner to count the number of occurrences of a letter in a word. Lets look at this broken down:first[a[c]-'a']++;
		for(int i=0; i < an1.length(); i++) {
			anagram_check[an1.charAt(i) - 'a']++;
		}
		for(int i=0; i < an2.length(); i++) {
			anagram_check[an2.charAt(i) - 'a']--;
		}
		
		int total =0;
		
		for(int i : anagram_check) {
			total += Math.abs(i);
		}
		
		System.out.println(total +"----total---");
		
		
		//merge two arryas withut extra space.
		
		int[] arr5= {2,3,1,4};
		int[] arr6= {8,7,5,9};
		
		int length = arr5.length + arr6.length;
		
//		for(int i=0; i < arr5.length; i++) {
//			System.out.println(arr5[i]);
//		}
//		for(int i=0; i < arr6.length; i++) {
//			System.out.println(arr6[i]);
//		}
		Arrays.sort(arr5);
		Arrays.sort(arr6);
		int [] merge_result = new int[length];
		int position =0;
		for(int element : arr5) {
			merge_result[position] = element;
			position ++;
		}
		
		for(int element : arr6) {
			merge_result[position] = element;
			position++;
		}
		
		System.out.println("result of merge array-->"+ Arrays.toString(merge_result));
		
		
		//replace 0 with 5
		int replace_num = 1001;
		int digit, replace_sum =0;
		
//		while(replace_num > 0) {
//			digit = replace_num%10;
//			if(digit == 0) {
//				digit = 5;
//			}
//			
//			sum = sum *10 + digit;
//			
//			replace_num = replace_num/10;
//		}
//		
//		System.out.println("result -->"+sum);
		
		 String numToString = Integer.toString(replace_num).replace('0', '5');
		 
		 int result_replace = Integer.parseInt(numToString);
		 System.out.println("result -->"+ result_replace);
		
		 List<Integer> listOfIntegers = Stream.of("1", "2", "3", "4") .map(Integer::valueOf) .collect(Collectors.toList());
		 
		 System.out.println(listOfIntegers);
		 
	}

}
