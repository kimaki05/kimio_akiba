package Fibonacci;

// passo 2 
//Implementa��o da interface Fibonacci.java
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class FibonacciImpl implements Fibonacci {
	public FibonacciImpl() throws RemoteException {
		UnicastRemoteObject.exportObject(this);
	}

	public Integer getFibonacci(Integer n) throws RemoteException {
		
		if (n < 2)
			return n;
		else
			return (getFibonacci(n-1) + getFibonacci(n-2 ));
	}

	public Integer getFibonacci(int n) throws RemoteException {

		if (n < 2)
			return n;
		else
			return (getFibonacci(n-1) + getFibonacci(n-2 ));
	}

	 
}