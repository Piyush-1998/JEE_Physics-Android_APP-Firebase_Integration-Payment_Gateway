package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.internal.ads.zztq;
import com.google.android.gms.internal.ads.zztw;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzto {
    private final zztt zzbvr;
    private final zztw.zzi.zza zzbvs;
    private final boolean zzbvt;

    public static zzto zzmy() {
        return new zzto();
    }

    public zzto(zztt zzttVar) {
        this.zzbvs = zztw.zzi.zznz();
        this.zzbvr = zzttVar;
        this.zzbvt = ((Boolean) zzwe.zzpu().zzd(zzaat.zzctk)).booleanValue();
    }

    private zzto() {
        this.zzbvs = zztw.zzi.zznz();
        this.zzbvt = false;
        this.zzbvr = new zztt();
    }

    public final synchronized void zza(zztq.zza.zzb zzbVar) {
        if (this.zzbvt) {
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzctl)).booleanValue()) {
                zzc(zzbVar);
            } else {
                zzb(zzbVar);
            }
        }
    }

    private final synchronized void zzb(zztq.zza.zzb zzbVar) {
        this.zzbvs.zznv().zza(zzmz());
        this.zzbvr.zzf(((zztw.zzi) ((zzegp) this.zzbvs.zzbfx())).toByteArray()).zzby(zzbVar.zzv()).zzdv();
        String valueOf = String.valueOf(Integer.toString(zzbVar.zzv(), 10));
        zzaxy.zzei(valueOf.length() != 0 ? "Logging Event with event code : ".concat(valueOf) : new String("Logging Event with event code : "));
    }

    private final synchronized void zzc(zztq.zza.zzb zzbVar) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
            try {
                try {
                    fileOutputStream.write(zzd(zzbVar).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        zzaxy.zzei("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    zzaxy.zzei("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        zzaxy.zzei("Could not close Clearcut output stream.");
                    }
                }
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused4) {
                    zzaxy.zzei("Could not close Clearcut output stream.");
                }
                throw th;
            }
        } catch (FileNotFoundException unused5) {
            zzaxy.zzei("Could not find file for Clearcut");
        }
    }

    private final synchronized String zzd(zztq.zza.zzb zzbVar) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", this.zzbvs.zznu(), Long.valueOf(com.google.android.gms.ads.internal.zzp.zzkw().elapsedRealtime()), Integer.valueOf(zzbVar.zzv()), Base64.encodeToString(((zztw.zzi) ((zzegp) this.zzbvs.zzbfx())).toByteArray(), 3));
    }

    public final synchronized void zza(zztn zztnVar) {
        if (this.zzbvt) {
            try {
                zztnVar.zza(this.zzbvs);
            } catch (NullPointerException e) {
                com.google.android.gms.ads.internal.zzp.zzkt().zza(e, "AdMobClearcutLogger.modify");
            }
        }
    }

    private static List<Long> zzmz() {
        List<String> zzre = zzaat.zzre();
        ArrayList arrayList = new ArrayList();
        for (String str : zzre) {
            for (String str2 : str.split(",")) {
                try {
                    arrayList.add(Long.valueOf(str2));
                } catch (NumberFormatException unused) {
                    zzaxy.zzei("Experiment ID is not a number");
                }
            }
        }
        return arrayList;
    }
}
