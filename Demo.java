// leetcode 852 Peak Index in a Mountain Array


class Demo{
    public static void main(String [] args){
        int arr[]={5,62,5,4,3,1};
        int result =Search(arr);
        System.out.println(result);
    }
    public int peakIndexInMountainArray(int[] arr){
        int max=arr[0];
        int maxIndex=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                maxIndex=i;
            }
        }
        return start;
    }
}
