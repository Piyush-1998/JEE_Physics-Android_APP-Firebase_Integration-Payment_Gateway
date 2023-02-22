package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbeq extends zzaxu {
    final zzbde zzefm;
    private final String zzefy;
    private final String[] zzefz;
    final zzbev zzekp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbeq(zzbde zzbdeVar, zzbev zzbevVar, String str, String[] strArr) {
        this.zzefm = zzbdeVar;
        this.zzekp = zzbevVar;
        this.zzefy = str;
        this.zzefz = strArr;
        com.google.android.gms.ads.internal.zzp.zzll().zza(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaxu
    public final void zzuy() {
        try {
            this.zzekp.zze(this.zzefy, this.zzefz);
        } finally {
            zzayh.zzeaj.post(new zzbet(this));
        }
    }
}
