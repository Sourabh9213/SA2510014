package SeleniumAssinment;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<String>fruits = new ArrayList<>();
		
		fruits.add("Banana");
		fruits.add("Grapes");
		fruits.add("Watermelon");
		
		System.out.println(fruits.get(2));
		
		for(String f : fruits)
			System.out.println(f);
	}

}
