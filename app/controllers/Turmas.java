package controllers;

import java.util.List;

import models.Turma;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

import com.avaje.ebean.Ebean;

public class Turmas extends Controller{
	private static Form<Turma> turmaForm = Form.form(Turma.class);

	public static Result home(){
		return ok(views.html.home.render());
	}
	
	public static Result novaTurma(){
		return ok(views.html.cadastrarTurma.render(""));
	}
	
	public static Result salvarTurma(){
		Form<Turma> formFromRequest = turmaForm.bindFromRequest();
		Turma turma = formFromRequest.get();
		Ebean.save(turma);		
		return ok(views.html.cadastrarTurma.render("Turma salva com sucesso!"));
	}
	
	public static Result listar(){
		List<Turma> turmas = Ebean.find(Turma.class).findList();
		return ok(views.html.turmas.render(turmas));
	}
	
}