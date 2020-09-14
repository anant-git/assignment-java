package com.bajaj.recharge_992022;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RechargeService {
	@Autowired 
	RechargeRepository repository;
	
	public void save(String pno,int price)
	{
		Recharge r= new Recharge(pno,price);
		repository.save(r);
	}
	public Recharge get(String pno)
	{
		return repository.findById(pno).get();
	}
}