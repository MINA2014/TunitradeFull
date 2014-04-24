package edu.esprit.service.gestion.authentification;

import javax.ejb.Local;

import edu.esprit.domain.entities.User;

@Local
public interface AuthentificationLocal {

	User authenticate(String login, String password);

	void createUser(User user);

}
