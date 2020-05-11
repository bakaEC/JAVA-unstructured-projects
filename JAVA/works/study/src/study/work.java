package study;

import java.util.Scanner;
class student{
	String name;
	int age;
	int sex;
	int gradeId;
	String getName(){
		return name;
	}
	int getAge(){
		return age;

	}
	int getSex(){
		return sex;
	}
	int getGradeId(){
		return gradeId;
	}
}

public class work {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		student s1,s2,s3;
		s1 = new student();
		s2 = new student();
		s3 = new student();

		s1.age = 10;
		s1.sex = 1;
		s1.gradeId = 7;
		s1.name = "阿斯蒂芬";

		s2.age = 12;
		s2.sex = 0;
		s2.gradeId = 8;
		s2.name = "阿斯";

		do{
			System.out.println("请输入要获取信息的学生");
			int stuid = in.nextInt();
			switch(stuid){
				case 1: student stuInfo=s1;break;
				case 2: student stuInfo=s2;break;
				case 3: student stuInfo=s3;break;
			}
			System.out.println("请输入要获取的信息:1、姓名 2、性别 3、年龄 4、年级");
			int t = in.nextInt();
			switch(t){
				case 1:System.out.println(stuInfo.name);
				case 2:System.out.println(stuInfo.sex);
				case 3:System.out.println(stuInfo.age);
				case 4:System.out.println(stuInfo.gradeId);
			}
			String answer = in.next();
			
		}

}
