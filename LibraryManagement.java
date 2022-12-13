import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryManagement {
         
     

    public static Object yp;
    static String str ;
    static boolean flag = true;

    public static void main(String[] args) {

        String a = new String("Genre");
        String b = new String("Authors");
        String c = new String("Year of Publication");
        String d = new String("Mark Mason");
        String e = new String("Dan Brwon");
        String f = new String("Dandapani");
        String g = new String("Kentaro Muira");
        String h = new String("e");
        String i = new String("Poornachandra");

        //System.out.println("Enter yes ");

        //String str1=Genre.ec.nextLine();

        //String str ="";
        //boolean flag = true;
         while(flag){
            System.out.println("Enter your choice  from the option below or type e to exit");
            System.out.println("  *Genre");
            System.out.println("  *Authors");
            System.out.println("  *Year of Publication");
   
   
            // Scanner sc= new Scanner(System.in);
            
   
            //String str= sc.nextLine(); //reads input
            str = Genre.ec.nextLine();
            //if(str=="e"){
               // flag = false;
            //}
            //String strcpy = str ;
            //else{
                if(str.equals(a)){
                    Genre genre = new Genre();
                    genre.list();
                    System.out.println("select the genre to view the books");
       
                    genre.getStringList();
                    System.out.println("Do you want to add or delete books for this genre or exit:type add or del or exit");
                    String test = Genre.ec.nextLine();
                    
                       switch(test){
                           case "add":
                           genre.addBooks();
                           System.out.println("Books added to the store");
                           break;
       
                           case "del":
                           genre.delBooks();
       
                           default:
                           return;
                       }
       
                    }
       
       
                else if(str.equals(b)){
                    Authors authors = new Authors();
                    authors.list();
       
                    String aut= Genre.ec.nextLine();
       
                    if (aut.equals(d)){
                        Authors.getBooksByAuthor1();
                        Authors.addorDel();
                        
                    }
       
                    else if (aut.equals(e)){
                        Authors.getBooksByAuthor2();
                    }
       
                    else if (aut.equals(f)){
                       Authors.getBooksByAuthor3();
                   }
       
                    else if (aut.equals(g)){
                       Authors.getBooksByAuthor4();
                   }
       
                    else if (aut.equals(i)){
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
                   System.out.println("Do you want to add or delete books for this genre:type add or del");
                    String test = Genre.ec.nextLine();
                    
                       switch(test){
                           case "add":
                           yop.addBooks();
                           System.out.println("Books added to the store");
                           break;
       
                           case "del":
                           yop.delBooks();
       
                           default:
                           return;
                       }
       
       
                          }
               else if(str.equals(h)){
                   //flag = false;
                   break;
               }
       
               else {
                    System.out.println("Invalid Entry,Retry");
                }

         }
            
                

           // }
           
   
            
   
   
   
           
            

         }
            
        
    }

    
        
    
    

