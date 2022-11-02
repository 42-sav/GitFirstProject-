import java.util.Scanner;

public class LibraryManagement {
         
     public static void main(String[] args) {

        String a = "Genre";
        String b = "Authors";
        String c = "Year of Publication";
         

         System.out.println("Enter your choice  from the option below");
         System.out.println("  *Genre");
         System.out.println("  *Authors");
         System.out.println("  *Year of Publication");

         Scanner sc= new Scanner(System.in);

         String str= sc.nextLine(); //reads input

         if(str==a){
             Genre genre = new Genre();
             genre.list();
         }
        

         else if(str==b){

                   }

        else if(str==c){

                   }

        else {
             System.out.println("Invalid Entry,Retry");
         }
         sc.close();

         }


        
    }

    
        
    
    

