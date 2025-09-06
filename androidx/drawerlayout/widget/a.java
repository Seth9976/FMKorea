package androidx.drawerlayout.widget;

public final class a implements Runnable {
    public final DrawerLayout f;

    public a(DrawerLayout drawerLayout0) {
        this.f = drawerLayout0;
    }

    @Override
    public final void run() {
        this.f.j();
    }
}

