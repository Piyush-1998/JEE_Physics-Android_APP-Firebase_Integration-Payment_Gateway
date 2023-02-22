package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzawg implements zzawo {
    static final zzawo zzdxg = new zzawg();

    private zzawg() {
    }

    @Override // com.google.android.gms.internal.ads.zzawo
    public final Object zzb(zzbib zzbibVar) {
        String currentScreenName = zzbibVar.getCurrentScreenName();
        if (currentScreenName != null) {
            return currentScreenName;
        }
        String currentScreenClass = zzbibVar.getCurrentScreenClass();
        return currentScreenClass != null ? currentScreenClass : "";
    }
}
