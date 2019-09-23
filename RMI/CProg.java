import java.rmi.*;


public class CProg{
	public static void main(String alpha[])throws Exception{
		IProg prog = (IProg) Naming.lookup("prog");
		System.out.println(prog.add(2,8));
	}
}