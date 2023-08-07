import java.util.*;

import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> setForFirstArray = new HashSet<>();
        Set<Integer> setForSecondArray = new HashSet<>();

        for (int num : nums1) {
            setForFirstArray.add(num);
        }

        for (int num : nums2) {
            setForSecondArray.add(num);
        }

        List<Integer> listForFirstArray = new ArrayList<>();
        List<Integer> listForSecondArray = new ArrayList<>();

        for (int num : nums1) {
            if (!setForSecondArray.contains(num) && !listForFirstArray.contains(num)) {
                listForFirstArray.add(num);
            }
        }

        for (int num : nums2) {
            if (!setForFirstArray.contains(num) && !listForSecondArray.contains(num)) {
                listForSecondArray.add(num);
            }
        }

        List<List<Integer>> listOfLists = new ArrayList<>();
        listOfLists.add(listForFirstArray);
        listOfLists.add(listForSecondArray);

        return listOfLists;
    }
}

