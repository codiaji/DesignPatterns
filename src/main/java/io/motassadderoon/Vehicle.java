package io.motassadderoon;

public abstract class Vehicle {

    private int speed;


    public Vehicle(int speed) {
        this.speed = speed;
    }

     public int getSpeed(){
         return speed;
     }

    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        }
    }


    public abstract Vehicle clone();
}