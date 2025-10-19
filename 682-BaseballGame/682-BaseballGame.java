// Last updated: 10/19/2025, 4:58:39 AM
class Solution {
    public int calPoints(String[] operations) {
        List<Integer> record = new ArrayList<>();
        int sum = 0;

        for (String op : operations) {
            int val;

            switch (op) {
                case "C":
                    sum -= record.remove(record.size() - 1);
                    break;

                case "D":
                    val = record.get(record.size() - 1) * 2;
                    record.add(val);
                    sum += val;
                    break;

                case "+":
                    int n = record.size();
                    val = record.get(n - 1) + record.get(n - 2);
                    record.add(val);
                    sum += val;
                    break;

                default:
                    val = Integer.parseInt(op);
                    record.add(val);
                    sum += val;
                    break;
            }
        }

        return sum;
    }
}
