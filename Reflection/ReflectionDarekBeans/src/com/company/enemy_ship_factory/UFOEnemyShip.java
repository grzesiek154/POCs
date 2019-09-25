package com.company.enemy_ship_factory;

public class UFOEnemyShip extends EnemyShip{

    private String idcode ="100";

    private String getPRivate() {return "How did you get this";}

    private String getOtherPrivate(int thisInt, String thatString){
        return "How did you get here " + thisInt + " " + thatString;
    }

    EnemyShipFactory shipFactory;

    public UFOEnemyShip(int number, String randString){

        System.out.println("You sent: " + number + " " + randString);
    }


    public UFOEnemyShip(EnemyShipFactory shipFactory) {
        this.shipFactory = shipFactory;
    }

    void makeShip() {

        System.out.println("Making enemy ship " + getName());

        // The specific weapon & engine needed were passed in
        // shipFactory. We are assigning those specific part
        // objects to the UFOEnemyShip here

        weapon = shipFactory.addESGun();
        engine = shipFactory.addESEngine();

    }
}
