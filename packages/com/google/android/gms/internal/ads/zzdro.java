package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzcf;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdro implements zzdqe {
    private final Object zzhkp;
    private final zzdrn zzhkq;
    private final zzdrz zzhkr;
    private final zzdpy zzvw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdro(Object obj, zzdrn zzdrnVar, zzdrz zzdrzVar, zzdpy zzdpyVar) {
        this.zzhkp = obj;
        this.zzhkq = zzdrnVar;
        this.zzhkr = zzdrzVar;
        this.zzvw = zzdpyVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzdrn zzawa() {
        return this.zzhkq;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean zzawb() throws zzdrx {
        try {
        } catch (Exception e) {
            throw new zzdrx(2001, e);
        }
        return ((Boolean) this.zzhkp.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.zzhkp, new Object[0])).booleanValue();
    }

    public final synchronized void close() throws zzdrx {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.zzhkp.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.zzhkp, new Object[0]);
            this.zzvw.zzg(3001, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new zzdrx(2003, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqe
    public final synchronized String zzv(Context context, String str) {
        Map<String, Object> zzcd;
        zzcd = this.zzhkr.zzcd();
        zzcd.put("f", "q");
        zzcd.put("ctx", context);
        zzcd.put("aid", null);
        return zzk(zzb(null, zzcd));
    }

    @Override // com.google.android.gms.internal.ads.zzdqe
    public final synchronized String zzb(Context context, String str, View view, Activity activity) {
        Map<String, Object> zzce;
        zzce = this.zzhkr.zzce();
        zzce.put("f", "v");
        zzce.put("ctx", context);
        zzce.put("aid", null);
        zzce.put("view", view);
        zzce.put("act", activity);
        return zzk(zzb(null, zzce));
    }

    @Override // com.google.android.gms.internal.ads.zzdqe
    public final synchronized String zza(Context context, String str, String str2, View view, Activity activity) {
        Map<String, Object> zzcf;
        zzcf = this.zzhkr.zzcf();
        zzcf.put("f", "c");
        zzcf.put("ctx", context);
        zzcf.put("cs", str2);
        zzcf.put("aid", null);
        zzcf.put("view", view);
        zzcf.put("act", activity);
        return zzk(zzb(null, zzcf));
    }

    @Override // com.google.android.gms.internal.ads.zzdqe
    public final synchronized void zza(String str, MotionEvent motionEvent) throws zzdrx {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("aid", null);
            hashMap.put("evt", motionEvent);
            this.zzhkp.getClass().getDeclaredMethod("he", Map.class).invoke(this.zzhkp, hashMap);
            this.zzvw.zzg(3003, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new zzdrx(2005, e);
        }
    }

    public final synchronized int zzawc() throws zzdrx {
        try {
        } catch (Exception e) {
            throw new zzdrx(2006, e);
        }
        return ((Integer) this.zzhkp.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.zzhkp, new Object[0])).intValue();
    }

    private static String zzk(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(((zzcf.zzf) ((zzegp) zzcf.zzf.zzbl().zzb(zzcm.DG).zzj(zzeff.zzu(bArr)).zzbfx())).toByteArray(), 11);
    }

    private final synchronized byte[] zzb(Map<String, String> map, Map<String, Object> map2) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e) {
            this.zzvw.zza(2007, System.currentTimeMillis() - currentTimeMillis, e);
            return null;
        }
        return (byte[]) this.zzhkp.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.zzhkp, null, map2);
    }
}
