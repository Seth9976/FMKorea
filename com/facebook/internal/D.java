package com.facebook.internal;

import com.facebook.h;

public enum d {
    Login(0),
    Share(1),
    Message(2),
    Like(3),
    GameRequest(4),
    AppGroupCreate(5),
    AppGroupJoin(6),
    AppInvite(7),
    DeviceShare(8),
    GamingFriendFinder(9),
    GamingGroupIntegration(10),
    Referral(11);

    private final int f;

    private d(int v1) {
        this.f = v1;
    }

    public final int b() {
        return h.j() + this.f;
    }
}

