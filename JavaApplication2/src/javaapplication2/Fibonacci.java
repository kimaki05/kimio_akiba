// Passo 1
//Interface remota para implementação de método da séria de Fibinacci
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Fibonacci extends Remote {
	public Integer getFibonacci(int n) throws RemoteException;

	public Integer getFibonacci(Integer n) throws RemoteException;
}