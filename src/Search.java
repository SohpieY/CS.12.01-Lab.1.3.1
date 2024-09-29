import java.util.ArrayList;

public class Search {

    public static int linearSearch(int[] array, int value) {
        for(int i = 0; i < array.length; i++){
            if(array[i] == value){
            return i;
        }
        }

        return -1;
    }

    public static int linearSearch(ArrayList<String> list, String string) {
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).equals(string)){
                return i;
            }
        }

        return -1;

    }

    public static int binarySearch(int[] array, int value) {

        int start = 0;
        int end = array.length - 1;

        while(start <= end) {
            int mid = (end + start)/2;
            if(array[mid] == value){
                return mid;
            }

            if(array[mid] < value){ //if value is greater than mid, then ignore left half
                start = mid + 1;
            } else{
                end = mid - 1; //if value is smaller than mid, ignore right half
            }
        }
        return -1;
    }

    public static int binarySearch(String[] array, String string) {
        int start = 0;
        int end = array.length - 1;

        while(start <= end) {

            int mid = (end + start)/2;
            int check = string.compareTo(array[mid]);

            if(check == 0){ // Check if value is present at mid
                return mid;
            }

            if(check > 0){ //if value is greater than mid, then ignore left half
                start = mid + 1;
            } else{
                end = mid - 1; //if value is smaller than mid, ignore right half
            }
        }
        return -1;


    }
}
