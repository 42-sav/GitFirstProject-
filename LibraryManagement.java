import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryManagement {
         
     

    public static Object yp;

    public static void main(String[] args) {

        String a = new String("Genre");
        String b = new String("Authors");
        String c = new String("Year of Publication");
        String d = new String("Mark Mason");
        String e = new String("Dan Brwon");
        String f = new String("Dandapani");
        String g = new String("Kentaro Muira");

         

         System.out.println("Enter your choice  from the option below");
         System.out.println("  *Genre");
         System.out.println("  *Authors");
         System.out.println("  *Year of Publication");

          Scanner sc= new Scanner(System.in);

         String str= sc.nextLine(); //reads input

         if(str.equals(a)){
             Genre genre = new Genre();
             genre.list();
             //String test = sc.nextLine();

             genre.getStringList();
             //String test1 = sc.nextLine();
             System.out.println("Do you want to add  books to this genre:type y or n");
             genre.addBooks();
             String add = sc.nextLine();
             
             try{
                
             
                System.out.println("add your books in order");
                //not able to execute this line somehowGenre


                 //genre.addBooks();
                 //write method for adding new books which goes to arraylist as per genre
             }finally{
                System.out.println("Books added to the store");
              }
                 
                 

             }




         
        

         else if(str.equals(b)){
             Authors authors = new Authors();
             authors.list();

             String aut= sc.nextLine();

             if (aut.equals(d)){
                 Authors.getBooksByAuthor1();
                 String addordel = sc.nextLine();
                 
             }

             else if (aut.equals(e)){
                 Authors.getBooksByAuthor2();
             }

             else if (aut.equals(f)){
                Authors.getBooksByAuthor3();
            }

             else if (aut.equals(f)){
                Authors.getBooksByAuthor4();
            }

             else if (aut.equals(f)){
                Authors.getBooksByAuthor5();
            }
             else {
                 System.out.println("Invalid author entered ,try again");
             }

                   }

        else if(str.equals(c)){
            YearOfPublication yop = new YearOfPublication();
            yop.list();

            yop.getStringList();


                   }

        else {
             System.out.println("Invalid Entry,Retry");
         }
         sc.close();

         }


        
    }

    
        
    
    

