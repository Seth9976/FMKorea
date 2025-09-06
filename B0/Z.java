package B0;

import G3.h;
import K0.c;
import K0.d;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.ResolveInfoFlags;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Environment;
import android.os.Parcelable;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video.Media;
import android.util.Log;
import android.webkit.WebChromeClient.FileChooserParams;
import androidx.core.content.FileProvider;
import d.a;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l3.q;
import m3.o;
import w3.b;
import z3.g;
import z3.k;
import z3.t;

public final class z extends a {
    public static final class B0.z.a {
        private B0.z.a() {
        }

        public B0.z.a(g g0) {
        }

        public final boolean a() [...] // 潜在的解密器
    }

    private Context a;
    private c b;
    private Uri c;
    private Uri d;
    private List e;
    private D f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    public static final B0.z.a k;

    static {
        z.k = new B0.z.a(null);
    }

    public z() {
        this.e = new ArrayList();
    }

    @Override  // d.a
    public Intent a(Context context0, Object object0) {
        return this.i(context0, ((D)object0));
    }

    @Override  // d.a
    public Object c(int v, Intent intent0) {
        return this.v(v, intent0);
    }

    private final void d(Intent intent0) {
        Uri uri0 = z.k(this, false, 1, null);
        this.c = uri0;
        intent0.putExtra("output", uri0);
    }

    private final void e(Intent intent0) {
        c c0 = this.b;
        if(c0 == null) {
            k.p("cameraConfig");
            c0 = null;
        }
        if(c0.a() == d.g) {
            intent0.putExtra("android.intent.extra.videoQuality", 1);
        }
        else {
            intent0.putExtra("android.intent.extra.videoQuality", 0);
        }
        Uri uri0 = this.j(true);
        this.d = uri0;
        intent0.putExtra("output", uri0);
    }

    // 去混淆评级： 低(20)
    private final Intent f() {
        return this.q() ? ((Intent)o.r(this.w())) : ((Intent)o.r(this.x()));
    }

    private final Uri g(Uri uri0, String s) {
        OutputStream outputStream0;
        InputStream inputStream0;
        q q0;
        String s1 = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date());
        String s2 = s.toLowerCase(Locale.ROOT);
        k.d(s2, "toLowerCase(...)");
        if(k.a(s2, "image")) {
            q0 = new q("IMG_" + s1 + ".jpg", "image/jpeg", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        }
        else if(k.a(s2, "video")) {
            q0 = new q("VID_" + s1 + ".mp4", "video/mp4", MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
        }
        else {
            throw new IllegalArgumentException("Unsupported media type: " + s);
        }
        String s3 = (String)q0.a();
        String s4 = (String)q0.b();
        Uri uri1 = (Uri)q0.c();
        Context context0 = this.a;
        if(context0 == null) {
            k.p("context");
            context0 = null;
        }
        ContentResolver contentResolver0 = context0.getContentResolver();
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("_display_name", s3);
        contentValues0.put("mime_type", s4);
        contentValues0.put("relative_path", Environment.DIRECTORY_DCIM + "/Camera");
        Uri uri2 = contentResolver0.insert(uri1, contentValues0);
        if(uri2 != null) {
            try {
                Context context1 = this.a;
                if(context1 == null) {
                    k.p("context");
                    context1 = null;
                }
                inputStream0 = context1.getContentResolver().openInputStream(uri0);
                if(inputStream0 == null) {
                    throw new IOException("Failed to open input stream for " + uri0);
                }
            }
            catch(Exception exception0) {
                Log.e("FileUploadContract", "Failed to copy " + s + " to gallery", exception0);
                return uri0;
            }
            Context context2 = this.a;
            if(context2 == null) {
                k.p("context");
                context2 = null;
            }
            outputStream0 = context2.getContentResolver().openOutputStream(uri2);
            if(outputStream0 == null) {
                throw new IOException("Failed to open output stream for " + uri2);
            }
            try {
                w3.a.b(inputStream0, outputStream0, 0, 2, null);
                goto label_41;
            }
            catch(Throwable throwable1) {
                try {
                    b.a(outputStream0, throwable1);
                    throw throwable1;
                label_41:
                    b.a(outputStream0, null);
                    goto label_48;
                }
                catch(Throwable throwable0) {
                }
            }
            try {
                throw throwable0;
            }
            catch(Throwable throwable2) {
                try {
                    b.a(inputStream0, throwable0);
                    throw throwable2;
                label_48:
                    b.a(inputStream0, null);
                    this.l();
                    return uri2;
                }
                catch(Exception exception0) {
                }
            }
            Log.e("FileUploadContract", "Failed to copy " + s + " to gallery", exception0);
        }
        return uri0;
    }

    public final Intent h() {
        Intent intent1;
        ArrayList arrayList0 = new ArrayList();
        if(this.q()) {
            arrayList0.addAll(this.w());
        }
        if(this.y()) {
            arrayList0.addAll(this.x());
        }
        if((this.q() ^ this.y()) != 0) {
            Intent intent0 = this.n();
            intent0.putExtra("android.intent.extra.ALLOW_MULTIPLE", this.g);
            if(this.a == null) {
                k.p("context");
            }
            intent1 = Intent.createChooser(intent0, "Choose an action");
        }
        else if(this.f == null || !this.f.n() || this.s()) {
            Intent intent3 = this.m();
            if(this.a == null) {
                k.p("context");
            }
            intent1 = Intent.createChooser(intent3, "Choose an action");
        }
        else {
            Intent intent2 = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            intent2.setType("image/*, video/*");
            intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", this.g);
            if(this.a == null) {
                k.p("context");
            }
            intent1 = Intent.createChooser(intent2, "Choose an action");
        }
        intent1.putExtra("android.intent.extra.INITIAL_INTENTS", ((Parcelable[])arrayList0.toArray(new Parcelable[0])));
        k.b(intent1);
        return intent1;
    }

    public Intent i(Context context0, D d0) {
        k.e(context0, "context");
        k.e(d0, "input");
        this.a = context0;
        this.f = d0;
        I0.a a0 = I0.a.V(context0);
        this.b = a0.x4;
        this.j = a0.q;
        this.i = d0.k();
        this.h = d0.j();
        this.e = d0.m();
        if(d0.l().getMode() == 1) {
            this.g = true;
        }
        return d0.l().isCaptureEnabled() ? this.f() : this.h();
    }

    private final Uri j(boolean z) {
        Context context0 = this.a;
        if(context0 == null) {
            k.p("context");
            context0 = null;
        }
        File file0 = new File(context0.getCacheDir(), "downloads");
        if(!file0.exists()) {
            file0.mkdirs();
        }
        File file1 = new File(file0, (z ? "temp_video_recording.mp4" : "temp_capture_image.jpg"));
        Context context1 = this.a;
        if(context1 == null) {
            k.p("context");
            context1 = null;
        }
        if(this.a == null) {
            k.p("context");
        }
        Uri uri0 = FileProvider.h(context1, "com.fmkorea.m.fmk.fileprovider", file1);
        k.b(uri0);
        return uri0;
    }

    static Uri k(z z0, boolean z1, int v, Object object0) {
        if((v & 1) != 0) {
            z1 = false;
        }
        return z0.j(z1);
    }

    private final void l() {
        Uri uri0 = this.c;
        if(uri0 != null) {
            Context context0 = this.a;
            if(context0 == null) {
                k.p("context");
                context0 = null;
            }
            context0.getContentResolver().delete(uri0, null, null);
            this.c = null;
        }
        Uri uri1 = this.d;
        if(uri1 != null) {
            Context context1 = this.a;
            if(context1 == null) {
                k.p("context");
                context1 = null;
            }
            context1.getContentResolver().delete(uri1, null, null);
            this.d = null;
        }
    }

    private final Intent m() {
        Intent intent0 = new Intent("android.intent.action.GET_CONTENT");
        intent0.setType(o.w(this.e, ", ", null, null, 0, null, null, 62, null));
        intent0.putExtra("android.intent.extra.MIME_TYPES", ((String[])this.e.toArray(new String[0])));
        intent0.putExtra("android.intent.extra.ALLOW_MULTIPLE", this.g);
        intent0.addCategory("android.intent.category.OPENABLE");
        if(this.u(intent0).isEmpty() && h.n(Build.MANUFACTURER, "samsung", true)) {
            intent0 = new Intent("com.sec.android.app.myfiles.PICK_DATA");
            intent0.putExtra("CONTENT_TYPE", "*/*");
            intent0.addCategory("android.intent.category.DEFAULT");
        }
        return intent0;
    }

    // 去混淆评级： 低(20)
    private final Intent n() {
        return this.q() ? new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI) : new Intent("android.intent.action.PICK", MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
    }

    private final boolean o(Uri uri0, Context context0) {
        try {
            Cursor cursor0 = context0.getContentResolver().query(uri0, new String[]{"_size"}, null, null, null);
            if(cursor0 != null) {
                try {
                    if(cursor0.moveToFirst()) {
                        int v = cursor0.getColumnIndex("_size");
                        if(v >= 0) {
                            if(cursor0.getLong(v) > 0L) {
                                goto label_12;
                            }
                            else {
                                goto label_14;
                            }
                            goto label_15;
                        }
                    }
                    goto label_17;
                }
                catch(Throwable throwable0) {
                    try {
                        throw throwable0;
                    }
                    catch(Throwable throwable1) {
                        b.a(cursor0, throwable0);
                        throw throwable1;
                    }
                }
            label_12:
                boolean z = true;
                goto label_15;
            label_14:
                z = false;
            label_15:
                b.a(cursor0, null);
                return z;
            label_17:
                b.a(cursor0, null);
                return false;
            }
        }
        catch(Exception unused_ex) {
        }
        return false;
    }

    private final boolean p(Uri uri0, Context context0) {
        try {
            InputStream inputStream0 = context0.getContentResolver().openInputStream(uri0);
            if(inputStream0 != null) {
                try {
                    t t0 = new t();
                    while(true) {
                        int v = inputStream0.read(new byte[0x400]);
                        t0.f = v;
                        if(v == -1) {
                            goto label_14;
                        }
                        if(v > 0) {
                            break;
                        }
                    }
                }
                catch(Throwable throwable0) {
                    b.a(inputStream0, throwable0);
                    throw throwable0;
                }
                b.a(inputStream0, null);
                return true;
            label_14:
                b.a(inputStream0, null);
                return false;
            }
        }
        catch(IOException unused_ex) {
        }
        return false;
    }

    private final boolean q() {
        if(!this.i) {
            return false;
        }
        return this.f == null ? false : this.f.g();
    }

    // 去混淆评级： 低(20)
    public static final boolean r() [...] // 潜在的解密器

    private final boolean s() {
        List list0 = this.u(new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI));
        return list0.size() == 1 && k.a(((ResolveInfo)o.r(list0)).activityInfo.packageName, "com.google.android.apps.photos");
    }

    // 去混淆评级： 低(20)
    private final boolean t(Uri uri0, Context context0) {
        return this.o(uri0, context0) || this.p(uri0, context0);
    }

    private final List u(Intent intent0) {
        List list0;
        Context context0 = null;
        if(Build.VERSION.SDK_INT >= 33) {
            Context context1 = this.a;
            if(context1 == null) {
                k.p("context");
            }
            else {
                context0 = context1;
            }
            list0 = context0.getPackageManager().queryIntentActivities(intent0, PackageManager.ResolveInfoFlags.of(0x10000L));
            k.b(list0);
            return list0;
        }
        Context context2 = this.a;
        if(context2 == null) {
            k.p("context");
        }
        else {
            context0 = context2;
        }
        list0 = context0.getPackageManager().queryIntentActivities(intent0, 0x10000);
        k.b(list0);
        return list0;
    }

    public E v(int v, Intent intent0) {
        Uri uri3;
        c c0 = null;
        if(v != -1) {
            this.l();
            return new E(false, null, false, 4, null);
        }
        if(intent0 != null) {
            if(intent0.getData() != null) {
                Uri uri0 = this.d;
                if(uri0 != null) {
                    Context context0 = this.a;
                    if(context0 == null) {
                        k.p("context");
                        context0 = null;
                    }
                    if(this.t(uri0, context0)) {
                        Uri[] arr_uri = WebChromeClient.FileChooserParams.parseResult(-1, intent0);
                        Uri uri1 = arr_uri == null ? null : arr_uri[0];
                        Uri uri2 = uri0.normalizeScheme();
                        if(uri1 == null) {
                            uri3 = Boolean.FALSE;
                        }
                        else {
                            uri3 = uri1.normalizeScheme();
                            if(uri3 == null) {
                                uri3 = Boolean.FALSE;
                            }
                        }
                        if(k.a(uri2, uri3)) {
                            c c1 = this.b;
                            if(c1 == null) {
                                k.p("cameraConfig");
                            }
                            else {
                                c0 = c1;
                            }
                            if(c0.e() && this.h) {
                                uri0 = this.g(uri0, "video");
                            }
                            return new E(true, new Uri[]{uri0}, false, 4, null);
                        }
                    }
                }
                return new E(true, WebChromeClient.FileChooserParams.parseResult(-1, intent0), false, 4, null);
            }
            ClipData clipData0 = intent0.getClipData();
            if(clipData0 != null) {
                D3.c c2 = D3.d.g(0, clipData0.getItemCount());
                ArrayList arrayList0 = new ArrayList();
                Iterator iterator0 = c2.iterator();
                while(iterator0.hasNext()) {
                    Uri uri4 = clipData0.getItemAt(((m3.D)iterator0).a()).getUri();
                    if(uri4 != null) {
                        arrayList0.add(uri4);
                    }
                }
                return new E(true, ((Uri[])arrayList0.toArray(new Uri[0])), false, 4, null);
            }
        }
        Uri uri5 = this.c;
        if(uri5 != null) {
            Context context1 = this.a;
            if(context1 == null) {
                k.p("context");
                context1 = null;
            }
            if(this.t(uri5, context1)) {
                c c3 = this.b;
                if(c3 == null) {
                    k.p("cameraConfig");
                    c3 = null;
                }
                if(c3.e() && this.h) {
                    uri5 = this.g(uri5, "image");
                }
                c c4 = this.b;
                if(c4 == null) {
                    k.p("cameraConfig");
                    throw new NullPointerException();
                }
                return c4.a() == d.f ? new E(true, new Uri[]{uri5}, true) : new E(true, new Uri[]{uri5}, false);
            }
        }
        Uri uri6 = this.d;
        if(uri6 != null) {
            Context context2 = this.a;
            if(context2 == null) {
                k.p("context");
                context2 = null;
            }
            if(this.t(uri6, context2)) {
                c c5 = this.b;
                if(c5 == null) {
                    k.p("cameraConfig");
                }
                else {
                    c0 = c5;
                }
                if(c0.e() && this.h) {
                    uri6 = this.g(uri6, "video");
                }
                return new E(true, new Uri[]{uri6}, false, 4, null);
            }
        }
        this.l();
        return new E(false, null, false, 4, null);
    }

    private final ArrayList w() {
        ArrayList arrayList0 = new ArrayList();
        Context context0 = this.a;
        if(context0 == null) {
            k.p("context");
            context0 = null;
        }
        if(!I0.a.V(context0).q) {
            return arrayList0;
        }
        Intent intent0 = new Intent("android.media.action.IMAGE_CAPTURE");
        this.d(intent0);
        for(Object object0: this.u(intent0)) {
            String s = ((ResolveInfo)object0).activityInfo.packageName;
            Intent intent1 = new Intent(intent0);
            intent1.setComponent(new ComponentName(((ResolveInfo)object0).activityInfo.packageName, ((ResolveInfo)object0).activityInfo.name));
            intent1.setPackage(s);
            arrayList0.add(intent1);
        }
        return arrayList0;
    }

    private final ArrayList x() {
        ArrayList arrayList0 = new ArrayList();
        if(!this.j) {
            return arrayList0;
        }
        Intent intent0 = new Intent("android.media.action.VIDEO_CAPTURE");
        this.e(intent0);
        for(Object object0: this.u(intent0)) {
            String s = ((ResolveInfo)object0).activityInfo.packageName;
            Intent intent1 = new Intent(intent0);
            intent1.setComponent(new ComponentName(((ResolveInfo)object0).activityInfo.packageName, ((ResolveInfo)object0).activityInfo.name));
            intent1.setPackage(s);
            arrayList0.add(intent1);
        }
        return arrayList0;
    }

    private final boolean y() {
        if(!this.i) {
            return false;
        }
        return this.f == null ? false : this.f.i();
    }
}

