package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import z1.g;

class TimePickerView extends ConstraintLayout {
    class a implements View.OnClickListener {
        final TimePickerView f;

        @Override  // android.view.View$OnClickListener
        public void onClick(View view0) {
            TimePickerView.u(TimePickerView.this);
        }
    }

    interface d {
    }

    interface e {
    }

    private final Chip C;
    private final Chip D;
    private final ClockHandView E;
    private final ClockFaceView F;
    private final MaterialButtonToggleGroup G;
    private final View.OnClickListener H;

    public TimePickerView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public TimePickerView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.H = (/* 缺少LAMBDA参数 */) -> {
            TimePickerView.this.getClass();
            return null;
        };
        LayoutInflater.from(context0).inflate(g.o, this);
        this.F = (ClockFaceView)this.findViewById(z1.e.i);
        MaterialButtonToggleGroup materialButtonToggleGroup0 = (MaterialButtonToggleGroup)this.findViewById(z1.e.l);
        this.G = materialButtonToggleGroup0;
        materialButtonToggleGroup0.b(new f(this));
        this.C = (Chip)this.findViewById(z1.e.o);
        this.D = (Chip)this.findViewById(z1.e.m);
        this.E = (ClockHandView)this.findViewById(z1.e.j);
        this.y();
        this.x();
    }

    @Override  // android.view.View
    protected void onVisibilityChanged(View view0, int v) {
        super.onVisibilityChanged(view0, v);
        if(view0 == this && v == 0) {
            this.D.sendAccessibilityEvent(8);
        }
    }

    public static void t(TimePickerView timePickerView0, MaterialButtonToggleGroup materialButtonToggleGroup0, int v, boolean z) {
    }

    // 检测为 Lambda 实现
    static e u(TimePickerView timePickerView0) [...]

    static d v(TimePickerView timePickerView0) {
        timePickerView0.getClass();
        return null;
    }

    private void w(MaterialButtonToggleGroup materialButtonToggleGroup0, int v, boolean z) {
    }

    private void x() {
        this.C.setTag(z1.e.L, 12);
        this.D.setTag(z1.e.L, 10);
        this.C.setOnClickListener(this.H);
        this.D.setOnClickListener(this.H);
        this.C.setAccessibilityClassName("android.view.View");
        this.D.setAccessibilityClassName("android.view.View");
    }

    private void y() {
        class b extends GestureDetector.SimpleOnGestureListener {
            final TimePickerView a;

            @Override  // android.view.GestureDetector$SimpleOnGestureListener
            public boolean onDoubleTap(MotionEvent motionEvent0) {
                TimePickerView.v(TimePickerView.this);
                return false;
            }
        }


        class c implements View.OnTouchListener {
            final GestureDetector f;
            final TimePickerView g;

            c(GestureDetector gestureDetector0) {
                this.f = gestureDetector0;
                super();
            }

            // 去混淆评级： 低(20)
            @Override  // android.view.View$OnTouchListener
            public boolean onTouch(View view0, MotionEvent motionEvent0) {
                return ((Checkable)view0).isChecked() ? this.f.onTouchEvent(motionEvent0) : false;
            }
        }

        c timePickerView$c0 = new c(this, new GestureDetector(this.getContext(), new b(this)));
        this.C.setOnTouchListener(timePickerView$c0);
        this.D.setOnTouchListener(timePickerView$c0);
    }
}

