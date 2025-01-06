package map;

import java.util.HashMap;
import java.util.Map;

public class HashmapNull {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put(null, "First value");
		map.put(null, "Second value");
		map.put("Key1", null);
		map.put("Key2", null);

		System.out.println(map.get(null));
		System.out.println(map.get("Key1")); 
		System.out.println(map.get("Key2")); 
	}
}
