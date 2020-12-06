package BoundedTypeParameter;

class Data<K extends Integer,V extends App >{
	private K key;
	private V value;

	public Data(K key,V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}
	
	public <E,N extends Character> void display(char c, int i) {
		System.out.println("Element:"+ c + " Number: "+ i);
	}
	
}
public class App {

	public static void main(String[] args) {
		Data<Integer,App> data = new Data<Integer, App>(1,new App());
           data.display('#', 12);
           data.getValue().test();
           System.out.println("Key= "+ data.getKey());
	}

	public void test() {
		System.out.println("Testing...");
	}
}
