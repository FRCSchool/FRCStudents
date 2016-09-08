import java.util.ArrayList;

public class MyArray {

    private int firstElement(ArrayList<Integer> a){
        return a.get(0);
    }
    private int lastElement(ArrayList<Integer> a){
        return a.get(a.size() - 1);
    }
    private ArrayList<Integer> restOfArray(ArrayList<Integer> a){
        ArrayList<Integer> temp = new ArrayList<>();
        temp.addAll(a);
        temp.remove(0);
        int size = a.size() -2;
        temp.remove(size);
        return temp;
    }
    private ArrayList<Integer> combineArrays(ArrayList<Integer> first, ArrayList<Integer> second, ArrayList<Integer> end){
        end.addAll(first);
        end.addAll(second);
        return end;
    }
    private ArrayList<Integer> sortArray(ArrayList<Integer> array) {
        int size = array.size();

        for(int i=0; i< size; i++){
            int check = 0;
            int mover = 1;
            int count = 0;
            while(count < size-1){
                if(array.get(mover) < array.get(check)){
                    int temp = array.get(check);
                    array.set(check, array.get(mover));
                    array.set(mover, temp);
                    count++;
                    check++;
                    mover++;
                }else{
                    count++;
                    check++;
                    mover++;
                }
            }
        }
        return array;
    }
    private void printMyArray(ArrayList<Integer> a, ArrayList<Integer> first, ArrayList<Integer> second){
        System.out.print("Initial Array: " +a);
        System.out.println();
        System.out.print("Sorted Array: " + sortArray(a));
        System.out.println();
        System.out.println("First Element: " + firstElement(a));
        System.out.print("Middle Elements: " + restOfArray(a));
        System.out.println();
        System.out.println("Last Element: " + lastElement(a));
        System.out.print("Combined Array: " + combineArrays(first, second, a));
    }
    public static void main(String[] args) {
        ArrayList<Integer> dataArray = new ArrayList<>();
        dataArray.add(5);
        dataArray.add(8);
        dataArray.add(5);
        dataArray.add(7);
        dataArray.add(6);
        dataArray.add(4);
        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();

        MyArray MyArray = new MyArray();

        /*for (int i = 0; i<10; i++){
            dataArray.add(i);
        }*/
        for(int i = 10; i<15; i++){
            listA.add(i);
        }
        for(int i = 15; i<20; i++){
            listB.add(i);
        }

        MyArray.printMyArray(dataArray, listA, listB);
    }
}
