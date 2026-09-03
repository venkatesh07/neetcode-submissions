class Solution {
    public int numRescueBoats(int[] people, int limit) {

        //basecase
        int n = people.length, count = 0, sum = 0;

        int low = 0, high = n-1;
        Arrays.sort(people);

        while(low <= high){
            sum = people[low] + people[high];
            if(sum <= limit){
                count++;
                low++;
                high--;
            }else{
                count++;
                high--;
            }
        }
        return count;
    }
}