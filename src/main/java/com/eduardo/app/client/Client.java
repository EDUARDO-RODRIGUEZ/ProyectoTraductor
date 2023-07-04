package com.eduardo.app.client;

import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Optional;

public class Client {

    private String host;
    private Integer port;
    private Registry registry;

    public Client(String host, Integer port) {
        this.host = host;
        this.port = port;
        init();
    }

    public void init() {
        try {
            this.registry = LocateRegistry.getRegistry(host, port);
        } catch (RemoteException ex) {
            ex.printStackTrace();
        }
    }

    public Optional<Remote> getInstance(String nameObject) {
        try {
            Remote instance = registry.lookup(nameObject);
            return Optional.of(instance);
        } catch (RemoteException | NotBoundException ex) {
            ex.printStackTrace();
        }
        return Optional.empty();
    }

}
