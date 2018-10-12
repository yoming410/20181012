public class Main {
    public static void main(String[] args) {
	// write your code here
        System.out.println("Binary Search");
        int[] data={1,5,7,8,10,15,16,20,25,31,26};

       // for (int i=0; i<data.length; i++)
       //     System.out.println(data[i]);

        int index_Iterative=BinarySearchIteratively(data,16,0,data.length-1);
        System.out.println("By Iterative: "+index_Iterative);

        int index_Recursive=BinarySearchRecursively(data,16,0,data.length-1);
        System.out.println("By Recursive: "+index_Recursive);
    }

    static public int BinarySearchIteratively(int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }

    // ***********************************************************
    static public int BinarySearchRecursively(int[] sortedArray, int key, int low, int high) {
        int middle = (low + high) / 2;

        if (high < low) {
            return -1;
        }

        if (key == sortedArray[middle]) {
            return middle;
        } else if (key < sortedArray[middle]) {
            return BinarySearchRecursively(
                    sortedArray, key, low, middle - 1);
        } else {
            return BinarySearchRecursively(
                    sortedArray, key, middle + 1, high);
        }
    }

}
