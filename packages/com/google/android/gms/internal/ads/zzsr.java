package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzsr implements Runnable {
    private final /* synthetic */ zzss zzbuu;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzsr(zzss zzssVar) {
        this.zzbuu = zzssVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzbuu.disconnect();
    }
}
