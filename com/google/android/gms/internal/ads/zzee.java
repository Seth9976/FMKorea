package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import java.util.Locale;

public final class zzee implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    private static final int[] zza;
    private final Handler zzb;
    private final int[] zzc;
    private EGLDisplay zzd;
    private EGLContext zze;
    private EGLSurface zzf;
    private SurfaceTexture zzg;

    static {
        zzee.zza = new int[]{0x3040, 4, 0x3024, 8, 0x3023, 8, 0x3022, 8, 0x3021, 8, 0x3025, 0, 0x3027, 0x3038, 0x3033, 4, 0x3038};
    }

    public zzee(Handler handler0, zzed zzed0) {
        this.zzb = handler0;
        this.zzc = new int[1];
    }

    @Override  // android.graphics.SurfaceTexture$OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture0) {
        this.zzb.post(this);
    }

    @Override
    public final void run() {
        SurfaceTexture surfaceTexture0 = this.zzg;
        if(surfaceTexture0 != null) {
            try {
                surfaceTexture0.updateTexImage();
            }
            catch(RuntimeException unused_ex) {
            }
        }
    }

    public final SurfaceTexture zza() {
        SurfaceTexture surfaceTexture0 = this.zzg;
        surfaceTexture0.getClass();
        return surfaceTexture0;
    }

    public final void zzb(int v) {
        EGLSurface eGLSurface0;
        EGLDisplay eGLDisplay0 = EGL14.eglGetDisplay(0);
        zzeh.zzb(eGLDisplay0 != null, "eglGetDisplay failed");
        int[] arr_v = new int[2];
        zzeh.zzb(EGL14.eglInitialize(eGLDisplay0, arr_v, 0, arr_v, 1), "eglInitialize failed");
        this.zzd = eGLDisplay0;
        EGLConfig[] arr_eGLConfig = new EGLConfig[1];
        int[] arr_v1 = new int[1];
        boolean z = EGL14.eglChooseConfig(eGLDisplay0, zzee.zza, 0, arr_eGLConfig, 0, 1, arr_v1, 0);
        zzeh.zzb(z && arr_v1[0] > 0 && arr_eGLConfig[0] != null, String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(z), ((int)arr_v1[0]), arr_eGLConfig[0]));
        EGLConfig eGLConfig0 = arr_eGLConfig[0];
        EGLContext eGLContext0 = EGL14.eglCreateContext(this.zzd, eGLConfig0, EGL14.EGL_NO_CONTEXT, (v == 0 ? new int[]{0x3098, 2, 0x3038} : new int[]{0x3098, 2, 0x32C0, 1, 0x3038}), 0);
        zzeh.zzb(eGLContext0 != null, "eglCreateContext failed");
        this.zze = eGLContext0;
        EGLDisplay eGLDisplay1 = this.zzd;
        if(v == 1) {
            eGLSurface0 = EGL14.EGL_NO_SURFACE;
        }
        else {
            eGLSurface0 = EGL14.eglCreatePbufferSurface(eGLDisplay1, eGLConfig0, (v == 2 ? new int[]{0x3057, 1, 0x3056, 1, 0x32C0, 1, 0x3038} : new int[]{0x3057, 1, 0x3056, 1, 0x3038}), 0);
            zzeh.zzb(eGLSurface0 != null, "eglCreatePbufferSurface failed");
        }
        zzeh.zzb(EGL14.eglMakeCurrent(eGLDisplay1, eGLSurface0, eGLSurface0, eGLContext0), "eglMakeCurrent failed");
        this.zzf = eGLSurface0;
        GLES20.glGenTextures(1, this.zzc, 0);
        zzeh.zza();
        SurfaceTexture surfaceTexture0 = new SurfaceTexture(this.zzc[0]);
        this.zzg = surfaceTexture0;
        surfaceTexture0.setOnFrameAvailableListener(this);
    }

    public final void zzc() {
        this.zzb.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture0 = this.zzg;
            if(surfaceTexture0 != null) {
                surfaceTexture0.release();
                GLES20.glDeleteTextures(1, this.zzc, 0);
            }
        }
        finally {
            if(this.zzd != null && !this.zzd.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglMakeCurrent(this.zzd, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
            }
            if(this.zzf != null && !this.zzf.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.zzd, this.zzf);
            }
            EGLContext eGLContext0 = this.zze;
            if(eGLContext0 != null) {
                EGL14.eglDestroyContext(this.zzd, eGLContext0);
            }
            EGL14.eglReleaseThread();
            if(this.zzd != null && !this.zzd.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.zzd);
            }
            this.zzd = null;
            this.zze = null;
            this.zzf = null;
            this.zzg = null;
        }
    }
}

