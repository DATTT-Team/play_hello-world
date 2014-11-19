package controllers;

import play.*;
import play.mvc.*;
import views.html.*;

public class HelloWorld extends Controller {
	
	public static Result helloWorld() {
        return ok(helloworld.render("Hello World. Geändert in feature1"));
    }

}
