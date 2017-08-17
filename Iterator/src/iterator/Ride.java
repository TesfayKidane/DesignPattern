package iterator;

public class Ride {
	private String fullname;
	private String money;
	private int age;
	public Ride(String fullname, String money, int age) {
		super();
		this.fullname = fullname;
		this.money = money;
		this.age = age;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Ride [fullname=" + fullname + ", money=" + money + ", age=" + age + "]";
	}
	
	
	

}
