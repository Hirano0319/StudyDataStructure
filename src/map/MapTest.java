package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest {
	public static void main(String args[]) {
//		Map<String, String> map = new HashMap<String, String>(5, 0.8f);
		// Map<String, String> map = new TreeMap<String, String>();
		Map<String, String> map = new LinkedHashMap<String, String>();
//		Map<String, String> map = new SimpleLruCache<String, String>();
		addMap(map);

		System.out.println(map);
//		System.out.println(((TreeMap)map).subMap("002", true, "006", false));
		

	}
	

	private static void addMap(Map<String, String> map){
		map.put("002", "チャーハン");
		map.put("005", "唐揚げ定食");
		map.put("006", "レバニラ炒め");
		map.put("003", "青椒肉絲");
		map.put("001", "ラーメン");
		map.put("004", "麻婆豆腐");
		
		// 変更①
		map.put("001", "醤油ラーメン");
		// 追加①
		map.put("007", "味噌ラーメン");
		map.put("008", "塩ラーメン");

		// 変更②
		map.put("006", "ニラレバ炒め");
		
//		map.put("009", "油淋鶏");
//		map.put("010", "餃子");
		map.put(null, null);
		

	}
	
}
