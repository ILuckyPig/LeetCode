package com.lu.designpattern.factorypattern.factorymethodpattern;

import com.lu.designpattern.factorypattern.Mouse;
import com.lu.designpattern.factorypattern.SteelSeriesMouse;

public class SteelSeriesMouseFactory implements MouseFactory {
    @Override
    public Mouse createMouse() {
        return new SteelSeriesMouse();
    }
}
