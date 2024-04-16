package org.example;

public final class ExampleUtilities {
    // Example Utility method
    private ExampleUtilities(int a) {

    }

    public static ExampleUtilities of(int a) {
        return new ExampleUtilities(a);
    }

    public static ExampleUtilities doubleCreate(int a) {
        return new ExampleUtilities(a * a);
    }

}

