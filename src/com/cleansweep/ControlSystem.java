package com.cleansweep;

public class ControlSystem {
    private final VacuumCleaner vacuum;

    public ControlSystem(VacuumCleaner vacuum) {
        this.vacuum = vacuum;
    }

    public void startCleaningSession() {
        System.out.println("Starting cleaning session.");
        while (vacuum.hasPower() && vacuum.canContinueCleaning()) {
            if (vacuum.detectObstacle()) {
                vacuum.changeDirection();
            } else {
                vacuum.cleanCurrentLocation();
            }
        }
        System.out.println("Cleaning session ended. Returning to base for recharge.");
        vacuum.returnToBase();
    }
}