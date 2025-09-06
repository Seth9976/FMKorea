package z2;

public interface j {
    public static enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);

        private final int f;

        private a(int v1) {
            this.f = v1;
        }

        public int b() {
            return this.f;
        }
    }

    a b(String arg1);
}

