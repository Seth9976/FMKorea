package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class ShareOpenGraphAction extends ShareOpenGraphValueContainer {
    static final class a implements Parcelable.Creator {
        public ShareOpenGraphAction a(Parcel parcel0) {
            return new ShareOpenGraphAction(parcel0);
        }

        public ShareOpenGraphAction[] b(int v) {
            return new ShareOpenGraphAction[v];
        }

        @Override  // android.os.Parcelable$Creator
        public Object createFromParcel(Parcel parcel0) {
            return this.a(parcel0);
        }

        @Override  // android.os.Parcelable$Creator
        public Object[] newArray(int v) {
            return this.b(v);
        }
    }

    public static final class b extends com.facebook.share.model.ShareOpenGraphValueContainer.a {
        public ShareOpenGraphAction d() {
            return new ShareOpenGraphAction(this, null);
        }

        b e(Parcel parcel0) {
            return this.f(((ShareOpenGraphAction)parcel0.readParcelable(ShareOpenGraphAction.class.getClassLoader())));
        }

        public b f(ShareOpenGraphAction shareOpenGraphAction0) {
            return shareOpenGraphAction0 == null ? this : ((b)super.c(shareOpenGraphAction0)).g(shareOpenGraphAction0.e());
        }

        public b g(String s) {
            this.b("og:type", s);
            return this;
        }
    }

    public static final Parcelable.Creator CREATOR;

    static {
        ShareOpenGraphAction.CREATOR = new a();
    }

    ShareOpenGraphAction(Parcel parcel0) {
        super(parcel0);
    }

    private ShareOpenGraphAction(b shareOpenGraphAction$b0) {
        super(shareOpenGraphAction$b0);
    }

    ShareOpenGraphAction(b shareOpenGraphAction$b0, a shareOpenGraphAction$a0) {
        this(shareOpenGraphAction$b0);
    }

    public String e() {
        return this.c("og:type");
    }
}

