package string.easy;

import string.easy.problem.BinaryTreePaths257;

import java.util.ArrayList;
import java.util.List;

public class Solution257 implements BinaryTreePaths257 {
    /*
     *  Given the root
     * */
    @Override
    public List<String> binaryTreePaths(TreeNode root) {
        var paths = new ArrayList<String>();
        dfs(root, "", paths);
        return paths;
    }

    private void dfs(TreeNode node, String path, List<String> paths) {
        if(node == null) return;
        path += node.val;
        if(node.left == null && node.right == null) {
            paths.add(path);
        } else {
            path += "->";
            dfs(node.left, path, paths);
            dfs(node.right, path, paths);
        }
    }
}

