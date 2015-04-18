//Passo 6 criar o FibonacciClient

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;


public class FibonacciClient {

	public static void main(String[] args) {
		try {
			Object o = Naming.lookup("rmi://localhost/fibonacci");
			// ligação com o servidor remoto
			Fibonacci calculator = (Fibonacci) o;
			// conversão de tipo
			 Integer index = new  Integer("11");
			// número da série
			 Integer f = calculator.getFibonacci(index);
			// chamada de método em interface remota
			System.out.println(" O " + index + "-ésimo termo da série de Fibonacci é " + f);
			} 
			catch(MalformedURLException e) {  System.err.print(e.getMessage());}
			catch(RemoteException re) { System.err.print(re.getMessage()); }
			catch(NotBoundException e) { System.err.print(e.getMessage()); }
	}

}
