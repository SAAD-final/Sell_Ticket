package hello;

public interface CustomerService {
	public boolean register(String name, String password);
	public boolean login(String name, String password);
	public boolean exists(String name);
	public void init();
}
