package edu.esprit.service.mailBox;

import javax.ejb.Local;

import java.util.List;

import edu.esprit.domain.entities.MailBox;

;

@Local
public interface MailBoxServiceEJBLocal {
	public void add(MailBox mailBox);

	public void update(MailBox mailBox);

	public MailBox findBY(int id);

	public List<MailBox> findall();

	public void delete(MailBox mailBox);

}