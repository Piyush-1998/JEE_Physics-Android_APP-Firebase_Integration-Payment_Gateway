package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public class zzgk {
    private static final String TAG = zzgk.class.getSimpleName();
    private final String className;
    private final String zzabk;
    private final Class<?>[] zzabn;
    private final zzex zzwg;
    private final int zzabl = 2;
    private volatile Method zzabm = null;
    private CountDownLatch zzabo = new CountDownLatch(1);

    public zzgk(zzex zzexVar, String str, String str2, Class<?>... clsArr) {
        this.zzwg = zzexVar;
        this.className = str;
        this.zzabk = str2;
        this.zzabn = clsArr;
        zzexVar.zzcg().submit(new zzgj(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzda() {
        try {
            Class loadClass = this.zzwg.zzch().loadClass(zzb(this.zzwg.zzcj(), this.className));
            if (loadClass == null) {
                return;
            }
            this.zzabm = loadClass.getMethod(zzb(this.zzwg.zzcj(), this.zzabk), this.zzabn);
            if (this.zzabm == null) {
            }
        } catch (zzeh unused) {
        } catch (UnsupportedEncodingException unused2) {
        } catch (ClassNotFoundException unused3) {
        } catch (NoSuchMethodException unused4) {
        } catch (NullPointerException unused5) {
        } finally {
            this.zzabo.countDown();
        }
    }

    private final String zzb(byte[] bArr, String str) throws zzeh, UnsupportedEncodingException {
        return new String(this.zzwg.zzci().zza(bArr, str), "UTF-8");
    }

    public final Method zzdb() {
        if (this.zzabm != null) {
            return this.zzabm;
        }
        try {
            if (this.zzabo.await(2L, TimeUnit.SECONDS)) {
                return this.zzabm;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
