package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzae {
    private final zzx zzal;
    private final AtomicInteger zzbg;
    private final Set<zzaa<?>> zzbh;
    private final PriorityBlockingQueue<zzaa<?>> zzbi;
    private final PriorityBlockingQueue<zzaa<?>> zzbj;
    private final zzw[] zzbk;
    private final List<zzag> zzbl;
    private final List<zzah> zzbm;
    private final zzk zzn;
    private final zzak zzo;
    private zzm zzz;

    private zzae(zzk zzkVar, zzx zzxVar, int i, zzak zzakVar) {
        this.zzbg = new AtomicInteger();
        this.zzbh = new HashSet();
        this.zzbi = new PriorityBlockingQueue<>();
        this.zzbj = new PriorityBlockingQueue<>();
        this.zzbl = new ArrayList();
        this.zzbm = new ArrayList();
        this.zzn = zzkVar;
        this.zzal = zzxVar;
        this.zzbk = new zzw[4];
        this.zzo = zzakVar;
    }

    private zzae(zzk zzkVar, zzx zzxVar, int i) {
        this(zzkVar, zzxVar, 4, new zzt(new Handler(Looper.getMainLooper())));
    }

    public zzae(zzk zzkVar, zzx zzxVar) {
        this(zzkVar, zzxVar, 4);
    }

    public final void start() {
        zzw[] zzwVarArr;
        zzm zzmVar = this.zzz;
        if (zzmVar != null) {
            zzmVar.quit();
        }
        for (zzw zzwVar : this.zzbk) {
            if (zzwVar != null) {
                zzwVar.quit();
            }
        }
        zzm zzmVar2 = new zzm(this.zzbi, this.zzbj, this.zzn, this.zzo);
        this.zzz = zzmVar2;
        zzmVar2.start();
        for (int i = 0; i < this.zzbk.length; i++) {
            zzw zzwVar2 = new zzw(this.zzbj, this.zzal, this.zzn, this.zzo);
            this.zzbk[i] = zzwVar2;
            zzwVar2.start();
        }
    }

    public final <T> zzaa<T> zze(zzaa<T> zzaaVar) {
        zzaaVar.zza(this);
        synchronized (this.zzbh) {
            this.zzbh.add(zzaaVar);
        }
        zzaaVar.zze(this.zzbg.incrementAndGet());
        zzaaVar.zzc("add-to-queue");
        zza(zzaaVar, 0);
        if (!zzaaVar.zzh()) {
            this.zzbj.add(zzaaVar);
            return zzaaVar;
        }
        this.zzbi.add(zzaaVar);
        return zzaaVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <T> void zzf(zzaa<T> zzaaVar) {
        synchronized (this.zzbh) {
            this.zzbh.remove(zzaaVar);
        }
        synchronized (this.zzbl) {
            for (zzag zzagVar : this.zzbl) {
                zzagVar.zzg(zzaaVar);
            }
        }
        zza(zzaaVar, 5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzaa<?> zzaaVar, int i) {
        synchronized (this.zzbm) {
            for (zzah zzahVar : this.zzbm) {
                zzahVar.zzb(zzaaVar, i);
            }
        }
    }
}
