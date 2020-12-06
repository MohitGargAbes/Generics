package understandingGenerics;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Data<T>{
	private T myVariable;

	public Data(T myVariable) {
		this.myVariable = myVariable;
	}

	public T getMyVariable() {
		return myVariable;
	}

	@Override
	public String toString() {
		return "Data [myVariable=" + myVariable + "]";
	}
	
	
}
public class App {

	public static void main(String[] args) {
		List<Data<Object>> elements = new LinkedList<>();
		elements.add(new Data<Object>("Some Text"));
		elements.add(new Data<Object>(12));
		elements.add(new Data<Object>(1.0));
		elements.add(new Data<Object>('%'));
		elements.add(new Data<Object>(5.4f));
		
		App app = new App();
		app.displayList(elements);
		
		
	}

	void displayList(List<Data<Object>> list) {
		ListIterator<Data<Object>> iterator = list.listIterator();
		while(iterator.hasNext()) {
			System.out.println("Elements: "+ iterator.next().getMyVariable());
		}
	}
}
