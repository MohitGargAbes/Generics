

/*Generics==It would be nice if we could write a single sort method that 
 * could sort the elements in anInteger array, a String array, or an array
 *  of any type that supports
ordering.

Java Generic methods and generic classes enable programmers to specify, with
 a single method declaration*/

//Advantages:
/*1)Reusability.
 *2)Stronger type Checking,better type safety.
 *3)Eliminate type casting statements.
 */
//T-->denotes type.

package Generics;


class GenericClass<T>{
	private T data;

	public GenericClass(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	@Override
	public String toString() {
		return "GenericClass [data=" + data + "]";
	}
	
	
}
public class App {

	public static void main(String[] args) {
	
		
	GenericClass<String> genericData = new GenericClass<String>("some data");
	GenericClass<Integer> genericIntData = new GenericClass<Integer>(24);
		
		String data= genericData.getData();
		System.out.println(data);
		
		int data1 =  genericIntData.getData();
		System.out.println(data1);
		
		
	}

}
