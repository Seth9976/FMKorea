package com.onesignal;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.d;
import androidx.work.e;
import androidx.work.l;
import androidx.work.m;
import java.util.concurrent.TimeUnit;

class OSReceiveReceiptController {
    public static class ReceiveReceiptWorker extends Worker {
        public ReceiveReceiptWorker(Context context0, WorkerParameters workerParameters0) {
            super(context0, workerParameters0);
        }

        void b(String s) {
            class a extends g {
                final String a;
                final ReceiveReceiptWorker b;

                a(String s) {
                    this.a = s;
                    super();
                }

                @Override  // com.onesignal.U1$g
                void a(int v, String s, Throwable throwable0) {
                    I1.a(C.h, "Receive receipt failed with statusCode: " + v + " response: " + s);
                }

                @Override  // com.onesignal.U1$g
                void b(String s) {
                    I1.a(C.k, "Receive receipt sent for notificationID: " + this.a);
                }
            }

            Integer integer0;
            String s1 = I1.d == null || I1.d.isEmpty() ? I1.z0() : I1.d;
            String s2 = I1.L0();
            h1 h10 = new h1();
            try {
                integer0 = new OSUtils().e();
            }
            catch(NullPointerException nullPointerException0) {
                nullPointerException0.printStackTrace();
                integer0 = null;
            }
            I1.a(C.k, "ReceiveReceiptWorker: Device Type is: " + integer0);
            h10.a(s1, s2, integer0, s, new a(this, s));
        }

        @Override  // androidx.work.Worker
        public androidx.work.j.a doWork() {
            this.b(this.getInputData().l("os_notification_id"));
            return androidx.work.j.a.c();
        }
    }

    private int a;
    private int b;
    private final i1 c;
    private static OSReceiveReceiptController d;

    private OSReceiveReceiptController() {
        this.a = 0;
        this.b = 25;
        this.c = I1.v0();
    }

    void a(Context context0, String s) {
        if(!this.c.j()) {
            I1.a(C.k, "sendReceiveReceipt disabled");
            return;
        }
        int v = OSUtils.j(this.a, this.b);
        d d0 = new androidx.work.d.a().h("os_notification_id", s).a();
        c c0 = this.b();
        m m0 = (m)((androidx.work.m.a)((androidx.work.m.a)((androidx.work.m.a)new androidx.work.m.a(ReceiveReceiptWorker.class).i(c0)).k(((long)v), TimeUnit.SECONDS)).l(d0)).b();
        I1.a(C.k, "OSReceiveReceiptController enqueueing send receive receipt work with notificationId: " + s + " and delay: " + v + " seconds");
        F1.a(context0).d(s + "_receive_receipt", e.g, m0);
    }

    c b() {
        return new androidx.work.c.a().b(l.g).a();
    }

    public static OSReceiveReceiptController c() {
        synchronized(OSReceiveReceiptController.class) {
            if(OSReceiveReceiptController.d == null) {
                OSReceiveReceiptController.d = new OSReceiveReceiptController();
            }
            return OSReceiveReceiptController.d;
        }
    }
}

