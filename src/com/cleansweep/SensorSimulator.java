package com.cleansweep;

public class SensorSimulator {
    public boolean isPathBlocked() {
        // Simulate detecting an obstacle
        // 20% chance of an obstacle
        return Math.random() > 0.8;
    }

    public boolean isDirty() {
        // Simulate detecting dirt
        // 50% chance of dirt
        return Math.random() > 0.5;
    }
}