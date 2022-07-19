package assistedpracticeprojects;


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

	Std std1=new Std(5,"Max");
	Std std2=new Std(10,"Tony");
	std1.display();
	std2.display();
		}
}
