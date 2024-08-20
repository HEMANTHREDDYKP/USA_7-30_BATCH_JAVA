
public class Student {

	int age;
	String name;
	
	public Student(int age,String name) {
		
		this.age=age;
		this.name=name;
	}
	
	
	public static void main(String[] args) {
		
		
		Student s1=new Student(12, "Bheem");
		Student s2=new Student(34, "Dinga");
		Student s3=new Student(20, "Manga");
		
		Student[] students=new Student[3];
		students[0]=s1;
		students[1]=s2;
		students[2]=s3;
			
	for(int i=0;i<students.length;i++) {
		
		System.out.println(students[i].name);
		System.out.println(students[i].age);
		System.out.println("-------------");
	}
			
	}
}
