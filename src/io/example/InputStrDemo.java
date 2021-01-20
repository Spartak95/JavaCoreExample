package io.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Enumeration;
import java.util.Vector;

public class InputStrDemo implements Enumeration<FileInputStream> {
     private Enumeration<String> files;

     public InputStrDemo(Vector<String> list) {
         this.files = list.elements();
     }

     @Override
     public boolean hasMoreElements() {
         return files.hasMoreElements();
     }

     @Override
     public FileInputStream nextElement() {
         FileInputStream f = null;
         try {
             f = new FileInputStream(files.nextElement());
         } catch (FileNotFoundException e) {
             e.printStackTrace();
         }
         return f;
     }
}
