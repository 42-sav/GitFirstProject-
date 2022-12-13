import java.util.*;

public class Authors {

    static Map<String, List<String>> map = new HashMap<String, List<String>>();
    public static List<String> books1 = new ArrayList<String>();
    public static List<String> books2 = new ArrayList<String>();
    public static List<String> books3 = new ArrayList<String>();
    public static List<String> books4 = new ArrayList<String>();
    public static List<String> books5 = new ArrayList<String>();
    
    public static void list() {
        System.out.println("Mark Mason");
        System.out.println("Dan Brown");
        System.out.println("Dandapani");
        System.out.println("Kentaro Muira");
        System.out.println("Poornachandra");


    }
    public static  void getBooksByAuthor1(){
    
    
    books1.add("Love Is Not Enough");
    books1.add("The Subtle Art of Not Giving a fuck");
    books1.add("will");
    map.put("key1", books1);

    
    Object value=map.get("key1");
    List<Object> listofbook = new ArrayList<Object>();
    listofbook.add(value);
    System.out.println(listofbook);
    
    
    }


    public static void getBooksByAuthor2(){
    
    
    books2.add("DA VINCI CODE");
    books2.add("Inferno");
    books2.add("Origin");
    books2.add("Deception point");
    map.put("key2",books2);

    Object value=map.get("key2");
    List<Object> listbook = new ArrayList<Object>();
    listbook.add(value);
    System.out.println(listbook);

    }

    public static void getBooksByAuthor3(){
        
        books3.add("The Power of Unwavering");
        map.put("key3",books3);
    
        Object value=map.get("key3");
        List<Object> listbook = new ArrayList<Object>();
        listbook.add(value);
        System.out.println(listbook);
    
        }

        public static void getBooksByAuthor4(){
            
            books4.add("Berserk");
            map.put("key4",books4);
        
            Object value=map.get("key4");
            List<Object> listbook = new ArrayList<Object>();
            listbook.add(value);
            System.out.println(listbook);
        
            }


            public static void getBooksByAuthor5(){
                
                books5.add("The Power of Unwavering");
                map.put("key3",books5);
            
                Object value=map.get("key5");
                List<Object> listbook = new ArrayList<Object>();
                listbook.add(value);
                System.out.println(listbook);
            
                }

            public static void addorDel(){
                System.out.println("Do you want to add or delete books from authors:type add or del");
                String test1 = Genre.ec.nextLine();
                if (test1 =="add"){
                    list();
                    System.out.println("enter the no of books you want to add");
                    String nextIntString = Genre.ec.nextLine(); //get the number as a single line this can reduced by taking int input
                    int nob = Integer.parseInt(nextIntString);
                    for(int i =0;i<nob;i++)
                            {
                        System.out.println("enter the name of the book you want to add");
                        String book = Genre.ec.nextLine();
                        System.out.println("Confirm the  Author to which this book belongs");            
                        String gen = Genre.ec.nextLine();


                        switch(gen){
                            case "Mark Mason":
                                books1.add(book);
                                break;

                            case "Dan Brown":
                               books2.add(book);
                                break;

                            case "Dandapani":
                                books3.add(book);
                                break;

                            case "Kentaro Muira":
                                books4.add(book);
                                break;

                            default:
                                books5.add(book);


                    }



                }
            }

            else if(test1=="del"){
                list();
                System.out.println("enter the no of books you want to delete");
                String nextIntString = Genre.ec.nextLine(); //get the number as a single line this can reduced by taking int input
                    int nob = Integer.parseInt(nextIntString);
                    for(int i =0;i<nob;i++)
                            {
                        System.out.println("enter the name of the book you want to delete");
                        String book = Genre.ec.nextLine();
                        System.out.println("Confirm the  Author to which this book belongs");            
                        String gen = Genre.ec.nextLine();


                        switch(gen){
                            case "Mark Mason":
                                books1.remove(book);
                                break;

                            case "Dan Brown":
                               books2.remove(book);
                                break;

                            case "Dandapani":
                                books3.remove(book);
                                break;

                            case "Kentaro Muira":
                                books4.remove(book);
                                break;

                            default:
                                books5.remove(book);


                    }



                }

            }



                


                return ;
            }

    
}
