package Behavior.Iterator;

import java.util.Iterator;
import java.util.Stack;

/**
 * @ClassName: TreeIterator
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/30 11:20
 */
public class TreeIterator implements Iterator<TreeNode> {

    Stack<TreeNode> treeNodes = new Stack<>();

    public TreeIterator(TreeNode node) {
        this.treeNodes.push(node);
    }

    @Override
    public boolean hasNext() {
        return (!treeNodes.isEmpty() && treeNodes.peek() != null);
    }
    /*
        这里使用先序遍历
     */
    @Override
    public TreeNode next() {
        TreeNode node = treeNodes.pop();
        if(node.getRight() != null){
            treeNodes.push(node.getRight());
        }
        if(node.getLeft() != null) {
            treeNodes.push(node.getLeft());
        }
        return node;
    }
}
