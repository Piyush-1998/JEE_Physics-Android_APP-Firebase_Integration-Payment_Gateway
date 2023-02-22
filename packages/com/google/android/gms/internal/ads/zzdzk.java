package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebt;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdzk extends zzdwx<zzebl> {
    public zzdzk() {
        super(zzebl.class, new zzdzj(zzdxd.class));
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final zzebt.zza zzaxs() {
        return zzebt.zza.SYMMETRIC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(zzebq zzebqVar) throws GeneralSecurityException {
        if (zzebqVar.zzayn() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int i = zzdzl.zzhsu[zzebqVar.zzbav().ordinal()];
        if (i == 1) {
            if (zzebqVar.zzayn() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (i == 2) {
            if (zzebqVar.zzayn() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (i == 3) {
            if (zzebqVar.zzayn() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("unknown hash type");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final zzdxa<?, zzebl> zzaxv() {
        return new zzdzm(this, zzebp.class);
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final /* synthetic */ void zzc(zzebl zzeblVar) throws GeneralSecurityException {
        zzebl zzeblVar2 = zzeblVar;
        zzeej.zzy(zzeblVar2.getVersion(), 0);
        if (zzeblVar2.zzayi().size() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        zza(zzeblVar2.zzbap());
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final /* synthetic */ zzebl zzp(zzeff zzeffVar) throws zzegz {
        return zzebl.zzr(zzeffVar, zzegc.zzbex());
    }
}
