package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public class zzegz extends IOException {
    private zzehz zzigo;

    public zzegz(String str) {
        super(str);
        this.zzigo = null;
    }

    public final zzegz zzl(zzehz zzehzVar) {
        this.zzigo = zzehzVar;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzegz zzbgb() {
        return new zzegz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzegz zzbgc() {
        return new zzegz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzegz zzbgd() {
        return new zzegz("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzegz zzbge() {
        return new zzegz("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzegz zzbgf() {
        return new zzegz("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzehc zzbgg() {
        return new zzehc("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzegz zzbgh() {
        return new zzegz("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzegz zzbgi() {
        return new zzegz("Failed to parse the message.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzegz zzbgj() {
        return new zzegz("Protocol message had invalid UTF-8.");
    }
}
