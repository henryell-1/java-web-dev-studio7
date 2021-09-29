package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc{
    // TODO: Implement your custom interface.

    public CD(String aNme, int capacity, String dType) {
        super(aNme, capacity, dType);
    }

    @Override
    public void spinDisc() {
        System.out.println("The cd spins at 5000 RPM.");

    }

    @Override
    public void readData() {
        System.out.println("This cd can hold a max of 56 songs.");

    }

    @Override
    public void writeData() {
        System.out.println("Upload speed 2500 MBS.");

    }

    @Override
    public void getData() {

    }


    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
