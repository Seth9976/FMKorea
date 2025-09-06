package co.median.android.widget;

public final class h implements Runnable {
    public final MedianProgressView f;

    public h(MedianProgressView medianProgressView0) {
        this.f = medianProgressView0;
    }

    @Override
    public final void run() {
        MedianProgressView.c(this.f);
    }
}

