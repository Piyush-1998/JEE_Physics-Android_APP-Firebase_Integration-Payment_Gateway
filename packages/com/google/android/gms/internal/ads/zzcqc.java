package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcqc implements zzdoq<zzcqb, zzcqe> {
    private final String zzdqr;
    private final zzatc zzgiy;
    private final String zzgjo;
    private final int zzgjp;
    private final Context zzvr;

    public zzcqc(Context context, String str, zzatc zzatcVar, String str2, int i) {
        this.zzvr = context;
        this.zzgjo = str;
        this.zzgiy = zzatcVar;
        this.zzdqr = str2;
        this.zzgjp = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x024b, code lost:
        r2 = new java.lang.StringBuilder(46);
        r2.append("Received error HTTP response code: ");
        r2.append(r11);
        com.google.android.gms.internal.ads.zzaxy.zzfe(r2.toString());
        r4 = com.google.android.gms.internal.ads.zzdmd.zzhco;
        r5 = new java.lang.StringBuilder(46);
        r5.append("Received error HTTP response code: ");
        r5.append(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0275, code lost:
        throw new com.google.android.gms.internal.ads.zzcmt(r4, r5.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.android.gms.internal.ads.zzcqe zza(java.lang.String r21, com.google.android.gms.internal.ads.zzasv r22, org.json.JSONObject r23, java.lang.String r24) throws com.google.android.gms.internal.ads.zzcmt {
        /*
            Method dump skipped, instructions count: 681
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcqc.zza(java.lang.String, com.google.android.gms.internal.ads.zzasv, org.json.JSONObject, java.lang.String):com.google.android.gms.internal.ads.zzcqe");
    }

    @Override // com.google.android.gms.internal.ads.zzdoq
    public final /* synthetic */ zzcqe apply(zzcqb zzcqbVar) throws Exception {
        zzasv zzasvVar;
        zzasv zzasvVar2;
        JSONObject jSONObject;
        zzcqb zzcqbVar2 = zzcqbVar;
        zzasvVar = zzcqbVar2.zzgji;
        String url = zzasvVar.getUrl();
        zzasvVar2 = zzcqbVar2.zzgji;
        jSONObject = zzcqbVar2.zzgjh;
        return zza(url, zzasvVar2, jSONObject, this.zzdqr);
    }
}
