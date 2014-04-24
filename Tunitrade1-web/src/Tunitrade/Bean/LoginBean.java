package Tunitrade.Bean;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

import edu.esprit.domain.entities.User;
import edu.esprit.service.gestion.authentification.AuthentificationLocal;

@ManagedBean(name = "authBean")
@SessionScoped
public class LoginBean implements Serializable {

	private static final long serialVersionUID = -4107564050474835809L;
	// private String oriontation;

	@EJB
	private AuthentificationLocal authBean;
	private String login;
	private String password;
	private String userType = "";
	private boolean loggedIn = false;
	private User user = new User();

	public String conn() {
		User found = null;
		found = authBean.authenticate(user.getLogin(), user.getPassword());
		if (found != null) {
			user = found;
			loggedIn = true;
			return ("/gestionCurrency");
		} else {

			return ("/error");
		}

	}

	public String logout() {
		String navgateTo = null;
		loggedIn = false;
		user = new User();
		navgateTo = "/login";
		return navgateTo;

	}

	public AuthentificationLocal getAuthBean() {
		return authBean;
	}

	public void setAuthBean(AuthentificationLocal authBean) {
		this.authBean = authBean;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public boolean isLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
