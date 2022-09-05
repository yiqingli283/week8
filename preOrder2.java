//前序遍历——迭代思想
    public void preOrderNR(){
        LinkedList<Node> stack = new LinkedList<>();
        //如果树为空，返回空
        if (isEmpty()){
            return;
        }
        //让根结点进栈
        stack.push(root);
        //只要栈不为空
        while (!stack.isEmpty()){
            //弹栈 栈顶结点
            Node cur = stack.pop();
            //输出弹栈结点的值
            System.out.println(cur.e);
            //只要当前结点的右子节点不为空，就让右子节点进栈
            if (cur.right != null){
                stack.push(cur.right);
            }
            //只要当前结点的左子节点不为空，就让左子节点进栈
            if (cur.left != null){
                stack.push(cur.right);
            }
        }
    }