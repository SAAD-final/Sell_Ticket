package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

	CustomerServiceImpl() {}

	@Autowired
	private CustomerRepository repository;

	@Override
	public boolean login(String name, String password) {
		Customer customer = repository.findByName(name);
		if (customer == null)
			return false;
		else if (customer.getPassword() != password)
			return false;
		return true;
	}

	@Override
	public boolean exists(String name) {
		return (repository.findByName(name) != null);
	}

	@Override
	public boolean register(String name, String password) {
		if (this.exists(name))
			return false;
		repository.save(new Customer(name, password));
		return true;
	}

	@Override
	public void init() {
		repository.deleteAll();
	}

}
