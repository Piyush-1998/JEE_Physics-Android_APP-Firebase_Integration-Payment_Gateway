package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.Hex;
import java.io.File;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdrq {
    private final SharedPreferences zzcld;
    private final File zzhks;
    private final File zzhkt;
    private final zzgo zzvy;

    public zzdrq(Context context, zzgo zzgoVar) {
        this.zzcld = context.getSharedPreferences("pcvmspf", 0);
        this.zzhks = zzdrp.zza(context.getDir("pccache", 0), false);
        this.zzhkt = zzdrp.zza(context.getDir("tmppccache", 0), true);
        this.zzvy = zzgoVar;
    }

    public final zzdrn zzp(int i) {
        zzgr zzei = zzei(i);
        if (zzei == null) {
            return null;
        }
        String zzdg = zzei.zzdg();
        return new zzdrn(zzei, zzdrp.zza(zzdg, "pcam", zzawd()), zzdrp.zza(zzdg, "pcbc", zzawd()), zzdrp.zza(zzdg, "pcopt", zzawd()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0140, code lost:
        if (r0.commit() != false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zza(com.google.android.gms.internal.ads.zzgq r9, com.google.android.gms.internal.ads.zzdrw r10) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdrq.zza(com.google.android.gms.internal.ads.zzgq, com.google.android.gms.internal.ads.zzdrw):boolean");
    }

    private final File zzawd() {
        File file = new File(this.zzhks, Integer.toString(this.zzvy.zzv()));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private static String zza(zzgr zzgrVar) {
        return Hex.bytesToStringLowercase(zzgrVar.zzbda().toByteArray());
    }

    private final String zzawe() {
        int zzv = this.zzvy.zzv();
        StringBuilder sb = new StringBuilder(17);
        sb.append("FBAMTD");
        sb.append(zzv);
        return sb.toString();
    }

    private final String zzawf() {
        int zzv = this.zzvy.zzv();
        StringBuilder sb = new StringBuilder(17);
        sb.append("LATMTD");
        sb.append(zzv);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.android.gms.internal.ads.zzgr zzei(int r6) {
        /*
            r5 = this;
            int r0 = com.google.android.gms.internal.ads.zzdry.zzhkz
            r1 = 0
            if (r6 != r0) goto L10
            android.content.SharedPreferences r6 = r5.zzcld
            java.lang.String r0 = r5.zzawf()
            java.lang.String r6 = r6.getString(r0, r1)
            goto L20
        L10:
            int r0 = com.google.android.gms.internal.ads.zzdry.zzhla
            if (r6 != r0) goto L1f
            android.content.SharedPreferences r6 = r5.zzcld
            java.lang.String r0 = r5.zzawe()
            java.lang.String r6 = r6.getString(r0, r1)
            goto L20
        L1f:
            r6 = r1
        L20:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L27
            return r1
        L27:
            byte[] r6 = com.google.android.gms.common.util.Hex.stringToBytes(r6)     // Catch: com.google.android.gms.internal.ads.zzegz -> L5d
            com.google.android.gms.internal.ads.zzeff r6 = com.google.android.gms.internal.ads.zzeff.zzu(r6)     // Catch: com.google.android.gms.internal.ads.zzegz -> L5d
            com.google.android.gms.internal.ads.zzgr r6 = com.google.android.gms.internal.ads.zzgr.zzl(r6)     // Catch: com.google.android.gms.internal.ads.zzegz -> L5d
            java.lang.String r0 = r6.zzdg()     // Catch: com.google.android.gms.internal.ads.zzegz -> L5d
            java.lang.String r2 = "pcam"
            java.io.File r3 = r5.zzawd()     // Catch: com.google.android.gms.internal.ads.zzegz -> L5d
            java.io.File r2 = com.google.android.gms.internal.ads.zzdrp.zza(r0, r2, r3)     // Catch: com.google.android.gms.internal.ads.zzegz -> L5d
            java.lang.String r3 = "pcbc"
            java.io.File r4 = r5.zzawd()     // Catch: com.google.android.gms.internal.ads.zzegz -> L5d
            java.io.File r0 = com.google.android.gms.internal.ads.zzdrp.zza(r0, r3, r4)     // Catch: com.google.android.gms.internal.ads.zzegz -> L5d
            boolean r2 = r2.exists()     // Catch: com.google.android.gms.internal.ads.zzegz -> L5d
            if (r2 == 0) goto L59
            boolean r0 = r0.exists()     // Catch: com.google.android.gms.internal.ads.zzegz -> L5d
            if (r0 == 0) goto L59
            r0 = 1
            goto L5a
        L59:
            r0 = 0
        L5a:
            if (r0 == 0) goto L5d
            return r6
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdrq.zzei(int):com.google.android.gms.internal.ads.zzgr");
    }
}
