package S1;

public class e extends d {
    float a;

    public e() {
        this.a = -1.0f;
    }

    @Override  // S1.d
    public void a(m m0, float f, float f1, float f2) {
        m0.o(0.0f, f2 * f1, 180.0f, 180.0f - f);
        m0.m(((float)(Math.sin(Math.toRadians(f)) * ((double)f2) * ((double)f1))), ((float)(Math.sin(Math.toRadians(90.0f - f)) * ((double)f2) * ((double)f1))));
    }
}

