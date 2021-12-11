/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author lenovo
 */
public class MyObjectOutputStream extends ObjectOutputStream {
  
      protected MyObjectOutputStream() throws IOException, SecurityException {
          super();
      }
  
      @Override
      protected void writeStreamHeader() throws IOException {
          
     }
     
     public MyObjectOutputStream(OutputStream o) throws IOException{
         super(o);
     }
}