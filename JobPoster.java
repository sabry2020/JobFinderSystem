package jobfindersys;


public class JobPoster extends SystemUser {
  
    //Any Job Poster Should Have   
   // public final String AccountType= "Job Poster"; //public boolean AccountType;
    public JobVacancy JobVacancies[]= new JobVacancy[5];
    
    //Constructor
    public JobPoster(String JobPostersName, String JobPostersEmail, String JobPostersPassword, String JobPostersType){
        super( JobPostersName, JobPostersEmail, JobPostersPassword, JobPostersType);
    }
    
    //Instantiating Three Arrays of Three Objects for The Three Companies
   
 
    //Any Job Poster Can Add Job Posts
    public static void AddJobPosts( JobVacancy J_Vacancy, String postNameChoice,int ApplicantsChoice){
     J_Vacancy.Postname=postNameChoice;
     J_Vacancy.Applicants=ApplicantsChoice;
    }
     
      
    
    /*public void addJobPosts(String JobPosts)
   {
       JobPosts JP1 = new JobPosts("Mechanical Engineering");
       JobPosts JP2 = new JobPosts("Web Developer");
       JobPosts JP3 = new JobPosts("");
       
   }*/
    //han3ml JobPostCount++; ??
    
    
    //Any Job Poster Can Accept (True) or Reject (False) a Job Application
    public boolean AcceptTorRejectF_JobApplication(){
         
        return true;
    }

    
    
    //His Last Function: He can't view job seeker's other applications to other companies
    //w dy ana lesa msh 3rfa hatt3ml ezay
}
