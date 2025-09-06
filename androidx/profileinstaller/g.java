package androidx.profileinstaller;

enum g {
    DEX_FILES(0L),
    EXTRA_DESCRIPTORS(1L),
    CLASSES(2L),
    METHODS(3L),
    AGGREGATION_COUNT(4L);

    private final long f;

    private g(long v1) {
        this.f = v1;
    }

    private static g[] b() [...] // Inlined contents

    public long f() {
        return this.f;
    }
}

