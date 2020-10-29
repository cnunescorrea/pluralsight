package com.cnunes.inheritance;

public class Divider extends CalculateBase {
    @Override
    public void calculate() {
        double value = getLeftVal() / getRightVal();
        setResult(value);
    }
}
