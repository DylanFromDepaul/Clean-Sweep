package com.cleansweep;

public class VacuumCleaner {
    private SensorSimulator simulator;
    private boolean powerOn = true;
    private int batteryLevel = 100; // Starts with full battery

    public VacuumCleaner(SensorSimulator simulator) {
        this.simulator = simulator;
    }

    public boolean hasPower() {
        return batteryLevel > 0;
    }

    public boolean canContinueCleaning() {
        return powerOn && batteryLevel > 20; // Reserve 20% power for returning to base
    }

    public boolean detectObstacle() {
        return simulator.isPathBlocked();
    }

    public void cleanCurrentLocation() {
        if (batteryLevel > 0 && simulator.isDirty()) {
            System.out.println("Cleaning...");
            batteryLevel -= 10; // Cleaning consumes battery
        }
    }

    public void changeDirection() {
        System.out.println("Obstacle detected, changing direction...");
        // Logic to change direction can be complex depending on the environment
    }

    public void returnToBase() {
        // Simulate returning to charging base
        System.out.println("Returning to base for recharge.");
        batteryLevel = 100; // Recharge the battery
    }
}