package com.lu.designpattern.factorypattern.factorymethodpattern;

import com.lu.designpattern.factorypattern.LogitechMouse;
import com.lu.designpattern.factorypattern.Mouse;

public class LogitechMouseFactory implements MouseFactory {
    @Override
    public Mouse createMouse() {
        return new LogitechMouse();
    }
}
