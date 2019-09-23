import java.rmi.*;
import java.rmi.server.*;

public class IProgImp extends UnicastRemoteObject implements IProg{

	public IProgImp() throws RemoteException{
	}
	public int add(int a, int b)throws RemoteException{
		return a+b;
	}
}