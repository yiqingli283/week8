//后续遍历-迭代方式
    public void postOrderNP(){
        LinkedList<Node> stack = new LinkedList<>();
        if (isEmpty()){
            return;
        }
        Node p = root;
        while (p != null){
            stack.push(p);
            p = p.left;
        }
        while (stack.isEmpty()){
            Node cur = stack.pop();
            if (cur.right != null){
                Node n = cur.right;
                while (n != null){
                    stack.push(n);
                    n = n.left;
                }
            }
            System.out.println(cur.e);
        }
 
    }