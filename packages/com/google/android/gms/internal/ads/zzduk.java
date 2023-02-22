package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public abstract class zzduk<I, O, F, T> extends zzdvf<O> implements Runnable {
    @NullableDecl
    private zzdvt<? extends I> zzhof;
    @NullableDecl
    private F zzhow;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <I, O> zzdvt<O> zza(zzdvt<I> zzdvtVar, zzduv<? super I, ? extends O> zzduvVar, Executor executor) {
        zzdsv.checkNotNull(executor);
        zzdun zzdunVar = new zzdun(zzdvtVar, zzduvVar);
        zzdvtVar.addListener(zzdunVar, zzdvv.zza(executor, zzdunVar));
        return zzdunVar;
    }

    abstract void setResult(@NullableDecl T t);

    @NullableDecl
    abstract T zzd(F f, @NullableDecl I i) throws Exception;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <I, O> zzdvt<O> zza(zzdvt<I> zzdvtVar, zzdsl<? super I, ? extends O> zzdslVar, Executor executor) {
        zzdsv.checkNotNull(zzdslVar);
        zzdum zzdumVar = new zzdum(zzdvtVar, zzdslVar);
        zzdvtVar.addListener(zzdumVar, zzdvv.zza(executor, zzdumVar));
        return zzdumVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzduk(zzdvt<? extends I> zzdvtVar, F f) {
        this.zzhof = (zzdvt) zzdsv.checkNotNull(zzdvtVar);
        this.zzhow = (F) zzdsv.checkNotNull(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        zzdvt<? extends I> zzdvtVar = this.zzhof;
        F f = this.zzhow;
        if ((isCancelled() | (zzdvtVar == null)) || (f == null)) {
            return;
        }
        this.zzhof = null;
        if (zzdvtVar.isCancelled()) {
            setFuture(zzdvtVar);
            return;
        }
        try {
            try {
                Object zzd = zzd(f, zzdvl.zza(zzdvtVar));
                this.zzhow = null;
                setResult(zzd);
            } catch (Throwable th) {
                try {
                    setException(th);
                } finally {
                    this.zzhow = null;
                }
            }
        } catch (Error e) {
            setException(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e2) {
            setException(e2);
        } catch (ExecutionException e3) {
            setException(e3.getCause());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdui
    public final void afterDone() {
        maybePropagateCancellationTo(this.zzhof);
        this.zzhof = null;
        this.zzhow = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdui
    public final String pendingToString() {
        String str;
        zzdvt<? extends I> zzdvtVar = this.zzhof;
        F f = this.zzhow;
        String pendingToString = super.pendingToString();
        if (zzdvtVar != null) {
            String valueOf = String.valueOf(zzdvtVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("inputFuture=[");
            sb.append(valueOf);
            sb.append("], ");
            str = sb.toString();
        } else {
            str = "";
        }
        if (f == null) {
            if (pendingToString != null) {
                String valueOf2 = String.valueOf(str);
                String valueOf3 = String.valueOf(pendingToString);
                return valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2);
            }
            return null;
        }
        String valueOf4 = String.valueOf(f);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(valueOf4).length());
        sb2.append(str);
        sb2.append("function=[");
        sb2.append(valueOf4);
        sb2.append("]");
        return sb2.toString();
    }
}
