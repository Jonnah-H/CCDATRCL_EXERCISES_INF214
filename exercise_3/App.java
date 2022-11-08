public class App {
    public static void main(String[] args) {
  
    Stack book = new Stack(5);
  
      book.push("English");
      book.push("Math");
      book.push("Science");
      book.push("History");
  
    System.out.println("You have a total of: " + book.size() + " books");
  
    System.out.println("The top of the stack is: " + book.peek());
  
      book.pop();
  
    System.out.println("After pop");
  
      book.printStack();
  
    System.out.println("The top of the stack is: " + book.peek());

    }
  }
