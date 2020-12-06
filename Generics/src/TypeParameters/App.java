package TypeParameters;


/*
 * The naming conventions are as follows:
 * T- Type
 * E-Element
 * K-Key
 * N-Number
 * V-Value
 * */

class Data<K,V, E, N>{
	private K key;
	private V value;
	public Data(K key, V value) {
		super();
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
	
	public <E,N>void display(E element, N numbers) {
	  System.out.println("Element: "+ element +" " + "Number: "+ numbers);
	}
}
public class App {

	public static void main(String[] args) {
		Data data = new Data(1,"tada");
		System.out.println("Key:" + data.getKey());
		System.out.println("Value:" + data.getValue());
		
		data.display("ele", 12);
	}

}
