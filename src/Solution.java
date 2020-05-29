import org.w3c.dom.Node;

public class Solution {
    
// https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=trees

    public static int height(Node root) {

        // My code starts here.
     if(root==null){
            return -1;
            } else {
     return 1 + 
     (   height(root.left)>height(root.right) ?  height(root.left):height(root.right)   );
         } 
        // My code ends here

    }


}
