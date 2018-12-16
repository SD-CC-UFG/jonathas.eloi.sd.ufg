package rmi.exer2;

import java.rmi.Remote;
import java.rmi.RemoteException;

import rmi.objetos.Pessoa;

public interface Exer2Interface extends Remote {
	public Pessoa maioridade(Pessoa pessoa) throws RemoteException;
}