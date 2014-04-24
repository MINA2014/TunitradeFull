package edu.esprit.service.notification;

import javax.ejb.Local;

import java.util.List;

import edu.esprit.domain.entities.Notification;

@Local
public interface NotificationServiceEJBLocal {
	public void add(Notification notification);

	public void update(Notification notification);

	public Notification findBY(int id);

	public List<Notification> findall();

	public void delete(Notification notification);

}