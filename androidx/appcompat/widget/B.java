package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

class b extends Drawable {
    static abstract class a {
        public static void a(Drawable drawable0, Outline outline0) {
            drawable0.getOutline(outline0);
        }
    }

    final ActionBarContainer a;

    public b(ActionBarContainer actionBarContainer0) {
        this.a = actionBarContainer0;
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(Canvas canvas0) {
        ActionBarContainer actionBarContainer0 = this.a;
        if(actionBarContainer0.m) {
            Drawable drawable0 = actionBarContainer0.l;
            if(drawable0 != null) {
                drawable0.draw(canvas0);
            }
        }
        else {
            Drawable drawable1 = actionBarContainer0.j;
            if(drawable1 != null) {
                drawable1.draw(canvas0);
            }
            Drawable drawable2 = this.a.k;
            if(drawable2 != null && this.a.n) {
                drawable2.draw(canvas0);
            }
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override  // android.graphics.drawable.Drawable
    public void getOutline(Outline outline0) {
        ActionBarContainer actionBarContainer0 = this.a;
        if(!actionBarContainer0.m) {
            Drawable drawable0 = actionBarContainer0.j;
            if(drawable0 != null) {
                a.a(drawable0, outline0);
            }
        }
        else if(actionBarContainer0.l != null) {
            a.a(actionBarContainer0.j, outline0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter0) {
    }
}

