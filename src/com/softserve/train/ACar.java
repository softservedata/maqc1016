package com.softserve.train;

public abstract class ACar {
    private double maxSpeed;
    
    protected ACar(){
    	System.out.println("protected ACar()");
    }

    protected ACar(double maxSpeed){
    	this.maxSpeed = maxSpeed;
    	System.out.println("protected ACar()");
    }

    public double getMaxSpeed( ) {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    abstract void carRides( );
}
