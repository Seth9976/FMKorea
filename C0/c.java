package C0;

import android.content.Context;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import org.json.JSONObject;
import w3.h;
import z3.k;

public class c {
    private final Context a;
    private final String b;
    private final int c;
    private final int d;
    private final String e;
    private a f;
    private final String g;
    private final File h;

    public c(Context context0, String s, int v, int v1) {
        k.e(context0, "context");
        k.e(s, "iconName");
        super();
        this.a = context0;
        this.b = s;
        this.c = v;
        this.d = v1;
        this.e = "c";
        a a0 = b.a.a(s);
        this.f = a0;
        this.g = this.d(s, a0);
        this.h = this.a();
    }

    private final File a() {
        String s = k.k(this.a.getCacheDir().getAbsolutePath(), "/");
        float f = this.a.getResources().getDisplayMetrics().density;
        String s1 = Integer.toString((this.f.h() + ':' + this.b + ':' + this.d).hashCode(), G3.a.a(0x20));
        k.d(s1, "toString(this, checkRadix(radix))");
        return new File(s + s1 + '_' + this.c + ('@' + f + 'x') + ".png");
    }

    // 去混淆评级： 低(20)
    private final String b() {
        this.f = a.d.d();
        k.d("", "format(format, *args)");
        return "";
    }

    public final Drawable c() {
        if(!this.h.exists()) {
            try {
                this.e();
                return Drawable.createFromPath(this.h.getPath());
            }
            catch(Exception exception0) {
                Log.w(this.e, "getDrawable: Error occurred while saving image for iconName " + this.b, exception0);
                return this.a.getDrawable(d.a);
            }
        }
        return Drawable.createFromPath(this.h.getPath());
    }

    private final String d(String s, a a0) {
        String s1;
        BufferedReader bufferedReader0;
        if(a0 == null) {
            return this.b();
        }
        try {
            InputStream inputStream0 = this.a.getAssets().open(k.k(a0.i(), ".json"));
            k.d(inputStream0, "context.assets.open(font…yphMapFile.plus(\".json\"))");
            bufferedReader0 = new BufferedReader(new InputStreamReader(inputStream0, G3.d.b), 0x2000);
        }
        catch(Exception exception0) {
            Log.e(this.e, "glyphForIconName: ", exception0);
            return this.b();
        }
        try {
            s1 = h.c(bufferedReader0);
            goto label_10;
        }
        catch(Throwable throwable0) {
            try {
                w3.b.a(bufferedReader0, throwable0);
                throw throwable0;
            label_10:
                w3.b.a(bufferedReader0, null);
                JSONObject jSONObject0 = new JSONObject(s1);
                if(!G3.h.x(s, "-", false, 2, null)) {
                    return this.b();
                }
                String s2 = s.substring(G3.h.F(s, "-", 0, false, 6, null) + 1);
                k.d(s2, "this as java.lang.String).substring(startIndex)");
                if(jSONObject0.optLong(s2) == 0L) {
                    return this.b();
                }
                String s3 = String.format("%s", Arrays.copyOf(new Object[]{Character.valueOf(((char)(((int)jSONObject0.getLong(s2)))))}, 1));
                k.d(s3, "format(format, *args)");
                return s3;
            }
            catch(Exception exception0) {
            }
        }
        Log.e(this.e, "glyphForIconName: ", exception0);
        return this.b();
    }

    private final void e() {
        DisplayMetrics displayMetrics0 = this.a.getResources().getDisplayMetrics();
        float f = TypedValue.applyDimension(2, ((float)this.c), displayMetrics0);
        if(k.a(this.f.h(), "fonts/materialdesign_regular.ttf") || k.a(this.f.h(), "fonts/custom-icons.ttf")) {
            f *= 1.5f;
        }
        TextPaint textPaint0 = new TextPaint();
        textPaint0.setColor(this.d);
        textPaint0.setTextSize(f);
        textPaint0.setAntiAlias(true);
        if(!k.a(this.g, "?")) {
            textPaint0.setTypeface(Typeface.createFromAsset(this.a.getAssets(), this.f.h()));
        }
        Rect rect0 = new Rect();
        textPaint0.getTextBounds(this.g, 0, this.g.length(), rect0);
        Bitmap bitmap0 = Bitmap.createBitmap(rect0.width() + 5, rect0.height() + 5, Bitmap.Config.ARGB_8888);
        k.d(bitmap0, "createBitmap(canvasWidth… Bitmap.Config.ARGB_8888)");
        Canvas canvas0 = new Canvas(bitmap0);
        float f1 = ((float)(bitmap0.getWidth() - rect0.width())) / 2.0f - ((float)rect0.left);
        int v = bitmap0.getHeight();
        int v1 = rect0.height();
        canvas0.drawText(this.g, f1, ((float)(v - v1)) / 2.0f - ((float)rect0.top), textPaint0);
        FileOutputStream fileOutputStream0 = new FileOutputStream(this.h);
        try {
            bitmap0.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream0);
            fileOutputStream0.flush();
        }
        catch(Throwable throwable0) {
            w3.b.a(fileOutputStream0, throwable0);
            throw throwable0;
        }
        w3.b.a(fileOutputStream0, null);
    }
}

