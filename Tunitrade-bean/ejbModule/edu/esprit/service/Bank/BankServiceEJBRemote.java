package edu.esprit.service.Bank;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.domain.entities.Bank;

@Remote
public interface BankServiceEJBRemote {
	public void add(Bank bank);

	public void update(Bank bank);

	public Bank findBY(int id);

	public List<Bank> findall();

	public void delete(Bank bank);

}
