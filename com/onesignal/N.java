package com.onesignal;

import android.os.Bundle;

class n implements m {
    private Bundle a;

    n() {
        this.a = new Bundle();
    }

    @Override  // com.onesignal.m
    public void a(String s, String s1) {
        this.a.putString(s, s1);
    }

    @Override  // com.onesignal.m
    public boolean b(String s, boolean z) {
        return this.a.getBoolean(s, z);
    }

    @Override  // com.onesignal.m
    public void c(String s, Long long0) {
        this.a.putLong(s, ((long)long0));
    }

    @Override  // com.onesignal.m
    public Long d(String s) {
        return this.a.getLong(s);
    }

    @Override  // com.onesignal.m
    public Object e() {
        return this.i();
    }

    @Override  // com.onesignal.m
    public Integer f(String s) {
        return this.a.getInt(s);
    }

    @Override  // com.onesignal.m
    public String g(String s) {
        return this.a.getString(s);
    }

    @Override  // com.onesignal.m
    public boolean h(String s) {
        return this.a.containsKey(s);
    }

    public Bundle i() {
        return this.a;
    }
}

