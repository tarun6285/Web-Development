import java.rmi.*;

public interface IProg extends Remote{
	int add(int a, int b) throws RemoteException;
}