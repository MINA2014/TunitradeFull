package edu.esprit.service.mailBox;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.domain.entities.MailBox;

;

@Remote
public interface MailBoxServiceEJBRemote {
	public void add(MailBox mailBox);

	public void update(MailBox mailBox);

	public MailBox findBY(int id);

	public List<MailBox> findall();

	public void delete(MailBox mailBox);

}