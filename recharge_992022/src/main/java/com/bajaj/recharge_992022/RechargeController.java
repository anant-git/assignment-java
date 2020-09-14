package com.bajaj.recharge_992022;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RechargeController {
	@Autowired
	RechargeService service;
	
	@GetMapping("/recharges/{id}")
	public ResponseEntity<Recharge> getRecharge(@PathVariable String id)
	{
		try 
		{
			Recharge r=service.get(id);
			return new ResponseEntity<Recharge>(r,HttpStatus.OK);
		}
		catch (Exception e) {	
			return new ResponseEntity<Recharge>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping("/recharges/{id}")
	public ResponseEntity<?> update(@RequestBody Recharge r,@PathVariable String id){
		Recharge rech = service.get(id);
		if(rech!= null) {
			service.save(r.getPno(),r.getPrice()+rech.getPrice());
			return new ResponseEntity<Recharge>(HttpStatus.OK);
		}
		else
			return new ResponseEntity<Recharge>(HttpStatus.NOT_FOUND);
	}
}
