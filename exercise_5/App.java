public class App {

    public static void main(String[] args) {
        System.out.println("============= ");
        System.out.println(" EMO COMPANY ");
        System.out.println("============= ");

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

        System.out.print(" In order Traversal: \n");
        traverseInOrder(A);
        System.out.print("\n Post order Traversal: \n");
        traversePostOrder(A);
        System.out.print("\n Pre order Traversal: \n");
        traversePreOrder(A);

    }

    // Traverse Inorder Method
    static void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data + "\n");
            traverseInOrder(node.right);
            
        }
    }
    // Traverse Postorder method
    static void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data + "\n");
        }
    }

    // Traverse Preorder method
    static void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.data + "\n");
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }

        
    }

  
}
