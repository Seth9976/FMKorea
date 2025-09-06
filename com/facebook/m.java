package com.facebook;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class m extends AbstractList {
    public interface a {
        void a(m arg1);
    }

    private Handler f;
    private List g;
    private int h;
    private final String i;
    private List j;
    private String k;
    private static AtomicInteger l;

    static {
        m.l = new AtomicInteger();
    }

    public m(Collection collection0) {
        this.g = new ArrayList();
        this.h = 0;
        this.i = "1";
        this.j = new ArrayList();
        this.g = new ArrayList(collection0);
    }

    public m(GraphRequest[] arr_graphRequest) {
        this.g = new ArrayList();
        this.h = 0;
        this.i = "1";
        this.j = new ArrayList();
        this.g = Arrays.asList(arr_graphRequest);
    }

    public final void a(int v, GraphRequest graphRequest0) {
        this.g.add(v, graphRequest0);
    }

    @Override
    public void add(int v, Object object0) {
        this.a(v, ((GraphRequest)object0));
    }

    @Override
    public boolean add(Object object0) {
        return this.c(((GraphRequest)object0));
    }

    public final boolean c(GraphRequest graphRequest0) {
        return this.g.add(graphRequest0);
    }

    @Override
    public final void clear() {
        this.g.clear();
    }

    public void d(a m$a0) {
        if(!this.j.contains(m$a0)) {
            this.j.add(m$a0);
        }
    }

    public final List e() {
        return this.h();
    }

    @Override
    public Object get(int v) {
        return this.l(v);
    }

    List h() {
        return GraphRequest.j(this);
    }

    public final l i() {
        return this.k();
    }

    l k() {
        return GraphRequest.m(this);
    }

    public final GraphRequest l(int v) {
        return (GraphRequest)this.g.get(v);
    }

    public final String m() {
        return this.k;
    }

    final Handler n() {
        return this.f;
    }

    final List o() {
        return this.j;
    }

    final String p() {
        return this.i;
    }

    final List q() {
        return this.g;
    }

    @Override
    public Object remove(int v) {
        return this.t(v);
    }

    public int s() {
        return this.h;
    }

    @Override
    public Object set(int v, Object object0) {
        return this.u(v, ((GraphRequest)object0));
    }

    @Override
    public final int size() {
        return this.g.size();
    }

    public final GraphRequest t(int v) {
        return (GraphRequest)this.g.remove(v);
    }

    public final GraphRequest u(int v, GraphRequest graphRequest0) {
        return (GraphRequest)this.g.set(v, graphRequest0);
    }

    final void v(Handler handler0) {
        this.f = handler0;
    }
}

