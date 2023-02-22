package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdwd<V> extends zzdvf<V> {
    @NullableDecl
    private zzdvt<V> zzhqj;
    @NullableDecl
    private ScheduledFuture<?> zzhqk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <V> zzdvt<V> zzb(zzdvt<V> zzdvtVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzdwd zzdwdVar = new zzdwd(zzdvtVar);
        zzdwf zzdwfVar = new zzdwf(zzdwdVar);
        zzdwdVar.zzhqk = scheduledExecutorService.schedule(zzdwfVar, j, timeUnit);
        zzdvtVar.addListener(zzdwfVar, zzdva.INSTANCE);
        return zzdwdVar;
    }

    private zzdwd(zzdvt<V> zzdvtVar) {
        this.zzhqj = (zzdvt) zzdsv.checkNotNull(zzdvtVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdui
    public final String pendingToString() {
        zzdvt<V> zzdvtVar = this.zzhqj;
        ScheduledFuture<?> scheduledFuture = this.zzhqk;
        if (zzdvtVar != null) {
            String valueOf = String.valueOf(zzdvtVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
            sb.append("inputFuture=[");
            sb.append(valueOf);
            sb.append("]");
            String sb2 = sb.toString();
            if (scheduledFuture != null) {
                long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
                if (delay > 0) {
                    String valueOf2 = String.valueOf(sb2);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 43);
                    sb3.append(valueOf2);
                    sb3.append(", remaining delay=[");
                    sb3.append(delay);
                    sb3.append(" ms]");
                    return sb3.toString();
                }
                return sb2;
            }
            return sb2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdui
    public final void afterDone() {
        maybePropagateCancellationTo(this.zzhqj);
        ScheduledFuture<?> scheduledFuture = this.zzhqk;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zzhqj = null;
        this.zzhqk = null;
    }
}
