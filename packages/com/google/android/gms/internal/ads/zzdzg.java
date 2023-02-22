package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdzw;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzdzg implements zzedk {
    private final String zzhsx;
    private final int zzhsy;
    private zzeam zzhsz;
    private zzdzw zzhta;
    private int zzhtb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdzg(zzebw zzebwVar) throws GeneralSecurityException {
        String zzbay = zzebwVar.zzbay();
        this.zzhsx = zzbay;
        if (zzbay.equals(zzdxs.zzhru)) {
            try {
                zzeap zzl = zzeap.zzl(zzebwVar.zzbaz(), zzegc.zzbex());
                this.zzhsz = (zzeam) zzdxm.zzb(zzebwVar);
                this.zzhsy = zzl.getKeySize();
            } catch (zzegz e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        } else if (this.zzhsx.equals(zzdxs.zzhrt)) {
            try {
                zzdzz zzf = zzdzz.zzf(zzebwVar.zzbaz(), zzegc.zzbex());
                this.zzhta = (zzdzw) zzdxm.zzb(zzebwVar);
                this.zzhtb = zzf.zzayu().getKeySize();
                this.zzhsy = this.zzhtb + zzf.zzayv().getKeySize();
            } catch (zzegz e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e2);
            }
        } else {
            String valueOf = String.valueOf(this.zzhsx);
            throw new GeneralSecurityException(valueOf.length() != 0 ? "unsupported AEAD DEM key type: ".concat(valueOf) : new String("unsupported AEAD DEM key type: "));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzedk
    public final int zzayh() {
        return this.zzhsy;
    }

    @Override // com.google.android.gms.internal.ads.zzedk
    public final zzdwq zzn(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length != this.zzhsy) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        }
        if (this.zzhsx.equals(zzdxs.zzhru)) {
            return (zzdwq) zzdxm.zza(this.zzhsx, (zzeam) ((zzegp) zzeam.zzazm().zza(this.zzhsz).zzw(zzeff.zzi(bArr, 0, this.zzhsy)).zzbfx()), zzdwq.class);
        } else if (this.zzhsx.equals(zzdxs.zzhrt)) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.zzhtb);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.zzhtb, this.zzhsy);
            zzdzw.zza zzb = zzdzw.zzays().zzet(this.zzhta.getVersion()).zzb((zzeaa) ((zzegp) zzeaa.zzayy().zza(this.zzhta.zzayq()).zzu(zzeff.zzu(copyOfRange)).zzbfx()));
            return (zzdwq) zzdxm.zza(this.zzhsx, (zzdzw) ((zzegp) zzb.zzb((zzebl) ((zzegp) zzebl.zzbaq().zza(this.zzhta.zzayr()).zzad(zzeff.zzu(copyOfRange2)).zzbfx())).zzbfx()), zzdwq.class);
        } else {
            throw new GeneralSecurityException("unknown DEM key type");
        }
    }
}
