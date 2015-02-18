package controllers;

import play.*;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }
    
    public static Result matrix() {
    	System.out.println(System.currentTimeMillis() + " >> matrix default renderer");
        return ok(matrix.render(null) );
    }
    
    public static Result newProduct() {
    	System.out.println( System.currentTimeMillis() + " >> returning render with messages...");
		return ok(searchbox.render());
	}
    
}
