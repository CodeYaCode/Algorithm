/**
* BinaryTreeNode.java
*/
package binarytree;

/**
 * The node of binary tree.
 * @author LiuChen
 * @date 2016年11月24日 上午11:03:42
 *
 */

public class BinaryTreeNode<T> {
    private T value;
    private BinaryTreeNode<T> leftNode;
    private BinaryTreeNode<T> rightNode;
    
    public BinaryTreeNode() {
        this.leftNode = null;
        this.rightNode = null;
    }
    
    public BinaryTreeNode(T value) {
        this.value = value;
        this.leftNode = null;
        this.rightNode = null;
    }
    
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public BinaryTreeNode<T> getLeftNode() {
        return leftNode;
    }
    public void setLeftNode(BinaryTreeNode<T> leftNode) {
        this.leftNode = leftNode;
    }
    public BinaryTreeNode<T> getRightNode() {
        return rightNode;
    }
    public void setRightNode(BinaryTreeNode<T> rightNode) {
        this.rightNode = rightNode;
    }

    @Override
    public String toString() {
        return "BinaryTreeNode [value=" + value + ", leftNode=" + leftNode
                + ", rightNode=" + rightNode + "]";
    }
}
