package edu.esprit.service.gestion.authentification;

import javax.ejb.Remote;

import edu.esprit.domain.entities.User;

@Remote
public interface AuthentificationRemote {

	User authenticate(String login, String password);
	void createUser(User user);
}
