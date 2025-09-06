package co.median.android.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation.AnimationListener;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.Y;

class a extends AppCompatImageView {
    class co.median.android.widget.a.a extends OvalShape {
        private RadialGradient f;
        private Paint g;
        final a h;

        co.median.android.widget.a.a(int v) {
            this.g = new Paint();
            a0.j = v;
            this.b(((int)this.rect().width()));
        }

        private void b(int v) {
            RadialGradient radialGradient0 = new RadialGradient(((float)(v / 2)), ((float)(v / 2)), ((float)a.this.j), new int[]{0x3D000000, 0}, null, Shader.TileMode.CLAMP);
            this.f = radialGradient0;
            this.g.setShader(radialGradient0);
        }

        @Override  // android.graphics.drawable.shapes.OvalShape
        public void draw(Canvas canvas0, Paint paint0) {
            int v = a.this.getWidth();
            int v1 = a.this.getHeight();
            float f = (float)(v / 2);
            canvas0.drawCircle(f, ((float)(v1 / 2)), f, this.g);
            canvas0.drawCircle(f, ((float)(v1 / 2)), ((float)(v / 2 - a.this.j)), paint0);
        }

        @Override  // android.graphics.drawable.shapes.RectShape
        protected void onResize(float f, float f1) {
            super.onResize(f, f1);
            this.b(((int)f));
        }
    }

    private Animation.AnimationListener i;
    int j;

    a(Context context0, int v) {
        super(context0);
        float f = this.getContext().getResources().getDisplayMetrics().density;
        this.j = (int)(3.5f * f);
        ShapeDrawable shapeDrawable0 = new ShapeDrawable(new OvalShape());
        Y.w0(this, f * 4.0f);
        shapeDrawable0.getPaint().setColor(v);
        Y.s0(this, shapeDrawable0);
    }

    private boolean c() [...] // Inlined contents

    public void d(Animation.AnimationListener animation$AnimationListener0) {
        this.i = animation$AnimationListener0;
    }

    @Override  // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animation$AnimationListener0 = this.i;
        if(animation$AnimationListener0 != null) {
            animation$AnimationListener0.onAnimationEnd(this.getAnimation());
        }
    }

    @Override  // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animation$AnimationListener0 = this.i;
        if(animation$AnimationListener0 != null) {
            animation$AnimationListener0.onAnimationStart(this.getAnimation());
        }
    }

    @Override  // android.widget.ImageView
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
    }

    @Override  // android.view.View
    public void setBackgroundColor(int v) {
        if(this.getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable)this.getBackground()).getPaint().setColor(v);
        }
    }
}

