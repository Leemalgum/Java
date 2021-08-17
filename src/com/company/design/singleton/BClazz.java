package com.company.design.singleton;

public class BClazz {
    private SocketClient socketClient;

    public BClazz() {
        this.socketClient = SocketClient.getInstance(); //기본 생성자를 private으로 선언하여 new로 인스턴스화 할 수 없다.
    }

    public SocketClient getSocketClient() {
        return this.socketClient;
    }
}
