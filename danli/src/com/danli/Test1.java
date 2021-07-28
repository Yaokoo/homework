package com.danli;

import java.util.concurrent.atomic.AtomicReference;

public class Test1 {
    private static final AtomicReference<Test1> atomicReference = new AtomicReference<>(null);


    private Test1() {
    }
    public static Test1 getvalue() {
        Test1 test1 = atomicReference.get();
        if (test1 == null) {
            test1 = new Test1();
            if (!atomicReference.compareAndSet(null, test1))
                return atomicReference.get();
            System.out.println(atomicReference.get().hashCode());
        }
        return test1;
    }
}