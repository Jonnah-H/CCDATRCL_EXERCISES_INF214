
public class Stack {

    String array[]; 
    int top;
    int quantity;

    Stack(int size) {
       
        array = new String[size];
        quantity = size;
        top = -1;
    }

public void push(String data) {
       
    if (isFull()) {
        System.out.println("Stack is Full!");
        System.exit(1);
    }

        System.out.println("Fitting in " + data);
        array[++top] = data;
    }

public String pop() {
  
    if (isEmpty()) {
        System.out.println("Stack is empty!");
        System.exit(1);
    }

        System.out.println("Removing " + array[top]);

        return array[top--];
    }

public int size() {
       
        return top + 1;
    }

public Boolean isEmpty() {
        
        return top == -1;
    }

public Boolean isFull() {
       
        return top == quantity - 1;
    }

public String peek() {

    if (isEmpty()) {
        System.out.println("The stack is empty");
        System.exit(-1);
    }
        return array[top];
    }

public void printStack() {
    for (int i = top; i >= 0; i--) {
        System.out.println(array[i]);
    }
    }
}
