package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcud {
    private final Clock zzbpw;
    private final zzcuf zzgnc;
    private final List<String> zzgnd = Collections.synchronizedList(new ArrayList());
    private final boolean zzgne = ((Boolean) zzwe.zzpu().zzd(zzaat.zzcxa)).booleanValue();

    public zzcud(Clock clock, zzcuf zzcufVar) {
        this.zzbpw = clock;
        this.zzgnc = zzcufVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <T> zzdvt<T> zza(zzdkz zzdkzVar, zzdkx zzdkxVar, zzdvt<T> zzdvtVar) {
        long elapsedRealtime = this.zzbpw.elapsedRealtime();
        String str = zzdkxVar.zzdjo;
        if (str != null) {
            zzdvl.zza(zzdvtVar, new zzcug(this, str, elapsedRealtime, zzdkxVar, zzdkzVar), zzbbi.zzedz);
        }
        return zzdvtVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(String str, int i, long j, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33);
        sb.append(str);
        sb.append(".");
        sb.append(i);
        sb.append(".");
        sb.append(j);
        String sb2 = sb.toString();
        if (!TextUtils.isEmpty(str2)) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 1 + String.valueOf(str2).length());
            sb3.append(sb2);
            sb3.append(".");
            sb3.append(str2);
            sb2 = sb3.toString();
        }
        this.zzgnd.add(sb2);
    }

    public final String zzapv() {
        return TextUtils.join("_", this.zzgnd);
    }
}
