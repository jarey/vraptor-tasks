package br.com.caelum.vraptor.tasks.jobs.jpa;


import javax.persistence.EntityManager;

import br.com.caelum.vraptor.tasks.Task;
import br.com.caelum.vraptor.tasks.validator.Validator;


public interface TransactionalTask extends Task {
	
	void setup(EntityManager manager, Validator validator);

}
