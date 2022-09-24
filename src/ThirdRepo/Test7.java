package ThirdRepo;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//consumer functional Interface
		Consumer<Integer> consumer = t -> System.out.println("printing"+t);
		consumer.accept(10);
		
		List<Integer> listOfInteger = Arrays.asList(1,2,3,4,5);
		
		listOfInteger.stream().forEach(consumer);
		
		//predicate functional interface
		
		//commented for the alternate shortcut method
//		Predicate<Integer> predicate = (j) -> {
//			
//			if(j%2==0)return true;
//			else return false;
//		};
		Predicate<Integer> predicate = j -> j%2 == 0;
		System.out.println("check_even_odd-->"+ predicate.test(7));
		
		//supplier functional interface
		
		Supplier<String> supplier = () -> "hi welcome to java8";
		System.out.println("supplier Code->"+supplier.get());
		
		
		
   String st= "geeksforgeeks";
   
String st1 ="";
 
 for(int i=0; i < st.length();i=i+2) {
	 
	 
		 
		st1 = st1+ st.charAt(i);
	 
 }
 
 System.out.println("delete alter chars ->"+ st1);
 
 
 String N ="1234006";
int len = N.length()/2;
int left =0, right=0;

 char c[] = N.toCharArray();
 for(int i=0; i<= len; i++) {
	 
	left = left+ c[i];
	}
 for(int i= N.length() -1; i >= len; i--)
 {
	 right = right+c[i];
 }

 if(left == right) {
	 System.out.println("matched");
 } else {
	 System.out.println("not matched");
 }
 
 String str3= "hello";
 
 char str_val[] = str3.toCharArray();

 LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
 
 for(int i=0; i <str3.length();i++) {
 if(map.containsKey(str_val[i])) {
	 
	 map.put(str_val[i], map.get(str_val[i])+1);
 } else {
	 map.put(str_val[i], 1);
 }
 
 if(map.entrySet().stream().filter(val -> val.getValue() ==1).findFirst().isPresent()) {
	System.out.println("value is --> "+map.entrySet().stream().filter(val -> val.getValue() ==1).findFirst().get().getKey());
	break;
 }
	 
 }
 }
 
	

}
