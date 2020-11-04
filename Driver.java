import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Driver {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(5);
		list.add(3);
		list.add(7);
		Set<Integer> set = new HashSet<>(list);
		System.out.println(set);
		
		Map<String, Integer> unordered = new HashMap<>();		
		unordered.put("zero", 0);
		unordered.put("one", 1);
		unordered.put("two", 2);
		unordered.put("three", 3);
		unordered.put("four", 4);
		unordered.put("five", 5);
		System.out.println("Hash" + unordered);
		unordered = new TreeMap<>(unordered);
		System.out.println("Tree" + unordered);
		/**
		 * The difference between HashMap ad TreeMap is that the output of HashMap is seemingly
		 * in a random order, while the TreeMap ordered the String values in ABC order.
		 * */
		
		/**
		 * TreeMap to guarantee order, as the tree will maintain insertion order for the type that
		 * is passed in as a key.
		 * */
	}

}
