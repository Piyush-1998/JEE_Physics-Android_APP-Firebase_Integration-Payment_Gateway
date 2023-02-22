package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzds implements zzdrw {
    private final /* synthetic */ zzdpx zzwe;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzds(zzdp zzdpVar, zzdpx zzdpxVar) {
        this.zzwe = zzdpxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdrw
    public final boolean zzb(File file) {
        try {
            return this.zzwe.zzb(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
