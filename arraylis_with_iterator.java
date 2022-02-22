import java.util.*;
public class student{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("rohit");
        list.add("rohit1");
        list.add("rohit2");
        list.add("rohit3");
        list.add("rohit4");
        list.add("rohit5");
        
        System.out.println("The list is: \n" + list);
        
        Iterator<String> iter = list.iterator();
        System.out.println("\n The iterator values" + " of list are: ");
        while(iter.hasNext()){
            System.out.print(iter.next() + " ");
        }
    }
}