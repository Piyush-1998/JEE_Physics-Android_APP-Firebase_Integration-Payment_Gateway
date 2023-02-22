package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdui;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
abstract class zzdus<OutputT> extends zzdui.zzj<OutputT> {
    private static final Logger zzhoi = Logger.getLogger(zzdus.class.getName());
    private static final zzb zzhph;
    private volatile int remaining;
    private volatile Set<Throwable> seenExceptions = null;

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    static abstract class zzb {
        private zzb() {
        }

        abstract void zza(zzdus zzdusVar, Set<Throwable> set, Set<Throwable> set2);

        abstract int zzc(zzdus zzdusVar);
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    static final class zzc extends zzb {
        private zzc() {
            super();
        }

        @Override // com.google.android.gms.internal.ads.zzdus.zzb
        final void zza(zzdus zzdusVar, Set<Throwable> set, Set<Throwable> set2) {
            synchronized (zzdusVar) {
                if (zzdusVar.seenExceptions == null) {
                    zzdusVar.seenExceptions = set2;
                }
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdus.zzb
        final int zzc(zzdus zzdusVar) {
            int zzb;
            synchronized (zzdusVar) {
                zzb = zzdus.zzb(zzdusVar);
            }
            return zzb;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdus(int i) {
        this.remaining = i;
    }

    abstract void zzh(Set<Throwable> set);

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    static final class zza extends zzb {
        private final AtomicReferenceFieldUpdater<zzdus, Set<Throwable>> zzhpi;
        private final AtomicIntegerFieldUpdater<zzdus> zzhpj;

        zza(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            super();
            this.zzhpi = atomicReferenceFieldUpdater;
            this.zzhpj = atomicIntegerFieldUpdater;
        }

        @Override // com.google.android.gms.internal.ads.zzdus.zzb
        final void zza(zzdus zzdusVar, Set<Throwable> set, Set<Throwable> set2) {
            this.zzhpi.compareAndSet(zzdusVar, null, set2);
        }

        @Override // com.google.android.gms.internal.ads.zzdus.zzb
        final int zzc(zzdus zzdusVar) {
            return this.zzhpj.decrementAndGet(zzdusVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<Throwable> zzaxf() {
        Set<Throwable> set = this.seenExceptions;
        if (set == null) {
            Set<Throwable> newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            zzh(newSetFromMap);
            zzhph.zza(this, null, newSetFromMap);
            return this.seenExceptions;
        }
        return set;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzaxg() {
        return zzhph.zzc(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzaxh() {
        this.seenExceptions = null;
    }

    static /* synthetic */ int zzb(zzdus zzdusVar) {
        int i = zzdusVar.remaining - 1;
        zzdusVar.remaining = i;
        return i;
    }

    static {
        zzb zzcVar;
        Throwable th;
        try {
            zzcVar = new zza(AtomicReferenceFieldUpdater.newUpdater(zzdus.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(zzdus.class, "remaining"));
            th = null;
        } catch (Throwable th2) {
            zzcVar = new zzc();
            th = th2;
        }
        zzhph = zzcVar;
        if (th != null) {
            zzhoi.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }
}
