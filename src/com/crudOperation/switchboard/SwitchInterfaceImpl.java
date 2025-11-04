package com.crudOperation.switchboard;

import java.util.ArrayList;
import java.util.List;

public class SwitchInterfaceImpl implements SwitchInterface{

  public List<TubeLight> lights = new ArrayList<>();

    @Override
    public void addLight(TubeLight light) {

        if (light != null){
            lights.add(light);

        }else{
            System.out.println("invalid light");
        }

    }

    @Override
    public void getAllLights() {
        for (TubeLight l : lights){

                System.out.println("id :"+l.getId());
                System.out.println("color :"+l.getColor());
                System.out.println("-----------------");

        }
    }


}
