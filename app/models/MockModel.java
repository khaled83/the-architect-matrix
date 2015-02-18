package models;

import java.util.List;
import java.util.Arrays;

public class MockModel {
	
	public static List<Product> items;
	
	static
	{
		String[] labelsArray = { "Programming Language", "Web", "Full Stack" };
		Product[] itemsArray = { 
			Product.newInstance("Spring", "JVM Web Framework", Arrays.asList(labelsArray) ),
			Product.newInstance("Grails", "JVM Web Framework", Arrays.asList(labelsArray) ),
			Product.newInstance("Play!", "JVM Web Framework", Arrays.asList(labelsArray) ),
			Product.newInstance("GWT", "JVM Web Framework", Arrays.asList(labelsArray) ),
							
		};
		items = Arrays.asList( itemsArray );
	}
	
	public static Product addItem(String name, String category)
	{
		return Product.newInstance(name, category);
	}

}
