package example;


 
public class BinaryTree {
     
    static Node root;
 
  
    Node sortedArrayToBST(int arr[], int start, int end) {
 
        
        if (start > end) {
            return null;
        }
 
        
        int mid = (start + end) / 2;
        Node node = new Node();
        node.setValue(arr[mid]);    
 
       
        node.setSmaller(sortedArrayToBST(arr, start, mid - 1));
        
 
     
        node.setLarger(sortedArrayToBST(arr, mid + 1, end));
        
        return node;
       
    }
 
    void printBinaryTree(Node node, int level){
        if(node==null)
            return;
        printBinaryTree(node.getLarger(), level+1);
        if(level!=0){
            for(int i=0;i<level-1;i++)
                System.out.print("|\t");
            System.out.println("|-------"+node.getValue());
        } else
            System.out.println(node.getValue());
        printBinaryTree(node.getSmaller(), level+1);
    }    
     
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7,8,9};
        int n = arr.length;
        root = tree.sortedArrayToBST(arr, 0, n - 1);
        tree.printBinaryTree(root, 0);
    }
}
 

