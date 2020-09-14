import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RechargeService {
	@Autowired 
	RechargeRepository repository;
	
	public void save(Recharge r)
	{
		repository.save(r);
	}
	public Recharge get(Integer pno)
	{
		return repository.findById(pno).get();
	}
}