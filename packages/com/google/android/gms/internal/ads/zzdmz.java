package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zztw;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzdmz implements zzdna {
    private final ConcurrentHashMap<zzdnk, zzdmx> zzhdu;
    private zzdnd zzhdv;
    private zzdnb zzhdw = new zzdnb();

    public zzdmz(zzdnd zzdndVar) {
        this.zzhdu = new ConcurrentHashMap<>(zzdndVar.zzhek);
        this.zzhdv = zzdndVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdna
    public final synchronized zzdnh<?> zza(zzdnk zzdnkVar) {
        zzdnh<?> zzdnhVar;
        zzdmx zzdmxVar = this.zzhdu.get(zzdnkVar);
        zzdnhVar = null;
        if (zzdmxVar != null) {
            zzdnhVar = zzdmxVar.zzate();
            if (zzdnhVar == null) {
                this.zzhdw.zzatn();
            }
            zza(zzdnhVar, zzdmxVar.zzati());
        } else {
            this.zzhdw.zzatm();
            zza((zzdnh<?>) null, (zzdnx) null);
        }
        return zzdnhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdna
    public final synchronized boolean zza(zzdnk zzdnkVar, zzdnh<?> zzdnhVar) {
        boolean zzb;
        zzdmx zzdmxVar = this.zzhdu.get(zzdnkVar);
        zzdnhVar.zzhfj = com.google.android.gms.ads.internal.zzp.zzkw().currentTimeMillis();
        if (zzdmxVar == null) {
            zzdmxVar = new zzdmx(this.zzhdv.zzhek, this.zzhdv.zzhel * 1000);
            if (this.zzhdu.size() == this.zzhdv.zzhej) {
                int i = zzdnc.zzhed[this.zzhdv.zzheo - 1];
                long j = Long.MAX_VALUE;
                zzdnk zzdnkVar2 = null;
                if (i == 1) {
                    for (Map.Entry<zzdnk, zzdmx> entry : this.zzhdu.entrySet()) {
                        if (entry.getValue().getCreationTimeMillis() < j) {
                            j = entry.getValue().getCreationTimeMillis();
                            zzdnkVar2 = entry.getKey();
                        }
                    }
                    if (zzdnkVar2 != null) {
                        this.zzhdu.remove(zzdnkVar2);
                    }
                } else if (i == 2) {
                    for (Map.Entry<zzdnk, zzdmx> entry2 : this.zzhdu.entrySet()) {
                        if (entry2.getValue().zzatf() < j) {
                            j = entry2.getValue().zzatf();
                            zzdnkVar2 = entry2.getKey();
                        }
                    }
                    if (zzdnkVar2 != null) {
                        this.zzhdu.remove(zzdnkVar2);
                    }
                } else if (i == 3) {
                    int i2 = Integer.MAX_VALUE;
                    for (Map.Entry<zzdnk, zzdmx> entry3 : this.zzhdu.entrySet()) {
                        if (entry3.getValue().zzatg() < i2) {
                            i2 = entry3.getValue().zzatg();
                            zzdnkVar2 = entry3.getKey();
                        }
                    }
                    if (zzdnkVar2 != null) {
                        this.zzhdu.remove(zzdnkVar2);
                    }
                }
                this.zzhdw.zzatp();
            }
            this.zzhdu.put(zzdnkVar, zzdmxVar);
            this.zzhdw.zzato();
        }
        zzb = zzdmxVar.zzb(zzdnhVar);
        this.zzhdw.zzatq();
        zzdne zzatr = this.zzhdw.zzatr();
        zzdnx zzati = zzdmxVar.zzati();
        if (zzdnhVar != null) {
            zzdnhVar.zzhfh.zzaiw().zzd((zztw.zzb) ((zzegp) zztw.zzb.zzng().zza(zztw.zzb.zza.zzne().zzb(zztw.zzb.zzc.IN_MEMORY).zza(zztw.zzb.zze.zznk().zzu(zzatr.zzher).zzv(zzatr.zzhes).zzcd(zzati.zzhga))).zzbfx()));
        }
        dumpToLog();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdna
    public final synchronized boolean zzb(zzdnk zzdnkVar) {
        zzdmx zzdmxVar = this.zzhdu.get(zzdnkVar);
        if (zzdmxVar != null) {
            return zzdmxVar.size() < this.zzhdv.zzhek;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdna
    @Deprecated
    public final zzdnk zza(zzvc zzvcVar, String str, zzvm zzvmVar) {
        return new zzdnj(zzvcVar, str, new zzasx(this.zzhdv.zzvr).zzvk().zzdtx, this.zzhdv.zzhem, zzvmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdna
    public final zzdnd zzatl() {
        return this.zzhdv;
    }

    private final void zza(zzdnh<?> zzdnhVar, zzdnx zzdnxVar) {
        if (zzdnhVar != null) {
            zzdnhVar.zzhfh.zzaiw().zzc((zztw.zzb) ((zzegp) zztw.zzb.zzng().zza(zztw.zzb.zza.zzne().zzb(zztw.zzb.zzc.IN_MEMORY).zza(zztw.zzb.zzd.zzni().zzt(zzdnxVar.zzhfz).zzcc(zzdnxVar.zzhga))).zzbfx()));
        }
        dumpToLog();
    }

    private final void dumpToLog() {
        if (zzdnd.zzatt()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.zzhdv.zzhei);
            sb.append(" PoolCollection");
            sb.append(this.zzhdw.zzats());
            int i = 0;
            for (Map.Entry<zzdnk, zzdmx> entry : this.zzhdu.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(entry.getKey().hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < entry.getValue().size(); i2++) {
                    sb.append("[O]");
                }
                for (int size = entry.getValue().size(); size < this.zzhdv.zzhek; size++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(entry.getValue().zzath());
                sb.append("\n");
            }
            while (i < this.zzhdv.zzhej) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            zzaxy.zzef(sb.toString());
        }
    }
}
