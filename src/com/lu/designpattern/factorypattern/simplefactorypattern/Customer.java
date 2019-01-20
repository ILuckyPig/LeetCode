package com.lu.designpattern.factorypattern.simplefactorypattern;

import com.lu.designpattern.factorypattern.Mouse;

public class Customer {
    public static void main(String[] args) {
        Mouse mouse = MouseFactory.createMouse("罗技");
        mouse.desc();
    }
}
