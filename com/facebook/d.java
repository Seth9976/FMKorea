package com.facebook;

public class d extends e {
    private int f;
    private String g;
    static final long serialVersionUID = 1L;

    public d(String s, int v, String s1) {
        super(s);
        this.f = v;
        this.g = s1;
    }

    public int a() {
        return this.f;
    }

    public String b() {
        return this.g;
    }

    // 去混淆评级： 低(20)
    @Override  // com.facebook.e
    public final String toString() {
        return "{FacebookDialogException: errorCode: " + this.a() + ", message: " + this.getMessage() + ", url: " + this.b() + "}";
    }
}

