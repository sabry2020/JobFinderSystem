
package jobfindersys;
import java.util.*;
import java.util.Scanner;
import static jobfindersys.CompanyAdmin.c_admins;

import static jobfindersys.JobVacancy.J_Vacancy;

import java.util.ArrayList;
public class JobFINDERSYS {
    
                          //Custom Functions   
   
static Company ChangeCompanyInfo(Company comp, String choice, boolean canFire){
    
    DisplayCompanyInfo(comp);
    comp.CompanyName=choice;
           
//decrement
if(canFire){
           comp.CompanyNumberOfEmployees--;
           //preventing negative number 
           if(comp.CompanyNumberOfEmployees<0)
               comp.CompanyNumberOfEmployees=0;
            
        }
return comp;
}
        
static void DisplayCompanyInfo(Company comp, float avgReview){
    System.out.println("\n Company name is "+comp.CompanyName+"\n Company number of Employees are "+comp.CompanyNumberOfEmployees);
    System.out.println("\n And for the reviews ");
    if(comp.CompanyReviews!=null)
    {
    for(int i=0; i<comp.CompanyReviews.length;i++){
        
        System.out.println("\n review"+(i+1)+" is \t"+comp.CompanyReviews[i]);
       
    }
     System.out.println("\n the average review is "+ avgReview);
  
    }
    else{
        System.out.println("\n There is no reviews added till now  ");
    }
}
static void DisplayCompanyInfo(Company comp){//for the view of the system admin (no need to know the average reviews)
    System.out.println("\n Company name is "+comp.CompanyName+"\n Company number of Employees are "+comp.CompanyNumberOfEmployees);
  
    
   
}

    static void SearchJobPosts(String desiredJobPost, JobPost[] jobPost){//also exist in the company class for a check 
        for(int i=0; i<jobPost.length;i++){
            if(desiredJobPost.equals(jobPost[i].name)){
                System.out.print("found a match and it is "+jobPost[i].name+"Which is equals to "+desiredJobPost);
               
                System.out.println("\nJob post Found \n "+jobPost[i].name+"\t"+jobPost[i].description);
                break;
                
            }
           
        }
    }
 
    
    // Java Program to add an element in an Array 
public static int[] addReviews(int n , int[]arr, int newElement ){//for reviews 
    
    int i;
    
    int newarr[]=new int[n+1];
    for(i=0; i<n;i++){
        newarr[i]=arr[i]; 
    }
   newarr[n]=newElement;
   
    
   return newarr;
}

public static JobPost[] addJobPosts(int n , JobPost arr[], JobPost newObject){//for adding a jobPost
    int i; 
  
        // create a new array of size n+1 
       JobPost newarr[] = new JobPost[n + 1]; 
     
      
  
        // insert the elements from 
        // the old array into the new array 
        // insert all elements till n 
        // then insert x at n+1 
        for (i = 0; i < n; i++) 
            newarr[i] = arr[i]; 
  
        newarr[n] = newObject; 
  
        return newarr; 
    
}
public static float calculateAverageReviews(int [] reviews){
  
   float sum=0;     
   if(reviews[0]!=0||reviews!=null)
    for(int i=0; i<reviews.length; i++)
        sum+=(float)reviews[i];//preventing type conversion
    
   return sum/reviews.length;
}



		
 

    
    public static void main(String[] args) {
        
        //The Start...Welcoming 
        
       Scanner input=new Scanner(System.in);
        System.out.println("\tWelcome to Sha3'lny Shokran! :)");
        
      int numberChoice=0;
     
     float avgReviews=0.0f;
     boolean companyReviewed=false;
       
       
        
//JobPosters 

// One JobPoster for Each Company 

JobPoster j1=new JobPoster("Mohamed Hosam", "sabry", "sabry123", "Job Poster");


   JobPoster jpDell[]={j1};
    
   
    JobPoster jp4 =new JobPoster("Adham Shreif", "adham", "adham123", "Job Poster");
  

   JobPoster jpLenovo[]={jp4};
   
   
   
   
    JobPoster jp7 =new JobPoster("Nada", "nada", "nada123", "Job Poster");//only this is working 
  


   JobPoster jpSamsung[]={jp7};
  
   
        JobPoster J[] ={j1,jp4,jp7};
    CompanyAdmin cDell =new CompanyAdmin("","","","","");
    CompanyAdmin cLenovo =new CompanyAdmin("","","","","");
    CompanyAdmin cSamsung =new CompanyAdmin("","","","","");
   
     CompanyAdmin c_admins[]={cDell,cLenovo,cSamsung};
    
    
    CompanyAdmin.Insert_CompanyAdmins(c_admins);
    
    
    cDell=c_admins[0];
    cLenovo=c_admins[1];
    cSamsung=c_admins[2];
    
    
    
         
    /*obPostersName, String JobPostersEmail, String JobPostersPassword, String JobPostersType
    JobPoster jp1=new JobPoster("mohamed", "mohamed", "mohamed", "mohamed");
        JobPoster jp2=new JobPoster("mohamed", "mohamed", "mohamed", "mohamed");
            JobPoster jp3=new JobPoster("mohamed", "mohamed", "mohamed", "mohamed");
            
            
             JobPoster j_poster[]={jp1,jp2,jp3};
             JobPoster j_poster2[]={jp1,jp2,jp3};
             JobPoster j_poster3[]={jp1,jp2,jp3};
    JobPoster.Insert_JP_DELL(j_poster);
   JobPoster.Insert_JP_LENOVO(j_poster2);
   JobPoster.Insert_JP_SAMSUNG(j_poster3);
  */
    
JobPost jpp1=new JobPost("Backend role in Cairo", "NEEDED A BACKEND ENGINEER for a work");
   JobPost jpp2=new JobPost("JOBPOST2", "NEEDED A BACKEND ENGINEER ya sabry ");
   JobPost [] jPostDell ={jpp1, jpp2};
   
   JobPost jpp3=new JobPost("Front End Role", "NEEDED A FrontEnd ENGINEER");
   JobPost jpp4=new JobPost("JOBPOST2", "NEEDED A BACKEND ENGINEER ya sabry ");
   JobPost [] jPostLenovo ={jpp3, jpp4};
   
   
   JobPost jpp5=new JobPost("JOBPOST", "NEEDED A BACKEND ENGINEER");
   JobPost jpp6=new JobPost("JOBPOST2", "NEEDED A BACKEND ENGINEER ya sabry ");
   JobPost [] jPostSamsung ={jpp5, jpp6};
   
   
   
   
int []reviews={1, 2 , 3};
int []rev2={5,5,5};
int[]rev3={4,5,3};

    //String CompName, String CompAdmin, int CompNumberOfEmployees,
          // JobPoster[] CompJobPosters, JobVacancy[] CompJobVacancies, float CompReviews[]
        Company Dell= new Company("Dell", cDell,12, jpDell, jPostDell, reviews ); 
        Company Lenovo=new Company("Lenovo",cLenovo,20,jpLenovo,  jPostLenovo, rev2 );
       Company Samsung=new Company("Samsung",cSamsung,25,jpSamsung, jPostSamsung, rev3);
       
       Company [] companies={Dell, Lenovo, Samsung};
   
      
   //String CompName, String CompAdmin, int CompNumberOfEmployees,
     
   
    
           System.out.println("How Are you");
      
       
        int opt;
        boolean companyRegistered=false;
        
        String Continue="Continue";
        while(Continue.equals("Continue"))  //main loop
        {
            
       
       
        //Options 
  
        //Add a loop to repeat taking options from user 
        System.out.print("What Do you Want to Do \n 1.Log in to Your Company\n 2.Browse Jobs \n 3.AddReviews \n 4.Apply to a Job \n 5.Run as administrator \n 6.Display Company Info \n 7.Exit ");
        opt =input.nextInt();
        
        
        //opt 1
        if(opt==1){
         //using labels instead of goto
         outer:{
             
            boolean LoggedIn=false;
            System.out.println("Option 1 \n ");
    
            
            System.out.println("Which Company you are in ?\n ");
            String CompanyChoice=input.next();
          
            inner:{
            System.out.println("Continue or Just Registering to the Company \t ..to Continue Press 1 \t Quit Press any Number");
            int optionToContinue=input.nextInt();
            if(optionToContinue==1){
                
            
            
                System.out.println("Login as Job poster ");
        System.out.println("Enter your email: ");
        String mail2=input.next();   
        System.out.println("Enter your password: ");
        String pass2=input.next(); 
            
       //n is intialized in the global scope 
        
//          if(CompanyChoice.equals("Dell")){
//                 LoggedIn=SystemUser.Login(jpDell, mail2, pass2);
//                 numberChoice=0;
//            }
//             if(CompanyChoice.equals("Lenovo")){
//                 LoggedIn=SystemUser.Login(jpLenovo, mail2, pass2);
//                 numberChoice=1;
//            }
//              if(CompanyChoice.equals("Samsung")){
//                  
//                 LoggedIn=SystemUser.Login(jpSamsung, mail2, pass2);
//                  numberChoice=2;
//            }
//              if(companies[numberChoice].CompanyName.equals(""))
              
               LoggedIn=SystemUser.Login(J[numberChoice], mail2, pass2);
              
        
         if(LoggedIn){
             System.out.println("Want to add a Jobpost press 1 :\n ");
             
             int optionToSelect=input.nextInt();
             
             if(optionToSelect==1){
             
             
             System.out.println(" \n Enter the name of the new job post \n ");
             
           input.useDelimiter("\n");
           String choice=input.next();
           companyRegistered=true;
           
             System.out.println("Enter the description \n");
            
             String choice3=input.next();
             JobPost jp10=new JobPost(choice,choice3 );    //thn push to the main array 
            
           if(numberChoice==0)
           jPostDell=addJobPosts(jPostDell.length, jPostDell, jp10);
           
            if(numberChoice==1)
           jPostLenovo=addJobPosts(jPostLenovo.length, jPostLenovo, jp10);
           
             if(numberChoice==2)
           jPostSamsung=addJobPosts(jPostSamsung.length, jPostSamsung, jp10);
           
             System.out.println("The JobPost now appears like \n"+"\t"+"JobPost name \t "+jp10.name+"\t"+jp10.description+"\n");
             
            
             }
         
         
            
         
         }
             else{
                 System.out.println("Have a good LOOK");
                 continue;
             }
         
            }
            else{
                for(int i=0 ;i<companies.length;i++){
                    if(CompanyChoice.equals(companies[i].CompanyName)){
                        numberChoice=i;
                        companyRegistered=true;
                    }
                }
                
                break inner;
            }
            
            } 
            
          
             
         }
         
            
         }
        
        
            
    //opt 2    
        else if(opt==2){
       
            if(companyRegistered)
            {
            System.out.println("Job Posts avialable are as follows :");
            if(numberChoice==0)
            {
            for(int i=0; i<jPostDell.length; i++){
                //jobPost array must be pushed succesfully 
                System.out.println("Job Post:"+(i+1) +" \n "+companies[numberChoice].CompanyName+"\n Title:"+jPostDell[i].name+"\n Description "+jPostDell[i].description);
            }
            }
              if(numberChoice==1)
            {
            for(int i=0; i<jPostLenovo.length; i++){
                //jobPost array must be pushed succesfully 
                System.out.println("Job Post:"+(i+1) +" \n "+companies[numberChoice].CompanyName+"\n Title:"+jPostLenovo[i].name+"\n Description "+jPostLenovo[i].description);
            }
            }
                if(numberChoice==2)
            {
            for(int i=0; i<jPostSamsung.length; i++){
                //jobPost array must be pushed succesfully 
                System.out.println("Job Post:"+(i+1) +" \n "+companies[numberChoice].CompanyName+"\n Title:"+jPostSamsung[i].name+"\n Description "+jPostSamsung[i].description);
            }
//                for(int i=0; i<jPostSamsung.length; i++){
//               
//              System.out.println("Job Post:"+(i+1) +" \n "+"Company-Name :\t Samsung"+"\n Title:"+companies[numberChoice].CompanyName+"\n Description "+companies.description);
//            }
            }
        }
            else{
                System.out.println("Please register to your Company");
            }
        }
        
        else if(opt==3){
        
         
          if(companyRegistered){
         int  n=0;
            while(true)
            {
            System.out.println("Enter the review you want to add (From 1 to 10) ");
        int choice=input.nextInt();
        
       if( choice>10 ||choice<1){
           System.out.println("Enter n from 1 to 10 ");
           break;
       }
          
     
//       if(numberChoice==0)
//        Dell.CompanyReviews=addReviews(n, Dell.CompanyReviews, choice);
//       
//        
//        if(numberChoice==1)
//        Lenovo.CompanyReviews=addReviews(n, Lenovo.CompanyReviews, choice);
//        
//         if(numberChoice==2)
//        Samsung.CompanyReviews=addReviews(n, Samsung.CompanyReviews, choice);
         
         companies[numberChoice].CompanyReviews=addReviews(n,companies[numberChoice].CompanyReviews,choice);
     
            
               
           System.out.println("add another review");
                String choice2=input.next();
                if(choice2.equals("no"))
                    break;
                
                n++;
             
            
            
            System.out.println("\n Now lets see the reviews \n  ");
            

            
            avgReviews=calculateAverageReviews(companies[numberChoice].CompanyReviews);
 
 
 
 companyReviewed=true;

                 for(int i=0; i<companies[numberChoice].CompanyReviews.length;i++){
                System.out.println("\n review "+(i+1) +"  is \t"+companies[numberChoice].CompanyReviews[i]);
                     System.out.println("Average Reviews is \t"+avgReviews);
            }
            
            
    
            
            }
        }else{
             System.out.println("Please Register to your Company  add  ln 411 below");
              
          }
        }
        
        
        
        else  if(opt==4){
             System.out.println("Option 4");
        
             
           // displayJobs();
           System.out.print("want to search for a specific job  type yes ");
           String Yesorno = input.next();
           if(Yesorno.equals("yes")){
               System.out.println("Enter your desired job Post ");
               String desiredName=input.next();
                if(numberChoice==0)
               SearchJobPosts(desiredName,jPostDell);
               
                   if(numberChoice==1)
               SearchJobPosts(desiredName,jPostLenovo);
               
                      if(numberChoice==2)
               SearchJobPosts(desiredName,jPostSamsung);
               
           }
           else{
                if(numberChoice==0)
                {
                     for(int i=0; i<jPostDell.length; i++){
              
                System.out.print("Job Post:"+(i+1) +" \n "+"Name:"+companies[numberChoice].CompanyName+"\n Description "+jPostDell[i].description);
                     }
                }
                 if(numberChoice==1)
                {
                  for(int i=0; i<jPostLenovo.length; i++){
                
                System.out.print("Job Post:"+(i+1) +" \n "+"Name:"+companies[numberChoice].CompanyName+"\n Description "+jPostLenovo[i].description);   
                }
                  if(numberChoice==2)
                {
                     for(int i=0; i<jPostSamsung.length; i++){
              
                System.out.print("Job Post:"+(i+1) +" \n "+"Name:"+companies[numberChoice].CompanyName+"\n Description "+jPostSamsung[i].description);
                }
              System.out.println("Job Posts avialable are as follows :");
           
            }
           }

            
        
        }
        }       
        else  if(opt==5){
            boolean LoggedIn=false;
            if(companyRegistered)
            {
            System.out.println("Login as administrator ! \n ");
      System.out.println("Enter your email: ");
        String mail=input.next();   
        System.out.println("Enter your password: ");
        String pass=input.next(); 
        
       LoggedIn=SystemUser.Login(c_admins,mail,pass);
       if(LoggedIn==true){
           System.out.println("change the company name to :");
           
           String choice=input.next();
           
           System.out.println("Fire an employee? ");
          
          
           boolean boolChoice=false;
           String choice3=input.next();
           
           if(choice3.equals("yes"))
               boolChoice=true;
           
//           if(numberChoice==0)
//           ChangeCompanyInfo(Dell, choice, boolChoice);
//           
//            if(numberChoice==1)
//           ChangeCompanyInfo(Lenovo, choice, boolChoice); 
//            
//            if(numberChoice==2)
//          ChangeCompanyInfo(Samsung, choice, boolChoice);
           
            companies[numberChoice]=ChangeCompanyInfo(companies[numberChoice],choice,boolChoice);
            
             System.out.println("Latest Changes ");
           DisplayCompanyInfo(companies[numberChoice]);
          
        
       }
       
        }
            else{
                System.out.println("Please register to your company at opt1 ");
            
            }
        }
          
  
           else if(opt==6){
            //enter the company you want to display 
            //System.out.println("Enter the name of the company you want to see"); encapsul. is needed 
            
            if(companyRegistered)
            {
//                try{
//                float avgReview=calculateAverageReviews(companies[numberChoice].CompanyReviews);
//                }
//                catch(Exception e ){
//                    System.out.println("Found an Exception"+e.getMessage());
//                }
//                finally{
//                    
//                float avgReview=0.0f;
            
            if(companyReviewed)
            {
            DisplayCompanyInfo(companies[numberChoice], avgReviews);
            }
            else{
                DisplayCompanyInfo(companies[numberChoice]);
            }
            }
            else{
                System.out.println("Please register to your Company");
            }
           
          }
           else if(opt==7){
               //Application.Quit();
              System.out.print("Thank you for visiting us ");
            break;
               
           }
           else if(opt==8){
               
               
               System.out.println("------------All The companies Info Combined----------------------");
               for(int i=0; i<companies.length; i++){
                   System.out.println(" \n Reviews for the company  indexed"+i);
                   if(companies[i].CompanyReviews!=null){
                   for(int j=0; j<companies[i].CompanyReviews.length;j++)
                       System.out.println(companies[i].CompanyReviews[j]+" \n" );
               }
                   
               }
           }
        else{
            System.out.println("Invalid entry");
        }
        
            System.out.println("\n Type Stop to Exit OR Continue  "); 
       Continue=input.next();
        }
        
        
       
       
        
       
    }
     }
        
    
    
    


