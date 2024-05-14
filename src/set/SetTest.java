package set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest {

	private static int count = 5_000_000;
	private static String targetData1= "Test:10000000";
	private static String targetData2= "Test:10000001";
	private static List<String> targetDataList1 = Arrays.asList("Test:100000","Test:101");
	private static List<String> targetDataList2 = Arrays.asList("Test:10000","Test:10001");
	public static void main(String args[]) {
		testArrayList(count);
		System.out.println("=======================================\r\n");

		testHashSet(count);
		

	}
	

	private static void testArrayList(int count) {
		System.out.println("start:"+Thread.currentThread().getStackTrace()[1].getMethodName());
		long startTime = System.currentTimeMillis();

		List<String> list = new ArrayList<String>();
		for(int i = 0; i <= count; i++) {
			list.add("Test:" + i);
		}

		System.out.println("処理時間1（準備）：" + (System.currentTimeMillis() - startTime));
		startTime = System.currentTimeMillis();
		// ループ
		for(String data : list) {
		}
		System.out.println("処理時間2（空ループ）：" + (System.currentTimeMillis() - startTime));
		startTime = System.currentTimeMillis();

		// 要素の存在チェック
		System.out.println(list.contains(targetData1));
		System.out.println(list.contains(targetData2));
		System.out.println("処理時間3（存在チェック）：" + (System.currentTimeMillis() - startTime));
		startTime = System.currentTimeMillis();
		// 
		System.out.println(list.containsAll(targetDataList1));
		System.out.println(list.containsAll(targetDataList2));

		System.out.println("処理時間4（まとめて存在チェック）：" + (System.currentTimeMillis() - startTime));

		System.out.println("end:"+Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	private static void testHashSet(int count) {
		System.out.println("start:"+Thread.currentThread().getStackTrace()[1].getMethodName());

		long startTime = System.currentTimeMillis();
		Set<String> set = new HashSet<String>(count);
		for(int i = 0; i <= count; i++) {
			set.add("Test:" + i);
		}
		System.out.println("処理時間1（準備）：" + (System.currentTimeMillis() - startTime));
		startTime = System.currentTimeMillis();
		// ループ
		for(String data : set) {
		}
		System.out.println("処理時間2（空ループ）：" + (System.currentTimeMillis() - startTime));
		startTime = System.currentTimeMillis();
		// 要素の存在チェック
		System.out.println(set.contains(targetData1));
		System.out.println(set.contains(targetData2));
		System.out.println("処理時間3（存在チェック）：" + (System.currentTimeMillis() - startTime));
		startTime = System.currentTimeMillis();
		// 
		System.out.println(set.containsAll(targetDataList1));
		System.out.println(set.containsAll(targetDataList2));
		System.out.println("処理時間4（まとめて存在チェック）：" + (System.currentTimeMillis() - startTime));

		System.out.println("end:"+Thread.currentThread().getStackTrace()[1].getMethodName());
	}

}
