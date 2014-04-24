package edu.esprit.service.message;

import javax.ejb.Local;

import java.util.List;

import edu.esprit.domain.entities.Message;

@Local
public interface MessageServiceEJBLocal {
	public void add(Message message);

	public void update(Message message);

	public Message findBY(int id);

	public List<Message> findall();

	public void delete(Message message);

}