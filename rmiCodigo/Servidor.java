import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Servidor {

	private Pessoa pessoa;

	public void Servidor() throws RemoteException{
	}

	public static void main(String[] args){
		try {

			ExerImpl ExerImpl = new ExerImpl();
			Exer2Impl Exer2Impl = new Exer2Impl();

			Naming.bind("ReajusteSalarial", ExerImpl); 
			Naming.bind("Maioridade", Exer2Impl);          

            System.err.println("Servidor pronto... esperando...");
            
        } catch (Exception e) {
        	System.err.println("Erro: " + e.toString());
          e.printStackTrace();
        }
	}
}
