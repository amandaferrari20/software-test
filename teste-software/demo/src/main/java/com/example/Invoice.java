package com.example;

import java.util.List;

public class Invoice {
    private final double value;

    public Invoice(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}