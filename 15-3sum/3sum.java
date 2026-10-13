class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            HashSet<Integer> elementSet = new HashSet<>();

            for (int j = i + 1; j < nums.length; j++) {

                int third = -(nums[i] + nums[j]);
                if (elementSet.contains(third)) {

                    List<Integer> temp = new ArrayList<>();

                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(third);

                    Collections.sort(temp);

                    set.add(temp);
                }

                elementSet.add(nums[j]);
            }
        }

        return new ArrayList<>(set);
    }
}