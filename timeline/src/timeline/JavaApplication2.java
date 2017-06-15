/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeline;

import com.mongodb.DB;
//import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import java.util.concurrent.CountDownLatch;

/**
 *
 * @author Anetha
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        
            CountDownLatch latch  = new CountDownLatch(1);
        try{
            MongoClient m = new MongoClient("localhost",27017);
       MongoDatabase db =  m.getDatabase("test");
        System.out.println("connected");
        
    }
        catch(Exception e)
        {
            System.out.println(e);
        }
       latch.await();
    }
    
}
