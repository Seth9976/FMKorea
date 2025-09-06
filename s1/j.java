package S1;

public class j extends d {
    float a;

    public j() {
        this.a = -1.0f;
    }

    @Override  // S1.d
    public void a(m m0, float f, float f1, float f2) {
        m0.o(0.0f, f2 * f1, 180.0f, 180.0f - f);
        float f3 = f2 * 2.0f * f1;
        m0.a(0.0f, 0.0f, f3, f3, 180.0f, f);
    }
}

