class MyStack {

    Deque<Integer> stack = new ArrayDeque<>();

    public MyStack() {
    }

    public void push(int x) {
        if (stack.size() == 0) {
            stack.addFirst(x);
        } else {
            stack.addLast(x);
        }
    }

    public int pop() {
        return stack.removeLast();
    }

    public int top() {
        return stack.getLast();
    }

    public boolean empty() {
        if (stack.size() == 0)
            return true;
        else
            return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */