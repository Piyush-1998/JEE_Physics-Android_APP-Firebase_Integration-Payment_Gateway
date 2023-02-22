package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzclm implements zzdpl {
    private final Clock zzbpw;
    private final zzclg zzgfk;
    private final Map<zzdpg, Long> zzgfj = new HashMap();
    private final Map<zzdpg, zzcll> zzgfl = new HashMap();

    public zzclm(zzclg zzclgVar, Set<zzcll> set, Clock clock) {
        zzdpg zzdpgVar;
        this.zzgfk = zzclgVar;
        for (zzcll zzcllVar : set) {
            Map<zzdpg, zzcll> map = this.zzgfl;
            zzdpgVar = zzcllVar.zzgfi;
            map.put(zzdpgVar, zzcllVar);
        }
        this.zzbpw = clock;
    }

    @Override // com.google.android.gms.internal.ads.zzdpl
    public final void zza(zzdpg zzdpgVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdpl
    public final void zzb(zzdpg zzdpgVar, String str) {
        this.zzgfj.put(zzdpgVar, Long.valueOf(this.zzbpw.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.zzdpl
    public final void zza(zzdpg zzdpgVar, String str, Throwable th) {
        if (this.zzgfj.containsKey(zzdpgVar)) {
            long elapsedRealtime = this.zzbpw.elapsedRealtime() - this.zzgfj.get(zzdpgVar).longValue();
            Map<String, String> zzrr = this.zzgfk.zzrr();
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task.");
            String valueOf2 = String.valueOf(Long.toString(elapsedRealtime));
            zzrr.put(concat, valueOf2.length() != 0 ? "f.".concat(valueOf2) : new String("f."));
        }
        if (this.zzgfl.containsKey(zzdpgVar)) {
            zza(zzdpgVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdpl
    public final void zzc(zzdpg zzdpgVar, String str) {
        if (this.zzgfj.containsKey(zzdpgVar)) {
            long elapsedRealtime = this.zzbpw.elapsedRealtime() - this.zzgfj.get(zzdpgVar).longValue();
            Map<String, String> zzrr = this.zzgfk.zzrr();
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task.");
            String valueOf2 = String.valueOf(Long.toString(elapsedRealtime));
            zzrr.put(concat, valueOf2.length() != 0 ? "s.".concat(valueOf2) : new String("s."));
        }
        if (this.zzgfl.containsKey(zzdpgVar)) {
            zza(zzdpgVar, true);
        }
    }

    private final void zza(zzdpg zzdpgVar, boolean z) {
        zzdpg zzdpgVar2;
        String str;
        zzdpgVar2 = this.zzgfl.get(zzdpgVar).zzgfh;
        String str2 = z ? "s." : "f.";
        if (this.zzgfj.containsKey(zzdpgVar2)) {
            long elapsedRealtime = this.zzbpw.elapsedRealtime() - this.zzgfj.get(zzdpgVar2).longValue();
            Map<String, String> zzrr = this.zzgfk.zzrr();
            str = this.zzgfl.get(zzdpgVar).label;
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "label.".concat(valueOf) : new String("label.");
            String valueOf2 = String.valueOf(Long.toString(elapsedRealtime));
            zzrr.put(concat, valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2));
        }
    }
}
