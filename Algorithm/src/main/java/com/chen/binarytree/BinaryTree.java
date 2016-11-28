/**
* BinaryTree.java
*/
package com.chen.binarytree;

/**
 * Binary tree
 * @author LiuChen
 * @date 2016年11月24日 上午11:05:22
 *
 */

public class BinaryTree<T> {
    protected BinaryTreeNode<T> root;
    
    public BinaryTree() {
        this.root = null;
    }
    
    public BinaryTree(T value) {
        this.root = new BinaryTreeNode<T>(value);
    }
    
    public BinaryTreeNode<T> getRoot() {
        return this.root;
    }
    
    /**
     * Insert a node into tree.
     * 
     * @param value
     * @return
     */
    public BinaryTree<T> insert(T value) {
        BinaryTreeNode<T> newNode = new BinaryTreeNode<T>(value);
        if(this.root == null) {
            this.root = newNode;
            return this;
        }
        BinaryTreeNode<T> temp = this.root;
        while(temp.getLeftNode() != null) {
            if(temp.getRightNode() == null) {
                temp.setRightNode(newNode);
                return this;
            }
            temp = temp.getLeftNode();
        }
        temp.setLeftNode(newNode);
        return this;
    }
    
    /**
     * Get node count.
     * @param node
     * @return
     */
    public int getNodeCount(BinaryTreeNode<T> node) {
        if(node == null) {
            return 0;
        }
        return getNodeCount(node.getLeftNode()) + getNodeCount(node.getRightNode()) + 1;
    }
    
    /**
     * Get tree's depth.
     * @param node
     * @return
     */
    public int getDepth(BinaryTreeNode<T> node) {
        if(node == null) {
            return 0;
        }
        int depthLeft = getDepth(node.getLeftNode());
        int depthRight = getDepth(node.getRightNode());
        
        return depthLeft > depthRight ? (depthLeft + 1) : (depthRight + 1);
    }
    
    public void visit(BinaryTreeNode<T> node) {
        System.out.print("NODE[" + node.getValue() + "]-->");
    }
    
    /**
     * PreOrderTraverse
     * @param root
     */
    public void preOrderTraverse(BinaryTreeNode<T> root) {
        if(root == null) {
            return;
        }
        this.visit(root); // visit root node 
        preOrderTraverse(root.getLeftNode()); // visit left child tree
        preOrderTraverse(root.getRightNode()); // visit right child tree
    }
    
    /**
     * InOrderTraverse
     * @param root
     */
    public void inOrderTraverse(BinaryTreeNode<T> root) {
        if(root == null) {
            return;
        }
        inOrderTraverse(root.getLeftNode()); // visit left child tree
        this.visit(root); // visit root node 
        inOrderTraverse(root.getRightNode()); // visit right child tree
    }
    
    /**
     * PostOrderTraverse
     * @param root
     */
    public void postOrderTraverse(BinaryTreeNode<T> root) {
        if(root == null) {
            return;
        }
        postOrderTraverse(root.getLeftNode()); // visit left child tree
        postOrderTraverse(root.getRightNode()); // visit right child tree
        this.visit(root); // visit root node 
    }
}
