package controllers;

import play.*;
import play.mvc.*;
import views.html.*;

public class HelloWorld extends Controller {
	
	public static Result helloWorld() {
        return ok(helloworld.render("Hello World. geändert in feature1"));
    }

}
