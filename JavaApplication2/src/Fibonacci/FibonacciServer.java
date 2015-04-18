package Fibonacci;

//Passo 3 � Implementar o Servidor
// Servidor que conter� o objeto da classe FibonacciImpl.java
import java.net.*;
import java.rmi.*;

public class FibonacciServer {
	public static void main(String[] args) throws AlreadyBoundException {
		try {
			FibonacciImpl f = new FibonacciImpl();
			// instancia��o do objeto remoto
			Naming.rebind("fibonacci", f);
			// registro do servidor
			System.out.println("Servidor Fibonacci pronto.");
		} catch (RemoteException re) {
			System.out.println(" Exception in FibonacciImpl.main: " + re);
		} catch (MalformedURLException e) {
			System.out.println(" URL mal formada" + e);
		}
	}
}