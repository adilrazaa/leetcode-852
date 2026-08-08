// leetcode 852 Peak Index in a Mountain Array
class Demo{
    public static void main(String[] args){
        Demo p=new Demo();
        int[] arr={0,1,2,3,4,5,6,7,8,9,10,5,2};
        System.out.println(p.peakIndexInMountainArray(arr));
    }
    public int peakIndexInMountainArray(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
}