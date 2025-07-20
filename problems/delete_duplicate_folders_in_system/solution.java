class Solution 
{
    static class Node 
    {
        Map<String, Node> children = new HashMap<>();
        boolean del = false;
    }

    Map<String, List<Node>> seen = new HashMap<>();

    public List<List<String>> deleteDuplicateFolder(List<List<String>> paths) 
    {
        Node root = new Node();

     
        for (List<String> path : paths) 
        {
            Node cur = root;
            for (String dir : path) 
            {
                cur.children.putIfAbsent(dir, new Node());
                cur = cur.children.get(dir);
            }
        }


        dfs(root);

        for (List<Node> group : seen.values()) 
        {
            if (group.size() > 1) 
            {
                for (Node node : group) 
                {
                    node.del = true;
                }
            }
        }

        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();
        collect(root, path, res);
        return res;
    }

    public String dfs(Node node) 
    {
        if (node.children.isEmpty())
        {
            return "";
        } 

        List<String> subs = new ArrayList<>();
        for (String name : node.children.keySet()) 
        {
            String childSerial = dfs(node.children.get(name));
            subs.add(name + "(" + childSerial + ")");
        }

        Collections.sort(subs);
        String serial = String.join("", subs);
        seen.computeIfAbsent(serial, k -> new ArrayList<>()).add(node);

        return serial;
    }

    public void collect(Node node, List<String> path, List<List<String>> res) 
    {
        for (Map.Entry<String, Node> entry : node.children.entrySet()) 
        {
            if (entry.getValue().del)
            {
                continue;
            } 

            path.add(entry.getKey());
            res.add(new ArrayList<>(path));
            collect(entry.getValue(), path, res);
            path.remove(path.size() - 1);
        }
    }
}