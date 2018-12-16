package rmi.exer1;

import java.rmi.Remote;
import java.rmi.RemoteException;

import rmi.objetos.Pessoa;

public interface ExerInterface extends Remote {
	public Pessoa ajusteSalarial(Pessoa pessoa) throws RemoteException;
}