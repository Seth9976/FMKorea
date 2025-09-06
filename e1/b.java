package E1;

import com.google.android.material.carousel.CarouselLayoutManager;

public final class b implements Runnable {
    public final CarouselLayoutManager f;

    public b(CarouselLayoutManager carouselLayoutManager0) {
        this.f = carouselLayoutManager0;
    }

    @Override
    public final void run() {
        CarouselLayoutManager.Q1(this.f);
    }
}

