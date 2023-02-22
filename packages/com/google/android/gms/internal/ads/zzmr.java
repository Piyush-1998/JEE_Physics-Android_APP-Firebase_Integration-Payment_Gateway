package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzmr implements Runnable {
    private final /* synthetic */ zzmn zzbeg;
    private final /* synthetic */ IOException zzbeh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzmr(zzmn zzmnVar, IOException iOException) {
        this.zzbeg = zzmnVar;
        this.zzbeh = iOException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzmy zzmyVar;
        zzmyVar = this.zzbeg.zzbdg;
        zzmyVar.zzb(this.zzbeh);
    }
}
