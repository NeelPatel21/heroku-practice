/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herokudb;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Neel Patel
 */
public class Herokudb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("hello world "+System.getenv("port"));
        new DataBaseHandle();
        
        try {
            Thread.sleep(1000000);
        } catch(InterruptedException ex) {
        }
    }
    
}
