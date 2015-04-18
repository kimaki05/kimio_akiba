package Fibonacci;

//Passo 6 criar o FibonacciClient

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;


public class FibonacciClient {

	public static void main(String[] args) {
		try {
			Object o = Naming.lookup("rmi://localhost/fibonacci");
			// liga��o com o servidor remoto
			Fibonacci calculator = (Fibonacci) o;
			// convers�o de tipo
			 Integer index = new  Integer("11");
			// n�mero da s�rie
			 Integer f = calculator.getFibonacci(index);
			// chamada de m�todo em interface remota
			System.out.println(" O " + index + "-�simo termo da s�rie de Fibonacci � " + f);
			} 
			catch(MalformedURLException e) {  System.err.print(e.getMessage());}
			catch(RemoteException re) { System.err.print(re.getMessage()); }
			catch(NotBoundException e) { System.err.print(e.getMessage()); }
	}

}
