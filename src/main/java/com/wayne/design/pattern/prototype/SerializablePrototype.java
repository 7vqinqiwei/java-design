package com.wayne.design.pattern.prototype;

import lombok.Getter;
import lombok.Setter;

import java.io.*;

/**
 * @Author: waynechin
 * @Date: 2019/3/25 16:40
 */
public class SerializablePrototype implements Serializable {

    private static final long serialVersionUID = 1L;
    private @Setter @Getter int i;
    private @Setter @Getter transient int notClone;//transient关键字的成员不会被序列化

    public void writeToFile(String path) throws Exception{
        FileOutputStream outStream = new FileOutputStream(path);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outStream);
        objectOutputStream.writeObject(this);
        outStream.close();
    }

    public static SerializablePrototype ReadFromFile(String path) throws Exception{
        File file = new File(path);
        if(!file.exists())
            file.createNewFile();
        FileInputStream inStream = new FileInputStream(path);
        ObjectInputStream objectOutputStream = new ObjectInputStream(inStream);
        Object o= objectOutputStream.readObject();
        inStream.close();
        return (SerializablePrototype) o;
    }

    /**
     *  原型模式：使用自身或者文件等方式记录本身并能还原到当时记录态
     *  当然不必要的属性应该不备关注都有相关的方法和例子
     * @param args
     * @throws Exception
     */
    /*public static void main(String[] args) throws Exception {

        String path = "D:/SerializablePrototype.instance";

        SerializablePrototype serializablePrototype = new SerializablePrototype();

        serializablePrototype.setI(23);
        serializablePrototype.setNotClone(50);

        serializablePrototype.writeToFile(path);

        SerializablePrototype newProtytype = SerializablePrototype.ReadFromFile(path);

        if(serializablePrototype == newProtytype){
            System.out.println("this is the same object!");
        }

        System.out.println(newProtytype.getI() + ":" + newProtytype.getNotClone());

    }*/




}
