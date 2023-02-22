package com.google.android.gms.internal.ads;

import androidx.collection.SimpleArrayMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcdi {
    zzaex zzfyk;
    zzaew zzfyl;
    zzafl zzfym;
    zzafk zzfyn;
    zzaiz zzfyo;
    final SimpleArrayMap<String, zzafd> zzfyp = new SimpleArrayMap<>();
    final SimpleArrayMap<String, zzafc> zzfyq = new SimpleArrayMap<>();

    public final zzcdi zzb(zzaex zzaexVar) {
        this.zzfyk = zzaexVar;
        return this;
    }

    public final zzcdi zzb(zzaew zzaewVar) {
        this.zzfyl = zzaewVar;
        return this;
    }

    public final zzcdi zzb(zzafl zzaflVar) {
        this.zzfym = zzaflVar;
        return this;
    }

    public final zzcdi zza(zzafk zzafkVar) {
        this.zzfyn = zzafkVar;
        return this;
    }

    public final zzcdi zzb(zzaiz zzaizVar) {
        this.zzfyo = zzaizVar;
        return this;
    }

    public final zzcdi zzb(String str, zzafd zzafdVar, zzafc zzafcVar) {
        this.zzfyp.put(str, zzafdVar);
        this.zzfyq.put(str, zzafcVar);
        return this;
    }

    public final zzcdg zzamk() {
        return new zzcdg(this);
    }
}
