package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaq;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzad implements Runnable {
    private final /* synthetic */ String zzbd;
    private final /* synthetic */ long zzbe;
    private final /* synthetic */ zzaa zzbf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzad(zzaa zzaaVar, String str, long j) {
        this.zzbf = zzaaVar;
        this.zzbd = str;
        this.zzbe = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaq.zza zzaVar;
        zzaq.zza zzaVar2;
        zzaVar = this.zzbf.zzap;
        zzaVar.zza(this.zzbd, this.zzbe);
        zzaVar2 = this.zzbf.zzap;
        zzaVar2.zzd(this.zzbf.toString());
    }
}
