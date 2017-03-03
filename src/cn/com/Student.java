package cn.com;

public class Student {
	private String name;
	private int age;
	private char sex;
	private String phone;
	private String address;
	private String email;

	public Student() {

	}

	public Student(String name, int age, char sex, String phone,
			String address, String email) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.phone = phone;
		this.address = address;
		this.email = email;
	}

	public void eat() {
		System.out.println("ÔÚÊ³ÌÃ³Ô·¹");
	}

	public void drink() {
		System.out.println("ºÈË®");
	}

	public void play() {
		System.out.println("Íæ");
	}

	public void sleep() {
		System.out.println("ÔÚÇŞÊÒË¯¾õ");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
