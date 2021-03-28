package jobfindersys;
import java.util.Scanner;
public abstract class SystemUser {

    public static CompanyAdmin c_admins[]= new CompanyAdmin[3];
    public JobPoster JobPostersOfDELL[]= new JobPoster[3];
    public JobPoster JobPostersOfLENOVO[]= new JobPoster[3];
    public JobPoster JobPostersOfSAMSUNG[]= new JobPoster[3];
    
    static boolean  Login(CompanyAdmin c_admins, String mail, String pass) {
        
       
        
//        for (int i =0; i<c_admins.length; i++){
            if(c_admins.UserEmail.equals(mail)){
                if(c_admins.UserPassword.equals(pass)){
                    System.out.println("\n*******************\n -Logged In Successfully:\n \n account details:\n\n -Email:" +"\t"+c_admins.UserEmail+"\n Member Type: "+c_admins.UserType+"\n Password: *********");
                   return true;
                }
                
            }
            else{
                System.out.println("\n Not correct email or password");
              return false;
              
            }
            
            
//        }
        return false;
    }
    
    
         static boolean Login(JobPoster jp, String mail, String pass) {
       
        
      
            if(jp.UserEmail.equals(mail)){
                if(jp.UserPassword.equals(pass)){
                    System.out.println("\n Logged In Successfully:\n \n -account details:\n Email:" +"\t"+jp.UserEmail+"\n \n Member Type: "+jp.UserType+"\n \n Password: *********");
                    System.out.println("");
                   return true;
                }
                
            }
            else{
                System.out.println("Invalid email or password");
                return false;
              
                        
            }
            
            return false;
        }
         
        
         
           /*
             if ((mail.equals(c_admins[0].UserEmail)) || (mail.equals(c_admins[1].UserEmail)) || (mail.equals(c_admins[2].UserEmail))) {
                 System.out.println("Welcome admin");
                 //Calling Functions of admin   
                 
            } 
             else if (mail.equals(P1[0].UserEmail) || mail.equals(P1[1].UserEmail) || mail.equals(P1[2].UserEmail)) {
                 System.out.println("Welcome dell poster");
                 //Calling Functions of dell poster   
              /*
            } 
             else if (mail.equals(P2[0].UserEmail) || mail.equals(P2[1].UserEmail) || mail.equals(P2[2].UserEmail)) {
                   System.out.println("Welcome lenovo poster");
                 //Calling Functions of dell poster 
                
            } 
             else if (mail.equals(P3[0].UserEmail) || mail.equals(P2[1].UserEmail) || mail.equals(P2[2].UserEmail)) {
                  System.out.println("Welcome Samsung poster");
                 //Calling Functions of dell poster 
            }             
             else {
                 System.out.println(" INVALID ENTRY");
            } 
    */

    public String UserName;
    public String UserEmail;
    public String UserPassword;
    public String UserType; //in case needed
    
    public SystemUser(String user_name, String user_email, String user_password, 
            String user_type)
    {
        this.UserName= user_name;
        this.UserEmail= user_email;
        this.UserPassword= user_password;
        this.UserType= user_type;
    }
    
    public void UserInfo_Validation() {
    
    }
    
//    abstract float Newfeature();
    
        
    
}
