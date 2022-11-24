package com.epam.training.student_anastasia_chupina.clean_code.main.java.planes;

import com.epam.training.student_anastasia_chupina.clean_code.main.java.models.MilitaryType;

import java.util.Objects;

public class MilitaryPlane extends Plane{

    private final MilitaryType militaryType;

    public MilitaryPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, MilitaryType militaryType) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.militaryType = militaryType;
    }

    public MilitaryType getPlaneType() {
        return militaryType;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", type=" + militaryType +
                '}');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MilitaryPlane)) return false;
        if (!super.equals(o)) return false;
        return militaryType == ((MilitaryPlane) o).militaryType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), militaryType);
    }
}
