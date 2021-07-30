package com.reflect;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws Exception {
        FileReader fr=null;
        BufferedReader br=null;
        String s="";
        String[] ss=new String[3];
        String sss="";
        sss+="package com.reflect;\n";
        sss+="public class File1{\n";
            fr=new FileReader("D:\\homework\\reflect\\src\\com\\reflect\\xxx.properties");
            br=new BufferedReader(fr);
            while((s= br.readLine())!=null) {
                ss=s.split(":");
                sss+="\tprivate "+ss[1]+" "+ss[0]+";\n";
                sss+="\tpublic "+ss[1]+" get"+String.valueOf(ss[0].charAt(0)).toUpperCase()+ss[0].substring(1)+"() {\n";
                sss+="\t\treturn "+ss[0]+";\n";
                sss+="\t}\n";
                sss+="\tpublic void set"+String.valueOf(ss[0].charAt(0)).toUpperCase()+ss[0].substring(1)+"("+ss[1]+" "+ss[0]+") {\n";
                sss+="\t\tthis."+ss[0]+"="+ss[0]+";\n";
                sss+="\t}\n";
            }
            sss+="}";
            fr.close();
            br.close();
            File file=new File("D:\\homework\\reflect\\src\\com\\reflect\\File1.java");
            if (!file.exists()){
                file.createNewFile();
            }
            OutputStream out=new FileOutputStream(file);
            out.write(sss.getBytes(StandardCharsets.UTF_8));
            out.flush();
            out.close();



/*

            Class c=Class.forName("com.reflect.File1");
           // Class c1=Class.forName("java.lang.Object");
            File1 file1= (File1) c.newInstance();
            Field[] fields=c.getDeclaredFields();
            */
/*for (int i=0;i<ss.length;i++){
                System.out.println(ss[i]);
            }*//*

            fr=new FileReader("D:\\homework\\reflect\\src\\com\\reflect\\xxx.properties");
            br=new BufferedReader(fr);
*/

           /* for (Field f:fields){
                f.setAccessible(true);
                s= br.readLine();
                ss = s.split(":");
                switch (ss[1]){
                    case "String":f.set(file1,ss[2]);
                        break;
                    case "int":
                        int temp= Integer.parseInt(ss[2]);
                        f.set(file1,temp);
                        break;
                    case "boolean":
                        Boolean temp1= Boolean.parseBoolean(ss[2]);
                        f.set(file1,temp1);
                }
                *//*if (ss[1].contentEquals("String")){
                    f.set(file1,ss[2]);
                }else {
                    int temp= Integer.parseInt(ss[2]);
                    f.set(file1,temp);
                }*//*
            }

            Method[] methods=c.getDeclaredMethods();
            for(Method m:methods) {
                if (m.getName().charAt(0) == 'g') {
                    System.out.print(m.invoke(file1, null)+" ");
                }
            }
            */

             // System.out.println(file1.getName()+" "+file1.getId()+" "+file1.getAge());
/*            Field field=c.getDeclaredField("name");
            Field field2=c.getDeclaredField("id");
            Field field3=c.getDeclaredField("age");

            field.setAccessible(true);
            field2.setAccessible(true);
            field3.setAccessible(true);

            field.set(file1,"xxx");
            field2.set(file1,111);
            field3.set(file1,20);*/




            //  System.out.println(file1.getName()+" "+file1.getId()+" "+file1.getAge());
        /*


            field3.set(file1,ss[2]);
            System.out.println(file1.getAge()+" "+file1.getName()+" "+file1.getId());*/
        }
}
