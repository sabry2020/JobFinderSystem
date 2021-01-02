
package jobfindersys;


public class Company {
   
    //Any Company Should Have
    public String CompanyName;
    public String CompanyAdmin;
    public int CompanyNumberOfEmployees;
    public JobPoster CompanyJobPosters[] = new JobPoster[3];
    public JobVacancy CompanyJobVacancies[] = new JobVacancy[5];
    public int CompanyReviews[];
    JobPost[] jobPost;
    CompanyAdmin companyAdmin;
    
    
    //Constructor
    public Company(String CompName, CompanyAdmin companyAdmin, int CompNumberOfEmployees,
           JobPoster[] CompJobPosters, JobPost []jobPost, int CompReviews[]){
        this.CompanyName= CompName;
        this.companyAdmin= companyAdmin;
        this.CompanyNumberOfEmployees= CompNumberOfEmployees;
        this.CompanyJobPosters= CompJobPosters;
        this.jobPost=jobPost;
        this.CompanyReviews=CompanyReviews;
    }
    
    //Displaying a Company's Details
    public void DisplayAnyCompanyInfo(){
        System.out.println("Company's Name: " +CompanyName +"\tCompany Admin's Name: " +CompanyAdmin
        +"\tCompany's Number of Employees: " +CompanyNumberOfEmployees
        +"\t Company's Reviews: " +CompanyReviews);
         System.out.println("Company's Job Posters: ");
        for (int i = 0; i < 3; i++) {
                System.out.println(i+") "+CompanyJobPosters[i]);               
        }
       System.out.println("Company's Job Vacancies: ");
        for (int i = 0; i < 5; i++) {
                System.out.println(i+") "+CompanyJobVacancies[i]);               
        }
    } 
}

