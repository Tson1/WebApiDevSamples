package webApiTestjv.models;

import lombok.Data;

//@Setter
//@Getter
@Data
public class User {
	private String Name;
	private int Age;
//	public String getName() {
//		return Name;
//	}
//	public void setName(String name) {
//		Name = name;
//	}
//	public int getAge() {
//		return Age;
//	}
//	public void setAge(int age) {
//		Age = age;
//	}
	
	/*
	 *  @Dataは下記を含む
    @ToString
    @Getter
    @Setter
    @RequiredArgsConstructor
    @EqualsAndHashCode

	 * 
	 * */

}
