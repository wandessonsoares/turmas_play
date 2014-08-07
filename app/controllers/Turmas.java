package controllers;

import play.mvc.Controller;
import play.mvc.Http.Request;
import play.mvc.Result;

public class Turmas extends Controller{

	public static Result home(){
		return ok(views.html.home.render());
	}
	
	public static Result novaTurma(){
		return ok(views.html.cadastrarTurma.render());
	}
	
	public static Result salvarTurma(){
		Request request = request();
		System.out.println(request.body().asFormUrlEncoded().get("nome")[0]);
		System.out.println(request.body().asFormUrlEncoded().get("periodo")[0]);
		return TODO;
	}
	
}