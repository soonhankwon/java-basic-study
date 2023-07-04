package com.soon.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PersonClassTest {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class c = Class.forName("com.soon.reflection.Person");

        Class[] parameterTypes = {String.class, Integer.class};
        Constructor constructor = c.getConstructor(parameterTypes);

        Object[] initargs = {"Soon", 30};
        Person soon = (Person) constructor.newInstance(initargs);
        System.out.println(soon);
    }
}
