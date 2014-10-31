package models;

import java.util.List;

import scala.actors.threadpool.Arrays;

public class TestDataGenerator {
	
	public static List<Item> items;
	
	static
	{
		Item[] test = { Item.newInstance("Java", "Programming Language") };
		items = Arrays.asList( test );
	}

}
