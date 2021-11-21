package com.wight.proxy.myremote;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author wight
 * @date 2021/11/20
 * @apiNote
 */
public interface MyRemote extends Remote {
    /**
     * callResult
     * @return 调用结果
     * @throws RemoteException 网络异常
     */
    public String sayHello() throws RemoteException;
}
