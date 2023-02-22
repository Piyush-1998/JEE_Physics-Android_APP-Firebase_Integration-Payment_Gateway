package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzfe {
    static zzdwt zzaaa;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzb(zzex zzexVar) throws IllegalAccessException, InvocationTargetException {
        Method zza;
        zzdwt zza2;
        if (zzaaa != null) {
            return true;
        }
        String str = (String) zzwe.zzpu().zzd(zzaat.zzcqt);
        if (str == null || str.length() == 0) {
            str = (zzexVar == null || (zza = zzexVar.zza("TkuK+8ZKbIcxeUe4msY7eeifKf/tICuqqRvwzwQUhsKM0HemvJhBrPQYp0qpvgcE", "eNJuSXkridnHpFkTgNBQFH0ivDH801goaJfT5bONEac=")) == null) ? null : (String) zza.invoke(null, new Object[0]);
            if (str == null) {
                return false;
            }
        }
        try {
            zzdxc zzm = zzdxg.zzm(zzcv.zzb(str, true));
            for (zzeca zzecaVar : zzdyz.zzhsa.zzbck()) {
                if (zzecaVar.zzbay().isEmpty()) {
                    throw new GeneralSecurityException("Missing type_url.");
                }
                if (zzecaVar.zzbbg().isEmpty()) {
                    throw new GeneralSecurityException("Missing primitive_name.");
                }
                if (zzecaVar.zzbbj().isEmpty()) {
                    throw new GeneralSecurityException("Missing catalogue_name.");
                }
                if (!zzecaVar.zzbbj().equals("TinkAead") && !zzecaVar.zzbbj().equals("TinkMac") && !zzecaVar.zzbbj().equals("TinkHybridDecrypt") && !zzecaVar.zzbbj().equals("TinkHybridEncrypt") && !zzecaVar.zzbbj().equals("TinkPublicKeySign") && !zzecaVar.zzbbj().equals("TinkPublicKeyVerify") && !zzecaVar.zzbbj().equals("TinkStreamingAead") && !zzecaVar.zzbbj().equals("TinkDeterministicAead")) {
                    zzdwp<?> zzhn = zzdxm.zzhn(zzecaVar.zzbbj());
                    zzdxm.zza(zzhn.zzaxo());
                    zzdxm.zza(zzhn.zzb(zzecaVar.zzbay(), zzecaVar.zzbbg(), zzecaVar.zzbbh()), zzecaVar.zzbbi());
                }
            }
            zza2 = zzdza.zza(zzm, null);
            zzaaa = zza2;
        } catch (IllegalArgumentException | GeneralSecurityException unused) {
        }
        return zza2 != null;
    }
}
