package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbbg;
import com.google.android.gms.internal.ads.zzed;
import com.google.android.gms.internal.ads.zzeg;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzo implements Callable<zzeg> {
    private final /* synthetic */ zzj zzbpi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzo(zzj zzjVar) {
        this.zzbpi = zzjVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ zzeg call() throws Exception {
        zzbbg zzbbgVar;
        Context context;
        zzbbgVar = this.zzbpi.zzbpa;
        String str = zzbbgVar.zzbra;
        context = this.zzbpi.zzvr;
        return new zzeg(zzed.zzb(str, context, false));
    }
}
