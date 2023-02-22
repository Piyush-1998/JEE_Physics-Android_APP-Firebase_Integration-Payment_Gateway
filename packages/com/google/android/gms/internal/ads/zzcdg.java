package com.google.android.gms.internal.ads;

import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcdg {
    public static final zzcdg zzfyr = new zzcdi().zzamk();
    private final zzaex zzfyk;
    private final zzaew zzfyl;
    private final zzafl zzfym;
    private final zzafk zzfyn;
    private final zzaiz zzfyo;
    private final SimpleArrayMap<String, zzafd> zzfyp;
    private final SimpleArrayMap<String, zzafc> zzfyq;

    public final zzaex zzamc() {
        return this.zzfyk;
    }

    public final zzaew zzamd() {
        return this.zzfyl;
    }

    public final zzafl zzame() {
        return this.zzfym;
    }

    public final zzafk zzamf() {
        return this.zzfyn;
    }

    public final zzaiz zzamg() {
        return this.zzfyo;
    }

    public final zzafd zzgd(String str) {
        return this.zzfyp.get(str);
    }

    public final zzafc zzge(String str) {
        return this.zzfyq.get(str);
    }

    public final ArrayList<String> zzamh() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (this.zzfym != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.zzfyk != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.zzfyl != null) {
            arrayList.add(Integer.toString(2));
        }
        if (this.zzfyp.size() > 0) {
            arrayList.add(Integer.toString(3));
        }
        if (this.zzfyo != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    public final ArrayList<String> zzami() {
        ArrayList<String> arrayList = new ArrayList<>(this.zzfyp.size());
        for (int i = 0; i < this.zzfyp.size(); i++) {
            arrayList.add(this.zzfyp.keyAt(i));
        }
        return arrayList;
    }

    private zzcdg(zzcdi zzcdiVar) {
        this.zzfyk = zzcdiVar.zzfyk;
        this.zzfyl = zzcdiVar.zzfyl;
        this.zzfym = zzcdiVar.zzfym;
        this.zzfyp = new SimpleArrayMap<>(zzcdiVar.zzfyp);
        this.zzfyq = new SimpleArrayMap<>(zzcdiVar.zzfyq);
        this.zzfyn = zzcdiVar.zzfyn;
        this.zzfyo = zzcdiVar.zzfyo;
    }
}
