import java.util.ArrayList;
import java.util.Scanner;

public class YearOfPublication  {

    String a = "1980";
    String b = "1990";
    String c = "2000";
    String d = "2010";
    String e = "1970";
    
    public void list() {
        System.out.println("1970's");
        System.out.println("1980's");
        System.out.println("1990's");
        System.out.println("2000's");
        System.out.println("2010's");


        

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
                stringList1.add("Beloved Toni Morrison");
                stringList1.add("Stephen King");
                stringList1.add("Watchmen");

                
                System.out.println(stringList1);
            }
            

            else if (ip.equals(b)){
                stringList2.add("The secret History");
                stringList2.add("The Fightclub");
                stringList2.add("The Game of Thrones");

                System.out.println(stringList2);

            }

            else if (ip.equals(c)){
                stringList3.add("Never Let Me Go");
                stringList3.add("Life of Pi");
                stringList3.add("The Kite Runner");

                System.out.println(stringList3);

            }

            else if (ip.equals(d)){
                stringList4.add("Gone Girl");
                stringList4.add("The Martian");
                stringList4.add("The Night Circus");

                System.out.println(stringList4);

            }

            else if (ip.equals(e)){
                stringList5.add("The Sherlock");
                stringList5.add("The Bluest Eye");
                stringList5.add("Love Story");

                System.out.println(stringList5);

            }

            else {
                System.out.println("The list is Empty");

            }
        }

        


        


        
      }

    public void addBooks() {
        System.out.println("Enter the no of books that you want to add :");
        //String[] string  = new String[nb.nextInt()];
        //int nob = nb.nextInt();
        String nextIntString = ec.nextLine(); //get the number as a single line this can reduced by taking int input
        int nob = Integer.parseInt(nextIntString);

        //Cnb.nextLine();
        for(int i =0;i<nob;i++)
        {
            String book = ec.nextLine();
            System.out.println("Confirm the  yearofpublication in which this book belongs");            
            String gen = ec.nextLine();

            //String reg ="a";
            //String nm=Genre.ec.nextLine();
            //int qu=Genre.ec.nextInt();

            switch(gen){
                case "1980":
                stringList1.add(book);
                break;

                case "1990":
                stringList2.add(book);
                break;

                case "2000":
                stringList3.add(book);
                break;

                case "2010":
                stringList4.add(book);
                break;

                default:
                stringList5.add(book);

            }
        }

    }

    public void delBooks() {
        System.out.println("Confirm the yearofpublication from which you want to delete a book");
        list();
        String inp1 = ec.nextLine();

        switch(inp1){
            case "1980":
            System.out.println(stringList1);
            System.out.println("select the no of books you want to delete from this list");

            String nextIntString2 = ec.nextLine(); //get the number as a single line
            int nob2 = Integer.parseInt(nextIntString2);
            for (int i=0;i<nob2;i++){
                String inp2 = ec.nextLine();
                stringList1.remove(inp2);
                System.out.println("the book has been deleted");
            }
            System.out.println(stringList1);
            //System.out.println("the book has been deleted");
            break;

            case "1990":
            System.out.println(stringList2);
            System.out.println("select the no of books you want to delete from this list");

            String nextIntString3 = ec.nextLine(); //get the number as a single line
            int nob3 = Integer.parseInt(nextIntString3);
            for (int i=0;i<nob3;i++){
                String inp3= ec.nextLine();
                stringList2.remove(inp3);
                System.out.println("the book has been deleted");
            }
            System.out.println(stringList2);
            
            break;

            case "2000":
            System.out.println(stringList3);
            System.out.println("select the no of books you want to delete from this list");

            String nextIntString4= ec.nextLine(); //get the number as a single line
            int nob4 = Integer.parseInt(nextIntString4);
            for (int i=0;i<nob4;i++){
                String inp4 = ec.nextLine();
                stringList3.remove(inp4);
                System.out.println("the book has been deleted");
            }
            System.out.println(stringList3);
            
            break;

            case "2010":
            System.out.println(stringList4);
            System.out.println("select the no of books you want to delete from this list");

            String nextIntString5 = ec.nextLine(); //get the number as a single line
            int nob5 = Integer.parseInt(nextIntString5);
            for (int i=0;i<nob5;i++){
                String inp5 = ec.nextLine();
                stringList4.remove(inp5);
                System.out.println("the book has been deleted");
            }
            System.out.println(stringList4);
            
            break;

            default:
            System.out.println(stringList5);
            System.out.println("select the no of books you want to delete from this list");

            String nextIntString6 = ec.nextLine(); //get the number as a single line
            int nob6 = Integer.parseInt(nextIntString6);
            for (int i=0;i<nob6;i++){
                String inp6 = ec.nextLine();
                stringList5.remove(inp6);
                System.out.println("the book has been deleted");
            }
            System.out.println(stringList5);
            


            

        }

    }



    
    
}
