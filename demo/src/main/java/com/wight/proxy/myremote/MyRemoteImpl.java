package com.wight.proxy.myremote;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author wight
 * @date 2021/11/20
 * @apiNote
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    @Override
    public String sayHello() throws RemoteException {
        return "Server says, 'Hey'";
    }

    public MyRemoteImpl() throws RemoteException {
    }

    public static void main(String[] args) {
        try {
            MyRemoteImpl service = new MyRemoteImpl();
            Naming.rebind("RemoteHello", service);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
