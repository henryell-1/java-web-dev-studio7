package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc {
    private  String name;
    private int capacityStorage;
    private String diskType;
    private ArrayList<String> contents;

    public BaseDisc(String aNme, int capacity, String dType){
        name = aNme;
        capacityStorage = capacity;
        diskType = dType;

    }
}
