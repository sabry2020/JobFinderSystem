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
        c_admins[0].UserName= "Admin Dell";
        c_admins[0].UserEmail= "adminDell@gmail.com";
        c_admins[0].UserPassword= "admin1";
        c_admins[0].UserType= "Admin of Dell company";
        c_admins[1].UserName= "admin Lenovo";
        c_admins[1].UserEmail= "adminLenovo@gmail.com";
        c_admins[1].UserPassword= "admin2";
        c_admins[1].UserType= "Admin of Lenovo company";
        c_admins[2].UserName= " admin Samsung";
        c_admins[2].UserEmail= "adminSamsung@gmail.com";
        c_admins[2].UserPassword= "admin3";
        c_admins[2].UserType= "Admin of Samsung company";    
    }
    public boolean AcceptTorRejectF_JobApplication(JobVacancy V[]){
         
        return true;
    }
    
}
