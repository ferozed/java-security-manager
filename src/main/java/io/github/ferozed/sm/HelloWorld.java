package io.github.ferozed.sm;

public class HelloWorld {

    public static void main(String [] args) {
        System.setSecurityManager(new MySecurityManager());
    }
}
