import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryManagement {
         
     public static void main(String[] args) {

        String a = new String("Genre");
        String b = new String("Authors");
        String c = new String("Year of Publication");
        String d = new String("Mark Mason");
         

         System.out.println("Enter your choice  from the option below");
         System.out.println("  *Genre");
         System.out.println("  *Authors");
         System.out.println("  *Year of Publication");

         Scanner sc= new Scanner(System.in);

         String str= sc.nextLine(); //reads input

         if(str.equals(a)){
             Genre genre = new Genre();
             genre.list();

             String gen= sc.nextLine();


         }
        

         else if(str.equals(b)){
             Authors authors = new Authors();
             authors.list();

             String aut= sc.nextLine();

             if (aut.equals(d)){
                 Authors.getBooksByAuthor1();
             }

                   }

        else if(str.equals(c)){
            YearOfPublication yop = new YearOfPublication();
            yop.list();

            String yp= sc.nextLine();

                   }

        else {
             System.out.println("Invalid Entry,Retry");
         }
         sc.close();

         }


        
    }

    
        
    
    

