package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdp implements zzdw {
    private static zzdp zzvq;
    private final Context zzvr;
    private final zzdrq zzvs;
    private final zzdrv zzvt;
    private final zzdsa zzvu;
    private final zzew zzvv;
    private final zzdpy zzvw;
    private final Executor zzvx;
    private final zzgo zzvy;
    private final zzdrw zzvz;
    private volatile long zzwa = 0;
    private final Object zzwb = new Object();
    private volatile boolean zzwc;

    public static synchronized zzdp zza(String str, Context context, boolean z) {
        zzdp zzdpVar;
        synchronized (zzdp.class) {
            if (zzvq == null) {
                zzdqc zzava = zzdqc.zzavd().zzhb(str).zzbq(z).zzava();
                ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
                zzdp zza = zza(context, zzdpy.zza(context, newCachedThreadPool), zzava, newCachedThreadPool);
                zzvq = zza;
                zza.zzbq();
                zzvq.zzbt();
            }
            zzdpVar = zzvq;
        }
        return zzdpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final void zza(int i, int i2, int i3) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzdp zza(Context context, zzdpy zzdpyVar, zzdqc zzdqcVar) {
        return zza(context, zzdpyVar, zzdqcVar, Executors.newCachedThreadPool());
    }

    private static zzdp zza(Context context, zzdpy zzdpyVar, zzdqc zzdqcVar, Executor executor) {
        zzdqo zza = zzdqo.zza(context, executor, zzdpyVar, zzdqcVar);
        zzev zzevVar = new zzev(context);
        zzew zzewVar = new zzew(zzdqcVar, zza, new zzfi(context, zzevVar), zzevVar);
        zzgo zzavs = new zzdre(context, zzdpyVar).zzavs();
        zzdpx zzdpxVar = new zzdpx();
        return new zzdp(context, zzdpyVar, new zzdrq(context, zzavs), new zzdrv(context, zzavs), new zzdsa(context, zzewVar, zzdpyVar, zzdpxVar), zzewVar, executor, zzdpxVar, zzavs);
    }

    private zzdp(Context context, zzdpy zzdpyVar, zzdrq zzdrqVar, zzdrv zzdrvVar, zzdsa zzdsaVar, zzew zzewVar, Executor executor, zzdpx zzdpxVar, zzgo zzgoVar) {
        this.zzvr = context;
        this.zzvw = zzdpyVar;
        this.zzvs = zzdrqVar;
        this.zzvt = zzdrvVar;
        this.zzvu = zzdsaVar;
        this.zzvv = zzewVar;
        this.zzvx = executor;
        this.zzvy = zzgoVar;
        this.zzvz = new zzds(this, zzdpxVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void zzbq() {
        long currentTimeMillis = System.currentTimeMillis();
        zzdrn zzp = zzp(zzdry.zzhkz);
        if (zzp != null && !zzp.zza()) {
            this.zzvu.zzb(zzp);
        } else {
            this.zzvw.zzg(4013, System.currentTimeMillis() - currentTimeMillis);
        }
    }

    public final void zzbr() {
        this.zzvx.execute(new zzdr(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa A[Catch: zzegz -> 0x0118, TryCatch #0 {zzegz -> 0x0118, blocks: (B:6:0x0022, B:8:0x0033, B:11:0x003a, B:13:0x0058, B:15:0x0066, B:18:0x0072, B:31:0x00aa, B:33:0x00b7, B:37:0x00d0, B:43:0x00e9, B:45:0x00f6, B:40:0x00da, B:41:0x00e1, B:21:0x007b, B:24:0x0082, B:26:0x0094, B:47:0x010b), top: B:52:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7 A[Catch: zzegz -> 0x0118, TryCatch #0 {zzegz -> 0x0118, blocks: (B:6:0x0022, B:8:0x0033, B:11:0x003a, B:13:0x0058, B:15:0x0066, B:18:0x0072, B:31:0x00aa, B:33:0x00b7, B:37:0x00d0, B:43:0x00e9, B:45:0x00f6, B:40:0x00da, B:41:0x00e1, B:21:0x007b, B:24:0x0082, B:26:0x0094, B:47:0x010b), top: B:52:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzbs() {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdp.zzbs():void");
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final void zza(MotionEvent motionEvent) {
        zzdqe zzawh = this.zzvu.zzawh();
        if (zzawh != null) {
            try {
                zzawh.zza(null, motionEvent);
            } catch (zzdrx e) {
                this.zzvw.zza(e.zzawg(), -1L, e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final String zza(Context context, String str, View view, Activity activity) {
        zzbt();
        zzdqe zzawh = this.zzvu.zzawh();
        if (zzawh != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String zza = zzawh.zza(context, null, str, view, activity);
            this.zzvw.zza(5000, System.currentTimeMillis() - currentTimeMillis, zza, null);
            return zza;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final String zza(Context context, String str, View view) {
        return zza(context, str, view, (Activity) null);
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final void zzb(View view) {
        this.zzvv.zzc(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final String zza(Context context, View view, Activity activity) {
        zzbt();
        zzdqe zzawh = this.zzvu.zzawh();
        if (zzawh != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String zzb = zzawh.zzb(context, null, view, activity);
            this.zzvw.zza(5002, System.currentTimeMillis() - currentTimeMillis, zzb, null);
            return zzb;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final String zzb(Context context) {
        zzbt();
        zzdqe zzawh = this.zzvu.zzawh();
        if (zzawh != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String zzv = zzawh.zzv(context, null);
            this.zzvw.zza(5001, System.currentTimeMillis() - currentTimeMillis, zzv, null);
            return zzv;
        }
        return "";
    }

    private final void zzbt() {
        if (this.zzwc) {
            return;
        }
        synchronized (this.zzwb) {
            if (!this.zzwc) {
                if ((System.currentTimeMillis() / 1000) - this.zzwa < 3600) {
                    return;
                }
                zzdrn zzawi = this.zzvu.zzawi();
                if (zzawi == null || zzawi.zzfg(3600L)) {
                    zzbr();
                }
            }
        }
    }

    private final zzdrn zzp(int i) {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcqf)).booleanValue()) {
            return this.zzvt.zzp(i);
        }
        return this.zzvs.zzp(i);
    }
}
