package assistedpractice;


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

	public class ParamConstrDemo {
	public static void main(String[] args) {

		Std std1=new Std(2,"kalai");
		Std std2=new Std(10,"pooja");
		std1.display();
		std2.display();
			}
	}


