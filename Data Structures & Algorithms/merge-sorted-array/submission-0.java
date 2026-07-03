class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr1[] = new int[m];
        for(int i=0;i<m;i++){
            arr1[i]=nums1[i];
        }
        int i=0,j=0,k=0;
        while(i<m&&j<n){
            if(arr1[i]<nums2[j]){
                nums1[k]=arr1[i];
                k++;i++;
            }else{
                nums1[k]=nums2[j];
                k++;j++;
            }
        }
        while(i<m){
            nums1[k]=arr1[i];
            k++;i++;
        }
        while(j<n){
            nums1[k]=nums2[j];
            k++;j++;
        }
    }
}