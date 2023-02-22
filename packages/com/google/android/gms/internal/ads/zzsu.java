package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzsu implements zzrh {
    private final /* synthetic */ zzss zzbuu;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzsu(zzss zzssVar) {
        this.zzbuu = zzssVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrh
    public final void zzp(boolean z) {
        if (!z) {
            this.zzbuu.disconnect();
        } else {
            this.zzbuu.connect();
        }
    }
}
