package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
final class zzage extends zzafb {
    private final /* synthetic */ zzagc zzddm;

    private zzage(zzagc zzagcVar) {
        this.zzddm = zzagcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafc
    public final void zza(zzaes zzaesVar, String str) {
        if (this.zzddm.zzddk == null) {
            return;
        }
        this.zzddm.zzddk.onCustomClick(this.zzddm.zzb(zzaesVar), str);
    }
}
