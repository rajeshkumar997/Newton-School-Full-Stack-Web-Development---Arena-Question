static void  kCircleSum(int arr[],int n,int k){
//Enter your code here

    for (int i = 0; i < n; i++) {
        int subSum = 0;
        for (int j = i; j < i + k; j++) {
            subSum += arr[j % n];
           
        }
        System.out.print(subSum + " ");
    }
        
}
