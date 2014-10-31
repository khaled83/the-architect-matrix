package models;

import java.util.List;
import java.util.Arrays;

public class MockModel {
	
	public static List<Item> items;
	
	static
	{
		String[] labelsArray = { "Programming Language", "Web", "Full Stack" };
		Item[] itemsArray = { 
			Item.newInstance("Spring", "JVM Web Framework", Arrays.asList(labelsArray) ),
			Item.newInstance("Grails", "JVM Web Framework", Arrays.asList(labelsArray) ),
			Item.newInstance("Play!", "JVM Web Framework", Arrays.asList(labelsArray) ),
			Item.newInstance("GWT", "JVM Web Framework", Arrays.asList(labelsArray) ),
							
		};
		items = Arrays.asList( itemsArray );
	}
	
	public static Item addItem(String name, String category)
	{
		return Item.newInstance(name, category);
	}

}
