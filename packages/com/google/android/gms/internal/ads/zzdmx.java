package com.google.android.gms.internal.ads;

import java.util.LinkedList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdmx {
    private final int maxEntries;
    private final int zzhdr;
    private final LinkedList<zzdnh<?>> zzhdq = new LinkedList<>();
    private final zzdny zzhds = new zzdny();

    public zzdmx(int i, int i2) {
        this.maxEntries = i;
        this.zzhdr = i2;
    }

    public final boolean zzb(zzdnh<?> zzdnhVar) {
        this.zzhds.zzauc();
        zzatj();
        if (this.zzhdq.size() == this.maxEntries) {
            return false;
        }
        this.zzhdq.add(zzdnhVar);
        return true;
    }

    public final zzdnh<?> zzate() {
        this.zzhds.zzauc();
        zzatj();
        if (this.zzhdq.isEmpty()) {
            return null;
        }
        zzdnh<?> remove = this.zzhdq.remove();
        if (remove != null) {
            this.zzhds.zzaud();
        }
        return remove;
    }

    public final int size() {
        zzatj();
        return this.zzhdq.size();
    }

    public final long getCreationTimeMillis() {
        return this.zzhds.getCreationTimeMillis();
    }

    public final long zzatf() {
        return this.zzhds.zzatf();
    }

    public final int zzatg() {
        return this.zzhds.zzatg();
    }

    public final String zzath() {
        return this.zzhds.zzats();
    }

    public final zzdnx zzati() {
        return this.zzhds.zzauf();
    }

    private final void zzatj() {
        while (!this.zzhdq.isEmpty()) {
            if (!(com.google.android.gms.ads.internal.zzp.zzkw().currentTimeMillis() - this.zzhdq.getFirst().zzhfj >= ((long) this.zzhdr))) {
                return;
            }
            this.zzhds.zzaue();
            this.zzhdq.remove();
        }
    }
}
