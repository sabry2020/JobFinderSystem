
package jobfindersys;
import java.util.*;
import java.util.Scanner;
import static jobfindersys.CompanyAdmin.c_admins;
import static jobfindersys.JobPoster.JobPostersOfDELL;
import static jobfindersys.JobPoster.JobPostersOfLENOVO;
import static jobfindersys.JobPoster.JobPostersOfSAMSUNG;
import static jobfindersys.JobVacancy.J_Vacancy;

import java.util.ArrayList;
public class JobFINDERSYS {
   
static void ChangeCompanyInfo(Company comp, String choice, boolean canFire){
    
    DisplayCompanyInfo(comp);
    comp.CompanyName=choice;
           
//decrement
if(canFire){
           comp.CompanyNumberOfEmployees--;
           
           if(comp.CompanyNumberOfEmployees<0)
               comp.CompanyNumberOfEmployees=0;
            
        }
}
        
static void DisplayCompanyInfo(Company comp){
    System.out.println("\n Company name is "+comp.CompanyName+"\n Company number of Employees are "+comp.CompanyNumberOfEmployees);
    System.out.println("\n And for the reviews ");
    for(int i=0; i<comp.CompanyReviews.length;i++){
        System.out.println("\n review"+(i+1)+" is \t"+comp.CompanyReviews[i]);
    }
}

    static void SearchJobPosts(String desiredJobPost, JobPost[] jobPost){//also exist in the company class for a check 
        for(int i=0; i<jobPost.length;i++){
            if(desiredJobPost.equals(jobPost[i].name)){
                System.out.print("found a match and it is "+jobPost[i].name+"Which is equals to "+desiredJobPost);
                System.out.println("\n\n Loading ");
                System.out.println("Job post Found \n "+jobPost[i].name+"\t"+jobPost[i].description);
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



		
 

    
    public static void main(String[] args) {
        
        //The Start...Welcoming 
        
       Scanner input=new Scanner(System.in);
        System.out.println("\tWelcome to Sha3'lny Shokran! :)");
        
      int numberChoice=0;
     
     
       
       
        /*
        JobPoster job_posters[]= new JobPoster[3];
       
        
        
        JobSeeker job_seekers[]= new JobSeeker[2];
        
        
      
        
        JobVacancy job_vacancies[]= new JobVacancy[5];
    /*
    CompanyAdmin c_admins[]= new CompanyAdmin[3];
    CompanyAdmin c1=new CompanyAdmin(CompanyAdminsName, CompanyAdminsEmail, CompanyAdminsPassword, CompanyAdminsType, CompanyAdminID);
    companyAdmin.Insert_CompanyAdmins(c_admins);
*/
    ///compsny admins 
    
       
    
    
   
    //end of CompanyAdmin Insertion 
    
    
//    String JobPostersName, String JobPostersEmail, String JobPostersPassword, String JobPostersType


   

   
        
//     JobPoster J_Poster[]={J1,J2,J3};
/*
    JobPoster JobPostersOfDELL[]= {jp1,jp2,jp3};
     JobPoster JobPostersOfLENOVO[]= {jp4,jp5,jp6};


    
/*
    JobPoster.Insert_JP_DELL(JobPostersOfDELL);
    JobPoster.Insert_JP_LENOVO(JobPostersOfLENOVO);
    JobPoster.Insert_JP_SAMSUNG(JobPostersOfSAMSUNG);
    */

   

//JobPosters 


JobPoster j1=new JobPoster("mohamed", "mohamed", "mohamed", "mohamed");
JobPoster j2=new JobPoster("mohamed", "mohamed", "mohamed", "mohamed");
JobPoster j3=new JobPoster("mohamed", "mohamed", "mohamed", "mohamed");

   JobPoster jpDell[]={j1,j2,j3};
    
   
    JobPoster jp4 =new JobPoster("Sherief Mamdouh", "sabry", "sabry", "Job Poster");//only this is working 
   JobPoster jp5=new JobPoster("Sherien Maged", "sherien_samsung@gmail.com", "sherien2020samsung", "Job Poster");
   JobPoster jp6 =new JobPoster("Shady Mahmoud", "sabry3", "sabry", "Job Poster");


   JobPoster jpLenovo[]={jp4,jp5,jp6};
   
   
   
   
    JobPoster jp7 =new JobPoster("Sherief Mamdouh", "sabry", "sabry", "Job Poster");//only this is working 
   JobPoster jp8 =new JobPoster("Sherien Maged", "sherien_samsung@gmail.com", "sherien2020samsung", "Job Poster");
   JobPoster jp9 =new JobPoster("Shady Mahmoud", "sabry3", "sabry", "Job Poster");


   JobPoster jpSamsung[]={jp7,jp8,jp9};
  
    
    
//Vacancy Jobs 
//JobVacancy V1 =new JobVacancy("mohamed",5);
//    JobVacancy V2 =new JobVacancy("mohamed",7);
//    JobVacancy V3 =new JobVacancy("mohamed",8);
//    JobVacancy J_Vacancy[] =(V1,V2,V3};
//    JobVacancy.Insert_JobVacancy(J_Vacancy);
//



       
      
        
        
    CompanyAdmin cDell =new CompanyAdmin("","","","","");
    CompanyAdmin cLenovo =new CompanyAdmin("","","","","");
    CompanyAdmin cSamsung =new CompanyAdmin("","","","","");
    
     CompanyAdmin c_admins[]={cDell,cLenovo,cSamsung};
    
    
    CompanyAdmin.Insert_CompanyAdmins(c_admins);
    
    
    
    
         
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
    
JobPost jpp1=new JobPost("JOBPOST", "NEEDED A BACKEND ENGINEER");
   JobPost jpp2=new JobPost("JOBPOST2", "NEEDED A BACKEND ENGINEER ya sabry ");
   JobPost [] jPostDell ={jpp1, jpp2};
   
   JobPost jpp3=new JobPost("JOBPOST", "NEEDED A BACKEND ENGINEER");
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
   // Stack<JobPost>STACK=new Stack<JobPost>();
        
//JobPost jp=new JobPost("need a web developer ", " Our Company need developer for a very huge project call 01023720711 \n or Apply for the job here ");
   // STACK.push(jp);
   /*
   
   
   */
   /*
   ArrayList<JobPost>jpList=new ArrayList<>();
   
   JobPost jppp1=new JobPost("JOBPOST", "NEEDED A BACKEND ENGINEER");
    JobPost jppp2=new JobPost("JOBPOST", "NEEDED A BACKEND ENGINEER");
     JobPost jppp3=new JobPost("JOBPOST", "NEEDED A BACKEND ENGINEER");
     
    jpList.add(jppp1);
    jpList.add(jppp2);
    jpList.add(jppp3);
   */
   
    
      
   //String CompName, String CompAdmin, int CompNumberOfEmployees,
           //JobPoster[] CompJobPosters, JobVacancy[] CompJobVacancies, float CompReviews[]
    /*
       Company c1 =new Company("mohamed","mohamed",12,JobPostersOfDELL, )
      System.out.println("Enter your email: ");
        String mail=input.next();   
        System.out.println("Enter your password: ");
        String pass=input.next(); 
        //open Login as an administator 
        System.out.println("Login as an Admin ");
        
       SystemUser.Login(c_admins,mail,pass);
    
       */
    
    
       
        int opt;
        String Continue="Continue";
        while(Continue.equals("Continue"))
        {
       
       
        //Options 
  
        //Add a loop to repeat taking options from user 
        System.out.print("What Do you Want to Do \n 1.Login as JobPoster\n 2.Browse Jobs \n 3.AddReviews \n 4.Apply to a Job \n 5.Run as administrator \n 6.Exit ");
        opt =input.nextInt();
        
        
        //boolean LoggedIn=false;
        //input opt  and delete the zero above :)
        if(opt==1){
         
            boolean LoggedIn=false;
            System.out.println("Option 1");
    
            
            System.out.println("Which Company you are in ?\n ");
            String CompanyChoice=input.next();
          
                System.out.println("Login as Job poster ");
      System.out.println("Enter your email: ");
        String mail2=input.next();   
        System.out.println("Enter your password: ");
        String pass2=input.next(); 
        
       //n is intialized in the global scope 
        
          if(CompanyChoice.equals("Dell")){
                 LoggedIn=SystemUser.Login(jpDell, mail2, pass2);
                 numberChoice=0;
            }
             if(CompanyChoice.equals("Lenovo")){
                 LoggedIn=SystemUser.Login(jpLenovo, mail2, pass2);
                 numberChoice=1;
            }
              if(CompanyChoice.equals("Samsung")){
                  
                 LoggedIn=SystemUser.Login(jpSamsung, mail2, pass2);
                  numberChoice=2;
            }
              
        
         if(LoggedIn){
             System.out.println("Want to add a Jobpost press 1 :\n ");
             
             int optionToSelect=input.nextInt();
             
             if(optionToSelect==1){
             
             
             System.out.println(" \n Enter the name of the new job post \n ");
             
           input.useDelimiter("\n");
           String choice=input.next();
           
             System.out.println("Enter the description \n");
            
             String choice3=input.next();
             JobPost jp10=new JobPost(choice,choice3 );    //thn push to the main array 
            // STACK.push(jp10);
           // addJobPosts(int n , JobPost arr[], JobPost newObject)
           if(numberChoice==0)
           jPostDell=addJobPosts(jPostDell.length, jPostDell, jp10);
           
            if(numberChoice==1)
           jPostLenovo=addJobPosts(jPostLenovo.length, jPostLenovo, jp10);
           
             if(numberChoice==2)
           jPostSamsung=addJobPosts(jPostSamsung.length, jPostSamsung, jp10);
           
             System.out.println("The JobPost now appears like \n"+"\t"+"JobPost name \t "+jp10.name+"\t"+jp10.description+"\n");
             
             //jpList.add(jp10);
//assuming that this is an array list 
             }
         }
             else{
                 System.out.println("Have a good LOOK");
                 continue;
             }
            //JobPoster.AddJobPosts(jv[0],choice, choice2);
             
             //System.out.println("\n job after changing is  "+jv[0].Postname+"\n Number of Applicants are "+jv[0].Applicants);
             
             //another way 
          
         }
        
        
            
        
        else if(opt==2){
            /*
            System.out.println("Option 2 \n ");
            for( int i=0; i<jp.length; i++){
                System.out.println("JobPost "+(i+1)+ "\n Job post title"+jp[i].name+"\n Jobpost Description: \n "+jp[i].description);
            }
*/
           // System.out.println("Job Posts are "+Arrays.toString(STACK.toArray()));//look for purified Stack display 
            //STACK.forEach(System.out::println);
            System.out.println("Job Posts avialable are as follows :");
            if(numberChoice==0)
            {
            for(int i=0; i<jPostDell.length; i++){
                //jobPost array must be pushed succesfully 
                System.out.println("Job Post:"+(i+1) +" \n "+"Name:"+jPostDell[i].name+"\n Description "+jPostDell[i].description);
            }
            }
              if(numberChoice==1)
            {
            for(int i=0; i<jPostLenovo.length; i++){
                //jobPost array must be pushed succesfully 
                System.out.println("Job Post:"+(i+1) +" \n "+"Name:"+jPostLenovo[i].name+"\n Description "+jPostLenovo[i].description);
            }
            }
                if(numberChoice==2)
            {
            for(int i=0; i<jPostSamsung.length; i++){
                //jobPost array must be pushed succesfully 
                System.out.println("Job Post:"+(i+1) +" \n "+"Name:"+jPostSamsung[i].name+"\n Description "+jPostSamsung[i].description);
            }
            }
        }
        
        else if(opt==3){
            //
           System.out.println("Option 3");
             //AddReview()  //need the push array method 
            
            //addReviews(int n , Company comp, float newElement ){
            
          
         int  n=0;
            while(true)
            {
            System.out.println("Enter the review you want to add ");
        int choice=input.nextInt();
       
        //int[]myrev={1,2,3};
        //int[]revv=new int[n];
       if(numberChoice==0)
        Dell.CompanyReviews=addReviews(n, Dell.CompanyReviews, choice);
       
        
        if(numberChoice==1)
        Lenovo.CompanyReviews=addReviews(n, Lenovo.CompanyReviews, choice);
        
         if(numberChoice==2)
        Samsung.CompanyReviews=addReviews(n, Samsung.CompanyReviews, choice);
       /*
            System.out.println("\n The Reviews now will be seen as ");
            for(int i=0; i<comp.CompanyReviews.length;i++){
                System.out.println("\n review "+(i+1) +"  is \t"+comp.CompanyReviews[i]);
            }
        */
            
                System.out.println("add another review");
                String choice2=input.next();
                if(choice2.equals("no"))
                    break;
                
                n++;
            }
            
            System.out.println("\n Now lets see the reviews \n  ");
            
             if(numberChoice==0)
             {
            for(int i=0; i<Dell.CompanyReviews.length;i++){
                System.out.println("\n review "+(i+1) +"  is \t"+Dell.CompanyReviews[i]);
            }
             }
              if(numberChoice==1)
             {
            for(int i=0; i<Lenovo.CompanyReviews.length;i++){
                System.out.println("\n review "+(i+1) +"  is \t"+Lenovo.CompanyReviews[i]);
            }
             }
               if(numberChoice==2)
             {
            for(int i=0; i<Samsung.CompanyReviews.length;i++){
                System.out.println("\n review "+(i+1) +"  is \t"+Samsung.CompanyReviews[i]);
            }
             }
               
        /*
        int i; 
  
        // create a new array of size n+1 
       int newarr[] = new int[n]; 
  
        // insert the elements from 
        // the old array into the new array 
        // insert all elements till n 
        // then insert x at n+1 
        for (i = 0; i < n; i++) 
            newarr[i] = arr[i]; 
  
        newarr[n] = newElement; 
  
        System.out.println("new review have been pushed with value of "+newarr[n]);
        */
        
       /*
           try{
            addReviews(rev.length,rev,choice);
            
            System.out.println("The new review will be seen as "+comp.CompanyReviews[comp.CompanyReviews.length]);
           for(int i=0; i<rev.length; i++){
               
               System.out.println("\n review : "+(i+1)+" \t"+comp.CompanyReviews[i]);
           }
           }
           catch(Exception e ){
               System.out.println("we have found exception ya sabry:"+e );
           }
           finally{
               
           }
*/
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
              
                System.out.println("Job Post:"+(i+1) +" \n "+"Name:"+jPostDell[i].name+"\n Description "+jPostDell[i].description);
                     }
                }
                 if(numberChoice==1)
                {
                  for(int i=0; i<jPostLenovo.length; i++){
                
                System.out.println("Job Post:"+(i+1) +" \n "+"Name:"+jPostLenovo[i].name+"\n Description "+jPostLenovo[i].description);   
                }
                  if(numberChoice==2)
                {
                     for(int i=0; i<jPostSamsung.length; i++){
              
                System.out.println("Job Post:"+(i+1) +" \n "+"Name:"+jPostSamsung[i].name+"\n Description "+jPostSamsung[i].description);
                }
              System.out.println("Job Posts avialable are as follows :");
           
            }
           }

            
        
        }
        }       
        else  if(opt==5){
            boolean LoggedIn=false;
            
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
           
           if(numberChoice==0)
           ChangeCompanyInfo(Dell, choice, boolChoice);
           
            if(numberChoice==1)
           ChangeCompanyInfo(Lenovo, choice, boolChoice); 
            
            if(numberChoice==2)
          ChangeCompanyInfo(Samsung, choice, boolChoice);
           
            
            
             System.out.println("Latest Changes ");
           DisplayCompanyInfo(companies[numberChoice]);
          
        
       }
       
        }
          
  
           else if(opt==6){
            //enter the company you want to display 
            //System.out.println("Enter the name of the comapny you want to see"); encapsulization is needed 
            
            if(numberChoice==0)
         DisplayCompanyInfo(Dell);
            
                       if(numberChoice==1)
         DisplayCompanyInfo(Lenovo);
                  
                      if(numberChoice==2)
         DisplayCompanyInfo(Samsung);
           
            
          }
           else if(opt==7){
               //Application.Quit();
              System.out.print("Thank you for visiting us ");
            break;
               
           }
        else{
            System.out.println("Invalid entry");
        }
        
            System.out.println("\n Type Stop to Exit OR Continue  "); 
       Continue=input.next();
        }
        
        
       
       
        
       
    }
     }
        
    
    
    


