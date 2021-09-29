package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD cd = new CD("Maximus", 555,"CD-R");
        DVD dvd = new DVD("Xerox",5655,"DVD-W");

        // TODO: Call each CD and DVD method to verify that they work as expected.
        System.out.println("\ncd.spinDisc(); dvd.spinDisc();");
        cd.spinDisc();
        dvd.spinDisc();
        System.out.println("\ncd.readData(); dvd.readData();");
        cd.readData();
        dvd.readData();


    }
}
