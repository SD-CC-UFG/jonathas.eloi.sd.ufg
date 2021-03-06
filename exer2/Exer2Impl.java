package rmi.exer2;

import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
import java.net.*;

import rmi.objetos.Pessoa;

public class Exer2Impl extends UnicastRemoteObject implements Exer2Interface {
    
    public Exer2Impl() throws RemoteException{
        super();
    }

    @Override
	public Pessoa maioridade(Pessoa pessoa) {

		System.out.print("\nVerificando idade...");

		if (pessoa.getIdade() > 18 && pessoa.getSexo().equals("masculino") ||
			pessoa.getIdade() > 21 && pessoa.getSexo().equals("feminino") ) {

			pessoa.setMaioridade(true);
			System.out.print("\nMaioridade verificada... " + pessoa.getNome() + " eh maior de idade.");
		}

		System.out.print("\nMaioridade verificada... " + pessoa.getNome() + " nao eh maior de idade.");
		return pessoa;
	}
}