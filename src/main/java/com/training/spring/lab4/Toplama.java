package com.training.spring.lab4;

public class Toplama implements IMathOp {
    @Override
    public Integer execute(Integer val1,
                           Integer val2) {
        return val1 + val2;
    }
}
