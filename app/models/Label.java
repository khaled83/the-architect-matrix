package models;

import java.util.HashMap;

/**
 * A label or a tag, is used to describe characteristics of items and help in searching them.
 * E.g. Java may have the following labels: Programming Language, Web.
 * 
 * @author Khaled Abbas
 *
 */
public class Label {
	
	public long id;
	
	/** e.g. Programming Language */
	public String name;
	
	private Label() {}
	
	public static Label newInstance(String name)
	{
		Label newInstance = new Label();
		newInstance.name = name;
		tableLabels.put(name, newInstance);
		// TODO: save into MODEL, persistence
		
		return newInstance;
	}
	
	
	/** for mock data */
	public static HashMap<String, Label> tableLabels = new HashMap<String, Label>();
	
	public static Label findByName(String name)
	{
		return tableLabels.get(name);
	}

}
