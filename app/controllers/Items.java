package controllers;

import models.MockModel;
import play.mvc.Controller;
import play.mvc.Result;

public class Items extends Controller {
	
	public static Result newItem(String name)
	{
		MockModel.addItem(name, "Programming Language");
        return ok();
	}
	
	public static Result newItem()
	{
		System.out.println("New item");
        return TODO;
	}

}
