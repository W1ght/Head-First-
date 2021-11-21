package com.wight.proxy.gumballremote;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author wight
 * @date 2021/11/21
 * @apiNote
 */
public interface GumballMachineRemote extends Remote {
    /**
     * getCount
     * @return count
     * @throws RemoteException RemoteException
     */
    public int getCount() throws RemoteException;

    /**
     * getLocation
     * @return Location
     * @throws RemoteException RemoteException
     */
    public String getLocation() throws RemoteException;

    /**
     * getState
     * @return State
     * @throws RemoteException RemoteException
     */
    public State getState() throws RemoteException;
}
