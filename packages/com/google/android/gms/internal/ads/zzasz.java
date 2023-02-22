package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzasz implements Callable<zzasu> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzasw zzdut;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzasz(zzasw zzaswVar, Context context) {
        this.zzdut = zzaswVar;
        this.val$context = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ zzasu call() throws Exception {
        WeakHashMap weakHashMap;
        zzasu zzvk;
        WeakHashMap weakHashMap2;
        weakHashMap = this.zzdut.zzduq;
        zzasy zzasyVar = (zzasy) weakHashMap.get(this.val$context);
        if (zzasyVar != null) {
            if (!(zzasyVar.zzdur + zzacg.zzczs.get().longValue() < com.google.android.gms.ads.internal.zzp.zzkw().currentTimeMillis())) {
                zzvk = new zzasx(this.val$context, zzasyVar.zzdus).zzvk();
                weakHashMap2 = this.zzdut.zzduq;
                weakHashMap2.put(this.val$context, new zzasy(this.zzdut, zzvk));
                return zzvk;
            }
        }
        zzvk = new zzasx(this.val$context).zzvk();
        weakHashMap2 = this.zzdut.zzduq;
        weakHashMap2.put(this.val$context, new zzasy(this.zzdut, zzvk));
        return zzvk;
    }
}
