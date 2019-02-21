package Java1;

public class Singleton {

    int a;
    Singleton s;

    private Singleton() {
    }

    public Singleton create(){
        if(null==s){
            s = new Singleton();
        }
        return s;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
