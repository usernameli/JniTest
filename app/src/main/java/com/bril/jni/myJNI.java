package com.bril.jni;

/**
 * Created by brill on 2016/9/8.
 */
public class myJNI {

    static {
        System.loadLibrary("JniTest");
    }

    public static native String sayHello();

}