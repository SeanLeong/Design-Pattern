package Behavior.Iterator;

/**
 * @ClassName: TreeNode
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/30 11:20
 */
public class TreeNode {
    private String name;
    private TreeNode left, right;

    public TreeNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "name='" + name + '\'' +
                '}';
    }
}
