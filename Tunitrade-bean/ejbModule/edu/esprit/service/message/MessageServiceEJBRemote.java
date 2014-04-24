package edu.esprit.service.message;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.domain.entities.Message;

@Remote
public interface MessageServiceEJBRemote {
	public void add(Message message);

	public void update(Message message);

	public Message findBY(int id);

	public List<Message> findall();

	public void delete(Message message);

}