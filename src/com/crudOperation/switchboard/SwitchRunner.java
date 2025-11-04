package com.crudOperation.switchboard;

public class SwitchRunner {
    public static void main(String[] args) {

        SwitchInterface s = new SwitchInterfaceImpl();
        TubeLight light1 = new TubeLight();
        light1.setId(101);
        light1.setColor("yellow");

        TubeLight light2 = new TubeLight();
        light2.setId(103);
        light2.setColor("white");

//        SwitchInterface s = new SwitchInterfaceImpl();

        s.addLight(light1);
        s.addLight(light2);
        s.getAllLights();

    }
}
