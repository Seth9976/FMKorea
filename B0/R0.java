package B0;

import I3.I;
import I3.J;
import I3.W;
import I3.g;
import I3.i;
import android.content.Context;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import l3.o;
import l3.u;
import p3.f;
import y3.p;
import z3.k;

public final class r0 {
    public static final r0 a;

    static {
        r0.a = new r0();
    }

    public static final Uri a(Context context0, File file0) {
        k.e(context0, "context");
        k.e(file0, "file");
        Uri uri0 = FileProvider.h(context0, "com.fmkorea.m.fmk.fileprovider", file0);
        k.d(uri0, "getUriForFile(...)");
        return uri0;
    }

    public static final void b(Context context0, Uri uri0, r r0) {
        static final class a extends r3.k implements p {
            int j;
            final Context k;
            final Uri l;
            final r m;

            a(Context context0, Uri uri0, r r0, f f0) {
                this.k = context0;
                this.l = uri0;
                this.m = r0;
                super(2, f0);
            }

            @Override  // y3.p
            public Object k(Object object0, Object object1) {
                return this.w(((I)object0), ((f)object1));
            }

            @Override  // r3.a
            public final f q(Object object0, f f0) {
                return new a(this.k, this.l, this.m, f0);
            }

            @Override  // r3.a
            public final Object t(Object object0) {
                static final class B0.r0.a.a extends r3.k implements p {
                    int j;
                    final r k;

                    B0.r0.a.a(r r0, f f0) {
                        this.k = r0;
                        super(2, f0);
                    }

                    @Override  // y3.p
                    public Object k(Object object0, Object object1) {
                        return this.w(((I)object0), ((f)object1));
                    }

                    @Override  // r3.a
                    public final f q(Object object0, f f0) {
                        return new B0.r0.a.a(this.k, f0);
                    }

                    @Override  // r3.a
                    public final Object t(Object object0) {
                        if(this.j != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        o.b(object0);
                        r r0 = this.k;
                        if(r0 != null) {
                            r0.onFailure(new Exception("Failed to decode image"));
                            return u.a;
                        }
                        return null;
                    }

                    public final Object w(I i0, f f0) {
                        return ((B0.r0.a.a)this.q(i0, f0)).t(u.a);
                    }
                }


                static final class b extends r3.k implements p {
                    int j;
                    final r k;
                    final Context l;
                    final File m;

                    b(r r0, Context context0, File file0, f f0) {
                        this.k = r0;
                        this.l = context0;
                        this.m = file0;
                        super(2, f0);
                    }

                    @Override  // y3.p
                    public Object k(Object object0, Object object1) {
                        return this.w(((I)object0), ((f)object1));
                    }

                    @Override  // r3.a
                    public final f q(Object object0, f f0) {
                        return new b(this.k, this.l, this.m, f0);
                    }

                    @Override  // r3.a
                    public final Object t(Object object0) {
                        if(this.j != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        o.b(object0);
                        r r0 = this.k;
                        if(r0 != null) {
                            r0.a(r0.a(this.l, this.m));
                            return u.a;
                        }
                        return null;
                    }

                    public final Object w(I i0, f f0) {
                        return ((b)this.q(i0, f0)).t(u.a);
                    }
                }


                static final class c extends r3.k implements p {
                    int j;
                    final r k;
                    final Exception l;

                    c(r r0, Exception exception0, f f0) {
                        this.k = r0;
                        this.l = exception0;
                        super(2, f0);
                    }

                    @Override  // y3.p
                    public Object k(Object object0, Object object1) {
                        return this.w(((I)object0), ((f)object1));
                    }

                    @Override  // r3.a
                    public final f q(Object object0, f f0) {
                        return new c(this.k, this.l, f0);
                    }

                    @Override  // r3.a
                    public final Object t(Object object0) {
                        if(this.j != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        o.b(object0);
                        r r0 = this.k;
                        if(r0 != null) {
                            r0.onFailure(this.l);
                            return u.a;
                        }
                        return null;
                    }

                    public final Object w(I i0, f f0) {
                        return ((c)this.q(i0, f0)).t(u.a);
                    }
                }

                FileOutputStream fileOutputStream0;
                File file1;
                Bitmap bitmap1;
                Bitmap bitmap0;
                InputStream inputStream0;
                Object object1 = q3.b.c();
                try {
                    switch(this.j) {
                        case 0: {
                            goto label_5;
                        }
                        case 1: {
                            goto label_3;
                        }
                        case 2: {
                            goto label_52;
                        }
                        case 3: {
                            goto label_61;
                        }
                    }
                }
                catch(Exception exception0) {
                    goto label_56;
                }
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                try {
                label_3:
                    o.b(object0);
                    return u.a;
                }
                catch(Exception exception0) {
                    goto label_56;
                }
            label_5:
                o.b(object0);
                try {
                    inputStream0 = this.k.getContentResolver().openInputStream(this.l);
                    if(inputStream0 == null) {
                        bitmap0 = null;
                        goto label_16;
                    }
                }
                catch(Exception exception0) {
                    goto label_56;
                }
                try {
                    bitmap0 = BitmapFactory.decodeStream(inputStream0);
                    goto label_15;
                }
                catch(Throwable throwable0) {
                    try {
                        w3.b.a(inputStream0, throwable0);
                        throw throwable0;
                    label_15:
                        w3.b.a(inputStream0, null);
                    label_16:
                        if(bitmap0 == null) {
                            B0.r0.a.a r0$a$a0 = new B0.r0.a.a(this.m, null);
                            this.j = 1;
                            return g.g(W.c(), r0$a$a0, this) == object1 ? object1 : u.a;
                        }
                        int v = bitmap0.getWidth();
                        int v1 = bitmap0.getHeight();
                        boolean z = v1 > v;
                        int v2 = z ? v : v1;
                        if(z) {
                            v = v1;
                        }
                        int v3 = (int)(((float)v) * (480.0f / ((float)v2)));
                        int v4 = z ? 480 : v3;
                        if(!z) {
                            v3 = 480;
                        }
                        bitmap1 = Bitmap.createScaledBitmap(bitmap0, v4, v3, true);
                        k.d(bitmap1, "createScaledBitmap(...)");
                        if(!bitmap0.isRecycled()) {
                            bitmap0.recycle();
                        }
                        File file0 = new File(this.k.getCacheDir(), "downloads");
                        if(!file0.exists()) {
                            file0.mkdirs();
                        }
                        file1 = new File(file0, "temp_capture_image.jpg");
                        fileOutputStream0 = new FileOutputStream(file1);
                    }
                    catch(Exception exception0) {
                        goto label_56;
                    }
                }
                try {
                    bitmap1.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream0);
                    goto label_46;
                }
                catch(Throwable throwable1) {
                    try {
                        w3.b.a(fileOutputStream0, throwable1);
                        throw throwable1;
                    label_46:
                        w3.b.a(fileOutputStream0, null);
                        b r0$a$b0 = new b(this.m, this.k, file1, null);
                        this.j = 2;
                        object0 = g.g(W.c(), r0$a$b0, this);
                        if(object0 == object1) {
                            return object1;
                        label_52:
                            o.b(object0);
                        }
                        u u0 = (u)object0;
                        return u.a;
                    }
                    catch(Exception exception0) {
                    }
                }
            label_56:
                c r0$a$c0 = new c(this.m, exception0, null);
                this.j = 3;
                object0 = g.g(W.c(), r0$a$c0, this);
                if(object0 == object1) {
                    return object1;
                label_61:
                    o.b(object0);
                }
                u u1 = (u)object0;
                return u.a;
            }

            public final Object w(I i0, f f0) {
                return ((a)this.q(i0, f0)).t(u.a);
            }
        }

        k.e(context0, "context");
        k.e(uri0, "imageUri");
        i.d(J.a(W.b()), null, null, new a(context0, uri0, r0, null), 3, null);
    }
}

