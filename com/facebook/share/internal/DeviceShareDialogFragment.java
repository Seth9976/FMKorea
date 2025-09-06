package com.facebook.share.internal;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.c;
import androidx.fragment.app.h;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.common.b;
import com.facebook.common.d;
import com.facebook.common.e;
import com.facebook.internal.G;
import com.facebook.n;
import com.facebook.o;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
public class DeviceShareDialogFragment extends c {
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
        private long g;

        static {
            RequestState.CREATOR = new a();
        }

        RequestState() {
        }

        protected RequestState(Parcel parcel0) {
            this.f = parcel0.readString();
            this.g = parcel0.readLong();
        }

        public long a() {
            return this.g;
        }

        public String b() {
            return this.f;
        }

        public void c(long v) {
            this.g = v;
        }

        public void d(String s) {
            this.f = s;
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel parcel0, int v) {
            parcel0.writeString(this.f);
            parcel0.writeLong(this.g);
        }
    }

    private ProgressBar f;
    private TextView g;
    private Dialog h;
    private volatile RequestState i;
    private volatile ScheduledFuture j;
    private ShareContent k;
    private static ScheduledThreadPoolExecutor l;

    @Override  // androidx.fragment.app.c
    public Dialog onCreateDialog(Bundle bundle0) {
        class com.facebook.share.internal.DeviceShareDialogFragment.a implements View.OnClickListener {
            final DeviceShareDialogFragment f;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                if(b1.a.d(this)) {
                    return;
                }
                try {
                    DeviceShareDialogFragment.this.h.dismiss();
                }
                catch(Throwable throwable0) {
                    b1.a.b(throwable0, this);
                }
            }
        }

        this.h = new Dialog(this.getActivity(), e.b);
        View view0 = this.getActivity().getLayoutInflater().inflate(com.facebook.common.c.b, null);
        this.f = (ProgressBar)view0.findViewById(b.f);
        this.g = (TextView)view0.findViewById(b.e);
        ((Button)view0.findViewById(b.a)).setOnClickListener(new com.facebook.share.internal.DeviceShareDialogFragment.a(this));
        ((TextView)view0.findViewById(b.b)).setText(Html.fromHtml(this.getString(d.a)));
        this.h.setContentView(view0);
        this.y();
        return this.h;
    }

    @Override  // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = super.onCreateView(layoutInflater0, viewGroup0, bundle0);
        if(bundle0 != null) {
            RequestState deviceShareDialogFragment$RequestState0 = (RequestState)bundle0.getParcelable("request_state");
            if(deviceShareDialogFragment$RequestState0 != null) {
                this.w(deviceShareDialogFragment$RequestState0);
            }
        }
        return view0;
    }

    @Override  // androidx.fragment.app.c
    public void onDismiss(DialogInterface dialogInterface0) {
        super.onDismiss(dialogInterface0);
        if(this.j != null) {
            this.j.cancel(true);
        }
        this.s(-1, new Intent());
    }

    @Override  // androidx.fragment.app.c
    public void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        if(this.i != null) {
            bundle0.putParcelable("request_state", this.i);
        }
    }

    private void r() {
        if(this.isAdded()) {
            this.getFragmentManager().p().m(this).g();
        }
    }

    private void s(int v, Intent intent0) {
        if(this.i != null) {
            X0.a.a(this.i.b());
        }
        FacebookRequestError facebookRequestError0 = (FacebookRequestError)intent0.getParcelableExtra("error");
        if(facebookRequestError0 != null) {
            Toast.makeText(this.getContext(), facebookRequestError0.d(), 0).show();
        }
        if(this.isAdded()) {
            h h0 = this.getActivity();
            h0.setResult(v, intent0);
            h0.finish();
        }
    }

    private void t(FacebookRequestError facebookRequestError0) {
        this.r();
        Intent intent0 = new Intent();
        intent0.putExtra("error", facebookRequestError0);
        this.s(-1, intent0);
    }

    private static ScheduledThreadPoolExecutor u() {
        synchronized(DeviceShareDialogFragment.class) {
            if(DeviceShareDialogFragment.l == null) {
                DeviceShareDialogFragment.l = new ScheduledThreadPoolExecutor(1);
            }
            return DeviceShareDialogFragment.l;
        }
    }

    private Bundle v() {
        ShareContent shareContent0 = this.k;
        if(shareContent0 == null) {
            return null;
        }
        if(shareContent0 instanceof ShareLinkContent) {
            return h1.c.a(((ShareLinkContent)shareContent0));
        }
        return shareContent0 instanceof ShareOpenGraphContent ? h1.c.b(((ShareOpenGraphContent)shareContent0)) : null;
    }

    private void w(RequestState deviceShareDialogFragment$RequestState0) {
        class com.facebook.share.internal.DeviceShareDialogFragment.c implements Runnable {
            final DeviceShareDialogFragment f;

            @Override
            public void run() {
                if(b1.a.d(this)) {
                    return;
                }
                try {
                    DeviceShareDialogFragment.this.h.dismiss();
                }
                catch(Throwable throwable0) {
                    b1.a.b(throwable0, this);
                }
            }
        }

        this.i = deviceShareDialogFragment$RequestState0;
        this.g.setText(deviceShareDialogFragment$RequestState0.b());
        this.g.setVisibility(0);
        this.f.setVisibility(8);
        this.j = DeviceShareDialogFragment.u().schedule(new com.facebook.share.internal.DeviceShareDialogFragment.c(this), deviceShareDialogFragment$RequestState0.a(), TimeUnit.SECONDS);
    }

    public void x(ShareContent shareContent0) {
        this.k = shareContent0;
    }

    private void y() {
        class com.facebook.share.internal.DeviceShareDialogFragment.b implements com.facebook.GraphRequest.e {
            final DeviceShareDialogFragment a;

            @Override  // com.facebook.GraphRequest$e
            public void a(n n0) {
                FacebookRequestError facebookRequestError0 = n0.g();
                if(facebookRequestError0 != null) {
                    DeviceShareDialogFragment.this.t(facebookRequestError0);
                    return;
                }
                JSONObject jSONObject0 = n0.h();
                RequestState deviceShareDialogFragment$RequestState0 = new RequestState();
                try {
                    deviceShareDialogFragment$RequestState0.d(jSONObject0.getString("user_code"));
                    deviceShareDialogFragment$RequestState0.c(jSONObject0.getLong("expires_in"));
                }
                catch(JSONException unused_ex) {
                    FacebookRequestError facebookRequestError1 = new FacebookRequestError(0, "", "Malformed server response");
                    DeviceShareDialogFragment.this.t(facebookRequestError1);
                    return;
                }
                DeviceShareDialogFragment.this.w(deviceShareDialogFragment$RequestState0);
            }
        }

        Bundle bundle0 = this.v();
        if(bundle0 == null || bundle0.size() == 0) {
            this.t(new FacebookRequestError(0, "", "Failed to get share content"));
        }
        bundle0.putString("access_token", G.b() + "|" + G.c());
        bundle0.putString("device_info", X0.a.d());
        com.facebook.share.internal.DeviceShareDialogFragment.b deviceShareDialogFragment$b0 = new com.facebook.share.internal.DeviceShareDialogFragment.b(this);
        new GraphRequest(null, "device/share", bundle0, o.g, deviceShareDialogFragment$b0).i();
    }
}

