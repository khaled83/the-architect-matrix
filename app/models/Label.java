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
	
	
	
	
	/** for mock data */
	public static HashMap<String, Label> tableLabels = new HashMap<String, Label>();
	
	public Label findByName(String name)
	{
		return tableLabels.get(name);
	}

}
