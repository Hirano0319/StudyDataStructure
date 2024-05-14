package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayVsLink {
	public static void main(String args[]) {
		int count = 1000;
		
		testArrayList(count);
		testLinkedList(count);
	}
	
	private static void testArrayList(int count) {
		List<String> list = new ArrayList<String>();
		for(int i = 0; i <= count; i++) {
			list.add("Test:" + i);
		}
		
		for(int i = 0; i <= count; i++) {
			String str = list.get(i);
			if (i % 1000 == 0) {
				System.out.println(str);
			}
		}
	}

	private static void testLinkedList(int count) {
		List<String> list = new LinkedList<String>();
		for(int i = 0; i <= count; i++) {
			list.add("Test:" + i);
		}
		
		for(int i = 0; i <= count; i++) {
			String str = list.get(i);
			if (i % 1000 == 0) {
				System.out.println(str);
			}
		}
	}

}
