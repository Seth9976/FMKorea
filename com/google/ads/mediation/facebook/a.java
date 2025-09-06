package com.google.ads.mediation.facebook;

import android.content.Context;
import com.facebook.ads.AudienceNetworkAds.InitListener;
import com.facebook.ads.AudienceNetworkAds.InitResult;
import com.facebook.ads.AudienceNetworkAds;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;

class a implements InitListener {
    interface com.google.ads.mediation.facebook.a.a {
        void a(AdError arg1);

        void b();
    }

    private boolean a;
    private boolean b;
    private final ArrayList c;
    private static a d;

    private a() {
        this.a = false;
        this.b = false;
        this.c = new ArrayList();
    }

    static a a() {
        if(a.d == null) {
            a.d = new a();
        }
        return a.d;
    }

    void b(Context context0, ArrayList arrayList0, com.google.ads.mediation.facebook.a.a a$a0) {
        if(this.a) {
            this.c.add(a$a0);
            return;
        }
        if(this.b) {
            a$a0.b();
            return;
        }
        this.a = true;
        a.a().c.add(a$a0);
        AudienceNetworkAds.buildInitSettings(context0).withMediationService("GOOGLE:6.16.0.0").withPlacementIds(arrayList0).withInitListener(this).initialize();
    }

    @Override  // com.facebook.ads.AudienceNetworkAds$InitListener
    public void onInitialized(InitResult audienceNetworkAds$InitResult0) {
        this.a = false;
        this.b = audienceNetworkAds$InitResult0.isSuccess();
        for(Object object0: this.c) {
            com.google.ads.mediation.facebook.a.a a$a0 = (com.google.ads.mediation.facebook.a.a)object0;
            if(audienceNetworkAds$InitResult0.isSuccess()) {
                a$a0.b();
            }
            else {
                a$a0.a(new AdError(104, audienceNetworkAds$InitResult0.getMessage(), "com.google.ads.mediation.facebook"));
            }
        }
        this.c.clear();
    }
}

