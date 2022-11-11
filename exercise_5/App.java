// IN ORDER TRAVERSAL 
public class App {

    public static void main(String[] args) {

        System.out.println(" \nEMO COMPANY ");
        System.out.println("========================================================================== ");

        Node A = new Node("Jonnah");
        Node B = new Node("Hazel");
        Node C = new Node("Harold");
        Node D = new Node("Jeriel");
        Node E = new Node("Roxanne");
        Node F = new Node("Joseph");
        Node G = new Node("Rim");

        A.left = B;
        A.right = C;

        B.left = D;
        B.right = E;

        C.left = F;
        C.right = G;

        System.out.print("In order Traversal: \n");
        traverseInOrder(A);

    }

    // Traverse Inorder Method
    static void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data+ "\n");
            traverseInOrder(node.right);
            
        }

        
    }

  
}
