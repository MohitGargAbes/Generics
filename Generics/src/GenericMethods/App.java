package GenericMethods;

import java.util.ArrayList;
import java.util.List;

class Data{
	public <E> void printListData(List<E> list) {
		for(E element: list) {
			System.out.println(element);
		}
	}
	public <E> void printArrayData(E[] arrayData) {
		for(E element: arrayData) {
			System.out.print(element+ " ");
		}
	}
}


public class App {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
	
		Data data = new Data();
		data.printListData(list);
		
		String[] stringArray = {"A","B","C","D"};
		data.printArrayData(stringArray);
	}
}
