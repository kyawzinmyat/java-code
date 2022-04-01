public class Main {
	public static void main(String[] args) {
		Programmer kyaw = new Programmer("Kyaw",18,"Cs");
		System.out.println(kyaw.toString());
			
	}
}


class Person{
	String name;
	int age;
	Person(String name,int age){
			this.name = name;
			this.age = age;
		}
	public String toString(){
			return this.name+"\n"+this.age+"\n";
		}		
	
	}
	
	
class Programmer extends Person{
	String field;
	Programmer(String name,int age,String field){
			super(name,age);
			this.field = field;
		}
	public String toString(){
			return super.toString() + this.field;
			
		}	
	}