package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.zztw;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcqt {
    private static final SparseArray<zztw.zzo.zzb> zzgkn;
    private final zzbrz zzfqu;
    private final zzcqq zzghq;
    private final TelephonyManager zzgkk;
    private final zzcqk zzgkl;
    private zzug zzgkm;
    private final Context zzvr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcqt(Context context, zzbrz zzbrzVar, zzcqq zzcqqVar, zzcqk zzcqkVar) {
        this.zzvr = context;
        this.zzfqu = zzbrzVar;
        this.zzghq = zzcqqVar;
        this.zzgkl = zzcqkVar;
        this.zzgkk = (TelephonyManager) context.getSystemService("phone");
    }

    private static zzug zzbl(boolean z) {
        return z ? zzug.ENUM_TRUE : zzug.ENUM_FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zztw.zzm zzk(Bundle bundle) {
        zztw.zzm.zzb zzbVar;
        zztw.zzm.zza zzoe = zztw.zzm.zzoe();
        int i = bundle.getInt("cnt", -2);
        int i2 = bundle.getInt("gnt", 0);
        if (i == -1) {
            this.zzgkm = zzug.ENUM_TRUE;
        } else {
            this.zzgkm = zzug.ENUM_FALSE;
            if (i == 0) {
                zzoe.zza(zztw.zzm.zzc.CELL);
            } else if (i == 1) {
                zzoe.zza(zztw.zzm.zzc.WIFI);
            } else {
                zzoe.zza(zztw.zzm.zzc.NETWORKTYPE_UNSPECIFIED);
            }
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    zzbVar = zztw.zzm.zzb.TWO_G;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    zzbVar = zztw.zzm.zzb.THREE_G;
                    break;
                case 13:
                    zzbVar = zztw.zzm.zzb.LTE;
                    break;
                default:
                    zzbVar = zztw.zzm.zzb.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            zzoe.zza(zzbVar);
        }
        return (zztw.zzm) ((zzegp) zzoe.zzbfx());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zztw.zzo.zzb zzl(Bundle bundle) {
        return zzgkn.get(zzdlu.zza(zzdlu.zza(bundle, "device"), "network").getInt("active_network_state", -1), zztw.zzo.zzb.UNSPECIFIED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList<com.google.android.gms.internal.ads.zztw.zzc.zza> zzm(android.os.Bundle r7) {
        /*
            java.lang.String r0 = "ad_types"
            java.lang.Object r7 = r7.get(r0)
            boolean r0 = r7 instanceof java.util.List
            if (r0 == 0) goto Ld
            java.util.List r7 = (java.util.List) r7
            goto L17
        Ld:
            boolean r0 = r7 instanceof java.lang.String[]
            if (r0 == 0) goto L3d
            java.lang.String[] r7 = (java.lang.String[]) r7
            java.util.List r7 = java.util.Arrays.asList(r7)
        L17:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r7.size()
            r0.<init>(r1)
            java.util.Iterator r7 = r7.iterator()
        L24:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L38
            java.lang.Object r1 = r7.next()
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L24
            java.lang.String r1 = (java.lang.String) r1
            r0.add(r1)
            goto L24
        L38:
            java.util.List r7 = java.util.Collections.unmodifiableList(r0)
            goto L41
        L3d:
            java.util.List r7 = java.util.Collections.emptyList()
        L41:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L4a:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto La3
            java.lang.Object r1 = r7.next()
            java.lang.String r1 = (java.lang.String) r1
            r2 = -1
            int r3 = r1.hashCode()
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r3) {
                case -1396342996: goto L80;
                case -1052618729: goto L76;
                case -239580146: goto L6c;
                case 604727084: goto L62;
                default: goto L61;
            }
        L61:
            goto L89
        L62:
            java.lang.String r3 = "interstitial"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L89
            r2 = 1
            goto L89
        L6c:
            java.lang.String r3 = "rewarded"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L89
            r2 = 3
            goto L89
        L76:
            java.lang.String r3 = "native"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L89
            r2 = 2
            goto L89
        L80:
            java.lang.String r3 = "banner"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L89
            r2 = 0
        L89:
            if (r2 == 0) goto L9d
            if (r2 == r6) goto L9a
            if (r2 == r5) goto L97
            if (r2 == r4) goto L94
            com.google.android.gms.internal.ads.zztw$zzc$zza r1 = com.google.android.gms.internal.ads.zztw.zzc.zza.AD_FORMAT_TYPE_UNSPECIFIED
            goto L9f
        L94:
            com.google.android.gms.internal.ads.zztw$zzc$zza r1 = com.google.android.gms.internal.ads.zztw.zzc.zza.REWARD_BASED_VIDEO_AD
            goto L9f
        L97:
            com.google.android.gms.internal.ads.zztw$zzc$zza r1 = com.google.android.gms.internal.ads.zztw.zzc.zza.NATIVE_APP_INSTALL
            goto L9f
        L9a:
            com.google.android.gms.internal.ads.zztw$zzc$zza r1 = com.google.android.gms.internal.ads.zztw.zzc.zza.INTERSTITIAL
            goto L9f
        L9d:
            com.google.android.gms.internal.ads.zztw$zzc$zza r1 = com.google.android.gms.internal.ads.zztw.zzc.zza.BANNER
        L9f:
            r0.add(r1)
            goto L4a
        La3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcqt.zzm(android.os.Bundle):java.util.ArrayList");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] zza(boolean z, ArrayList<zztw.zzc.zza> arrayList, zztw.zzm zzmVar, zztw.zzo.zzb zzbVar) {
        return ((zztw.zzo.zza) ((zzegp) zztw.zzo.zza.zzoi().zze(arrayList).zzh(zzbl(com.google.android.gms.ads.internal.zzp.zzkr().zzb(this.zzvr.getContentResolver()) != 0)).zzi(com.google.android.gms.ads.internal.zzp.zzkr().zza(this.zzvr, this.zzgkk)).zzet(this.zzghq.zzapp()).zzeu(this.zzghq.zzapr()).zzcm(this.zzghq.getResponseCode()).zzb(zzbVar).zzb(zzmVar).zzj(this.zzgkm).zzf(zzbl(z)).zzes(com.google.android.gms.ads.internal.zzp.zzkw().currentTimeMillis()).zzg(zzbl(com.google.android.gms.ads.internal.zzp.zzkr().zza(this.zzvr.getContentResolver()) != 0)).zzbfx())).toByteArray();
    }

    public final void zzbk(boolean z) {
        zzdvl.zza(this.zzfqu.zzajc(), new zzcqw(this, z), zzbbi.zzedz);
    }

    static {
        SparseArray<zztw.zzo.zzb> sparseArray = new SparseArray<>();
        zzgkn = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zztw.zzo.zzb.CONNECTED);
        zzgkn.put(NetworkInfo.DetailedState.AUTHENTICATING.ordinal(), zztw.zzo.zzb.CONNECTING);
        zzgkn.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zztw.zzo.zzb.CONNECTING);
        zzgkn.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zztw.zzo.zzb.CONNECTING);
        zzgkn.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zztw.zzo.zzb.DISCONNECTING);
        zzgkn.put(NetworkInfo.DetailedState.BLOCKED.ordinal(), zztw.zzo.zzb.DISCONNECTED);
        zzgkn.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zztw.zzo.zzb.DISCONNECTED);
        zzgkn.put(NetworkInfo.DetailedState.FAILED.ordinal(), zztw.zzo.zzb.DISCONNECTED);
        zzgkn.put(NetworkInfo.DetailedState.IDLE.ordinal(), zztw.zzo.zzb.DISCONNECTED);
        zzgkn.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zztw.zzo.zzb.DISCONNECTED);
        zzgkn.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zztw.zzo.zzb.SUSPENDED);
        if (Build.VERSION.SDK_INT >= 17) {
            zzgkn.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zztw.zzo.zzb.CONNECTING);
        }
        zzgkn.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zztw.zzo.zzb.CONNECTING);
    }
}
