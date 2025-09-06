package p;

public class a {
    String a;
    static a b;
    public static String[] c;

    static {
        a.b = new a();
        a.c = new String[]{"standard", "accelerate", "decelerate", "linear"};
    }

    public a() {
        this.a = "identity";
    }

    @Override
    public String toString() {
        return this.a;
    }
}

