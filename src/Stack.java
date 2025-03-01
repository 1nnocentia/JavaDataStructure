public class Stack {
    private int[] stackArray;
    private int top;
    private int capacity;
    
    // Constructor to initialize the stack with a given capacity
    public Stack(int capacity) {
        this.capacity = capacity;
        stackArray = new int[capacity];
        top = -1; // Indicates that the stack is initially empty
    }
    
    // Push operation: Adds an element to the top of the stack
    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow! Cannot push " + value);
            return;
        }
        stackArray[++top] = value;
    }
    
    // Pop operation: Removes and returns the top element of the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! No elements to pop.");
            return -1; // Return a sentinel value indicating underflow
        }
        return stackArray[top--];
    }
    
    // Peek operation: Returns the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return stackArray[top];
    }
    
    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }
    
    // Get the current size of the stack
    public int size() {
        return top + 1;
    }
    
    // Main method for testing
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element: " + stack.peek()); // Expected: 30
        System.out.println("Popped element: " + stack.pop()); // Expected: 30
        System.out.println("New top element: " + stack.peek()); // Expected: 20
        System.out.println("Current stack size: " + stack.size()); // Expected: 2
    }
}