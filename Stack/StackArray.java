class StackArray {
    private int[] stack;
    private int top;
    private int capacity;

    public StackArray(int size) {
        stack = new int[size];
        capacity = size;
        top = -1; // Correct initialization. Stack starts empty.
    }

    // Push operation
    public void push(int data) {
        if (top == capacity - 1) {
            System.out.println("Stack overflow: cannot push " + data);
            return;
        }
        stack[++top] = data;
        System.out.println("Pushed " + data);
    }

    // Pop operation
    public int pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return -1;
        }
        return stack[top--];
    }

    // Peek operation
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Display stack elements
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
public static void main(String[] args) {
        StackArray stack = new StackArray(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();             // Output: 10 20 30
        System.out.println("Top: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        stack.display();             // Output: 10 20
    }
}