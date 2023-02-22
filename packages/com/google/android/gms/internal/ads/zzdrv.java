package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdrv {
    private static final Object zzhkx = new Object();
    private final SharedPreferences zzcld;
    private final String zzhkw;
    private final Context zzvr;

    public zzdrv(Context context, zzgo zzgoVar) {
        this.zzvr = context;
        this.zzhkw = Integer.toString(zzgoVar.zzv());
        this.zzcld = context.getSharedPreferences("pcvmspf", 0);
    }

    public final zzdrn zzp(int i) {
        synchronized (zzhkx) {
            zzgr zzei = zzei(i);
            if (zzei == null) {
                return null;
            }
            File zzhg = zzhg(zzei.zzdg());
            return new zzdrn(zzei, new File(zzhg, "pcam"), new File(zzhg, "pcbc"), new File(zzhg, "pcopt"));
        }
    }

    public final boolean zza(zzgq zzgqVar, zzdrw zzdrwVar) {
        File[] listFiles;
        synchronized (zzhkx) {
            zzgr zzei = zzei(zzdry.zzhkz);
            String zzdg = zzgqVar.zzdc().zzdg();
            if (zzei == null || !zzei.zzdg().equals(zzdg)) {
                if (zzhg(zzdg).mkdirs()) {
                    File zzhg = zzhg(zzdg);
                    File file = new File(zzhg, "pcam");
                    File file2 = new File(zzhg, "pcbc");
                    if (zzdrp.zza(file, zzgqVar.zzdd().toByteArray())) {
                        if (zzdrp.zza(file2, zzgqVar.zzde().toByteArray())) {
                            if (zzdrwVar != null && !zzdrwVar.zzb(file)) {
                                zzdrp.zze(zzhg);
                                return false;
                            }
                            String zzb = zzb(zzgqVar);
                            String string = this.zzcld.getString(zzawf(), null);
                            SharedPreferences.Editor edit = this.zzcld.edit();
                            edit.putString(zzawf(), zzb);
                            if (string != null) {
                                edit.putString(zzawe(), string);
                            }
                            if (edit.commit()) {
                                HashSet hashSet = new HashSet();
                                zzgr zzei2 = zzei(zzdry.zzhkz);
                                if (zzei2 != null) {
                                    hashSet.add(zzei2.zzdg());
                                }
                                zzgr zzei3 = zzei(zzdry.zzhla);
                                if (zzei3 != null) {
                                    hashSet.add(zzei3.zzdg());
                                }
                                for (File file3 : new File(this.zzvr.getDir("pccache", 0), this.zzhkw).listFiles()) {
                                    if (!hashSet.contains(file3.getName())) {
                                        zzdrp.zze(file3);
                                    }
                                }
                                return true;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
    }

    public final boolean zza(zzgq zzgqVar) {
        synchronized (zzhkx) {
            if (zzdrp.zza(new File(zzhg(zzgqVar.zzdc().zzdg()), "pcbc"), zzgqVar.zzde().toByteArray())) {
                String zzb = zzb(zzgqVar);
                SharedPreferences.Editor edit = this.zzcld.edit();
                edit.putString(zzawf(), zzb);
                return edit.commit();
            }
            return false;
        }
    }

    private final zzgr zzei(int i) {
        String string;
        if (i == zzdry.zzhkz) {
            string = this.zzcld.getString(zzawf(), null);
        } else {
            string = i == zzdry.zzhla ? this.zzcld.getString(zzawe(), null) : null;
        }
        if (string == null) {
            return null;
        }
        try {
            return zzgr.zzb(zzeff.zzu(Hex.stringToBytes(string)), zzegc.zzbey());
        } catch (zzegz unused) {
            return null;
        }
    }

    private final File zzhg(String str) {
        return new File(new File(this.zzvr.getDir("pccache", 0), this.zzhkw), str);
    }

    private final String zzawe() {
        String valueOf = String.valueOf(this.zzhkw);
        return valueOf.length() != 0 ? "FBAMTD".concat(valueOf) : new String("FBAMTD");
    }

    private final String zzawf() {
        String valueOf = String.valueOf(this.zzhkw);
        return valueOf.length() != 0 ? "LATMTD".concat(valueOf) : new String("LATMTD");
    }

    private static String zzb(zzgq zzgqVar) {
        return Hex.bytesToStringLowercase(((zzgr) ((zzegp) zzgr.zzdl().zzaw(zzgqVar.zzdc().zzdg()).zzax(zzgqVar.zzdc().zzdh()).zzdk(zzgqVar.zzdc().zzdj()).zzdl(zzgqVar.zzdc().zzdk()).zzdj(zzgqVar.zzdc().zzdi()).zzbfx())).zzbda().toByteArray());
    }
}
