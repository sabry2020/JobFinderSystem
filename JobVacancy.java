
package jobfindersys;


public class JobVacancy {
    String Postname;
    int Applicants;
    public JobVacancy(String Postname, int Applicants){
        this.Postname=Postname;
        this.Applicants=Applicants;
        
    }
    
    //Instantiating an Array of Three Elements for The Three Company Admins
    
   public static JobVacancy J_Vacancy[] = new JobVacancy[3];
    
    //One Company Admin For Each of The Three Companies    
    public static void Insert_JobVacancy( JobVacancy J_Vacancy, String postNameChoice,int ApplicantsChoice){
     J_Vacancy.Postname=postNameChoice;
     J_Vacancy.Applicants=ApplicantsChoice;
    }
}
