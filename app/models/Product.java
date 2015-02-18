package models;

import java.util.Collection;
import java.util.Set;

/**
 * Represents a programming language, framework, application server, etc.<br><br>
 * To create instances use factory method {@link Product#newInstance(String, String)}.
 * 
 * @author Khaled Abbas
 *
 */
public class Product {
	
	long id;
	
	/** e.g Java */
	public String name;
	
	/** e.g. Programming Language */
	public String category;
	
	/** e.g. [Programming Language, Web] */
	public Set<Label> labels;
	
	/** use factory method {@link Product#newInstance(String, String)} */
	private Product() {}
	
	/**
	 * Factory method to create a new {@link Product} initially without labels.
	 * 
	 * @param name	e.g. Java
	 * @param category	e.g. Programming Language
	 * @return	a new instance of {@link Product}
	 */
	public static Product newInstance(String name, String category)	
	{
		Product newInstance = new Product();
		newInstance.name = name;
		newInstance.category = category;
		return newInstance;
	}
	
	/**
	 * Factory method to create a new {@link Product} with labels.
	 * 
	 * @param name	e.g. Java
	 * @param category	e.g. Programming Language
	 * @param labels	a collection of {@link Label} instances or Label {@link String }names, e.g. { Programming Language, Web }
	 * @return	a new instance of {@link Product}
	 */
	@SuppressWarnings("unchecked")
	public static Product newInstance(String name, String category, Collection<? extends Object> labels)
	{
		Product newInstance = Product.newInstance(name, category);
		
		if(labels.iterator().next() instanceof Label)
			newInstance.labels.addAll( (Collection<Label>)(Collection<?>) labels);
		else if(labels.iterator().next() instanceof String)
			newInstance.addLabelNames( (Collection<String>)(Collection<?>) labels);
		
		return newInstance;
	}
	
	/**
	 * Finds {@link Label} instances in model that match argument label names and adds them to {@link Product}.<br><br>
	 * Labels that are not found will be created and saved into the model.
	 * 
	 * @param labelNames	A collection of {@link String}s that identify the names of {@link Label}s.
	 */
	public void addLabelNames(Collection<String> labelNames)
	{
		for(String labelName : labelNames)
		{
			Label label = Label.findByName(labelName);
			if(label == null)
				label = Label.newInstance(labelName);
			
			labels.add( label );
		}
	}
	
	@Override
	public String toString() {
		return name + " is a " + category + " with the following labels: " + labels.toString();
	}

}
