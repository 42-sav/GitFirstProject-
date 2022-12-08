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
    public static final Scanner ec= new Scanner(System.in);
    //String ip= ec.nextLine();

      public final ArrayList<String> stringList1 = new ArrayList<>();
      public final ArrayList<String> stringList2 = new ArrayList<>();
      public final ArrayList<String> stringList3 = new ArrayList<>();
      public final ArrayList<String> stringList4 = new ArrayList<>();
      public final ArrayList<String> stringList5 = new ArrayList<>();

      public void getStringList() {
        try  {
            //Scanner ec = new Scanner(System.in);
            String ip= ec.nextLine();
            
            if (ip.equals(a)){
                stringList1.add("The guest List");
                stringList1.add("Gone Girl");
                stringList1.add("Batman");

                
                System.out.println(stringList1);
                //return;
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
            //ec.close();
        }catch(Exception e){
            System.out.println("unknown error");
        }
    }

        
      

    public void addBooks() {
        //Scanner nb = new Scanner(System.in);
        System.out.println("Enter the no of books that you want to add :");
        //String[] string  = new String[nb.nextInt()];
        //int nob = nb.nextInt();
        String nextIntString = ec.nextLine(); //get the number as a single line
        int nob = Integer.parseInt(nextIntString);

        //Cnb.nextLine();
        for(int i =0;i<nob;i++)
        {
            String book = ec.nextLine();
            System.out.println("Confirm the  genre in which this book belongs");            
            String gen = ec.nextLine();

            //String reg ="a";
            switch(gen){
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




    public void delBooks() {
        System.out.println("Confirm the genre from which you want to delete a book");
        list();
        String inp1 = ec.nextLine();

        switch(inp1){
            case "Thriller":
            System.out.println(stringList1);
            System.out.println("select the no of books you want to delete from this list");

            String nextIntString2 = ec.nextLine(); //get the number as a single line
            int nob2 = Integer.parseInt(nextIntString2);
            for (int i=0;i<nob2;i++){
                String inp2 = ec.nextLine();
                stringList1.remove(inp2);
            }
            break;

            case "Comic":
            System.out.println(stringList2);
            System.out.println("select the no of books you want to delete from this list");

            String nextIntString3 = ec.nextLine(); //get the number as a single line
            int nob3 = Integer.parseInt(nextIntString3);
            for (int i=0;i<nob3;i++){
                String inp3= ec.nextLine();
                stringList2.remove(inp3);
            }
            break;

            case "Drama":
            System.out.println(stringList3);
            System.out.println("select the no of books you want to delete from this list");

            String nextIntString4= ec.nextLine(); //get the number as a single line
            int nob4 = Integer.parseInt(nextIntString4);
            for (int i=0;i<nob4;i++){
                String inp4 = ec.nextLine();
                stringList3.remove(inp4);
            }
            break;

            case "Mystery":
            System.out.println(stringList4);
            System.out.println("select the no of books you want to delete from this list");

            String nextIntString5 = ec.nextLine(); //get the number as a single line
            int nob5 = Integer.parseInt(nextIntString5);
            for (int i=0;i<nob5;i++){
                String inp5 = ec.nextLine();
                stringList4.remove(inp5);
            }
            break;

            default:
            System.out.println(stringList5);
            System.out.println("select the no of books you want to delete from this list");

            String nextIntString6 = ec.nextLine(); //get the number as a single line
            int nob6 = Integer.parseInt(nextIntString6);
            for (int i=0;i<nob6;i++){
                String inp6 = ec.nextLine();
                stringList5.remove(inp6);
            }


            

        }

    }

}
            
     
            
                 

             

    

