package com.reflect;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test1 {
    public static void main(String[] args) throws Exception {
        FileReader fr=null;
        BufferedReader br=null;
        String s="";
        String[] ss=new String[3];
        String sss="";

        Class c=Class.forName("com.reflect.File1");
        // Class c1=Class.forName("java.lang.Object");
        File1 file1= (File1) c.newInstance();
        Field[] fields=c.getDeclaredFields();
            /*for (int i=0;i<ss.length;i++){
                System.out.println(ss[i]);
            }*/
        fr=new FileReader("D:\\homework\\reflect\\src\\com\\reflect\\xxx.properties");
        br=new BufferedReader(fr);

        for (Field f:fields){
            f.setAccessible(true);
            s= br.readLine();
            ss = s.split(":");
            switch (ss[1]){
                case "String":f.set(file1,ss[2]);
                    break;
                case "int":
                    int anInt= Integer.parseInt(ss[2]);
                    f.set(file1,anInt);
                    break;
                case "boolean":
                    Boolean aBoolean= Boolean.parseBoolean(ss[2]);
                    f.set(file1,aBoolean);
                    break;
                case  "short":
                    Short aShort=Short.parseShort(ss[2]);
                    f.set(file1,aShort);
               /* case "short":
                    short temp2= Short.parseShort(ss[2]);
                    f.set(file1,temp2);*/
            }
                /*if (ss[1].contentEquals("String")){
                    f.set(file1,ss[2]);
                }else {
                    int temp= Integer.parseInt(ss[2]);
                    f.set(file1,temp);
                }*/
        }
        Method[] methods=c.getDeclaredMethods();
        for(Method m:methods) {
            if (m.getName().charAt(0) == 'g') {
                System.out.print(m.invoke(file1, null)+" ");
            }
        }
    }
}
