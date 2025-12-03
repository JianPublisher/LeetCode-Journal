//Design and implement TwoSum class 
- Should support add and find operations 
- add(value) -> add number input to data structure 
- find(target) -> find if any number in the arr added together is equal to the value 

class TwoSum {
HashMap<Integer, Integer> map;

    public TwoSum() {
        map = new HashMap<>();
    }
    
    public void add(int number) {
        map.put(number, map.getOrDefault(number, 0) + 1);
    }
    
    public boolean find(final int value) {
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            int complement = value - num;

            if (!map.containsKey(complement)) continue;

            if (complement == num) {
                if (entry.getValue() >= 2) return true;
            } else {
                return true;
            }
        }
        return false;
    }
}
