package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzczu implements zzden<zzczv> {
    private final zzaxk zzbps;
    private final zzdln zzfqn;
    private final zzden<zzdeq> zzgsl;
    private final Context zzvr;

    public zzczu(zzdbj<zzdeq> zzdbjVar, zzdln zzdlnVar, Context context, zzaxk zzaxkVar) {
        this.zzgsl = zzdbjVar;
        this.zzfqn = zzdlnVar;
        this.zzvr = context;
        this.zzbps = zzaxkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final zzdvt<zzczv> zzaqs() {
        return zzdvl.zzb(this.zzgsl.zzaqs(), new zzdsl(this) { // from class: com.google.android.gms.internal.ads.zzczx
            private final zzczu zzgsq;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgsq = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdsl
            public final Object apply(Object obj) {
                return this.zzgsq.zza((zzdeq) obj);
            }
        }, zzbbi.zzedz);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzczv zza(zzdeq zzdeqVar) {
        zzvj[] zzvjVarArr;
        String str;
        boolean z;
        String str2;
        float f;
        int i;
        int i2;
        zzvj[] zzvjVarArr2;
        int i3;
        int i4;
        int i5;
        DisplayMetrics displayMetrics;
        zzvj zzvjVar = this.zzfqn.zzbpb;
        if (zzvjVar.zzcho == null) {
            str = zzvjVar.zzacx;
            z = zzvjVar.zzchp;
        } else {
            str = null;
            boolean z2 = false;
            boolean z3 = false;
            z = false;
            for (zzvj zzvjVar2 : zzvjVar.zzcho) {
                if (!zzvjVar2.zzchp && !z2) {
                    str = zzvjVar2.zzacx;
                    z2 = true;
                }
                if (zzvjVar2.zzchp && !z3) {
                    z3 = true;
                    z = true;
                }
                if (z2 && z3) {
                    break;
                }
            }
        }
        Resources resources = this.zzvr.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            str2 = null;
            f = 0.0f;
            i = 0;
            i2 = 0;
        } else {
            float f2 = displayMetrics.density;
            int i6 = displayMetrics.widthPixels;
            i2 = displayMetrics.heightPixels;
            str2 = this.zzbps.zzwj().zzxk();
            i = i6;
            f = f2;
        }
        StringBuilder sb = new StringBuilder();
        if (zzvjVar.zzcho != null) {
            boolean z4 = false;
            for (zzvj zzvjVar3 : zzvjVar.zzcho) {
                if (zzvjVar3.zzchp) {
                    z4 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    if (zzvjVar3.width == -1 && f != 0.0f) {
                        i4 = (int) (zzvjVar3.widthPixels / f);
                    } else {
                        i4 = zzvjVar3.width;
                    }
                    sb.append(i4);
                    sb.append("x");
                    if (zzvjVar3.height == -2 && f != 0.0f) {
                        i5 = (int) (zzvjVar3.heightPixels / f);
                        sb.append(i5);
                    }
                    i5 = zzvjVar3.height;
                    sb.append(i5);
                }
            }
            if (z4) {
                if (sb.length() != 0) {
                    i3 = 0;
                    sb.insert(0, "|");
                } else {
                    i3 = 0;
                }
                sb.insert(i3, "320x50");
            }
        }
        return new zzczv(zzvjVar, str, z, sb.toString(), f, i, i2, str2, this.zzfqn.zzgso);
    }
}
