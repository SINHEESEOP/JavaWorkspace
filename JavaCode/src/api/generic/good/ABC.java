package api.generic.good;

public class ABC <T> {

    //<타입> 처럼 사용함
    private T t;

    //alt + shift + s
    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

}
