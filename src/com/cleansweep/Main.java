package com.cleansweep;

public class Main {
    public static void main(String[] args) {
        SensorSimulator simulator = new SensorSimulator();
        VacuumCleaner vacuum = new VacuumCleaner(simulator);
        ControlSystem controlSystem = new ControlSystem(vacuum);
        
        controlSystem.startCleaningSession();
    }
}