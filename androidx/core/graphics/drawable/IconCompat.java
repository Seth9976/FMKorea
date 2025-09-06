package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

public class IconCompat extends CustomVersionedParcelable {
    static abstract class a {
        static int a(Object object0) {
            if(Build.VERSION.SDK_INT >= 28) {
                return c.a(object0);
            }
            try {
                return (int)(((Integer)object0.getClass().getMethod("getResId", null).invoke(object0, null)));
            }
            catch(IllegalAccessException illegalAccessException0) {
                Log.e("IconCompat", "Unable to get icon resource", illegalAccessException0);
                return 0;
            }
            catch(InvocationTargetException invocationTargetException0) {
                Log.e("IconCompat", "Unable to get icon resource", invocationTargetException0);
                return 0;
            }
            catch(NoSuchMethodException noSuchMethodException0) {
                Log.e("IconCompat", "Unable to get icon resource", noSuchMethodException0);
                return 0;
            }
        }

        static String b(Object object0) {
            if(Build.VERSION.SDK_INT >= 28) {
                return c.b(object0);
            }
            try {
                return (String)object0.getClass().getMethod("getResPackage", null).invoke(object0, null);
            }
            catch(IllegalAccessException illegalAccessException0) {
                Log.e("IconCompat", "Unable to get icon package", illegalAccessException0);
                return null;
            }
            catch(InvocationTargetException invocationTargetException0) {
                Log.e("IconCompat", "Unable to get icon package", invocationTargetException0);
                return null;
            }
            catch(NoSuchMethodException noSuchMethodException0) {
                Log.e("IconCompat", "Unable to get icon package", noSuchMethodException0);
                return null;
            }
        }

        static int c(Object object0) {
            if(Build.VERSION.SDK_INT >= 28) {
                return c.c(object0);
            }
            try {
                return (int)(((Integer)object0.getClass().getMethod("getType", null).invoke(object0, null)));
            }
            catch(IllegalAccessException illegalAccessException0) {
                Log.e("IconCompat", "Unable to get icon type " + object0, illegalAccessException0);
                return -1;
            }
            catch(InvocationTargetException invocationTargetException0) {
                Log.e("IconCompat", "Unable to get icon type " + object0, invocationTargetException0);
                return -1;
            }
            catch(NoSuchMethodException noSuchMethodException0) {
                Log.e("IconCompat", "Unable to get icon type " + object0, noSuchMethodException0);
                return -1;
            }
        }

        static Uri d(Object object0) {
            if(Build.VERSION.SDK_INT >= 28) {
                return c.d(object0);
            }
            try {
                return (Uri)object0.getClass().getMethod("getUri", null).invoke(object0, null);
            }
            catch(IllegalAccessException illegalAccessException0) {
                Log.e("IconCompat", "Unable to get icon uri", illegalAccessException0);
                return null;
            }
            catch(InvocationTargetException invocationTargetException0) {
                Log.e("IconCompat", "Unable to get icon uri", invocationTargetException0);
                return null;
            }
            catch(NoSuchMethodException noSuchMethodException0) {
                Log.e("IconCompat", "Unable to get icon uri", noSuchMethodException0);
                return null;
            }
        }

        static Drawable e(Icon icon0, Context context0) {
            return icon0.loadDrawable(context0);
        }

        static Icon f(IconCompat iconCompat0, Context context0) {
            Icon icon0;
            switch(iconCompat0.a) {
                case -1: {
                    return (Icon)iconCompat0.b;
                }
                case 1: {
                    icon0 = Icon.createWithBitmap(((Bitmap)iconCompat0.b));
                    goto label_24;
                }
                case 2: {
                    icon0 = Icon.createWithResource(iconCompat0.f(), iconCompat0.e);
                    goto label_24;
                }
                case 3: {
                    icon0 = Icon.createWithData(((byte[])iconCompat0.b), iconCompat0.e, iconCompat0.f);
                    goto label_24;
                }
                case 4: {
                    icon0 = Icon.createWithContentUri(((String)iconCompat0.b));
                    goto label_24;
                }
                case 5: {
                    if(Build.VERSION.SDK_INT >= 26) {
                        icon0 = b.b(((Bitmap)iconCompat0.b));
                        goto label_24;
                    }
                    icon0 = Icon.createWithBitmap(IconCompat.a(((Bitmap)iconCompat0.b), false));
                    goto label_24;
                }
                case 6: {
                    int v = Build.VERSION.SDK_INT;
                    if(v >= 30) {
                        icon0 = d.a(iconCompat0.h());
                    }
                    else {
                        if(context0 == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat0.h());
                        }
                        InputStream inputStream0 = iconCompat0.i(context0);
                        if(inputStream0 == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat0.h());
                        }
                        icon0 = v < 26 ? Icon.createWithBitmap(IconCompat.a(BitmapFactory.decodeStream(inputStream0), false)) : b.b(BitmapFactory.decodeStream(inputStream0));
                    }
                label_24:
                    ColorStateList colorStateList0 = iconCompat0.g;
                    if(colorStateList0 != null) {
                        icon0.setTintList(colorStateList0);
                    }
                    PorterDuff.Mode porterDuff$Mode0 = iconCompat0.h;
                    if(porterDuff$Mode0 != IconCompat.k) {
                        icon0.setTintMode(porterDuff$Mode0);
                    }
                    return icon0;
                }
                default: {
                    throw new IllegalArgumentException("Unknown type");
                }
            }
        }
    }

    static abstract class b {
        static Drawable a(Drawable drawable0, Drawable drawable1) {
            return new AdaptiveIconDrawable(drawable0, drawable1);
        }

        static Icon b(Bitmap bitmap0) {
            return Icon.createWithAdaptiveBitmap(bitmap0);
        }
    }

    static abstract class c {
        static int a(Object object0) {
            return ((Icon)object0).getResId();
        }

        static String b(Object object0) {
            return ((Icon)object0).getResPackage();
        }

        static int c(Object object0) {
            return ((Icon)object0).getType();
        }

        static Uri d(Object object0) {
            return ((Icon)object0).getUri();
        }
    }

    static abstract class d {
        static Icon a(Uri uri0) {
            return Icon.createWithAdaptiveBitmapContentUri(uri0);
        }
    }

    public int a;
    Object b;
    public byte[] c;
    public Parcelable d;
    public int e;
    public int f;
    public ColorStateList g;
    PorterDuff.Mode h;
    public String i;
    public String j;
    static final PorterDuff.Mode k;

    static {
        IconCompat.k = PorterDuff.Mode.SRC_IN;
    }

    public IconCompat() {
        this.a = -1;
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.g = null;
        this.h = IconCompat.k;
        this.i = null;
    }

    IconCompat(int v) {
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.g = null;
        this.h = IconCompat.k;
        this.i = null;
        this.a = v;
    }

    static Bitmap a(Bitmap bitmap0, boolean z) {
        int v = (int)(((float)Math.min(bitmap0.getWidth(), bitmap0.getHeight())) * 0.666667f);
        Bitmap bitmap1 = Bitmap.createBitmap(v, v, Bitmap.Config.ARGB_8888);
        Canvas canvas0 = new Canvas(bitmap1);
        Paint paint0 = new Paint(3);
        float f = 0.5f * ((float)v);
        if(z) {
            paint0.setColor(0);
            paint0.setShadowLayer(0.010417f * ((float)v), 0.0f, ((float)v) * 0.020833f, 0x3D000000);
            canvas0.drawCircle(f, f, 0.916667f * f, paint0);
            paint0.setShadowLayer(0.010417f * ((float)v), 0.0f, 0.0f, 0x1E000000);
            canvas0.drawCircle(f, f, 0.916667f * f, paint0);
            paint0.clearShadowLayer();
        }
        paint0.setColor(0xFF000000);
        BitmapShader bitmapShader0 = new BitmapShader(bitmap0, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        Matrix matrix0 = new Matrix();
        matrix0.setTranslate(((float)(-(bitmap0.getWidth() - v))) / 2.0f, ((float)(-(bitmap0.getHeight() - v))) / 2.0f);
        bitmapShader0.setLocalMatrix(matrix0);
        paint0.setShader(bitmapShader0);
        canvas0.drawCircle(f, f, 0.916667f * f, paint0);
        canvas0.setBitmap(null);
        return bitmap1;
    }

    public static IconCompat b(Bitmap bitmap0) {
        B.c.c(bitmap0);
        IconCompat iconCompat0 = new IconCompat(1);
        iconCompat0.b = bitmap0;
        return iconCompat0;
    }

    public static IconCompat c(Resources resources0, String s, int v) {
        B.c.c(s);
        if(v == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat0 = new IconCompat(2);
        iconCompat0.e = v;
        if(resources0 == null) {
            iconCompat0.b = s;
        }
        else {
            try {
                iconCompat0.b = resources0.getResourceName(v);
            }
            catch(Resources.NotFoundException unused_ex) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        }
        iconCompat0.j = s;
        return iconCompat0;
    }

    public Bitmap d() {
        int v = this.a;
        if(v == -1) {
            return this.b instanceof Bitmap ? ((Bitmap)this.b) : null;
        }
        switch(v) {
            case 1: {
                return (Bitmap)this.b;
            }
            case 5: {
                return IconCompat.a(((Bitmap)this.b), true);
            }
            default: {
                throw new IllegalStateException("called getBitmap() on " + this);
            }
        }
    }

    public int e() {
        int v = this.a;
        if(v == -1) {
            return a.a(this.b);
        }
        if(v != 2) {
            throw new IllegalStateException("called getResId() on " + this);
        }
        return this.e;
    }

    public String f() {
        int v = this.a;
        if(v == -1) {
            return a.b(this.b);
        }
        if(v != 2) {
            throw new IllegalStateException("called getResPackage() on " + this);
        }
        return this.j == null || TextUtils.isEmpty(this.j) ? ((String)this.b).split(":", -1)[0] : this.j;
    }

    public int g() {
        return this.a == -1 ? a.c(this.b) : this.a;
    }

    public Uri h() {
        int v = this.a;
        if(v == -1) {
            return a.d(this.b);
        }
        if(v != 4 && v != 6) {
            throw new IllegalStateException("called getUri() on " + this);
        }
        return Uri.parse(((String)this.b));
    }

    public InputStream i(Context context0) {
        Uri uri0 = this.h();
        String s = uri0.getScheme();
        if(!"content".equals(s) && !"file".equals(s)) {
            try {
                return new FileInputStream(new File(((String)this.b)));
            }
            catch(FileNotFoundException fileNotFoundException0) {
                Log.w("IconCompat", "Unable to load image from path: " + uri0, fileNotFoundException0);
                return null;
            }
        }
        try {
            return context0.getContentResolver().openInputStream(uri0);
        }
        catch(Exception exception0) {
            Log.w("IconCompat", "Unable to load image from URI: " + uri0, exception0);
            return null;
        }
    }

    public void j() {
        this.h = PorterDuff.Mode.valueOf(this.i);
        switch(this.a) {
            case -1: {
                Parcelable parcelable0 = this.d;
                if(parcelable0 == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.b = parcelable0;
                return;
            }
            case 3: {
                this.b = this.c;
                return;
            }
            case 1: 
            case 5: {
                Parcelable parcelable1 = this.d;
                if(parcelable1 != null) {
                    this.b = parcelable1;
                    return;
                }
                this.b = this.c;
                this.a = 3;
                this.e = 0;
                this.f = this.c.length;
                return;
            }
            case 2: 
            case 4: 
            case 6: {
                String s = new String(this.c, Charset.forName("UTF-16"));
                this.b = s;
                if(this.a == 2 && this.j == null) {
                    this.j = s.split(":", -1)[0];
                }
            }
        }
    }

    public void k(boolean z) {
        this.i = this.h.name();
        switch(this.a) {
            case -1: {
                if(z) {
                    throw new IllegalArgumentException("Can\'t serialize Icon created with IconCompat#createFromIcon");
                }
                this.d = (Parcelable)this.b;
                return;
            }
            case 2: {
                this.c = ((String)this.b).getBytes(Charset.forName("UTF-16"));
                return;
            }
            case 3: {
                this.c = (byte[])this.b;
                return;
            }
            case 1: 
            case 5: {
                if(z) {
                    Bitmap bitmap0 = (Bitmap)this.b;
                    ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                    bitmap0.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream0);
                    this.c = byteArrayOutputStream0.toByteArray();
                    return;
                }
                this.d = (Parcelable)this.b;
                return;
            }
            case 4: 
            case 6: {
                this.c = this.b.toString().getBytes(Charset.forName("UTF-16"));
            }
        }
    }

    public Icon l() {
        return this.m(null);
    }

    public Icon m(Context context0) {
        return a.f(this, context0);
    }

    private static String n(int v) {
        switch(v) {
            case 1: {
                return "BITMAP";
            }
            case 2: {
                return "RESOURCE";
            }
            case 3: {
                return "DATA";
            }
            case 4: {
                return "URI";
            }
            case 5: {
                return "BITMAP_MASKABLE";
            }
            case 6: {
                return "URI_MASKABLE";
            }
            default: {
                return "UNKNOWN";
            }
        }
    }

    @Override
    public String toString() {
        if(this.a == -1) {
            return String.valueOf(this.b);
        }
        StringBuilder stringBuilder0 = new StringBuilder("Icon(typ=");
        stringBuilder0.append(IconCompat.n(this.a));
        switch(this.a) {
            case 2: {
                stringBuilder0.append(" pkg=");
                stringBuilder0.append(this.j);
                stringBuilder0.append(" id=");
                stringBuilder0.append(String.format("0x%08x", this.e()));
                break;
            }
            case 3: {
                stringBuilder0.append(" len=");
                stringBuilder0.append(this.e);
                if(this.f != 0) {
                    stringBuilder0.append(" off=");
                    stringBuilder0.append(this.f);
                }
                break;
            }
            case 1: 
            case 5: {
                stringBuilder0.append(" size=");
                stringBuilder0.append(((Bitmap)this.b).getWidth());
                stringBuilder0.append("x");
                stringBuilder0.append(((Bitmap)this.b).getHeight());
                break;
            }
            case 4: 
            case 6: {
                stringBuilder0.append(" uri=");
                stringBuilder0.append(this.b);
            }
        }
        if(this.g != null) {
            stringBuilder0.append(" tint=");
            stringBuilder0.append(this.g);
        }
        if(this.h != IconCompat.k) {
            stringBuilder0.append(" mode=");
            stringBuilder0.append(this.h);
        }
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

