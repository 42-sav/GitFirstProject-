import java.util.*;

public class Authors {
    public void list() {
        System.out.println("Mark Mason");
        System.out.println("Dan Brown");
        System.out.println("Dandapani");
        System.out.println("Kentaro Muira");
        System.out.println("Poornachandra");


    }
    public static void getBooksByAuthor1(){
    Map<String, List<String>> map = new HashMap<String, List<String>>();
    List<String> books1 = new ArrayList<String>();
    books1.add("Love Is Not Enough");
    books1.add("The Subtle Art of Not Giving a fuck");
    books1.add("will");
    map.put("key1", books1);

    
    Object value=map.get("key1");
    List<Object> list = new ArrayList<Object>();
    list.add(value);
    System.out.println(list);
    
    
    }


    public void getBooksByAuthor2(){
    Map<String, List<String>> map = new HashMap<String, List<String>>();
    List<String> books2 = new ArrayList<String>();
    books2.add("");


    }

    
}
