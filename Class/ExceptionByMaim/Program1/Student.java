package ExceptionByMaim.Program1;

public class Student {
	String name;
	int id, age, studentClass;

	Student() {
	}

	Student(String name, int id, int age, int studentClass) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.studentClass = studentClass;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	public int getStudentClass() {
		return studentClass;
	}

	@Override
	public String toString() {
		return "[" + "Name : " + name + "\tId : " + id + "\tAge : " + age + "\tstudent Class : " + studentClass + "]";
	}

}
