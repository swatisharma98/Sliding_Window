
class Solution {
public int maxSumSubArray(int[] arr){

int sum = 0;
int size = arr.length;
int j = 0;
int i = 0;

int max  = 0;

while(j<size){
  sum = sum + arr[j];
  if(j-i+1 < k){
    j++;
  }else if(j-i+1 == k){
    max = Math.max(max,sum);
    sum = sum - arr[i];
    i++;
    j++;
  }
}
}
}
