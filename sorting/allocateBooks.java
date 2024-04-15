import java.util.*;

public class allocateBooks {

    public static int countStudents(ArrayList<Integer> arr, int pages) {
        int students = 1;
        int pagesStudent = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (pagesStudent + arr.get(i) <= pages) {
                pagesStudent += arr.get(i);
            } else {
                students++;
                pagesStudent = arr.get(i);
            }
        }
        return students;
    }

    public static int findPages(ArrayList<Integer> arr,int n, int m) {
        if(m>n) return -1;
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            maxi = Math.max(maxi, arr.get(i));
            sum += arr.get(i);
        }
        int low = maxi;
        int high = sum;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (countStudents(arr, mid) > m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(25, 46, 28, 49, 24));
        int n = 5;
        int m = 4;
        int ans = findPages(arr, n, m);
        System.out.println("The answer is: " + ans);
    }
}
