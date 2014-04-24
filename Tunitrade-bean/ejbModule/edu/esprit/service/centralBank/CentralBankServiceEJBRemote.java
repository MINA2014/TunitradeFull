package edu.esprit.service.centralBank;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.domain.entities.CentralBank;

@Remote
public interface CentralBankServiceEJBRemote {
	public void add(CentralBank centralBank);

	public void update(CentralBank centralBank);

	public CentralBank findBY(int id);

	public List<CentralBank> findall();

	public void delete(CentralBank centralBank);

}
