package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
abstract class zzdup<InputT, OutputT> extends zzdus<OutputT> {
    private static final Logger logger = Logger.getLogger(zzdup.class.getName());
    @NullableDecl
    private zzdtf<? extends zzdvt<? extends InputT>> zzhpa;
    private final boolean zzhpb;
    private final boolean zzhpc;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public enum zza {
        OUTPUT_FUTURE_DONE,
        ALL_INPUT_FUTURES_PROCESSED
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdup(zzdtf<? extends zzdvt<? extends InputT>> zzdtfVar, boolean z, boolean z2) {
        super(zzdtfVar.size());
        this.zzhpa = (zzdtf) zzdsv.checkNotNull(zzdtfVar);
        this.zzhpb = z;
        this.zzhpc = z2;
    }

    abstract void zzaxe();

    abstract void zzb(int i, @NullableDecl InputT inputt);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdui
    public final void afterDone() {
        super.afterDone();
        zzdtf<? extends zzdvt<? extends InputT>> zzdtfVar = this.zzhpa;
        zza(zza.OUTPUT_FUTURE_DONE);
        if (isCancelled() && (zzdtfVar != null)) {
            boolean wasInterrupted = wasInterrupted();
            zzdub zzdubVar = (zzdub) zzdtfVar.iterator();
            while (zzdubVar.hasNext()) {
                ((Future) zzdubVar.next()).cancel(wasInterrupted);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdui
    public final String pendingToString() {
        zzdtf<? extends zzdvt<? extends InputT>> zzdtfVar = this.zzhpa;
        if (zzdtfVar != null) {
            String valueOf = String.valueOf(zzdtfVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
            sb.append("futures=");
            sb.append(valueOf);
            return sb.toString();
        }
        return super.pendingToString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzaxd() {
        if (this.zzhpa.isEmpty()) {
            zzaxe();
        } else if (this.zzhpb) {
            int i = 0;
            zzdub zzdubVar = (zzdub) this.zzhpa.iterator();
            while (zzdubVar.hasNext()) {
                zzdvt zzdvtVar = (zzdvt) zzdubVar.next();
                zzdvtVar.addListener(new zzduo(this, zzdvtVar, i), zzdva.INSTANCE);
                i++;
            }
        } else {
            zzduq zzduqVar = new zzduq(this, this.zzhpc ? this.zzhpa : null);
            zzdub zzdubVar2 = (zzdub) this.zzhpa.iterator();
            while (zzdubVar2.hasNext()) {
                ((zzdvt) zzdubVar2.next()).addListener(zzduqVar, zzdva.INSTANCE);
            }
        }
    }

    private final void zzj(Throwable th) {
        zzdsv.checkNotNull(th);
        if (this.zzhpb && !setException(th) && zza(zzaxf(), th)) {
            zzk(th);
        } else if (th instanceof Error) {
            zzk(th);
        }
    }

    private static void zzk(Throwable th) {
        logger.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", th instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th);
    }

    @Override // com.google.android.gms.internal.ads.zzdus
    final void zzh(Set<Throwable> set) {
        zzdsv.checkNotNull(set);
        if (isCancelled()) {
            return;
        }
        zza(set, zzaxa());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zza(int i, Future<? extends InputT> future) {
        try {
            zzb(i, (int) zzdvl.zza(future));
        } catch (ExecutionException e) {
            zzj(e.getCause());
        } catch (Throwable th) {
            zzj(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(@NullableDecl zzdtf<? extends Future<? extends InputT>> zzdtfVar) {
        int zzaxg = zzaxg();
        int i = 0;
        if (!(zzaxg >= 0)) {
            throw new IllegalStateException("Less than 0 remaining futures");
        }
        if (zzaxg == 0) {
            if (zzdtfVar != null) {
                zzdub zzdubVar = (zzdub) zzdtfVar.iterator();
                while (zzdubVar.hasNext()) {
                    Future<? extends InputT> future = (Future) zzdubVar.next();
                    if (!future.isCancelled()) {
                        zza(i, future);
                    }
                    i++;
                }
            }
            zzaxh();
            zzaxe();
            zza(zza.ALL_INPUT_FUTURES_PROCESSED);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void zza(zza zzaVar) {
        zzdsv.checkNotNull(zzaVar);
        this.zzhpa = null;
    }

    private static boolean zza(Set<Throwable> set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }
}
