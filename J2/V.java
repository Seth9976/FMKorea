package j2;

public enum v {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);

    private final int f;

    private v(int v1) {
        this.f = v1;
    }

    public static v b(String s) {
        return s == null ? v.g : v.j;
    }

    public int f() {
        return this.f;
    }

    @Override
    public String toString() {
        return Integer.toString(this.f);
    }
}

