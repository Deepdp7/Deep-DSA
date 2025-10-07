class selectionsort{
    public static void main(String[] args) {
        int arr[] = {7,4,3,2,1};
        int n = arr.length;

        System.out.print("Array before sort : ");
        for (int i = 0; i < n; i++) {
              System.out.print(arr[i]+" ");
        }

        // selection sort
        for(int i = 0; i < n-1; i++){
            int min = Integer.MAX_VALUE;
            int midx = 1;
            for (int j = i; j < n; j++) {
                if(min > arr[j]){
                    min = arr[j];
                    midx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[midx];
            arr[midx] = temp;
        }
        
        System.out.println("");
        System.out.print("Array After sort : ");
            for (int i = 0; i < n; i++) {
              System.out.print(arr[i]+" ");
            }


    }
}