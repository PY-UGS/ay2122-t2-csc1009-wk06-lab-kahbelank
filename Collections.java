import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;



public class Collections {
    
    public static void addAndSort(LinkedList<Integer> list, int value){
        
        list.add(value);
        list.sort(Comparator.naturalOrder());
        
    }

    public static void swapValues(LinkedList<Integer> list, int indexOne, int indexTwo){
        int validOne = list.get(indexOne);
        int validTwo = list.get(indexTwo);
        list.remove(indexOne);
        list.add(indexOne, validTwo);
        list.remove(indexTwo);
        list.add(indexTwo, validOne);
    }

    
    public static int findValue(LinkedList<Integer> listtwo, int searchVal){
        if(listtwo.contains(searchVal)) {
            return listtwo.indexOf(searchVal);
        }else {
            return -1;
        }
    }

    public static void main(String[] args) {

        //declares the list
        LinkedList<Integer> list = new LinkedList<>(); 
        System.out.println("QUESTION 1");
        //create a scanner
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int ll = scan.nextInt();

        for(int i=0;i<ll;i++){
            System.out.print("Add Element: ");
            int element=scan.nextInt();
            list.add(element);
        }
        
        
        System.out.println("The linked list BEFORE is: " + list);
        System.out.print("Enter a value to add into the list : ");
        int val = scan.nextInt();
        addAndSort(list, val);
        System.out.println("The linked list AFTER is: " + list + "\n");

        System.out.println("QUESTION 2");
        System.out.println("Enter the index of two values to swap: ");
        int indexOne = scan.nextInt();
        int indexTwo = scan.nextInt();

        swapValues(list, indexOne, indexTwo);
        System.out.println("Values After the swap are: " +list + "\n");


        System.out.println("QUESTION 3");
        LinkedList<Integer> listtwo = new LinkedList<>();
        int max = 9999;
        int min = 1000;
        int range = max - min + 1;
        int randval = 0;
        for (int i = 0; i < 500; i++){
            randval = (int) ((Math.random() * range) + 1000);
            listtwo.add(randval);
        }
        randval = (int) ((Math.random() * range) + 1000);
        System.out.println("Before: " + listtwo);
        System.out.println("Search: " + findValue(listtwo, randval));

        scan.close();
    }


}

