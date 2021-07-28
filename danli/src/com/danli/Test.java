package com.danli;

public class Test {
    public static void main(String[] args) {
        for (int i=0;i<5;i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    Test1.getvalue();
                }
            });
            thread.start();
        }
        Test1.getvalue();
    }
}

