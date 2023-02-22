package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbeb implements zzhf, zzmy, zzpa<zzom>, zzqd {
    private static int zzeju;
    private static int zzejv;
    private int bytesTransferred;
    private final zzbdf zzeiw;
    private final zzhx zzejx;
    private zzhc zzeka;
    private ByteBuffer zzekb;
    private boolean zzekc;
    private zzbei zzekd;
    private final Context zzvr;
    private Set<WeakReference<zzbdu>> zzeke = new HashSet();
    private final zzbdy zzejw = new zzbdy();
    private final zzhx zzejy = new zzjb(zzlw.zzbcs);
    private final zzoa zzejz = new zznv();

    public zzbeb(Context context, zzbdf zzbdfVar) {
        this.zzvr = context;
        this.zzeiw = zzbdfVar;
        this.zzejx = new zzpx(this.zzvr, zzlw.zzbcs, 0L, zzayh.zzeaj, this, -1);
        if (zzaxy.zzww()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb.append("ExoPlayerAdapter initialize ");
            sb.append(valueOf);
            zzaxy.zzei(sb.toString());
        }
        zzeju++;
        zzhc zza = zzhg.zza(new zzhx[]{this.zzejy, this.zzejx}, this.zzejz, this.zzejw);
        this.zzeka = zza;
        zza.zza(this);
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final void zza(Surface surface) {
    }

    @Override // com.google.android.gms.internal.ads.zzhf
    public final void zza(zzhu zzhuVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzhf
    public final void zza(zzhy zzhyVar, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzhf
    public final void zza(zznp zznpVar, zzod zzodVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final void zzd(String str, long j, long j2) {
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final void zze(int i, long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final void zze(zzjl zzjlVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzpa
    public final /* bridge */ /* synthetic */ void zze(zzom zzomVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzhf
    public final void zzel() {
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final void zzf(zzjl zzjlVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzhf
    public final void zzg(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final void zzk(zzho zzhoVar) {
    }

    public final zzhc zzaaq() {
        return this.zzeka;
    }

    public static int zzaar() {
        return zzeju;
    }

    public static int zzaas() {
        return zzejv;
    }

    public final void zza(zzbei zzbeiVar) {
        this.zzekd = zzbeiVar;
    }

    public final zzbdy zzaat() {
        return this.zzejw;
    }

    public final void zza(Uri[] uriArr, String str) {
        zza(uriArr, str, ByteBuffer.allocate(0), false);
    }

    public final void zza(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zzmz zzneVar;
        if (this.zzeka == null) {
            return;
        }
        this.zzekb = byteBuffer;
        this.zzekc = z;
        if (uriArr.length == 1) {
            zzneVar = zzb(uriArr[0], str);
        } else {
            zzmz[] zzmzVarArr = new zzmz[uriArr.length];
            for (int i = 0; i < uriArr.length; i++) {
                zzmzVarArr[i] = zzb(uriArr[i], str);
            }
            zzneVar = new zzne(zzmzVarArr);
        }
        this.zzeka.zza(zzneVar);
        zzejv++;
    }

    public final void release() {
        zzhc zzhcVar = this.zzeka;
        if (zzhcVar != null) {
            zzhcVar.zzb(this);
            this.zzeka.release();
            this.zzeka = null;
            zzejv--;
        }
    }

    public final long getBytesTransferred() {
        return this.bytesTransferred;
    }

    @Override // com.google.android.gms.internal.ads.zzmy
    public final void zzb(IOException iOException) {
        zzbei zzbeiVar = this.zzekd;
        if (zzbeiVar != null) {
            zzbeiVar.zza("onLoadError", iOException);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final void zza(int i, int i2, int i3, float f) {
        zzbei zzbeiVar = this.zzekd;
        if (zzbeiVar != null) {
            zzbeiVar.zzn(i, i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhf
    public final void zza(boolean z, int i) {
        zzbei zzbeiVar = this.zzekd;
        if (zzbeiVar != null) {
            zzbeiVar.zzdq(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhf
    public final void zza(zzhd zzhdVar) {
        zzbei zzbeiVar = this.zzekd;
        if (zzbeiVar != null) {
            zzbeiVar.zza("onPlayerError", zzhdVar);
        }
    }

    public final void zzdp(int i) {
        for (WeakReference<zzbdu> weakReference : this.zzeke) {
            zzbdu zzbduVar = weakReference.get();
            if (zzbduVar != null) {
                zzbduVar.setReceiveBufferSize(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(Surface surface, boolean z) {
        if (this.zzeka == null) {
            return;
        }
        zzhh zzhhVar = new zzhh(this.zzejx, 1, surface);
        if (z) {
            this.zzeka.zzb(zzhhVar);
        } else {
            this.zzeka.zza(zzhhVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(float f, boolean z) {
        if (this.zzeka == null) {
            return;
        }
        zzhh zzhhVar = new zzhh(this.zzejy, 2, Float.valueOf(f));
        if (z) {
            this.zzeka.zzb(zzhhVar);
        } else {
            this.zzeka.zza(zzhhVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzaw(boolean z) {
        if (this.zzeka == null) {
            return;
        }
        for (int i = 0; i < this.zzeka.zzej(); i++) {
            this.zzejz.zzf(i, !z);
        }
    }

    private final zzmz zzb(Uri uri, final String str) {
        final zzol zzolVar;
        zzka zzkaVar;
        if (this.zzekc && this.zzekb.limit() > 0) {
            final byte[] bArr = new byte[this.zzekb.limit()];
            this.zzekb.get(bArr);
            zzolVar = new zzol(bArr) { // from class: com.google.android.gms.internal.ads.zzbea
                private final byte[] zzedn;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzedn = bArr;
                }

                @Override // com.google.android.gms.internal.ads.zzol
                public final zzom zzin() {
                    return new zzoj(this.zzedn);
                }
            };
        } else {
            if (this.zzeiw.zzeic > 0) {
                zzolVar = new zzol(this, str) { // from class: com.google.android.gms.internal.ads.zzbed
                    private final String zzdft;
                    private final zzbeb zzekf;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzekf = this;
                        this.zzdft = str;
                    }

                    @Override // com.google.android.gms.internal.ads.zzol
                    public final zzom zzin() {
                        return this.zzekf.zzfm(this.zzdft);
                    }
                };
            } else {
                zzolVar = new zzol(this, str) { // from class: com.google.android.gms.internal.ads.zzbec
                    private final String zzdft;
                    private final zzbeb zzekf;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzekf = this;
                        this.zzdft = str;
                    }

                    @Override // com.google.android.gms.internal.ads.zzol
                    public final zzom zzin() {
                        return this.zzekf.zzfl(this.zzdft);
                    }
                };
            }
            if (this.zzeiw.zzeid) {
                zzolVar = new zzol(this, zzolVar) { // from class: com.google.android.gms.internal.ads.zzbef
                    private final zzbeb zzekf;
                    private final zzol zzekh;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzekf = this;
                        this.zzekh = zzolVar;
                    }

                    @Override // com.google.android.gms.internal.ads.zzol
                    public final zzom zzin() {
                        return this.zzekf.zza(this.zzekh);
                    }
                };
            }
            if (this.zzekb.limit() > 0) {
                final byte[] bArr2 = new byte[this.zzekb.limit()];
                this.zzekb.get(bArr2);
                zzolVar = new zzol(zzolVar, bArr2) { // from class: com.google.android.gms.internal.ads.zzbee
                    private final byte[] zzdtc;
                    private final zzol zzekg;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzekg = zzolVar;
                        this.zzdtc = bArr2;
                    }

                    @Override // com.google.android.gms.internal.ads.zzol
                    public final zzom zzin() {
                        zzol zzolVar2 = this.zzekg;
                        byte[] bArr3 = this.zzdtc;
                        return new zzbel(new zzoj(bArr3), bArr3.length, zzolVar2.zzin());
                    }
                };
            }
        }
        zzol zzolVar2 = zzolVar;
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzclv)).booleanValue()) {
            zzkaVar = zzbeh.zzeki;
        } else {
            zzkaVar = zzbeg.zzeki;
        }
        return new zzmv(uri, zzolVar2, zzkaVar, this.zzeiw.zzeie, zzayh.zzeaj, this, null, this.zzeiw.zzeia);
    }

    public final void finalize() throws Throwable {
        zzeju--;
        if (zzaxy.zzww()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
            sb.append("ExoPlayerAdapter finalize ");
            sb.append(valueOf);
            zzaxy.zzei(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpa
    public final /* synthetic */ void zzc(zzom zzomVar, int i) {
        this.bytesTransferred += i;
    }

    @Override // com.google.android.gms.internal.ads.zzpa
    public final /* synthetic */ void zza(zzom zzomVar, zzon zzonVar) {
        this.bytesTransferred = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzom zza(zzol zzolVar) {
        return new zzbdw(this.zzvr, zzolVar.zzin(), this, new zzbdz(this) { // from class: com.google.android.gms.internal.ads.zzbej
            private final zzbeb zzekf;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzekf = this;
            }

            @Override // com.google.android.gms.internal.ads.zzbdz
            public final void zzb(boolean z, long j) {
                this.zzekf.zzd(z, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(boolean z, long j) {
        zzbei zzbeiVar = this.zzekd;
        if (zzbeiVar != null) {
            zzbeiVar.zzb(z, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzom zzfl(String str) {
        return new zzop(str, null, this.zzeiw.zzeid ? null : this, this.zzeiw.zzehx, this.zzeiw.zzehz, true, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzom zzfm(String str) {
        zzbdu zzbduVar = new zzbdu(str, this.zzeiw.zzeid ? null : this, this.zzeiw.zzehx, this.zzeiw.zzehz, this.zzeiw.zzeic);
        this.zzeke.add(new WeakReference<>(zzbduVar));
        return zzbduVar;
    }
}
