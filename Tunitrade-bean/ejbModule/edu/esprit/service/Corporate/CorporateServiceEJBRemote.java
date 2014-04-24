package edu.esprit.service.Corporate;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.domain.entities.Corporate;

@Remote
public interface CorporateServiceEJBRemote {
	public void add(Corporate corporate);

	public void update(Corporate corporate);

	public Corporate findBY(int id);

	public List<Corporate> findall();

	public void delete(Corporate corporate);

}
