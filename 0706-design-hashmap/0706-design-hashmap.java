class Pair<U,V>{
    U first;
    V second;
    public Pair(U f,V s){
        first=f;
        second=s;
    }
}
class Bucket{
    List <Pair<Integer,Integer>> list;
    public Bucket(){
        list=new LinkedList<Pair<Integer,Integer>>();
    }

    public void put(int key, int value){
        for(Pair<Integer,Integer> p: list){
            if(p.first==key){
                p.second=value;
                return;
            }
        }
        list.addFirst(new Pair<>(key,value));
    }
    public int get(int key){
        for(Pair<Integer,Integer> p: list){
            if(p.first==key){
                return p.second;
            }
        }
        return -1;
    }
    public void remove(int key){
         for(Pair<Integer,Integer> p: list){
            if(p.first==key){
                list.remove(p);
                return;
            }
         }  
    }
}


class MyHashMap {
    Bucket[] buckets;
    int keyrange=769;

    public MyHashMap() {
        buckets=new Bucket[769];
        for(int i=0;i<keyrange;i++){
            this.buckets[i]=new Bucket();
        }
    }

    public int getIndex(int key){
        return key%keyrange;
    }
    
    public void put(int key, int value) {
        int bIndex=this.getIndex(key);
        this.buckets[bIndex].put(key,value);
    }
    
    public int get(int key) {
        int bIndex=this.getIndex(key);
        return this.buckets[bIndex].get(key);
    }
    
    public void remove(int key) {
        int bIndex=this.getIndex(key);
        this.buckets[bIndex].remove(key);
    }
}


/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */