class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         List<List<Integer>> list = new ArrayList<>();
            solve(0,candidates,new ArrayList<>(),list,target);
            return list;
        }
    
        private void solve(int ind,int[] num,List<Integer> temp,List<List<Integer>> list,int target){
            
            if (ind == num.length) return;
            // if target becomes zero means we have got the list whose sum is target
            if (target == 0) {
                // simply we add the temp to main list
                list.add(new ArrayList<>(temp));
                return;
            }
            
            // everytime we check,,target should be greater than num[ind]
            // pick
            if (target>=num[ind]){
                temp.add(num[ind]);
                solve(ind,num,temp,list,target-num[ind]);
                temp.remove(temp.size()-1);
            }
            // not pick
            solve(ind+1,num,temp,list,target);
            return;
            
        }
}