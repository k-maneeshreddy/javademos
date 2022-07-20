package PracticeProject4;

class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}

public class PMConstructor {
public static void main(String[] args) {

	Std std1=new Std(1,"Tom");
	Std std2=new Std(2,"Antony");
	std1.display();
	std2.display();
		}
}

