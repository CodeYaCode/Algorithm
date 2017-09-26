/**
* UnitTest.java
*/
package test.binarytree;

import org.junit.Test;

import binarytree.BinaryTree;

/**
 *
 * @author LiuChen
 * @date 2016年11月24日 下午2:35:16
 *
 */

public class UnitTest {
    public static BinaryTree<String> iTree = new BinaryTree<String>();
    static {
        iTree.insert("a").insert("b").insert("c").insert("d").insert("e").insert("f").insert("g").insert("h").insert("i");
    }
    
    @Test
    public void testTraverse() {
        iTree.preOrderTraverse(iTree.getRoot());System.out.println();
        iTree.inOrderTraverse(iTree.getRoot());System.out.println();
        iTree.postOrderTraverse(iTree.getRoot());System.out.println();
    }
    
    @Test
    public void testGetNodeCount() {
        System.out.println(iTree.getNodeCount(iTree.getRoot()));
    }
    
    @Test
    public void testGetDepth() {
        System.out.println(iTree.getDepth(iTree.getRoot()));
    }
}
