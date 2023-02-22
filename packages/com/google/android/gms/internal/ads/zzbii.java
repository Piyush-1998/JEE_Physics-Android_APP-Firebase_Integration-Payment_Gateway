package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbih;
import com.google.android.gms.internal.ads.zzbke;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public abstract class zzbii implements zzble {
    private static zzbii zzerm;

    protected abstract zzdff zza(zzdgo zzdgoVar);

    public abstract Executor zzadj();

    public abstract ScheduledExecutorService zzadk();

    public abstract Executor zzadl();

    public abstract zzdvw zzadm();

    public abstract zzbvb zzadn();

    public abstract zzcji zzado();

    public abstract zzbkj zzadp();

    public abstract zzbod zzadq();

    public abstract zzbmv zzadr();

    public abstract zzdhq zzads();

    public abstract zzcau zzadt();

    public abstract zzcbq zzadu();

    public abstract zzcia zzadv();

    public abstract zzdko zzadw();

    public abstract zzcyh zzadx();

    public abstract zzcyk zzady();

    public abstract zzdma<zzchc> zzadz();

    public static zzbii zza(Context context, zzamu zzamuVar, int i) {
        zzbii zzf = zzf(context, i);
        zzf.zzado().zzb(zzamuVar);
        return zzf;
    }

    @Deprecated
    public static zzbii zzf(Context context, int i) {
        synchronized (zzbii.class) {
            if (zzerm != null) {
                return zzerm;
            }
            return zza(new zzbbg(202006000, i, true, false), context, new zzbjd());
        }
    }

    @Deprecated
    private static zzbii zza(zzbbg zzbbgVar, Context context, zzbke.zza zzaVar) {
        zzbii zzbiiVar;
        synchronized (zzbii.class) {
            if (zzerm == null) {
                zzerm = new zzbjs().zzc(new zzbih(new zzbih.zza().zza(zzbbgVar).zzbw(context))).zza(new zzbke(zzaVar)).zzafx();
                zzaat.initialize(context);
                com.google.android.gms.ads.internal.zzp.zzkt().zzd(context, zzbbgVar);
                com.google.android.gms.ads.internal.zzp.zzkv().initialize(context);
                com.google.android.gms.ads.internal.zzp.zzkp().zzap(context);
                com.google.android.gms.ads.internal.zzp.zzkp().zzaq(context);
                zzaxw.zzao(context);
                com.google.android.gms.ads.internal.zzp.zzks().initialize(context);
                com.google.android.gms.ads.internal.zzp.zzlk().initialize(context);
                if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcvx)).booleanValue()) {
                    new zzcra(context, zzbbgVar, new zzto(new zztt(context)), new zzcqk(new zzcqi(context), zzerm.zzadm())).zzapt();
                }
            }
            zzbiiVar = zzerm;
        }
        return zzbiiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzble
    public final zzdff zza(zzasp zzaspVar, int i) {
        return zza(new zzdgo(zzaspVar, i));
    }
}
