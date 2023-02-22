package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzcvh implements zzbzf {
    private final /* synthetic */ zzdkx zzgnh;
    private final /* synthetic */ zzdlj zzgnv;
    private final /* synthetic */ zzcrg zzgnw;
    final /* synthetic */ zzcvf zzgnx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcvh(zzcvf zzcvfVar, zzdlj zzdljVar, zzdkx zzdkxVar, zzcrg zzcrgVar) {
        this.zzgnx = zzcvfVar;
        this.zzgnv = zzdljVar;
        this.zzgnh = zzdkxVar;
        this.zzgnw = zzcrgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzf
    public final void onInitializationSucceeded() {
        Executor executor;
        executor = this.zzgnx.zzfmk;
        final zzdlj zzdljVar = this.zzgnv;
        final zzdkx zzdkxVar = this.zzgnh;
        final zzcrg zzcrgVar = this.zzgnw;
        executor.execute(new Runnable(this, zzdljVar, zzdkxVar, zzcrgVar) { // from class: com.google.android.gms.internal.ads.zzcvk
            private final zzdkx zzfoo;
            private final zzdlj zzgbj;
            private final zzcvh zzgoc;
            private final zzcrg zzgod;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgoc = this;
                this.zzgbj = zzdljVar;
                this.zzfoo = zzdkxVar;
                this.zzgod = zzcrgVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzcvh zzcvhVar = this.zzgoc;
                zzdlj zzdljVar2 = this.zzgbj;
                zzdkx zzdkxVar2 = this.zzfoo;
                zzcrg zzcrgVar2 = this.zzgod;
                zzcvf zzcvfVar = zzcvhVar.zzgnx;
                zzcvf.zzc(zzdljVar2, zzdkxVar2, zzcrgVar2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbzf
    public final void zzdx(int i) {
        String valueOf = String.valueOf(this.zzgnw.zzfqh);
        zzaxy.zzfe(valueOf.length() != 0 ? "Fail to initialize adapter ".concat(valueOf) : new String("Fail to initialize adapter "));
    }
}
