package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Set;

class zzaku extends X509Certificate {
    private final X509Certificate zza;

    public zzaku(X509Certificate x509Certificate0) {
        this.zza = x509Certificate0;
    }

    @Override
    public final void checkValidity() {
        this.zza.checkValidity();
    }

    @Override
    public final void checkValidity(Date date0) {
        this.zza.checkValidity(date0);
    }

    @Override
    public final int getBasicConstraints() {
        return this.zza.getBasicConstraints();
    }

    @Override
    public final Set getCriticalExtensionOIDs() {
        return this.zza.getCriticalExtensionOIDs();
    }

    @Override
    public byte[] getEncoded() {
        return this.zza.getEncoded();
    }

    @Override
    public final byte[] getExtensionValue(String s) {
        return this.zza.getExtensionValue(s);
    }

    @Override
    public final Principal getIssuerDN() {
        return this.zza.getIssuerDN();
    }

    @Override
    public final boolean[] getIssuerUniqueID() {
        return this.zza.getIssuerUniqueID();
    }

    @Override
    public final boolean[] getKeyUsage() {
        return this.zza.getKeyUsage();
    }

    @Override
    public final Set getNonCriticalExtensionOIDs() {
        return this.zza.getNonCriticalExtensionOIDs();
    }

    @Override
    public final Date getNotAfter() {
        return this.zza.getNotAfter();
    }

    @Override
    public final Date getNotBefore() {
        return this.zza.getNotBefore();
    }

    @Override
    public final PublicKey getPublicKey() {
        return this.zza.getPublicKey();
    }

    @Override
    public final BigInteger getSerialNumber() {
        return this.zza.getSerialNumber();
    }

    @Override
    public final String getSigAlgName() {
        return this.zza.getSigAlgName();
    }

    @Override
    public final String getSigAlgOID() {
        return this.zza.getSigAlgOID();
    }

    @Override
    public final byte[] getSigAlgParams() {
        return this.zza.getSigAlgParams();
    }

    @Override
    public final byte[] getSignature() {
        return this.zza.getSignature();
    }

    @Override
    public final Principal getSubjectDN() {
        return this.zza.getSubjectDN();
    }

    @Override
    public final boolean[] getSubjectUniqueID() {
        return this.zza.getSubjectUniqueID();
    }

    @Override
    public final byte[] getTBSCertificate() {
        return this.zza.getTBSCertificate();
    }

    @Override
    public final int getVersion() {
        return this.zza.getVersion();
    }

    @Override
    public final boolean hasUnsupportedCriticalExtension() {
        return this.zza.hasUnsupportedCriticalExtension();
    }

    @Override
    public final String toString() {
        return this.zza.toString();
    }

    @Override
    public final void verify(PublicKey publicKey0) {
        this.zza.verify(publicKey0);
    }

    @Override
    public final void verify(PublicKey publicKey0, String s) {
        this.zza.verify(publicKey0, s);
    }
}

