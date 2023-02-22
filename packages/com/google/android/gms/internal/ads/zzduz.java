package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdup;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzduz<V> extends zzdup<Object, V> {
    private zzdvb<?> zzhpn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzduz(zzdtf<? extends zzdvt<?>> zzdtfVar, boolean z, Executor executor, Callable<V> callable) {
        super(zzdtfVar, z, false);
        this.zzhpn = new zzduy(this, callable, executor);
        zzaxd();
    }

    @Override // com.google.android.gms.internal.ads.zzdup
    final void zzb(int i, @NullableDecl Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzdup
    final void zzaxe() {
        zzdvb<?> zzdvbVar = this.zzhpn;
        if (zzdvbVar != null) {
            zzdvbVar.execute();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdup
    public final void zza(zzdup.zza zzaVar) {
        super.zza(zzaVar);
        if (zzaVar == zzdup.zza.OUTPUT_FUTURE_DONE) {
            this.zzhpn = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdui
    protected final void interruptTask() {
        zzdvb<?> zzdvbVar = this.zzhpn;
        if (zzdvbVar != null) {
            zzdvbVar.interruptTask();
        }
    }
}
