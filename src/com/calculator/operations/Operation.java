package com.calculator.operations;

import java.util.Scanner;

public abstract class Operation {
    protected Scanner scanner;

    public Operation(Scanner scanner) {
        this.scanner = scanner;
    }

    public abstract void execute();
}
