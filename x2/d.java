package x2;

public @interface d {
    public static enum a {
        DEFAULT,
        SIGNED,
        FIXED;

    }

    a intEncoding() default a.f;

    int tag();
}

