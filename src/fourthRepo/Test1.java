package fourthRepo;
import java.util.*;
import java.util.stream.Collectors;
public class Test1 {
public static void main(String[] args) {
	
	//sort in 0,1,2
	int[] arr = {0,1,2,1,2,0};
	
	int temp=0;
	for(int i=0; i < arr.length; i++) {
		for(int j=i+1; j< arr.length; j++) {
			
			if(arr[i] >= arr[j]) {
				
				temp =arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
	
	for(int i=0; i < arr.length;i++) {
	//	System.out.println(arr[i]);
	}
	
//	ArrayList<Integer> lista= new ArrayList<Integer>();
//	lista.add(10); lista.add(40);  lista.add(99);  lista.add(49);  lista.add(38);  lista.add(24); 
//	ArrayList<Integer> listb= new ArrayList<Integer>();
//	lista.add(57); lista.add(98);  lista.add(99);  lista.add(28);  lista.add(19);  lista.add(46); 
//	ArrayList<Integer> listc= new ArrayList<Integer>();
//	lista.add(10); lista.add(100);  lista.add(99);  lista.add(99);  lista.add(20);  lista.add(24); 
//	
//	ArrayList<Integer > listRes =(ArrayList<Integer>) lista.stream().filter(li -> listb.contains(li)).filter(li -> listc.contains(li)).collect(Collectors.toList());
//
//   System.out.println(listRes);
	
	
	//first repeating element of an array
 int arr1[] = {1, 5, 3, 4, 3, 5};
 
 Set<Integer> s = new HashSet<>();
 int firstRepeatingNum =0;
 for(int i = arr1.length -1 ; i>=0; i--) {
	 
	 if(s.contains(arr[i])) {
		 firstRepeatingNum = arr[i];
		 
	 } else {
		 s.add(arr[i]);
	 }
 }
	 //System.out.println("value-->"+firstRepeatingNum);
	 
	 //remove vowels from a string
	 
	 //Algorithm
	 /*
	  * create a string builder
	  * create hashset and add all the alphabets
	  * iterate the string and check whether it should not contains vowels from hashset and then append the string builder
	  * then convert into to string of stringbuilder
	  * */
	 
	 String Str= "leetcodeisacommunityforcoders";
	 
	 StringBuilder resultString = new StringBuilder();
	 
	 HashSet<Character> vowels = new HashSet<Character>();
	 vowels.add('a'); vowels.add('e');  vowels.add('i');  vowels.add('o');  vowels.add('u'); 
	 
	 for (Character c : Str.toCharArray()) {
		if(!vowels.contains(c)) {
			resultString.append(c);
		}
	}
	 
	// System.out.println(""+resultString.toString());
	 
	 //String Truncate
	
	 /* Algorithm
	  * create one array of string and split the spaces
	  * create one string builder
	  * loop till less of the length then append the value of array in string builder
	  * if(i+1 != k) then append the string builder with the space ("")
	  * */
	 
	 String Str2= "Hello how are you Contestant";
	 int k= 3;
	 String arr3[] = Str2.split(" ");
	 
	 StringBuilder truncateResult = new StringBuilder();
	 
	 for(int j=0; j<k ; j++) {
		 
		 truncateResult.append(arr3[j]);
		 
		 if(j+1 !=k) {
			 truncateResult.append(" ");
		 }
		 
	 }
	 System.out.println("final output -->"+truncateResult);

}




}
