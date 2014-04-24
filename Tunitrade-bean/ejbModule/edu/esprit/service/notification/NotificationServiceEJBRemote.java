package edu.esprit.service.notification;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.domain.entities.Notification;

@Remote
public interface NotificationServiceEJBRemote {
	public void add(Notification notification);

	public void update(Notification notification);

	public Notification findBY(int id);

	public List<Notification> findall();

	public void delete(Notification notification);

}
