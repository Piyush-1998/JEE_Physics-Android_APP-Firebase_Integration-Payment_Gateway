package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbjs {
    private zzbke zzerw;
    private zzbih zzerx;
    private zzdpq zzfht;
    private zzbkn zzfhu;
    private zzdmg zzfhv;

    private zzbjs() {
    }

    public final zzbjs zzc(zzbih zzbihVar) {
        this.zzerx = (zzbih) zzelu.checkNotNull(zzbihVar);
        return this;
    }

    public final zzbjs zza(zzbke zzbkeVar) {
        this.zzerw = (zzbke) zzelu.checkNotNull(zzbkeVar);
        return this;
    }

    public final zzbii zzafx() {
        zzelu.zza(this.zzerx, zzbih.class);
        zzelu.zza(this.zzerw, zzbke.class);
        if (this.zzfht == null) {
            this.zzfht = new zzdpq();
        }
        if (this.zzfhu == null) {
            this.zzfhu = new zzbkn();
        }
        if (this.zzfhv == null) {
            this.zzfhv = new zzdmg();
        }
        return new zzbjc(this.zzerx, this.zzerw, this.zzfht, this.zzfhu, this.zzfhv);
    }
}
