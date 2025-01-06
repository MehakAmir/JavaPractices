package generics;

public class GenericInterface {
	interface Pairable<K, V> {
	    K getKey();
	    V getValue();
	}

	class StringIntPair implements Pairable<String, Integer> {
	    private String key;
	    private Integer value;

	    public StringIntPair(String key, Integer value) {
	        this.key = key;
	        this.value = value;
	    }

	    public String getKey() {
	        return key;
	    }

	    public Integer getValue() {
	        return value;
	    }
	}

}
