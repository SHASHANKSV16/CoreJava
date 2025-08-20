package com.xworkz.blazers.blazer;

public class BlazerRunner {
    public static void main(String[] args) {
        Blazer firstBlazer = new Blazer(1, "black", 2, 3, "cotton", "casuals");
        firstBlazer.getData();

        Blazer secondBlazer = new Blazer(2, "blue", 3, 2, "wool", "formals");
        secondBlazer.getData();
    }
}
