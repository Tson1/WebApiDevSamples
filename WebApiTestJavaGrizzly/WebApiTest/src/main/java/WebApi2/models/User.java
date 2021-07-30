package WebApi2.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement  
public class User {
	 public User()
	    {
	    }
	private String Name;
	private int Age;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}

}
