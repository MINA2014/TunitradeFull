package edu.esprit.service.deal;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.domain.entities.Deal;

@Remote
public interface DealServiceEJBRemote {
	public void add(Deal deal);

	public void update(Deal deal);

	public Deal findBY(String trader);

	public List<Deal> findall();

	public void delete(Deal deal);

}
//