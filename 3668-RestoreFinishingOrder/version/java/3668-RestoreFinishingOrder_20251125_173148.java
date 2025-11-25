// Last updated: 11/25/2025, 5:31:48 PM
class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> friendsSet = new HashSet<>();
        for (int friendId : friends) {
            friendsSet.add(friendId);
        }

        int[] result = new int[friendsSet.size()];
        int i = 0;

        for (int participateId : order) {
            if (friendsSet.contains(participateId)) {
                if (i < result.length) result[i] = participateId;
                i++;
            }
        }

        return result;
    }
}