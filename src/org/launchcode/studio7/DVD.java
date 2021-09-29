package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {
    // TODO: Implement your custom interface.
    public DVD(String aNme, int capacity, String dType) {
        super(aNme, capacity, dType);
    }

    @Override
    public void spinDisc() {
        System.out.println("The disc spins at a rate of 9600 RPM.");

    }

    @Override
    public void readData() {
        System.out.println("This disc can be read and written on.");

    }

    @Override
    public void writeData() {
        System.out.println("The upload speed is 3300 MBS.");

    }

    @Override
    public void getData() {

    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
