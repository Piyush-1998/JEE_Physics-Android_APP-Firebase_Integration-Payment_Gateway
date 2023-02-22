package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzaq;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public abstract class zzaa<T> implements Comparable<zzaa<T>> {
    private final Object mLock;
    private final zzaq.zza zzap;
    private final int zzaq;
    private final String zzar;
    private final int zzas;
    private zzai zzat;
    private Integer zzau;
    private zzae zzav;
    private boolean zzaw;
    private boolean zzax;
    private boolean zzay;
    private boolean zzaz;
    private zzan zzba;
    private zzn zzbb;
    private zzac zzbc;

    public zzaa(int i, String str, zzai zzaiVar) {
        Uri parse;
        String host;
        this.zzap = zzaq.zza.zzbw ? new zzaq.zza() : null;
        this.mLock = new Object();
        this.zzaw = true;
        int i2 = 0;
        this.zzax = false;
        this.zzay = false;
        this.zzaz = false;
        this.zzbb = null;
        this.zzaq = i;
        this.zzar = str;
        this.zzat = zzaiVar;
        this.zzba = new zzq();
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i2 = host.hashCode();
        }
        this.zzas = i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract zzaj<T> zza(zzy zzyVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void zza(T t);

    public byte[] zzg() throws zzl {
        return null;
    }

    public final int getMethod() {
        return this.zzaq;
    }

    public final int zzd() {
        return this.zzas;
    }

    public final void zzc(String str) {
        if (zzaq.zza.zzbw) {
            this.zzap.zza(str, Thread.currentThread().getId());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzd(String str) {
        zzae zzaeVar = this.zzav;
        if (zzaeVar != null) {
            zzaeVar.zzf(this);
        }
        if (zzaq.zza.zzbw) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzad(this, str, id));
                return;
            }
            this.zzap.zza(str, id);
            this.zzap.zzd(toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzd(int i) {
        zzae zzaeVar = this.zzav;
        if (zzaeVar != null) {
            zzaeVar.zza(this, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzaa<?> zza(zzae zzaeVar) {
        this.zzav = zzaeVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzaa<?> zze(int i) {
        this.zzau = Integer.valueOf(i);
        return this;
    }

    public final String getUrl() {
        return this.zzar;
    }

    public final String zze() {
        String str = this.zzar;
        int i = this.zzaq;
        if (i == 0 || i == -1) {
            return str;
        }
        String num = Integer.toString(i);
        StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 1 + String.valueOf(str).length());
        sb.append(num);
        sb.append('-');
        sb.append(str);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzaa<?> zza(zzn zznVar) {
        this.zzbb = zznVar;
        return this;
    }

    public final zzn zzf() {
        return this.zzbb;
    }

    public final boolean isCanceled() {
        synchronized (this.mLock) {
        }
        return false;
    }

    public Map<String, String> getHeaders() throws zzl {
        return Collections.emptyMap();
    }

    public final boolean zzh() {
        return this.zzaw;
    }

    public final int zzi() {
        return this.zzba.zzb();
    }

    public final zzan zzj() {
        return this.zzba;
    }

    public final void zzk() {
        synchronized (this.mLock) {
            this.zzay = true;
        }
    }

    public final boolean zzl() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzay;
        }
        return z;
    }

    public final void zzb(zzao zzaoVar) {
        zzai zzaiVar;
        synchronized (this.mLock) {
            zzaiVar = this.zzat;
        }
        if (zzaiVar != null) {
            zzaiVar.zzc(zzaoVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzac zzacVar) {
        synchronized (this.mLock) {
            this.zzbc = zzacVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzaj<?> zzajVar) {
        zzac zzacVar;
        synchronized (this.mLock) {
            zzacVar = this.zzbc;
        }
        if (zzacVar != null) {
            zzacVar.zza(this, zzajVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzm() {
        zzac zzacVar;
        synchronized (this.mLock) {
            zzacVar = this.zzbc;
        }
        if (zzacVar != null) {
            zzacVar.zza(this);
        }
    }

    public String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.zzas));
        String concat = valueOf.length() != 0 ? "0x".concat(valueOf) : new String("0x");
        isCanceled();
        String str = this.zzar;
        String valueOf2 = String.valueOf(zzaf.NORMAL);
        String valueOf3 = String.valueOf(this.zzau);
        StringBuilder sb = new StringBuilder("[ ] ".length() + 3 + String.valueOf(str).length() + String.valueOf(concat).length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("[ ] ");
        sb.append(str);
        sb.append(" ");
        sb.append(concat);
        sb.append(" ");
        sb.append(valueOf2);
        sb.append(" ");
        sb.append(valueOf3);
        return sb.toString();
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Object obj) {
        zzaa zzaaVar = (zzaa) obj;
        zzaf zzafVar = zzaf.NORMAL;
        zzaf zzafVar2 = zzaf.NORMAL;
        return zzafVar == zzafVar2 ? this.zzau.intValue() - zzaaVar.zzau.intValue() : zzafVar2.ordinal() - zzafVar.ordinal();
    }
}
