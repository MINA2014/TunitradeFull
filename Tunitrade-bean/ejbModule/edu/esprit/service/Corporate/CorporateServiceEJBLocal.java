package edu.esprit.service.Corporate;

import javax.ejb.Local;


import java.util.List;



import edu.esprit.domain.entities.Corporate;

@Local
public interface CorporateServiceEJBLocal {
	public void add(Corporate corporate);

	public void update(Corporate corporate);

	public Corporate findBY(int id);

	public List<Corporate> findall();

	public void delete(Corporate corporate);

}
