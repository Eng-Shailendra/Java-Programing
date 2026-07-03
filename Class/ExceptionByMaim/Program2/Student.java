package ExceptionByMaim.Program2;

public class Student {
    	private String name;
	private int id, age, rollno;
	
	Student(){}
	

	public voide setName(String name){
		this.name =name;
	}
	public void setID(int id){
		this.id = id;
	}	
	public void setAge(int age){
		this.age = age;
	}
	public void setRollno(int rollno){
		this.rollno = rollno;
	}
	public int getName(){
		return name; 
	}
	public int getId(){
		return id; 
	}
	public itn getAge(){
		return age;
	}
	public int getRollno(){
		return rollno;
	}
	
	@Override
	public String toString(){
		return "["+"Name : "+ name+" ID : "+ id +"Age : "+ age+"rollno : "+rol
lno+ "]"; 
	}
}
