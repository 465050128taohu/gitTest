package cn.com;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		s.setName("С��");
		s.setSex('��');
		s.setAge(18);
		s.setPhone("18711326287");
		s.setAddress("���Ϲ���ѧԺ");
		s.setEmail("465050128@qq.com");
		String[] Student = new String[5];
		System.out.println("������Ҫ���ҵ�name,��email,��address");
		String ss = sc.nextLine();
		if (ss.equals(s.getName()) || ss.equals(s.getEmail())
				|| ss.equals(s.getAddress())) {
			System.out.println(s.getName());
			System.out.println(s.getSex());
			System.out.println(s.getAge());
			System.out.println(s.getPhone());
			System.out.println(s.getEmail());
			System.out.println(s.getAddress());
		} else {
			System.out.println("���޴���Ϣ");
		}

	}
}
