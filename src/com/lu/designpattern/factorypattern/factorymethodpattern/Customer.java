package com.lu.designpattern.factorypattern.factorymethodpattern;

import com.lu.designpattern.factorypattern.Mouse;

public class Customer {
    public static void main(String[] args) {
        MouseFactory steelSeriesMouseFactory = new SteelSeriesMouseFactory();
        MouseFactory logitechMouseFactory = new LogitechMouseFactory();
        Mouse steelSeriesMouse = steelSeriesMouseFactory.createMouse();
        Mouse logitechMouse = logitechMouseFactory.createMouse();
        steelSeriesMouse.desc();
        logitechMouse.desc();
    }
}
