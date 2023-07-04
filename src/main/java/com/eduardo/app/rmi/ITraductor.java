package com.eduardo.app.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ITraductor extends Remote {
    public String translate(String languageStart, String languageEnd, String text) throws RemoteException;;
}
