package edu.esprit.service.admin;

import javax.ejb.Local;

import java.util.List;

import edu.esprit.domain.entities.Admin;

@Local
public interface AdminServiceEJBLocal {
	public void add(Admin admin);

	public void update(Admin admin);

	public Admin findBY(int id);

	public List<Admin> findall();

	public boolean delete(Admin admin);

	public Admin login(String login, String password);

}