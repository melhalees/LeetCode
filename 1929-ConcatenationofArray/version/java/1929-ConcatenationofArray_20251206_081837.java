// Last updated: 12/6/2025, 8:18:37 AM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] output=new int[2*n];
        int[] numsx=new int[n];
        int[] numsy=new int[n];
        for(int i=0;i<2*n;i++){
            if(i<n){
                numsx[i]=nums[i];
            }
            else{
                numsy[i-n]=nums[i];
            }
        }
        int ix=0;
        int iy=0;
        for(int i=0;i<2*n;i++){
            if(i%2==0){
                output[i]=numsx[ix%n];
                ix++;
            }
            else{
                output[i]=numsy[iy%n];
                iy++;
            }
        }
        return output;
    }
}