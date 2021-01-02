package jobfindersys;


public class JobSeeker extends SystemUser{   
    
    //public final String AccountType= "Job Seeker"; //public boolean AccountType;   
    
    //Constructor
    public JobSeeker(String JobSeekersName, String JobSeekersEmail, String 
            JobSeekersPassword, String JobSeekersType){
        super(JobSeekersName, JobSeekersEmail, JobSeekersPassword, JobSeekersType);
    }
    
    //Instantiating an Array for Documanting Two Job Seekers Info
    public JobSeeker JobSeekersOfMySystem[]= new JobSeeker[2];
    
    //Two Job Seekers With Their Details For My JOB FINDER SYSTEM
    public void Insert_Job_Seekers(){
       
     
    }
    
    //Any Job Seeker Can Browse Job Posts
    public void JS_BrowseJobPosts(){
         
    }
    
    //Any Job Seeker Can Browse Companies (Company Name- Company Admin-  
    //  Company No. of Employees- Company Job Vacancies- Company Reviews)
    public void JS_BrowseCompanyMainInfo(){
         
    }
    
    //Any Job Seeker Can Add Company Review
    public void JS_Add_Review(){
         
    }
    
    //Any Job Seeker Can Apply To a Job Vacancy
    public void JS_Apply_toaJob(){
         
    }
    
    
    //His Last Function: He can update his application or delete it
    //w dy ana lesa msh 3rfa hatt3ml ezay    
    
}
