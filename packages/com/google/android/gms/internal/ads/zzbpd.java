package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public class zzbpd {
    protected final zzdlj zzflg;
    protected final zzdkx zzfpf;
    private final zzbto zzfps;
    private final zzbue zzfpt;
    private final zzdiw zzfpu;
    private final zzbsp zzfpv;
    private final zzbvi zzfpw;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzbpd(zzbpg zzbpgVar) {
        this.zzflg = zzbpg.zza(zzbpgVar);
        this.zzfpf = zzbpg.zzb(zzbpgVar);
        this.zzfps = zzbpg.zzc(zzbpgVar);
        this.zzfpt = zzbpg.zzd(zzbpgVar);
        this.zzfpu = zzbpg.zze(zzbpgVar);
        this.zzfpv = zzbpg.zzf(zzbpgVar);
        this.zzfpw = zzbpg.zzg(zzbpgVar);
    }

    public final zzbto zzail() {
        return this.zzfps;
    }

    public void zzahw() {
        this.zzfpt.onAdLoaded();
    }

    public final zzbsp zzaim() {
        return this.zzfpv;
    }

    public void destroy() {
        this.zzfps.zzcb(null);
    }

    public final zzdiw zzain() {
        return this.zzfpu;
    }

    public final zzbwh zzaio() {
        return this.zzfpw.zzaio();
    }
}
