package edu.esprit.service.admin;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.domain.entities.Admin;

@Remote
public interface AdminServiceEJBRemote {

	public void add(Admin admin);

	public void update(Admin admin);

	public Admin findBY(int id);

	public List<Admin> findall();

	public boolean delete(Admin admin);
	
	public Admin login(String login, String password);


}