class OrderedStream {
    String[] stream;
    int currPos;

    public OrderedStream(int n) {
        stream = new String[n + 1];
        currPos = 0;
    }
    
    public List<String> insert(int idKey, String value) {
        stream[idKey - 1] = value;
        List<String> list = new LinkedList<>();
        
        while (currPos < stream.length && stream[currPos] != null) {
            list.add(stream[currPos]);
            currPos++;
        }
        return list;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */