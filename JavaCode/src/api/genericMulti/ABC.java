package api.genericMulti;

public class ABC <A, B>{
    // multi generic (A, B를 타입으로 사용가능
    // 타입 갯수를 더 늘릴 수 있다. A, B, C, D 등등등
    // 반대로 키 벨류 처럼 사용가능.
    /*
    * 1. 각 타입마다 그냥 만들어놓고
    * 2. 각 타입에 벨류 저장하고
    * 3. 꺼낼때 그 타입만 꺼내는거 불가능?
     */

    private A Key;
    private B value;

    public A getKey() {
        return Key;
    }

    public B getValue() {
        return value;
    }

    public void setData(A key, B value) {
        this.Key = key;
        this.value = value;
    }

    // 아니 왜 밸류를 받는데 키를 받지?
    public B getValue(A Key) {
        return value;
    }

}
