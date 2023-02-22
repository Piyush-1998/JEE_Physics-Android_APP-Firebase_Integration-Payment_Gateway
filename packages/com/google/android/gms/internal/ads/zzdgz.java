package com.google.android.gms.internal.ads;

import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdgz implements zzelo<zzdem<JSONObject>> {
    public static zzdem<JSONObject> zza(zzaxc zzaxcVar, Object obj, zzdfh zzdfhVar, zzdge zzdgeVar, zzeli<zzdfb> zzeliVar, zzeli<zzdfl> zzeliVar2, zzeli<zzdfp> zzeliVar3, zzeli<zzdfv> zzeliVar4, zzeli<zzdga> zzeliVar5, zzeli<zzdgj> zzeliVar6, zzeli<zzdgn> zzeliVar7, zzeli<zzdhb> zzeliVar8, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        HashSet hashSet = new HashSet();
        hashSet.add((zzdfw) obj);
        hashSet.add(zzdfhVar);
        hashSet.add(zzdgeVar);
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcux)).booleanValue()) {
            hashSet.add(zzeliVar.get());
        }
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcuy)).booleanValue()) {
            hashSet.add(zzeliVar2.get());
        }
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcuz)).booleanValue()) {
            hashSet.add(zzeliVar3.get());
        }
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcva)).booleanValue()) {
            hashSet.add(zzeliVar4.get());
        }
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcve)).booleanValue()) {
            hashSet.add(new zzdcy(zzeliVar6.get(), ((Long) zzwe.zzpu().zzd(zzaat.zzcsa)).longValue(), scheduledExecutorService));
        }
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcvg)).booleanValue()) {
            hashSet.add(zzeliVar7.get());
        }
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcvh)).booleanValue()) {
            hashSet.add(zzeliVar8.get());
        }
        return (zzdem) zzelu.zza(new zzdem(executor, hashSet), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        throw new NoSuchMethodError();
    }
}
