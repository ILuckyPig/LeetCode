package com.lu.designpattern.factorypattern.simplefactorypattern;

import com.lu.designpattern.factorypattern.LogitechMouse;
import com.lu.designpattern.factorypattern.Mouse;
import com.lu.designpattern.factorypattern.SteelSeriesMouse;

public class MouseFactory {
    public static Mouse createMouse(String mouse) {
        switch (mouse) {
            case "赛睿":
                return new SteelSeriesMouse();
            case "罗技":
                return new LogitechMouse();
            default:
                return new LogitechMouse();
        }
    }
}
