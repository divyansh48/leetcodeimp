import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class sum3 {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        int n = nums.length;
        class Solution {
            public List<List<Integer>> threeSum(int[] nums) {
                List<List<Integer>> ans = new ArrayList<>();
                int n = nums.length;

                Arrays.sort(nums);

                for(int i = 0;i<n;i++){
                    if(i>0 && nums[i]==nums[i-1])continue;
                    int j = i+1;
                    int k = n-1;

                    while(j<k){

                        int sum = nums[i] + nums[j] + nums[k];

                        if(sum>0){
                            k--;
                        }

                        else if(sum<0){
                            j++;
                        }

                        else{
                            ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                            k--;
                            j++;

                            while(j<k && nums[j]==nums[j-1])j++;
                            while(j<k && nums[k]==nums[k+1])k--;

                        }


                    }


                }

                return ans;


            }
        }


    }
    static List<List<Integer>> check(List<List<Integer>> ans1){
        int i = 0;
        int count = 0;
        Arrays.sort(new List[]{ans1.get(i)});
        for (int j = 0; j < ans1.get(i).size() ; j++) {


            for (int k = i+1; k < ans1.size(); k++) {
                Arrays.sort(new List[]{ans1.get(k)});
                for (int l = 0; l < ans1.get(k).size(); l++) {
                    if(Objects.equals(ans1.get(i).get(j), ans1.get(k).get(l))){
                        count++;
                    }

                }

            }


        }
        if(count == ans1.get(i).size()){
            ans1.remove(i);
        }
        else {
            return ans1;
        }
        return ans1;
    }
}
