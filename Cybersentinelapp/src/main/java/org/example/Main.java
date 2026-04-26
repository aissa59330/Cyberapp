package org.example;

import model.incident;

public class Main {
    public static void main() {
        incident model = new incident("Brute Force", "192.168.10.1",8);
        System.out.println(model);
    }
}
