package com.cczyWyc.myRpc.serialization.jdk;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * main function
 *
 * @author wangyc
 */
public class JdkSerialMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String home = System.getProperty("user.home");
        String basePath = home + "/Desktop";
        FileOutputStream fileOutputStream = new FileOutputStream(basePath + "student.dat");
        Student student = new Student();
        student.setNumber(10);
        student.setName("cczyWyc");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(student);
        objectOutputStream.flush();
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream(basePath + "student.dat");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Student datStudent = (Student) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(datStudent);
    }
}
