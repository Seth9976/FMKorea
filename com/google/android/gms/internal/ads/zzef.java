package com.google.android.gms.internal.ads;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;

final class zzef {
    public static int zza() {
        int[] arr_v = new int[1];
        EGL14.eglQueryContext(EGL14.eglGetDisplay(0), EGL14.eglGetCurrentContext(), 0x3098, arr_v, 0);
        zzeh.zza();
        return arr_v[0];
    }

    public static EGLContext zzb(EGLContext eGLContext0, EGLDisplay eGLDisplay0, int v, int[] arr_v) {
        EGLContext eGLContext1 = EGL14.eglCreateContext(eGLDisplay0, zzef.zzl(eGLDisplay0, arr_v), eGLContext0, new int[]{0x3098, v, 0x3038}, 0);
        if(eGLContext1 != null) {
            zzeh.zza();
            return eGLContext1;
        }
        EGL14.eglTerminate(eGLDisplay0);
        throw new zzeg("eglCreateContext() failed to create a valid context. The device may not support EGL version " + v);
    }

    public static EGLContext zzc() {
        return EGL14.eglGetCurrentContext();
    }

    public static EGLDisplay zzd() {
        EGLDisplay eGLDisplay0 = EGL14.eglGetDisplay(0);
        zzeh.zzb(!eGLDisplay0.equals(EGL14.EGL_NO_DISPLAY), "No EGL display.");
        zzeh.zzb(EGL14.eglInitialize(eGLDisplay0, new int[1], 0, new int[1], 0), "Error in eglInitialize.");
        zzeh.zza();
        return eGLDisplay0;
    }

    public static EGLSurface zze(EGLDisplay eGLDisplay0, int[] arr_v, int[] arr_v1) {
        EGLSurface eGLSurface0 = EGL14.eglCreatePbufferSurface(eGLDisplay0, zzef.zzl(eGLDisplay0, arr_v), arr_v1, 0);
        zzef.zzg("Error creating a new EGL Pbuffer surface");
        return eGLSurface0;
    }

    public static EGLSurface zzf(EGLDisplay eGLDisplay0, Object object0, int[] arr_v, int[] arr_v1) {
        EGLSurface eGLSurface0 = EGL14.eglCreateWindowSurface(eGLDisplay0, zzef.zzl(eGLDisplay0, arr_v), object0, arr_v1, 0);
        zzef.zzg("Error creating a new EGL surface");
        return eGLSurface0;
    }

    public static void zzg(String s) {
        int v = EGL14.eglGetError();
        if(v != 0x3000) {
            throw new zzeg(s + ", error code: 0x" + Integer.toHexString(v));
        }
    }

    public static void zzh(EGLDisplay eGLDisplay0, EGLContext eGLContext0) {
        if(eGLDisplay0 == null) {
            return;
        }
        EGL14.eglMakeCurrent(eGLDisplay0, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
        zzef.zzg("Error releasing context");
        if(eGLContext0 != null) {
            EGL14.eglDestroyContext(eGLDisplay0, eGLContext0);
            zzef.zzg("Error destroying context");
        }
        EGL14.eglReleaseThread();
        zzef.zzg("Error releasing thread");
        EGL14.eglTerminate(eGLDisplay0);
        zzef.zzg("Error terminating display");
    }

    public static void zzi(EGLDisplay eGLDisplay0, EGLSurface eGLSurface0) {
        if(eGLDisplay0 != null && eGLSurface0 != null) {
            EGL14.eglDestroySurface(eGLDisplay0, eGLSurface0);
            zzef.zzg("Error destroying surface");
        }
    }

    public static void zzj(EGLDisplay eGLDisplay0, EGLContext eGLContext0, EGLSurface eGLSurface0, int v, int v1, int v2) {
        EGL14.eglMakeCurrent(eGLDisplay0, eGLSurface0, eGLSurface0, eGLContext0);
        zzef.zzg("Error making context current");
        int[] arr_v = new int[1];
        GLES20.glGetIntegerv(36006, arr_v, 0);
        if(arr_v[0] != v) {
            GLES20.glBindFramebuffer(0x8D40, v);
        }
        zzeh.zza();
        GLES20.glViewport(0, 0, v1, v2);
        zzeh.zza();
    }

    public static boolean zzk(String s) {
        String s1 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 0x3055);
        return s1 != null && s1.contains(s);
    }

    private static EGLConfig zzl(EGLDisplay eGLDisplay0, int[] arr_v) {
        EGLConfig[] arr_eGLConfig = new EGLConfig[1];
        if(!EGL14.eglChooseConfig(eGLDisplay0, arr_v, 0, arr_eGLConfig, 0, 1, new int[1], 0)) {
            throw new zzeg("eglChooseConfig failed.");
        }
        return arr_eGLConfig[0];
    }
}

