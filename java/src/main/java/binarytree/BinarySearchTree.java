/**
* BinarySearchTree.java
*/
package binarytree;

/**
 *
 * @author LiuChen
 * @date 2016年11月24日 下午4:34:20
 *
 */

public class BinarySearchTree extends BinaryTree<Integer> {
    
    /**
     * Insert a node into binary search tree.
     * 
     * @param value
     * @return
     */
    public BinarySearchTree insertSearch(Integer value) {
        BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(value);
        if(this.root == null) {
            this.root = newNode;
            return this;
        }
        BinaryTreeNode<Integer> temp = this.root;
        while(temp != null) {
            if(temp.getValue() == value) {
                return this;
            } else if(temp.getValue() < value) {
                if(temp.getRightNode() == null) {
                    temp.setRightNode(newNode);
                    break;
                }
                temp = temp.getRightNode();
            } else {
                if(temp.getLeftNode() == null) {
                    temp.setLeftNode(newNode);
                    break;
                }
                temp = temp.getLeftNode();
            }
        }
        return this;
    }
    
    /**
     * Remove node
     * 
     * @param node
     * @param value
     * @return
     */
    public BinaryTreeNode<Integer> remove(BinaryTreeNode<Integer> node, Integer value) {
        if(node == null) {
            return null;
        }
        if(node.getValue() > value) {
            node.setLeftNode(remove(node.getLeftNode(), value));
        }
        if(node.getValue() < value) {
            node.setRightNode(remove(node.getRightNode(), value));
        }
        if(node.getValue() == value) {
            if(node.getLeftNode() != null && node.getRightNode() != null) { // Two children
//                node = TODO
            } else { // Single child or no child
                node = node.getLeftNode() == null ? node.getRightNode() : node.getLeftNode();
            }
        }
        
        return node;
    }
    
    /**
     * Search parent node by value.
     * 
     * @param node
     * @param value
     * @return
     */
    public BinaryTreeNode<Integer> searchParentNode(BinaryTreeNode<Integer> node, Integer value) {
        if(node == null || node.getValue() == value) { // <node> is null or is root.
            return null;
        }
        if(node.getLeftNode() != null && node.getLeftNode().getValue() == value) { // Left child's value equals to <value>
            return node;
        }
        if(node.getRightNode() != null && node.getRightNode().getValue() == value) { // Right child's value equals to <value>
            return node;
        }
        if(node.getValue() > value) { // Search in left child tree.
            return searchParentNode(node.getLeftNode(), value);
        } else { // Search in right child tree.
            return searchParentNode(node.getRightNode(), value);
        }
    }
    
    /**
     * Search node by value
     * 
     * @param node
     * @param value
     * @return
     */
    public BinaryTreeNode<Integer> searchNode(BinaryTreeNode<Integer> node, Integer value) {
        if(node == null) {
            return null;
        }
        if(node.getValue() == value) {
            return node;
        } else if(node.getValue() < value) {
            return searchNode(node.getRightNode(), value);
        } else {
            return searchNode(node.getLeftNode(), value);
        }
    }
}
