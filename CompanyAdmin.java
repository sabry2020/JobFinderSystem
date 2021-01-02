package jobfindersys;


public class CompanyAdmin extends SystemUser {
    
    public String CompanyAdmin_ID;
    
    //Constructor
    public CompanyAdmin(String CompanyAdminsName, String CompanyAdminsEmail, String CompanyAdminsPassword, String CompanyAdminsType, String CompanyAdminID){
        super( CompanyAdminsName, CompanyAdminsEmail, CompanyAdminsPassword, CompanyAdminsType);
        this.CompanyAdmin_ID= CompanyAdminID;
    }
    
    //Instantiating an Array of Three Elements for The Three Company Admins
   // public static CompanyAdmin c_admins[]= new CompanyAdmin[3];
   
    
    //One Company Admin For Each of The Three Companies    
    public static void Insert_CompanyAdmins( CompanyAdmin c_admins[]){
        c_admins[0].UserName= "Adham Dell";
        c_admins[0].UserEmail= "m";
        c_admins[0].UserPassword= "m";
        c_admins[0].UserType= "Company Admin";
        c_admins[1].UserName= "Sabry Lenovo";
        c_admins[1].UserEmail= "sabry_calenovo@gmail.com";
        c_admins[1].UserPassword= "sabryca2020lenovo";
        c_admins[1].UserType= "Company Admin";
        c_admins[2].UserName= "Habiba Samsung";
        c_admins[2].UserEmail= "habiba_casamsung@gmail.com";
        c_admins[2].UserPassword= "habibaca2020samsung";
        c_admins[2].UserType= "Company Admin";    
    }
    public boolean AcceptTorRejectF_JobApplication(JobVacancy V[]){
         
        return true;
    }
    
}
