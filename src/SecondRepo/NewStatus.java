package SecondRepo;
import java.util.*;
import java.util.stream.Collectors;
public class NewStatus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	ArrayList<Integer> num = new ArrayList<Integer>();
		List<Integer> list = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);
		//largest number in a list
	Optional<Integer>max=	list.stream().max((i,j) -> i.compareTo(j));
		
		System.out.println(max);
		
		//ascending order of numbers.
		
		List<Integer> asc=list.stream().sorted().collect(Collectors.toList());
		System.out.println(asc+"ascending order");
		
		//descending order of numbers.
		List<Integer> dsc = list.stream().sorted(/* Collections.reverseOrder() */ Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(dsc+"descending order");
		
		//sum of elements
		Integer sum=list.stream().reduce(0, (a,b) -> a+b);
		list.stream().collect(Collectors.summingInt(Integer -> Integer.intValue()));
		System.out.println(sum);
		
		//calculate the largest number
		
		Integer maxNum= list.stream().max(Comparator.comparing(i -> i)).get();
		System.out.println("MAXNUM -->"+ maxNum);
		list.stream().max(Comparator.comparing(Integer :: valueOf)).get();
		Integer minNum=list.stream().min(Comparator.comparing(i ->i)).get();
		
		System.out.println("Minimum -->"+ minNum);
		
//		Concurrent Modification Exception
//		ArrayList<Integer> numbers = new ArrayList<Integer>();
//		numbers.add(1); numbers.add(2);  numbers.add(3);  numbers.add(4); 
//		
//		Iterator<Integer> itr = numbers.iterator();
//		while(itr.hasNext()) {
//			Integer rs = itr.next();
//			if(rs.equals(2)) {
//				numbers.remove(rs);
//			}
//		}
		
		StringJoiner stj = new StringJoiner(",");
        // Separated the elements with a comma in between.
         
        stj.add("Saket");
        stj.add("John");
        stj.add("Franklin");
        stj.add("Ricky");
        stj.add("Trevor");
         
        // Added elements into StringJoiner “stj”
         
        System.out.println(stj);
        
        //https://www.softwaretestinghelp.com/java-8-interview-questions/
	
	}

}
