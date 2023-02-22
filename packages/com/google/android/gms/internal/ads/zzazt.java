package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzazt {
    private static zzae zzebu;
    private static final Object zzebv = new Object();
    @Deprecated
    private static final zzazx<Void> zzebw = new zzazs();

    public zzazt(Context context) {
        zzbk(context.getApplicationContext() != null ? context.getApplicationContext() : context);
    }

    public static zzdvt<zzy> zzev(String str) {
        zzbbq zzbbqVar = new zzbbq();
        zzebu.zze(new zzazz(str, zzbbqVar));
        return zzbbqVar;
    }

    public final zzdvt<String> zza(int i, String str, Map<String, String> map, byte[] bArr) {
        zzazw zzazwVar = new zzazw(null);
        zzazv zzazvVar = new zzazv(this, str, zzazwVar);
        zzbax zzbaxVar = new zzbax(null);
        zzazu zzazuVar = new zzazu(this, i, str, zzazwVar, zzazvVar, bArr, map, zzbaxVar);
        if (zzbax.isEnabled()) {
            try {
                zzbaxVar.zza(str, "GET", zzazuVar.getHeaders(), zzazuVar.zzg());
            } catch (zzl e) {
                zzaxy.zzfe(e.getMessage());
            }
        }
        zzebu.zze(zzazuVar);
        return zzazwVar;
    }

    public final zzdvt<String> zzc(String str, Map<String, String> map) {
        return zza(0, str, map, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027 A[Catch: all -> 0x0036, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0010, B:13:0x0027, B:15:0x0030, B:14:0x002c, B:16:0x0032, B:17:0x0034), top: B:22:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c A[Catch: all -> 0x0036, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0010, B:13:0x0027, B:15:0x0030, B:14:0x002c, B:16:0x0032, B:17:0x0034), top: B:22:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.zzae zzbk(android.content.Context r3) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzazt.zzebv
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzae r1 = com.google.android.gms.internal.ads.zzazt.zzebu     // Catch: java.lang.Throwable -> L36
            if (r1 != 0) goto L32
            com.google.android.gms.internal.ads.zzaat.initialize(r3)     // Catch: java.lang.Throwable -> L36
            boolean r1 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()     // Catch: java.lang.Throwable -> L36
            if (r1 != 0) goto L24
            com.google.android.gms.internal.ads.zzaai<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.zzaat.zzcsu     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.zzaap r2 = com.google.android.gms.internal.ads.zzwe.zzpu()     // Catch: java.lang.Throwable -> L36
            java.lang.Object r1 = r2.zzd(r1)     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L36
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L24
            r1 = 1
            goto L25
        L24:
            r1 = 0
        L25:
            if (r1 == 0) goto L2c
            com.google.android.gms.internal.ads.zzae r3 = com.google.android.gms.internal.ads.zzazi.zzbj(r3)     // Catch: java.lang.Throwable -> L36
            goto L30
        L2c:
            com.google.android.gms.internal.ads.zzae r3 = com.google.android.gms.internal.ads.zzbk.zza(r3)     // Catch: java.lang.Throwable -> L36
        L30:
            com.google.android.gms.internal.ads.zzazt.zzebu = r3     // Catch: java.lang.Throwable -> L36
        L32:
            com.google.android.gms.internal.ads.zzae r3 = com.google.android.gms.internal.ads.zzazt.zzebu     // Catch: java.lang.Throwable -> L36
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            return r3
        L36:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzazt.zzbk(android.content.Context):com.google.android.gms.internal.ads.zzae");
    }
}
