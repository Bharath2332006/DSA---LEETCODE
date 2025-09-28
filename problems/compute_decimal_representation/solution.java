class Solution {
    public int[] decimalRepresentation(int a) {
        if (a == 0)  return new int[]{0};

        List<Integer> list = new ArrayList<>();
        int place = 1;
        while (a > 0) {
            int digit = a % 10;
            if (digit != 0) {
                list.add(digit * place);
            }
            place *= 10;
            a /= 10;
        }
        Collections.reverse(list);
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }
}