package com.google.android.gms.internal.ads;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;

final class zzcee extends SSLSocketFactory {
    final SSLSocketFactory zza;
    final zzcef zzb;

    zzcee(zzcef zzcef0) {
        this.zzb = zzcef0;
        super();
        this.zza = (SSLSocketFactory)SSLSocketFactory.getDefault();
    }

    @Override  // javax.net.SocketFactory
    public final Socket createSocket(String s, int v) {
        Socket socket0 = this.zza.createSocket(s, v);
        this.zza(socket0);
        return socket0;
    }

    @Override  // javax.net.SocketFactory
    public final Socket createSocket(String s, int v, InetAddress inetAddress0, int v1) {
        Socket socket0 = this.zza.createSocket(s, v, inetAddress0, v1);
        this.zza(socket0);
        return socket0;
    }

    @Override  // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress0, int v) {
        Socket socket0 = this.zza.createSocket(inetAddress0, v);
        this.zza(socket0);
        return socket0;
    }

    @Override  // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress0, int v, InetAddress inetAddress1, int v1) {
        Socket socket0 = this.zza.createSocket(inetAddress0, v, inetAddress1, v1);
        this.zza(socket0);
        return socket0;
    }

    @Override  // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket0, String s, int v, boolean z) {
        Socket socket1 = this.zza.createSocket(socket0, s, v, z);
        this.zza(socket1);
        return socket1;
    }

    @Override  // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.zza.getDefaultCipherSuites();
    }

    @Override  // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.zza.getSupportedCipherSuites();
    }

    private final Socket zza(Socket socket0) {
        zzcef zzcef0 = this.zzb;
        if(zzcef.zzk(zzcef0) > 0) {
            socket0.setReceiveBufferSize(zzcef.zzk(zzcef0));
        }
        zzcef.zzl(this.zzb, socket0);
        return socket0;
    }
}

