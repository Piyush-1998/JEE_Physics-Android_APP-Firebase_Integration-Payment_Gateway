package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzcny implements zzdvi<zzdlj> {
    private final /* synthetic */ zzcnt zzghu;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcny(zzcnt zzcntVar) {
        this.zzghu = zzcntVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final void zzb(Throwable th) {
        Pattern pattern;
        zzcqq zzcqqVar;
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcvx)).booleanValue()) {
            pattern = zzcnt.zzghr;
            Matcher matcher = pattern.matcher(th.getMessage());
            if (matcher.matches()) {
                String group = matcher.group(1);
                zzcqqVar = this.zzghu.zzghq;
                zzcqqVar.zzdz(Integer.parseInt(group));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final /* synthetic */ void onSuccess(zzdlj zzdljVar) {
        zzcqq zzcqqVar;
        zzcqq zzcqqVar2;
        zzdlj zzdljVar2 = zzdljVar;
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcvx)).booleanValue()) {
            zzcqqVar = this.zzghu.zzghq;
            zzcqqVar.zzdz(zzdljVar2.zzhbq.zzhbn.responseCode);
            zzcqqVar2 = this.zzghu.zzghq;
            zzcqqVar2.zzeo(zzdljVar2.zzhbq.zzhbn.zzgjr);
        }
    }
}
