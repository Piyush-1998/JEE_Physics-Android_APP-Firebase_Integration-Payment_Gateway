package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdsa {
    private static final HashMap<String, Class<?>> zzhld = new HashMap<>();
    private final zzdrz zzhkr;
    private final zzdpx zzhle;
    private zzdro zzhlf;
    private final Object zzhlg = new Object();
    private final Context zzvr;
    private final zzdpy zzvw;

    public zzdsa(Context context, zzdrz zzdrzVar, zzdpy zzdpyVar, zzdpx zzdpxVar) {
        this.zzvr = context;
        this.zzhkr = zzdrzVar;
        this.zzvw = zzdpyVar;
        this.zzhle = zzdpxVar;
    }

    private final synchronized Class<?> zza(zzdrn zzdrnVar) throws zzdrx {
        if (zzdrnVar.zzavw() == null) {
            throw new zzdrx(4010, "mc");
        }
        String zzdg = zzdrnVar.zzavw().zzdg();
        Class<?> cls = zzhld.get(zzdg);
        if (cls != null) {
            return cls;
        }
        try {
            if (!this.zzhle.zzb(zzdrnVar.zzavx())) {
                throw new zzdrx(2026, "VM did not pass signature verification");
            }
            try {
                File zzavy = zzdrnVar.zzavy();
                if (!zzavy.exists()) {
                    zzavy.mkdirs();
                }
                Class<?> loadClass = new DexClassLoader(zzdrnVar.zzavx().getAbsolutePath(), zzavy.getAbsolutePath(), null, this.zzvr.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                zzhld.put(zzdg, loadClass);
                return loadClass;
            } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e) {
                throw new zzdrx(2008, e);
            }
        } catch (GeneralSecurityException e2) {
            throw new zzdrx(2026, e2);
        }
    }

    private final Object zza(Class<?> cls, zzdrn zzdrnVar) throws zzdrx {
        try {
            return cls.getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzvr, "msa-r", zzdrnVar.zzavz(), null, new Bundle(), 2);
        } catch (Exception e) {
            throw new zzdrx(2004, e);
        }
    }

    public final void zzb(zzdrn zzdrnVar) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            zzdro zzdroVar = new zzdro(zza(zza(zzdrnVar), zzdrnVar), zzdrnVar, this.zzhkr, this.zzvw);
            if (!zzdroVar.zzawb()) {
                throw new zzdrx(4000, "init failed");
            }
            int zzawc = zzdroVar.zzawc();
            if (zzawc != 0) {
                StringBuilder sb = new StringBuilder(15);
                sb.append("ci: ");
                sb.append(zzawc);
                throw new zzdrx(4001, sb.toString());
            }
            synchronized (this.zzhlg) {
                if (this.zzhlf != null) {
                    try {
                        this.zzhlf.close();
                    } catch (zzdrx e) {
                        this.zzvw.zza(e.zzawg(), -1L, e);
                    }
                }
                this.zzhlf = zzdroVar;
            }
            this.zzvw.zzg(PathInterpolatorCompat.MAX_NUM_POINTS, System.currentTimeMillis() - currentTimeMillis);
        } catch (zzdrx e2) {
            this.zzvw.zza(e2.zzawg(), System.currentTimeMillis() - currentTimeMillis, e2);
        } catch (Exception e3) {
            this.zzvw.zza(4010, System.currentTimeMillis() - currentTimeMillis, e3);
        }
    }

    public final zzdqe zzawh() {
        zzdro zzdroVar;
        synchronized (this.zzhlg) {
            zzdroVar = this.zzhlf;
        }
        return zzdroVar;
    }

    public final zzdrn zzawi() {
        synchronized (this.zzhlg) {
            if (this.zzhlf != null) {
                return this.zzhlf.zzawa();
            }
            return null;
        }
    }
}
