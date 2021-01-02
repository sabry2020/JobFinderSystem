/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobfindersys;

/**
 *
 * @author user
 */


public class JobPost {
    
    String name;
    String description;
    
    
    JobPost(String name, String description){
        this.name=name;
        this.description=description;
        
        
    }
    void Display(){
        
        System.out.println("Job post is "+this.name+"\t" +this.description);
    }
    
}
