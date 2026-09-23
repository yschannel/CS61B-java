package demo.ch3;

public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r){
        this.first = f;
        this.rest = r;
    }

    /* Returns the size of the List using... recursion!*/
    public int size(){
        if(this.rest == null){
            return 1;
        }
        return 1 + this.rest.size();
    }

    /* Returns the size of the list using no recursion! */
    public int iterativeSize(){
        int totalSize = 0;
        IntList p = this;
        while(p != null){
            totalSize ++;
            p = p.rest;
        }
        return totalSize;
    }

    /* Returns the i'th item in the list. */
    public int get(int i){
        if(i == 0) {
            return first;
        }
        return this.rest.get(i - 1);
    }

    public static void main(String[] args){
        IntList L = new IntList(15, null);
        L = new IntList(10, L);
        L = new IntList(5, L);

        System.out.println(L.size());
        System.out.println(L.iterativeSize());
        System.out.println(L.get(1));
    }


}
