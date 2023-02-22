package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzaat;
import com.google.android.gms.internal.ads.zzaxy;
import com.google.android.gms.internal.ads.zzbat;
import com.google.android.gms.internal.ads.zzbbg;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzcw;
import com.google.android.gms.internal.ads.zzdp;
import com.google.android.gms.internal.ads.zzdw;
import com.google.android.gms.internal.ads.zzed;
import com.google.android.gms.internal.ads.zzwe;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzf implements zzdw, Runnable {
    private zzbbg zzbop;
    private Context zzvr;
    private final int zzxo;
    private final List<Object[]> zzbom = new Vector();
    private final AtomicReference<zzdw> zzbon = new AtomicReference<>();
    private final AtomicReference<zzdw> zzboo = new AtomicReference<>();
    private CountDownLatch zzboq = new CountDownLatch(1);

    public zzf(Context context, zzbbg zzbbgVar) {
        this.zzvr = context;
        this.zzbop = zzbbgVar;
        int intValue = ((Integer) zzwe.zzpu().zzd(zzaat.zzcqg)).intValue();
        if (intValue == 1) {
            this.zzxo = zzcw.zznk;
        } else if (intValue == 2) {
            this.zzxo = zzcw.zznl;
        } else {
            this.zzxo = zzcw.zznj;
        }
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcqw)).booleanValue()) {
            zzbbi.zzedu.execute(this);
            return;
        }
        zzwe.zzpq();
        if (zzbat.zzyn()) {
            zzbbi.zzedu.execute(this);
        } else {
            run();
        }
    }

    private final boolean zzjy() {
        try {
            this.zzboq.await();
            return true;
        } catch (InterruptedException e) {
            zzaxy.zzd("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    private final void zzjz() {
        zzdw zzca = zzca();
        if (this.zzbom.isEmpty() || zzca == null) {
            return;
        }
        for (Object[] objArr : this.zzbom) {
            if (objArr.length == 1) {
                zzca.zza((MotionEvent) objArr[0]);
            } else if (objArr.length == 3) {
                zzca.zza(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        this.zzbom.clear();
    }

    private static Context zze(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final String zzb(Context context) {
        zzdw zzdwVar;
        if (zzjy()) {
            if (this.zzxo == zzcw.zznk || this.zzxo == zzcw.zznl) {
                zzdwVar = this.zzboo.get();
            } else {
                zzdwVar = this.zzbon.get();
            }
            if (zzdwVar != null) {
                zzjz();
                return zzdwVar.zzb(zze(context));
            }
            return "";
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final String zza(Context context, View view, Activity activity) {
        zzdw zzca = zzca();
        return zzca != null ? zzca.zza(context, view, activity) : "";
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final String zza(Context context, String str, View view) {
        return zza(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final String zza(Context context, String str, View view, Activity activity) {
        zzdw zzca;
        if (!zzjy() || (zzca = zzca()) == null) {
            return "";
        }
        zzjz();
        return zzca.zza(zze(context), str, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final void zzb(View view) {
        zzdw zzca = zzca();
        if (zzca != null) {
            zzca.zzb(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final void zza(MotionEvent motionEvent) {
        zzdw zzca = zzca();
        if (zzca != null) {
            zzjz();
            zzca.zza(motionEvent);
            return;
        }
        this.zzbom.add(new Object[]{motionEvent});
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final void zza(int i, int i2, int i3) {
        zzdw zzca = zzca();
        if (zzca != null) {
            zzjz();
            zzca.zza(i, i2, i3);
            return;
        }
        this.zzbom.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.content.Context, com.google.android.gms.internal.ads.zzbbg] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z = false;
        try {
            boolean z2 = this.zzbop.zzeds;
            if (!((Boolean) zzwe.zzpu().zzd(zzaat.zzcoi)).booleanValue() && z2) {
                z = true;
            }
            if (this.zzxo != zzcw.zznk) {
                this.zzbon.set(zzed.zzb(this.zzbop.zzbra, zze(this.zzvr), z, this.zzxo));
            }
            if (this.zzxo != zzcw.zznj) {
                this.zzboo.set(zzdp.zza(this.zzbop.zzbra, zze(this.zzvr), z));
            }
        } finally {
            this.zzboq.countDown();
            this.zzvr = null;
            this.zzbop = null;
        }
    }

    private final zzdw zzca() {
        if (this.zzxo == zzcw.zznk) {
            return this.zzboo.get();
        }
        return this.zzbon.get();
    }
}
