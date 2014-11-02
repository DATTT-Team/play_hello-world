package controllers;

import play.*;
import play.mvc.*;
import views.html.*;

public class HelloWorld extends Controller {
	
	public static Result helloWorld() {
        return ok(index.render("Hallo Play. Das ist ein Hello World"));
//        return ok("Hallo Play");
    }

}
