import java.rmi.*;


public class SProg{
	public static void main(String alpha[])throws Exception{
		IProg prog = new IProgImp();
		Naming.rebind("prog",prog);
	}
}