import java.util.Scanner;

public class LibraryManagement {
         
     public static void main(String[] args) {

        String a = new String("Genre");
        String b = new String("Authors");
        String c = new String("Year of Publication");
         

         System.out.println("Enter your choice  from the option below");
         System.out.println("  *Genre");
         System.out.println("  *Authors");
         System.out.println("  *Year of Publication");

         Scanner sc= new Scanner(System.in);

         String str= sc.nextLine(); //reads input

         if(str.equals(a)){
             Genre genre = new Genre();
             genre.list();
         }
        

         else if(str.equals(b)){

                   }

        else if(str.equals(c)){

                   }

        else {
             System.out.println("Invalid Entry,Retry");
         }
         sc.close();

         }


        
    }

    
        
    
    

