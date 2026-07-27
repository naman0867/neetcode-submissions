class MinStack {
    private Stack<Integer> s = new Stack<>();
    private Stack<Integer> minS = new Stack<>();

    public MinStack() {}

    public void push(int val) {
        s.push(val);
        minS.push(minS.isEmpty() ? val : Math.min(val, minS.peek()));
    }

    public void pop() {
        s.pop();
        minS.pop();
    }

    public int top() {
        return s.peek();
    }

    public int getMin() {
        return minS.peek();
    }
}