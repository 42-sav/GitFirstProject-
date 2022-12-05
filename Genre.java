import java.util.ArrayList;
import java.util.Scanner;

public class Genre {
    String a = "Thriller";
    String b = "Comic";
    String c = "Drama";
    String d = "Mystery";
    String e = "Crime";
    

    public void list() {
        System.out.println("Thriller");
        System.out.println("Comic");
        System.out.println("Drama");
        System.out.println("Mystery");
        System.out.println("Crime");


    }
    Scanner ec= new Scanner(System.in);
    String ip= ec.nextLine();

      public final ArrayList<String> stringList = new ArrayList<>();

      public void getStringList() {
        try (Scanner ec = new Scanner(System.in)) {
            String ip= ec.nextLine();
            
            if (ip.equals(a)){
                stringList.add("The guest List");
                stringList.add("Gone Girl");
                stringList.add("Batman");

                
                System.out.println(stringList);
            }
            

            else if (ip.equals(b)){
                stringList.add("Dragon ball z");
                stringList.add("Berserk");
                stringList.add("Naruto");

                System.out.println(stringList);

            }

            else if (ip.equals(c)){
                stringList.add("Romeo ");
                stringList.add("Hamlet");
                stringList.add("Vaale");

                System.out.println(stringList);

            }

            else if (ip.equals(d)){
                stringList.add("Sherlock");
                stringList.add("The girl on a Train");
                stringList.add("In the Woods");

                System.out.println(stringList);

            }

            else if (ip.equals(e)){
                stringList.add("The Silent Patient");
                stringList.add("I will be gone in dark");
                stringList.add("Zn Cold Blood");

                System.out.println(stringList);

            }

            else {
                System.out.println("The list is Empty");

            }
        }

        


        


        
      }

    public void addBooks() {
        
    }


    
}
