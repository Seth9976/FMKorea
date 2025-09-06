package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class NavigationMenuView extends RecyclerView implements k {
    public NavigationMenuView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public NavigationMenuView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.setLayoutManager(new LinearLayoutManager(context0, 1, false));
    }

    @Override  // androidx.appcompat.view.menu.k
    public void b(e e0) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}

