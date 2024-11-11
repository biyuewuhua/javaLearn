package practiceIntpair;
public class Pair<T> {
    protected T first;
    protected T last;
    public Pair(Class<T> clazz) throws Exception  {
    	this.first = clazz.newInstance();
    	this.last = clazz.newInstance();
    			}
    public Pair(T first, T last) {
        this.first = first;
        this.last = last;
    }
    public T getFirst() {
        return first;
    }
    public T getLast() {
        return last;
    }
    public boolean same(T t) {
    	return this == t;
    }
}