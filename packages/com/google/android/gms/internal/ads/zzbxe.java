package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public class zzbxe<ListenerT> {
    private final Map<ListenerT, Executor> zzfts = new HashMap();

    /* JADX INFO: Access modifiers changed from: protected */
    public zzbxe(Set<zzbys<ListenerT>> set) {
        zzb(set);
    }

    public final synchronized void zza(zzbys<ListenerT> zzbysVar) {
        zza(zzbysVar.zzfum, zzbysVar.executor);
    }

    public final synchronized void zza(ListenerT listenert, Executor executor) {
        this.zzfts.put(listenert, executor);
    }

    private final synchronized void zzb(Set<zzbys<ListenerT>> set) {
        for (zzbys<ListenerT> zzbysVar : set) {
            zza(zzbysVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void zza(final zzbxg<ListenerT> zzbxgVar) {
        for (Map.Entry<ListenerT, Executor> entry : this.zzfts.entrySet()) {
            final ListenerT key = entry.getKey();
            entry.getValue().execute(new Runnable(zzbxgVar, key) { // from class: com.google.android.gms.internal.ads.zzbxh
                private final Object zzdij;
                private final zzbxg zzftt;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzftt = zzbxgVar;
                    this.zzdij = key;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        this.zzftt.zzp(this.zzdij);
                    } catch (Throwable th) {
                        com.google.android.gms.ads.internal.zzp.zzkt().zzb(th, "EventEmitter.notify");
                        zzaxy.zza("Event emitter exception.", th);
                    }
                }
            });
        }
    }
}
