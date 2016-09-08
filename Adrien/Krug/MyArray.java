import java.util.ArrayList;

class MyArrayInside {

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
                  }
                count++;
                check++;
                mover++;
            }
        }
        return array;
    }

    public void printMyArray(ArrayList<Integer> a, ArrayList<Integer> first, ArrayList<Integer> second){
        //System.out.print("Initial Array: " +a);
        System.out.println();
        System.out.print("Sorted Array: " + sortArray(a));
        System.out.println();
        //System.out.println("First Element: " + firstElement(a));
        //System.out.print("Middle Elements: " + restOfArray(a));
        //System.out.println();
        //System.out.println("Last Element: " + lastElement(a));
        //System.out.print("Combined Array: " + combineArrays(first, second, a));
    }
  }

  public class MyArray {
    public static void main(String[] args) {
        long timeFirst = System.currentTimeMillis();
        ArrayList<Integer> dataArray = new ArrayList<>();

        for(int i=0;i<100000;i++){
          dataArray.add(100000-i);
        }
        //dataArray.add(7);
        //dataArray.add(6);
        //dataArray.add(4);
        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();

        MyArrayInside MA = new MyArrayInside();

        /*for (int i = 0; i<10; i++){
            dataArray.add(i);
        }*/
        for(int i = 10; i<15; i++){
            listA.add(i);
        }
        for(int i = 15; i<20; i++){
            listB.add(i);
        }

        MA.printMyArray(dataArray, listA, listB);
        long timeLast = System.currentTimeMillis();
        System.out.println("Starting test: " + timeFirst);
        System.out.println("Ending test: " + timeLast);
        System.out.println("Difference (milliseconds): " + (timeLast - timeFirst));

    }
}
