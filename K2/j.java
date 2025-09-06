package K2;

import w2.f;

public enum j implements f {
    EVENT_TYPE_UNKNOWN(0),
    SESSION_START(1);

    private final int f;

    private j(int v1) {
        this.f = v1;
    }

    @Override  // w2.f
    public int a() {
        return this.f;
    }

    private static final j[] b() [...] // Inlined contents
}

