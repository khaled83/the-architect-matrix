package models;

import java.util.Collection;
import java.util.Set;

/**
 * Represents a programming language, framework, application server, etc.<br><br>
 * To create instances use factory method {@link Item#newInstance(String, String)}.
 * 
 * @author Khaled Abbas
 *
 */
public class Item {
	
	long id;
	
	/** e.g Java */
	public String name;
	
	/** e.g. Programming Language */
	public String category;
	
	/** e.g. [Programming Language, Web] */
	public Set<Label> labels;
	
	/** use factory method {@link Item#newInstance(String, String)} */
	private Item() {}
	
	public static Item newInstance(String name, String category)	
	{
		Item newInstance = new Item();
		newInstance.name = name;
		newInstance.category = category;
		return newInstance;
	}
	
	public static Item newInstance(String name, String category, Collection<Label> labels)
	{
		Item newInstance = Item.newInstance(name, category);
		newInstance.labels.addAll(labels);
		
		return newInstance;
	}
	
//	public static Item newInstance(String name, String category, Collection<String> labels)
//	{
//		Item newInstance = Item.newInstance(name, category);
////		newInstance.labels.addAll(labels);
//		
//		return newInstance;
//	}
	
	@Override
	public String toString() {
		return name + " is a " + category + " with the following labels: " + labels.toString();
	}

}
