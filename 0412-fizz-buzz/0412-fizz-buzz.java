class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            if ((i + 1) % 15 == 0) {
                res.add(i, "FizzBuzz");
            } else if ((i + 1) % 3 == 0) {
                res.add(i, "Fizz");
            } else if ((i + 1) % 5 == 0) {
                res.add(i, "Buzz");
            } else {

                res.add(i, String.valueOf(i + 1));
            }
        }
        return res;
    }
}