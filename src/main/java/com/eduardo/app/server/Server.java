package com.eduardo.app.server;

import com.eduardo.app.rmi.Traductor;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            Registry register = LocateRegistry.createRegistry(8000);
            register.rebind("traductor", new Traductor());
            System.out.println("Server Listen RMI!!!");
        } catch (RemoteException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
