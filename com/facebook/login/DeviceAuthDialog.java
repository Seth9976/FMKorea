package com.facebook.login;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.c;
import com.facebook.AccessToken;
import com.facebook.FacebookActivity;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.appevents.m;
import com.facebook.common.d;
import com.facebook.h;
import com.facebook.internal.A;
import com.facebook.internal.F.b;
import com.facebook.internal.F;
import com.facebook.internal.G;
import com.facebook.internal.r;
import com.facebook.l;
import com.facebook.n;
import com.facebook.o;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public class DeviceAuthDialog extends c {
    static class RequestState implements Parcelable {
        static final class a implements Parcelable.Creator {
            public RequestState a(Parcel parcel0) {
                return new RequestState(parcel0);
            }

            public RequestState[] b(int v) {
                return new RequestState[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.a(parcel0);
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.b(v);
            }
        }

        public static final Parcelable.Creator CREATOR;
        private String f;
        private String g;
        private String h;
        private long i;
        private long j;

        static {
            RequestState.CREATOR = new a();
        }

        RequestState() {
        }

        protected RequestState(Parcel parcel0) {
            this.f = parcel0.readString();
            this.g = parcel0.readString();
            this.h = parcel0.readString();
            this.i = parcel0.readLong();
            this.j = parcel0.readLong();
        }

        public String a() {
            return this.f;
        }

        public long b() {
            return this.i;
        }

        public String c() {
            return this.h;
        }

        public String d() {
            return this.g;
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public void e(long v) {
            this.i = v;
        }

        public void f(long v) {
            this.j = v;
        }

        public void g(String s) {
            this.h = s;
        }

        public void h(String s) {
            this.g = s;
            this.f = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", s);
        }

        public boolean i() {
            return Long.compare(this.j, 0L) == 0 ? false : new Date().getTime() - this.j - this.i * 1000L < 0L;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel parcel0, int v) {
            parcel0.writeString(this.f);
            parcel0.writeString(this.g);
            parcel0.writeString(this.h);
            parcel0.writeLong(this.i);
            parcel0.writeLong(this.j);
        }
    }

    private View f;
    private TextView g;
    private TextView h;
    private DeviceAuthMethodHandler i;
    private AtomicBoolean j;
    private volatile l k;
    private volatile ScheduledFuture l;
    private volatile RequestState m;
    private boolean n;
    private boolean o;
    private Request p;

    public DeviceAuthDialog() {
        this.j = new AtomicBoolean();
        this.n = false;
        this.o = false;
        this.p = null;
    }

    private void A(String s, b f$b0, String s1, Date date0, Date date1) {
        this.i.s(s1, h.f(), s, f$b0.c(), f$b0.a(), f$b0.b(), com.facebook.c.o, date0, null, date1);
        this.getDialog().dismiss();
    }

    // 去混淆评级： 低(20)
    protected int B(boolean z) {
        return z ? com.facebook.common.c.d : com.facebook.common.c.b;
    }

    private GraphRequest C() {
        class e implements com.facebook.GraphRequest.e {
            final DeviceAuthDialog a;

            @Override  // com.facebook.GraphRequest$e
            public void a(n n0) {
                if(DeviceAuthDialog.this.j.get()) {
                    return;
                }
                FacebookRequestError facebookRequestError0 = n0.g();
                if(facebookRequestError0 != null) {
                    int v = facebookRequestError0.h();
                    if(v != 0x149620) {
                        switch(v) {
                            case 0x149635: {
                                DeviceAuthDialog.this.F();
                                return;
                            }
                            case 0x149634: 
                            case 0x149636: {
                                DeviceAuthDialog.this.K();
                                return;
                            }
                            default: {
                                DeviceAuthDialog.this.G(n0.g().f());
                                return;
                            }
                        }
                    }
                    if(DeviceAuthDialog.this.m != null) {
                        X0.a.a(DeviceAuthDialog.this.m.d());
                    }
                    if(DeviceAuthDialog.this.p != null) {
                        DeviceAuthDialog.this.M(DeviceAuthDialog.this.p);
                        return;
                    }
                    DeviceAuthDialog.this.F();
                    return;
                }
                try {
                    JSONObject jSONObject0 = n0.h();
                    String s = jSONObject0.getString("access_token");
                    Long long0 = jSONObject0.getLong("expires_in");
                    Long long1 = jSONObject0.optLong("data_access_expiration_time");
                    DeviceAuthDialog.this.H(s, long0, long1);
                }
                catch(JSONException jSONException0) {
                    com.facebook.e e0 = new com.facebook.e(jSONException0);
                    DeviceAuthDialog.this.G(e0);
                }
            }
        }

        Bundle bundle0 = new Bundle();
        bundle0.putString("code", this.m.c());
        e deviceAuthDialog$e0 = new e(this);
        return new GraphRequest(null, "device/login_status", bundle0, o.g, deviceAuthDialog$e0);
    }

    protected View D(boolean z) {
        class com.facebook.login.DeviceAuthDialog.c implements View.OnClickListener {
            final DeviceAuthDialog f;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                if(b1.a.d(this)) {
                    return;
                }
                try {
                    DeviceAuthDialog.this.F();
                }
                catch(Throwable throwable0) {
                    b1.a.b(throwable0, this);
                }
            }
        }

        View view0 = this.getActivity().getLayoutInflater().inflate(this.B(z), null);
        this.f = view0.findViewById(com.facebook.common.b.f);
        this.g = (TextView)view0.findViewById(com.facebook.common.b.e);
        ((Button)view0.findViewById(com.facebook.common.b.a)).setOnClickListener(new com.facebook.login.DeviceAuthDialog.c(this));
        TextView textView0 = (TextView)view0.findViewById(com.facebook.common.b.b);
        this.h = textView0;
        textView0.setText(Html.fromHtml(this.getString(d.a)));
        return view0;
    }

    protected void E() {
    }

    protected void F() {
        if(!this.j.compareAndSet(false, true)) {
            return;
        }
        if(this.m != null) {
            X0.a.a(this.m.d());
        }
        DeviceAuthMethodHandler deviceAuthMethodHandler0 = this.i;
        if(deviceAuthMethodHandler0 != null) {
            deviceAuthMethodHandler0.q();
        }
        this.getDialog().dismiss();
    }

    protected void G(com.facebook.e e0) {
        if(!this.j.compareAndSet(false, true)) {
            return;
        }
        if(this.m != null) {
            X0.a.a(this.m.d());
        }
        this.i.r(e0);
        this.getDialog().dismiss();
    }

    private void H(String s, Long long0, Long long1) {
        class com.facebook.login.DeviceAuthDialog.h implements com.facebook.GraphRequest.e {
            final String a;
            final Date b;
            final Date c;
            final DeviceAuthDialog d;

            com.facebook.login.DeviceAuthDialog.h(String s, Date date0, Date date1) {
                this.a = s;
                this.b = date0;
                this.c = date1;
                super();
            }

            @Override  // com.facebook.GraphRequest$e
            public void a(n n0) {
                String s1;
                b f$b0;
                String s;
                if(DeviceAuthDialog.this.j.get()) {
                    return;
                }
                if(n0.g() != null) {
                    DeviceAuthDialog.this.G(n0.g().f());
                    return;
                }
                try {
                    JSONObject jSONObject0 = n0.h();
                    s = jSONObject0.getString("id");
                    f$b0 = F.D(jSONObject0);
                    s1 = jSONObject0.getString("name");
                }
                catch(JSONException jSONException0) {
                    com.facebook.e e0 = new com.facebook.e(jSONException0);
                    DeviceAuthDialog.this.G(e0);
                    return;
                }
                X0.a.a(DeviceAuthDialog.this.m.d());
                if(r.j(h.f()).j().contains(A.i) && !DeviceAuthDialog.this.o) {
                    DeviceAuthDialog.this.o = true;
                    DeviceAuthDialog.this.J(s, f$b0, this.a, s1, this.b, this.c);
                    return;
                }
                DeviceAuthDialog.this.A(s, f$b0, this.a, this.b, this.c);
            }
        }

        Bundle bundle0 = new Bundle();
        bundle0.putString("fields", "id,permissions,name");
        Date date0 = null;
        Date date1 = Long.compare(((long)long0), 0L) == 0 ? null : new Date(new Date().getTime() + ((long)long0) * 1000L);
        if(((long)long1) != 0L) {
            date0 = new Date(((long)long1) * 1000L);
        }
        AccessToken accessToken0 = new AccessToken(s, h.f(), "0", null, null, null, null, date1, null, date0);
        com.facebook.login.DeviceAuthDialog.h deviceAuthDialog$h0 = new com.facebook.login.DeviceAuthDialog.h(this, s, date1, date0);
        new GraphRequest(accessToken0, "me", bundle0, o.f, deviceAuthDialog$h0).i();
    }

    private void I() {
        this.m.f(new Date().getTime());
        this.k = this.C().i();
    }

    private void J(String s, b f$b0, String s1, String s2, Date date0, Date date1) {
        class f implements DialogInterface.OnClickListener {
            final DeviceAuthDialog f;

            @Override  // android.content.DialogInterface$OnClickListener
            public void onClick(DialogInterface dialogInterface0, int v) {
                View view0 = DeviceAuthDialog.this.D(false);
                DeviceAuthDialog.this.getDialog().setContentView(view0);
                DeviceAuthDialog.this.M(DeviceAuthDialog.this.p);
            }
        }


        class g implements DialogInterface.OnClickListener {
            final String f;
            final b g;
            final String h;
            final Date i;
            final Date j;
            final DeviceAuthDialog k;

            g(String s, b f$b0, String s1, Date date0, Date date1) {
                this.f = s;
                this.g = f$b0;
                this.h = s1;
                this.i = date0;
                this.j = date1;
                super();
            }

            @Override  // android.content.DialogInterface$OnClickListener
            public void onClick(DialogInterface dialogInterface0, int v) {
                DeviceAuthDialog.this.A(this.f, this.g, this.h, this.i, this.j);
            }
        }

        String s3 = this.getResources().getString(d.g);
        String s4 = this.getResources().getString(d.f);
        String s5 = this.getResources().getString(d.e);
        AlertDialog.Builder alertDialog$Builder0 = new AlertDialog.Builder(this.getContext());
        alertDialog$Builder0.setMessage(s3).setCancelable(true).setNegativeButton(String.format(s4, s2), new g(this, s, f$b0, s1, date0, date1)).setPositiveButton(s5, new f(this));
        alertDialog$Builder0.create().show();
    }

    private void K() {
        class com.facebook.login.DeviceAuthDialog.d implements Runnable {
            final DeviceAuthDialog f;

            @Override
            public void run() {
                if(b1.a.d(this)) {
                    return;
                }
                try {
                    DeviceAuthDialog.this.I();
                }
                catch(Throwable throwable0) {
                    b1.a.b(throwable0, this);
                }
            }
        }

        this.l = DeviceAuthMethodHandler.p().schedule(new com.facebook.login.DeviceAuthDialog.d(this), this.m.b(), TimeUnit.SECONDS);
    }

    private void L(RequestState deviceAuthDialog$RequestState0) {
        this.m = deviceAuthDialog$RequestState0;
        this.g.setText(deviceAuthDialog$RequestState0.d());
        Bitmap bitmap0 = X0.a.c(deviceAuthDialog$RequestState0.a());
        BitmapDrawable bitmapDrawable0 = new BitmapDrawable(this.getResources(), bitmap0);
        this.h.setCompoundDrawablesWithIntrinsicBounds(null, bitmapDrawable0, null, null);
        this.g.setVisibility(0);
        this.f.setVisibility(8);
        if(!this.o && X0.a.f(deviceAuthDialog$RequestState0.d())) {
            new m(this.getContext()).i("fb_smart_login_service");
        }
        if(deviceAuthDialog$RequestState0.i()) {
            this.K();
            return;
        }
        this.I();
    }

    public void M(Request loginClient$Request0) {
        class com.facebook.login.DeviceAuthDialog.b implements com.facebook.GraphRequest.e {
            final DeviceAuthDialog a;

            @Override  // com.facebook.GraphRequest$e
            public void a(n n0) {
                if(DeviceAuthDialog.this.n) {
                    return;
                }
                if(n0.g() != null) {
                    DeviceAuthDialog.this.G(n0.g().f());
                    return;
                }
                JSONObject jSONObject0 = n0.h();
                RequestState deviceAuthDialog$RequestState0 = new RequestState();
                try {
                    deviceAuthDialog$RequestState0.h(jSONObject0.getString("user_code"));
                    deviceAuthDialog$RequestState0.g(jSONObject0.getString("code"));
                    deviceAuthDialog$RequestState0.e(jSONObject0.getLong("interval"));
                }
                catch(JSONException jSONException0) {
                    com.facebook.e e0 = new com.facebook.e(jSONException0);
                    DeviceAuthDialog.this.G(e0);
                    return;
                }
                DeviceAuthDialog.this.L(deviceAuthDialog$RequestState0);
            }
        }

        this.p = loginClient$Request0;
        Bundle bundle0 = new Bundle();
        bundle0.putString("scope", TextUtils.join(",", loginClient$Request0.h()));
        String s = loginClient$Request0.f();
        if(s != null) {
            bundle0.putString("redirect_uri", s);
        }
        String s1 = loginClient$Request0.e();
        if(s1 != null) {
            bundle0.putString("target_user_id", s1);
        }
        bundle0.putString("access_token", G.b() + "|" + G.c());
        bundle0.putString("device_info", X0.a.d());
        com.facebook.login.DeviceAuthDialog.b deviceAuthDialog$b0 = new com.facebook.login.DeviceAuthDialog.b(this);
        new GraphRequest(null, "device/login", bundle0, o.g, deviceAuthDialog$b0).i();
    }

    @Override  // androidx.fragment.app.c
    public Dialog onCreateDialog(Bundle bundle0) {
        class com.facebook.login.DeviceAuthDialog.a extends Dialog {
            final DeviceAuthDialog f;

            com.facebook.login.DeviceAuthDialog.a(Context context0, int v) {
                super(context0, v);
            }

            @Override  // android.app.Dialog
            public void onBackPressed() {
                super.onBackPressed();
            }
        }

        Dialog dialog0 = new com.facebook.login.DeviceAuthDialog.a(this, this.getActivity(), com.facebook.common.e.b);
        dialog0.setContentView(this.D(X0.a.e() && !this.o));
        return dialog0;
    }

    @Override  // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = super.onCreateView(layoutInflater0, viewGroup0, bundle0);
        this.i = (DeviceAuthMethodHandler)((com.facebook.login.e)((FacebookActivity)this.getActivity()).Z0()).p().j();
        if(bundle0 != null) {
            RequestState deviceAuthDialog$RequestState0 = (RequestState)bundle0.getParcelable("request_state");
            if(deviceAuthDialog$RequestState0 != null) {
                this.L(deviceAuthDialog$RequestState0);
            }
        }
        return view0;
    }

    @Override  // androidx.fragment.app.c
    public void onDestroyView() {
        this.n = true;
        this.j.set(true);
        super.onDestroyView();
        if(this.k != null) {
            this.k.cancel(true);
        }
        if(this.l != null) {
            this.l.cancel(true);
        }
        this.f = null;
        this.g = null;
        this.h = null;
    }

    @Override  // androidx.fragment.app.c
    public void onDismiss(DialogInterface dialogInterface0) {
        super.onDismiss(dialogInterface0);
        if(!this.n) {
            this.F();
        }
    }

    @Override  // androidx.fragment.app.c
    public void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        if(this.m != null) {
            bundle0.putParcelable("request_state", this.m);
        }
    }
}

