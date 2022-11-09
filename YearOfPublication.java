import java.util.ArrayList;
import java.util.Scanner;

public class YearOfPublication  {

    String a = "1980";
    String b = "1990";
    String c = "2000";
    String d = "2010";
    String e = "1970";

    Scanner sc= new Scanner(System.in);
    String yp= sc.nextLine();

      private final ArrayList<String> stringList = new ArrayList<>();

      public ArrayList<String> getStringList() {
        
        if (yp.equals(a)){
            stringList.add("Beloved Toni Morrison");
            stringList.add("Stephen King");
            stringList.add("Watchmen");

            return stringList;
        }
        

        else if (yp.equals(b)){
            stringList.add("The secret History");
            stringList.add("The Fightclub");
            stringList.add("The Game of Thrones");

            return stringList;

        }

        else if (yp.equals(c)){
            stringList.add("Never Let Me Go");
            stringList.add("Life of Pi");
            stringList.add("The Kite Runner");

            return stringList;

        }

        else if (yp.equals(d)){
            stringList.add("Gone Girl");
            stringList.add("The Martian");
            stringList.add("The Night Circus");

            return stringList;

        }

        else if (yp.equals(e)){
            stringList.add("The Sherlock");
            stringList.add("The Bluest Eye");
            stringList.add("Love Story");

            return stringList;

        }

        else {
            System.out.println("The list is Empty");

        }

        return stringList ;


        


        
      }



    public void list() {
        System.out.println("1970's");
        System.out.println("1980's");
        System.out.println("1990's");
        System.out.println("2000's");
        System.out.println("2010's");


        

    }
    
}
