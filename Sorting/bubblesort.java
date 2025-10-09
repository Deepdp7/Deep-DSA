class bubblesort{
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        int n = arr.length;

        System.out.print("Array before sort : ");
        for (int i = 0; i < n; i++) {
              System.out.print(arr[i]+" ");
        }

        // bubble sort
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("");
        System.out.print("Array After sort : ");
            for (int i = 0; i < n; i++) {
              System.out.print(arr[i]+" ");
            }


    }
}