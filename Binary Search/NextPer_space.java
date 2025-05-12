import java.util.*;

class NextPer_space {

    private void recurPermute(int[] nums, List<Integer> ds, boolean[] freq, List<List<Integer>> ans) {
        if (ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!freq[i]) {
                freq[i] = true;
                ds.add(nums[i]);
                recurPermute(nums, ds, freq, ans);
                ds.remove(ds.size() - 1);
                freq[i] = false;
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ts = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        recurPermute(nums, ts, freq, ans);
        return ans;
    }

    public static void main(String[] args) {
        NextPer_space obj = new NextPer_space();
        int[] arr = {1, 2, 3};
        List<List<Integer>> permutations = obj.permute(arr);
        System.out.println(permutations);
    }
}
