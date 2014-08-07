package controllers;

import com.avaje.ebean.Ebean;

import models.Turma;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

public class Turmas extends Controller{
	private static Form<Turma> turmaForm = Form.form(Turma.class);

	public static Result home(){
		return ok(views.html.home.render());
	}
	
	public static Result novaTurma(){
		return ok(views.html.cadastrarTurma.render());
	}
	
	public static Result salvarTurma(){
		Form<Turma> formFromRequest = turmaForm.bindFromRequest();
		Turma turma = formFromRequest.get();
		Ebean.save(turma);		
		return TODO;
	}
	
}