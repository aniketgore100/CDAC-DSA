package searching;

public class BinarySearch {

    static int bin(int a[], int key, int s, int e) {
        int mid = 0;
        while (s <= e) {
            mid = (s + e) / 2;
            if (a[mid] == key) {
                return mid;
            } else {
                if (a[mid] > key) {
                    e = mid - 1;
                    return bin(a, key, s, e);
                } else {
                    s = mid + 1;
                    return bin(a, key, s, e);
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = {11, 22, 33, 44, 55};
        int x = 55;
        int s = 0; // Start index
        int e = a.length - 1; // End index
        int ans = BinarySearch.bin(a, x, s, e);
        if (ans != -1) {
            System.out.println("found : " + ans);
        } else {
            System.out.println("not found : " + ans);
        }
    }
}