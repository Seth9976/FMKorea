package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

public class g extends View {
    public g(Context context0) {
        super(context0);
        super.setVisibility(8);
    }

    @Override  // android.view.View
    public void draw(Canvas canvas0) {
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        this.setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int v) {
        b constraintLayout$b0 = (b)this.getLayoutParams();
        constraintLayout$b0.a = v;
        this.setLayoutParams(constraintLayout$b0);
    }

    public void setGuidelineEnd(int v) {
        b constraintLayout$b0 = (b)this.getLayoutParams();
        constraintLayout$b0.b = v;
        this.setLayoutParams(constraintLayout$b0);
    }

    public void setGuidelinePercent(float f) {
        b constraintLayout$b0 = (b)this.getLayoutParams();
        constraintLayout$b0.c = f;
        this.setLayoutParams(constraintLayout$b0);
    }

    @Override  // android.view.View
    public void setVisibility(int v) {
    }
}

