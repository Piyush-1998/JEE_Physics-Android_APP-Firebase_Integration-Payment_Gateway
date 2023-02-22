package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzabk {
    private zzabk zzcyv;
    private final List<zzabi> zzcyt = new LinkedList();
    private final Map<String, String> zzcyu = new LinkedHashMap();
    private final Object lock = new Object();
    boolean zzcys = true;

    public zzabk(boolean z, String str, String str2) {
        this.zzcyu.put("action", str);
        this.zzcyu.put("ad_format", str2);
    }

    public final void zzc(zzabk zzabkVar) {
        synchronized (this.lock) {
            this.zzcyv = zzabkVar;
        }
    }

    public final zzabi zzex(long j) {
        if (this.zzcys) {
            return new zzabi(j, null, null);
        }
        return null;
    }

    public final boolean zza(zzabi zzabiVar, long j, String... strArr) {
        synchronized (this.lock) {
            for (String str : strArr) {
                this.zzcyt.add(new zzabi(j, str, zzabiVar));
            }
        }
        return true;
    }

    public final String zzrq() {
        String sb;
        StringBuilder sb2 = new StringBuilder();
        synchronized (this.lock) {
            for (zzabi zzabiVar : this.zzcyt) {
                long time = zzabiVar.getTime();
                String zzrn = zzabiVar.zzrn();
                zzabi zzro = zzabiVar.zzro();
                if (zzro != null && time > 0) {
                    sb2.append(zzrn);
                    sb2.append('.');
                    sb2.append(time - zzro.getTime());
                    sb2.append(',');
                }
            }
            this.zzcyt.clear();
            if (!TextUtils.isEmpty(null)) {
                sb2.append((String) null);
            } else if (sb2.length() > 0) {
                sb2.setLength(sb2.length() - 1);
            }
            sb = sb2.toString();
        }
        return sb;
    }

    public final void zzh(String str, String str2) {
        zzaba zzwd;
        if (!this.zzcys || TextUtils.isEmpty(str2) || (zzwd = com.google.android.gms.ads.internal.zzp.zzkt().zzwd()) == null) {
            return;
        }
        synchronized (this.lock) {
            zzabe zzcu = zzwd.zzcu(str);
            Map<String, String> map = this.zzcyu;
            map.put(str, zzcu.zzg(map.get(str), str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<String, String> zzrr() {
        synchronized (this.lock) {
            zzaba zzwd = com.google.android.gms.ads.internal.zzp.zzkt().zzwd();
            if (zzwd != null && this.zzcyv != null) {
                return zzwd.zza(this.zzcyu, this.zzcyv.zzrr());
            }
            return this.zzcyu;
        }
    }
}
