package K2;

import w2.f;

public enum m implements f {
    LOG_ENVIRONMENT_UNKNOWN(0),
    LOG_ENVIRONMENT_AUTOPUSH(1),
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);

    private final int f;

    private m(int v1) {
        this.f = v1;
    }

    @Override  // w2.f
    public int a() {
        return this.f;
    }

    private static final m[] b() [...] // Inlined contents
}

