package main;

import main.DCSconnection.PortListenerThread;
import main.UI.GUI;

public class Main {
    public static void main(String[] args) {
        GUI.show();
        new Thread(new PortListenerThread()).start();
    }
}
