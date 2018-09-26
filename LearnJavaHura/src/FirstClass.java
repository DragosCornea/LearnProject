
import java.util.List;
import java.util.ArrayList;

public class FirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("ce facema ici");
			List names=new ArrayList();
			names.add("James");
			names.add("Saint");
			names.add("Patrick");
			names.add("Ghost");
			System.out.print(names);
			
			names.forEach(System.out::print);
			System.out.println();//linie noua Boss
			System.out.println(names.get(0));
			
			names.remove(0);
			System.out.println(names);
	}

}
