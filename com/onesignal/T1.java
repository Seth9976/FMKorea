package com.onesignal;

import java.util.Arrays;
import java.util.HashSet;

class t1 extends s1 {
    private final i1 e;
    static final HashSet f;

    static {
        t1.f = new HashSet(Arrays.asList(new String[]{"getTags()", "setSMSNumber()", "setEmail()", "logoutSMSNumber()", "logoutEmail()", "syncHashedEmail()", "setExternalUserId()", "setLanguage()", "setSubscription()", "promptLocation()", "idsAvailable()", "sendTag()", "sendTags()", "setLocationShared()", "setDisableGMSMissingPrompt()", "setRequiresUserPrivacyConsent()", "unsubscribeWhenNotificationsAreDisabled()", "handleNotificationOpen()", "onAppLostFocus()", "sendOutcome()", "sendUniqueOutcome()", "sendOutcomeWithValue()", "removeGroupedNotifications()", "removeNotification()", "clearOneSignalNotifications()"}));
    }

    t1(i1 i10, Q0 q00) {
        super(q00);
        this.e = i10;
    }

    // 去混淆评级： 低(20)
    boolean g(String s) {
        return !this.e.k() && t1.f.contains(s);
    }
}

