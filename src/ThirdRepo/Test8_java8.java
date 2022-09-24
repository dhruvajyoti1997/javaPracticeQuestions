package ThirdRepo;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import EmpDetails.Employee;
public class Test8_java8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();
		list.add("Murrit"); list.add("john"); list.add("piter"); list.add("marek"); list.add("mac");
		
		list.stream().filter(s -> s.startsWith("m"))
				/* .map(s -> s.toLowerCase()) */.forEach(t -> System.out.println(t));
		
		//MAP - data transformation - one to one mapping // convert one form to other and return to another stream
		//flatmap - data transformation + flatering // to convert different stream to a single stream is done by flatmap
		
		
		Map<String , Integer> map_example = new HashMap<>();
		
		map_example.put("eight", 8);
		map_example.put("nine", 9);
		map_example.put("one", 1);
		map_example.put("six", 6);
		map_example.put("four", 4);
		map_example.put("three", 3);
		
		//convert map to list
		List<Entry<String , Integer>> list_map = new ArrayList<>(map_example.entrySet());
		
		//sorting the array
		
//		Collections.sort(list_map , new Comparator<Entry<String , Integer>>() {
//
//			@Override
//			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
//				// TODO Auto-generated method stub
//				return o1.getKey().compareTo(o2.getKey());
//			}
//			
//		});
//		
//		for(Entry<String , Integer> result_entry : list_map) {
//			System.out.println(result_entry.getKey() + "  "+ result_entry.getValue());
//		}
		
		map_example.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out :: println);
		
		System.out.println("************************************************");
		
		map_example.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out :: println);
		
		System.out.println("************************************************");
		
		List<String> list_ex = new ArrayList<>();
		list.add("10"); list.add("12"); list.add("17"); list.add("20"); list.add("40");
		
	List<String> result_0=	list_ex.stream().filter(s -> s.startsWith("1")).collect(Collectors.toList());
		
	System.out.println("Result"+ result_0);
		
	List<Integer> result_1=	list_ex.stream().map(x -> Integer.valueOf(x)).collect(Collectors.toList());
	
	System.out.println("Result"+ result_1);
		
	}

}
