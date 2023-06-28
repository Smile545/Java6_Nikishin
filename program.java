import java.util.HashMap;
import java.util.Iterator;

public class program {
    private static HashMap<Integer, Object> hMap = new HashMap<>();
    private static final Object OBJ = new Object();
    public static void main(String[] args) {
        addToHMap(0);
        addToHMap(1);
        addToHMap(21);
        addToHMap(15); 
        addToHMap(77);

        System.out.println(isEmpty());

        printConsole();
        System.out.println();
        try {
            System.out.println(printOneEl(20));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void addToHMap(Integer number){
        hMap.put(number, OBJ);   
    } 


    private static boolean isEmpty(){
        return hMap.isEmpty();
    }


    private static void printConsole(){
        Iterator<Integer> iterator = hMap.keySet().iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }


    private static int printOneEl(int index){
        return (Integer)hMap.keySet().toArray()[index];
    }      
}