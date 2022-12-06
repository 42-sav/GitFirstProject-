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

      public final ArrayList<String> stringList1 = new ArrayList<>();
      public final ArrayList<String> stringList2 = new ArrayList<>();
      public final ArrayList<String> stringList3 = new ArrayList<>();
      public final ArrayList<String> stringList4 = new ArrayList<>();
      public final ArrayList<String> stringList5 = new ArrayList<>();

      public void getStringList() {
        try (Scanner ec = new Scanner(System.in)) {
            String ip= ec.nextLine();
            
            if (ip.equals(a)){
                stringList1.add("The guest List");
                stringList1.add("Gone Girl");
                stringList1.add("Batman");

                
                System.out.println(stringList1);
            }
            

            else if (ip.equals(b)){
                stringList2.add("Dragon ball z");
                stringList2.add("Berserk");
                stringList2.add("Naruto");

                System.out.println(stringList2);

            }

            else if (ip.equals(c)){
                stringList3.add("Romeo ");
                stringList3.add("Hamlet");
                stringList3.add("Vaale");

                System.out.println(stringList3);

            }

            else if (ip.equals(d)){
                stringList4.add("Sherlock");
                stringList4.add("The girl on a Train");
                stringList4.add("In the Woods");

                System.out.println(stringList4);

            }

            else if (ip.equals(e)){
                stringList5.add("The Silent Patient");
                stringList5.add("I will be gone in dark");
                stringList5.add("Zn Cold Blood");

                System.out.println(stringList5);

            }

            else {
                System.out.println("The list is Empty");

            }
        }

        

        
      }

    public void addBooks() {
        Scanner nb = new Scanner(System.in);
        System.out.print("Please enter the number of Books you want to add: ");
         //takes an integer input         
        String string[] = new String [nb.nextInt()];

        nb.nextLine();
        for(int i =0;i<=string.length;i++){
            String book = nb.nextLine();

            String reg ="a";
            switch (reg)
             {
                case "Thriller":
                    stringList1.add(book);
                    break;

                case "Comic":
                    stringList2.add(book);
                    break;

                case "Drama":
                    stringList3.add(book);
                    break;

                case "Mystery":
                    stringList4.add(book);
                    break;

                default:
                    stringList5.add(book);

            }

        }

              
        

    }


    
}
