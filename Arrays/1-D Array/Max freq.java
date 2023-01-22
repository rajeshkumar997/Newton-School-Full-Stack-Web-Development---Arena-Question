import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        int maxFrequency = 0;
        int maxNum = 0;
        for (int key : map.keySet()) {
            if (map.get(key) > maxFrequency) {
                maxFrequency = map.get(key);
                maxNum = key;
            } else if (map.get(key) == maxFrequency) {
                maxNum = Math.max(maxNum, key);
            }
        }
        System.out.println(maxNum);
    }
}
