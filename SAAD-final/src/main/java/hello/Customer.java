package hello;

import org.springframework.data.annotation.Id;


public class Customer {

    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Id
    private String id;

    private String name;
    private String password;

    public Customer() {}

    public Customer(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, name='%s', password='%s']",
                id, name, password);
    }

}

