package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzfdb;

final class zzm extends WebViewClient {
    final zzs zza;

    zzm(zzs zzs0) {
        this.zza = zzs0;
        super();
    }

    @Override  // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView0, WebResourceRequest webResourceRequest0, WebResourceError webResourceError0) {
        zzs zzs0 = this.zza;
        if(zzs.zzh(zzs0) != null) {
            try {
                zzs.zzh(zzs0).zzf(zzfdb.zzd(1, null, null));
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzl("#007 Could not call remote method.", remoteException0);
            }
        }
        zzs zzs1 = this.zza;
        if(zzs.zzh(zzs1) != null) {
            try {
                zzs.zzh(zzs1).zze(0);
            }
            catch(RemoteException remoteException1) {
                zzcaa.zzl("#007 Could not call remote method.", remoteException1);
            }
        }
    }

    @Override  // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView0, String s) {
        if(s.startsWith(this.zza.zzq())) {
            return false;
        }
        if(s.startsWith("gmsg://noAdLoaded")) {
            zzs zzs0 = this.zza;
            if(zzs.zzh(zzs0) != null) {
                try {
                    zzs.zzh(zzs0).zzf(zzfdb.zzd(3, null, null));
                }
                catch(RemoteException remoteException0) {
                    zzcaa.zzl("#007 Could not call remote method.", remoteException0);
                }
            }
            zzs zzs1 = this.zza;
            if(zzs.zzh(zzs1) != null) {
                try {
                    zzs.zzh(zzs1).zze(3);
                }
                catch(RemoteException remoteException1) {
                    zzcaa.zzl("#007 Could not call remote method.", remoteException1);
                }
            }
            this.zza.zzV(0);
            return true;
        }
        if(s.startsWith("gmsg://scriptLoadFailed")) {
            zzs zzs2 = this.zza;
            if(zzs.zzh(zzs2) != null) {
                try {
                    zzs.zzh(zzs2).zzf(zzfdb.zzd(1, null, null));
                }
                catch(RemoteException remoteException2) {
                    zzcaa.zzl("#007 Could not call remote method.", remoteException2);
                }
            }
            zzs zzs3 = this.zza;
            if(zzs.zzh(zzs3) != null) {
                try {
                    zzs.zzh(zzs3).zze(0);
                }
                catch(RemoteException remoteException3) {
                    zzcaa.zzl("#007 Could not call remote method.", remoteException3);
                }
            }
            this.zza.zzV(0);
            return true;
        }
        if(s.startsWith("gmsg://adResized")) {
            zzs zzs4 = this.zza;
            if(zzs.zzh(zzs4) != null) {
                try {
                    zzs.zzh(zzs4).zzi();
                }
                catch(RemoteException remoteException4) {
                    zzcaa.zzl("#007 Could not call remote method.", remoteException4);
                }
            }
            int v = this.zza.zzb(s);
            this.zza.zzV(v);
            return true;
        }
        if(s.startsWith("gmsg://")) {
            return true;
        }
        zzs zzs5 = this.zza;
        if(zzs.zzh(zzs5) != null) {
            try {
                zzs.zzh(zzs5).zzc();
                zzs.zzh(this.zza).zzh();
            }
            catch(RemoteException remoteException5) {
                zzcaa.zzl("#007 Could not call remote method.", remoteException5);
            }
        }
        String s1 = zzs.zzo(this.zza, s);
        zzs.zzw(this.zza, s1);
        return true;
    }
}

