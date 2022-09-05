 //中序遍历——迭代方式
    public void inOrderNR(){
        LinkedList<Node> stack = new LinkedList<>();\
        Node p = root;
        while (p != null){
            stack.push(p);
            p = p.left;
        }
        while (!stack.isEmpty()){
            Node cur = stack.pop();
            System.out.println(cur.e);
            if (cur.right != null){
                Node n = cur.right;
                while (n != null){
                    stack.push(n);
                    n = n.left;
                }
            }
        }
    }