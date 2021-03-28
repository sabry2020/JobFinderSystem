
package jobfindersys;
import static java.lang.System.exit;
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
    System.out.println("\n -Company name is "+comp.CompanyName+"\n -Company number of Employees are "+comp.CompanyNumberOfEmployees);
  
    
   
}

//    static void SearchJobPosts(String desiredJobPost, JobPost[] jobPost){//also exist in the company class for a check 
//        for(int i=0; i<jobPost.length;i++){
//            if(desiredJobPost.equals(jobPost[i].name)){
//                System.out.print("found a match and it is "+jobPost[i].name+"Which is equals to "+desiredJobPost);
//               
//                System.out.println("\nJob post Found \n "+jobPost[i].name+"\t"+jobPost[i].description);
//                break;
//                
//            }
//            else 
//                System.out.println("Job not found");
//            exit(0);
//           
//        }
//    }
// 
    
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
//public static float calculateAverageReviews(int [] reviews){
//  
//   float sum=0;     
//   if(reviews[0]!=0||reviews!=null)
//    for(int i=0; i<reviews.length; i++)
//        sum+=(float)reviews[i];//preventing type conversion
//    
//   return sum/reviews.length;
//}



		
 

    
    public static void main(String[] args) {
        
        //The Start...Welcoming 
        
       Scanner input=new Scanner(System.in);
        System.out.println("\tWelcome to SHA3'LNY SHOKRAN Job Finder Application ! :) \n");
        
      int numberChoice=0;
     
     float avgReviews=0.0f;
     boolean companyReviewed=false;
       
 
        
//JobPosters 

// One JobPoster for Each Company 

JobPoster j1=new JobPoster("Mohamed Hosam", "sabry@gmail.com", "sabry", "Job Poster");


   JobPoster jpDell[]={j1};
    
   
    JobPoster jp4 =new JobPoster("Adham Shreif", "adham@gmail.com", "adham", "Job Poster");
  

   JobPoster jpLenovo[]={jp4};
   
   
   
   
    JobPoster jp7 =new JobPoster("Nada", "nada@gmail.com", "nada", "Job Poster");//only this is working 
  


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

JobPost jpp1=new JobPost("Backend role in Cairo", "NEEDED A BACKEND ENGINEER for a work in an amazing job opportunity");
   JobPost jpp2=new JobPost("FrontEnd role", "NEEDED A FrontEnd ENGINEER For a professional company ");
   JobPost jPostDell[] ={jpp1, jpp2};
   
   JobPost jpp3=new JobPost("HR Engineer", "NEEDED an HR Manager for The Lenovo Leaderboard");
   JobPost jpp4=new JobPost("It Manager", "NEEDED An It Manager who has 4 years experience");
   JobPost jPostLenovo[] ={jpp3, jpp4};
   
   
   JobPost jpp5=new JobPost("Software Engineer", "NEEDED A Software ENGINEER with outstanding skills");
   JobPost jpp6=new JobPost("Cook", "NEEDED A Cook For the programmers Kitchen ");
   JobPost jPostSamsung [] ={jpp5, jpp6};
   
    JobPost J2[] ={jpp1,jpp2,jpp3,jpp4,jpp5,jpp6};

int []reviews={1, 2 , 3};
int []rev2={5,5,5};
int[]rev3={4,5,3};

    //String CompName, String CompAdmin, int CompNumberOfEmployees,
          // JobPoster[] CompJobPosters, JobVacancy[] CompJobVacancies, float CompReviews[]
        Company Dell= new Company("Dell", cDell,12, jpDell, jPostDell, reviews ); 
        Company Lenovo=new Company("Lenovo",cLenovo,20,jpLenovo,  jPostLenovo, rev2 );
       Company Samsung=new Company("Samsung",cSamsung,25,jpSamsung, jPostSamsung, rev3);
       
       Company [] companies={Dell, Lenovo, Samsung};
   

        
       
       
         int Continue=1;
        while(Continue==1)  //main loop
        {
          int opt;
        boolean companyRegistered=false;
        
        //Options 
  
        //Add a loop to repeat taking options from user 
            System.out.println("************************* \n Please Enter your Company Name : \n ");
            System.out.println(" \n Name: "); 
            
                               
 String CompanyChoice=input.next();
            for(int i=0 ;i<companies.length;i++)
                    {
                       
                   if(CompanyChoice.equals(companies[i].CompanyName)){
                        numberChoice=i;
                        companyRegistered=true;
                        System.out.println("\n You are now a member in with  "+ companies[i].CompanyName );
                        System.out.println("\n1)To Continue to The main Menu Press 1 \n"
                                + "2)To Renter Company name press 2 \n"
                                + "3)To Exit Press any other number \n");
                        int mainmenu=input.nextInt();
                        if(mainmenu==1){ 
                        
                        }
                        else if(mainmenu==2){
                            break;
                        }
                        else{
                        exit(0);
                        }
                        
                    }
                   
                   
                   else if(CompanyChoice.equals("Dell") || (CompanyChoice.equals("Lenovo")) || (CompanyChoice.equals("Samsung")) ){
                       continue ;
                       
//                        
//                      
                }
                   else{
                       System.out.println("Company Name Doesn't Exist! \n");
                        System.out.println("1)To Renter Company name press 1 \n"
                                + "2)To Exit Press 2 \n");
                        int mainmenu2=input.nextInt();
                        System.out.println("\n *************************************************************");
                        if(mainmenu2==1){ 
                            break;
                        }                 
                        else{
                        exit(0);
                        }
                   }
                    
        
         
        System.out.print("\n-Please Choose an Option below:\n \n 1.Login as Job poster \t 2.Browse Current Jobs \t 3.Add your Review \n 4.Apply to a Job \t 5.Login as administrator \t 6.Display your Company Info \n 7.Exit \n\n");
        opt =input.nextInt();
        System.out.println();
        //opt 1
        
        if(opt==1){
         //using labels instead of goto
//         outer:{
             
            boolean LoggedIn=false;
            
         System.out.println("Enter your email:\n");
        String mail2=input.next();   
        System.out.println("\nEnter your password:\n");
        String pass2=input.next(); 
         LoggedIn=SystemUser.Login(J[numberChoice], mail2, pass2);
          
//            inner:{
//            System.out.println("Continue or Just Registering to the Company \t ..to Continue Press 1 \t Quit Press any Number");
//            int optionToContinue=input.nextInt();
//            if(optionToContinue==1){
//           
//    
//               
              
        
         if(LoggedIn){
             System.out.println("Choose an Option below : \n 1) Add a New Job Post :\t 2) Return To main Menu ");
             
             int optionToSelect=input.nextInt();
             
             if(optionToSelect==1){
             
             
             System.out.println(" \n Enter the name of the new job post \n ");
             
//           input.useDelimiter("/");
           String choice=input.next();
           companyRegistered=true;
           
             System.out.println("Enter the Job description \n");
            
             String choice3=input.next();
             JobPost jp10=new JobPost(choice,choice3 );    //thn push to the main array 
            
           if(numberChoice==0)
           jPostDell=addJobPosts(jPostDell.length, jPostDell, jp10);
           
            if(numberChoice==1)
           jPostLenovo=addJobPosts(jPostLenovo.length, jPostLenovo, jp10);
           
             if(numberChoice==2)
           jPostSamsung=addJobPosts(jPostSamsung.length, jPostSamsung, jp10);
           
             System.out.println("The JobPost Preview \n\n"+""+"JobPost name \t "+jp10.name+"\t"+jp10.description+"\n");
             
            
             }
             else
                 continue;
         
            
         
         }
             else{
                 System.out.println("Invalid Email or Password \n \n 1) To renter Company name press 1 \n 2)To exit press 2");
                 int yz=input.nextInt();
                 if(yz==1)
                 break;
                 else
                     exit(0);
             }
        }
                
            
    //opt 2    
        else if(opt==2){
       
            if(companyRegistered)
            {
            System.out.println("Job Posts avialable are as follows :");
            if(numberChoice==0)
            {
            for(int j=0; j<jPostDell.length; j++){
                //jobPost array must be pushed succesfully 
                System.out.println("Job Post:"+(j+1) +" \n "+companies[numberChoice].CompanyName+"\n Title:"+jPostDell[j].name+"\n Description "+jPostDell[j].description);
            }
            }
              if(numberChoice==1)
            {
            for(int x=0; x<jPostLenovo.length; x++){
                //jobPost array must be pushed succesfully 
                System.out.println("Job Post:"+(x+1) +" \n "+companies[numberChoice].CompanyName+"\n Title:"+jPostLenovo[x].name+"\n Description "+jPostLenovo[x].description);
            }
            }
                if(numberChoice==2)
            {
            for(int v=0; v<jPostSamsung.length; v++){
                //jobPost array must be pushed succesfully 
                System.out.println("Job Post:"+(v+1) +" \n "+companies[numberChoice].CompanyName+"\n Title:"+jPostSamsung[v].name+"\n Description "+jPostSamsung[v].description);
            }
//                for(int i=0; i<jPostSamsung.length; i++){
//               
//              System.out.println("Job Post:"+(i+1) +" \n "+"Company-Name :\t Samsung"+"\n Title:"+companies[numberChoice].CompanyName+"\n Description "+companies.description);
//            }
            }
        }
//            else{
//                System.out.println("Please register to your Company");
//            }
        }
        
        else if(opt==3){
        
         
          if(companyRegistered){
         int  n=0;
            while(true)
            {
            System.out.println("Enter the review you want to add (From 1 to 10) ");
        int choice=input.nextInt();
        
       if( choice>10 ||choice<1){
           System.out.println("Enter a review from 1 to 10 ");
           break;
       }

         companies[numberChoice].CompanyReviews=addReviews(n,companies[numberChoice].CompanyReviews,choice);
//           System.out.println("add another review");
//                String choice2=input.next();
//                if(choice2.equals("no"))
//                    break;               
                n++;         
                companyReviewed=true;
                     for(int l=0; l<companies[numberChoice].CompanyReviews.length;l++){
                     System.out.println("\n -Thanks For your feedback! :) \n\n -The final review: {"+companies[numberChoice].CompanyReviews[l]+"}");
                     
            }
            break;
             
            }
        }
//          else{
//             System.out.println("Please Register to your Company  add  ln 411 below");             
//          }
        }       
           else  if(opt==4){
             System.out.println("Option 4");
     
             // displayJobs();
//           System.out.print("want to search for a specific job  type : yes ");
//           String Yesorno = input.next();
//           if(Yesorno.equals("yes")){
//               System.out.println("Enter your desired job Post ");
//               String desiredName=input.next();
//               
//                if(numberChoice==0)
//               SearchJobPosts(desiredName,jPostDell);
//               
//                else if(numberChoice==1)
//               SearchJobPosts(desiredName,jPostLenovo);   
//                   
//                else if(numberChoice==2)
//               SearchJobPosts(desiredName,jPostSamsung);          
//           }
//           else
//{
                if(numberChoice==0)
                {
                     for(int g=0; g<jPostDell.length; g++){
              
                System.out.print((i+1)+")Job Post:"+(g+1) +" \n "+"Name:"+companies[numberChoice].CompanyName+"\n Description "+jPostDell[g].description+"\n");
                     }
                }
                 if(numberChoice==1)
                {
                  for(int h=0; h<jPostLenovo.length; h++){
                
                System.out.print((i+1)+")Job Post:"+(+1) +" \n "+"Name:"+companies[numberChoice].CompanyName+"\n Description "+jPostLenovo[h].description+"\n");   
                }
                }
                 if(numberChoice==2)
                {
                  for(int y=0; y<jPostSamsung.length; y++){
              
                System.out.print((i+1)+")Job Post:"+(y+1) +" \t "+"Name:"+companies[numberChoice].CompanyName+"\t Description "+jPostSamsung[y].description+"\n");
                }
                }
                 
                     System.out.println("\n Choose Your Desired Job ");
                     int job=input.nextInt();
                     System.out.println("\n\n -You Successfully applied for your Job \n" );
//              System.out.println("Job Posts avialable are as follows :");
           
//            }
           
 
        
        }       
        else  if(opt==5){
            boolean LoggedIn=false;
            if(companyRegistered)
            {
            System.out.println("Login as administrator ! \n ");
      System.out.println("Enter your email: \n");
        String mail=input.next();   
        System.out.println("\n Enter your password: \n");
        String pass=input.next(); 
        
          
          if(numberChoice==0)
       LoggedIn=SystemUser.Login(c_admins[0],mail,pass);
          else if(numberChoice==1)
       LoggedIn=SystemUser.Login(c_admins[1],mail,pass);
          else if(numberChoice==2)
       LoggedIn=SystemUser.Login(c_admins[2],mail,pass);

       if(LoggedIn==true){
           String choice="0"; 
           System.out.println("\n--------------\n 1)change the company name \t\t 2)keep the current name");
           int zz=input.nextInt();
           if(zz==1){
           System.out.println("\n -Enter the new company name: \n");
           choice=input.next();
           }
           else if (zz==2){
               choice=companies[numberChoice].CompanyName;
           }    
           
           System.out.println("\n 1)to fire an employee press 1 \t\t 2)to Continue press 2 \n");
          int yy=input.nextInt();
          boolean boolChoice=false;
          if (yy==1){               
              boolChoice=true;
          }
          else if(yy==2){
              boolChoice=false;
          }  
            companies[numberChoice]=ChangeCompanyInfo(companies[numberChoice],choice,boolChoice);  
           System.out.println("\n ************\n -After the current changes:");
           DisplayCompanyInfo(companies[numberChoice]);
       }
        }
//            else{
//                System.out.println("Please register to your company at opt1 ");
//            
//            }
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
//            else{
//                System.out.println("Please register to your Company");
//            }
           
          }
           else if(opt==7){
               //Application.Quit();
              System.out.print("Thank you for visiting us ");
            break;
               
           }
           else if(opt==8){
               
               
               System.out.println("------------All The companies Info Combined----------------------");
               for(int s=0; s<companies.length; s++){
                   System.out.println(" \n Reviews for the company  indexed"+s);
                   if(companies[s].CompanyReviews!=null){
                   for(int z=0; z<companies[i].CompanyReviews.length;z++)
                       System.out.println(companies[z].CompanyReviews[z]+" \n" );
               }
                   
               }
           }
        else{
            System.out.println("Invalid entry");
        }
                    System.out.println("\n **(Your Operation is done Successfuly)**  \n \n *******************\n 1)to enter new company name press 1 \n"
                          + "\n 2)to exit press 2");
                int check=input.nextInt();
                if(check==1)
                    break;
                else
                    exit(0);
                    
  
        }
                
        
        
//       
//                      
                
//                    else
//                        break;
//                        
                    
       
    
       
//                    if(xy==1)
//                    Continue=1;
    }
          
     }
    
}
        
    
    
    


