package com.facebook.ads;

import androidx.annotation.Keep;
import java.io.Serializable;

@Keep
public class RewardData implements Serializable {
    private String mCurrency;
    private int mQuantity;
    private String mUserID;
    private static final long serialVersionUID = -6264212909606201882L;

    public RewardData(String s, String s1) {
        this(s, s1, 0);
    }

    public RewardData(String s, String s1, int v) {
        this.mUserID = s;
        this.mCurrency = s1;
        this.mQuantity = v;
    }

    public String getCurrency() {
        return this.mCurrency;
    }

    public int getQuantity() {
        return this.mQuantity;
    }

    public String getUserID() {
        return this.mUserID;
    }
}

