package edu.esprit.service.event;

import javax.ejb.Local;

import java.util.List;

import edu.esprit.domain.entities.Event;

@Local
public interface EventServiceEJBLocal {
	public void add(Event event);

	public void update(Event event);

	public Event findBY(String name);

	public List<Event> findall();

	public void delete(Event event);

}
