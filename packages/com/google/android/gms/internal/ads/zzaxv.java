package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzaxv implements zzrh {
    private final zzaya zzdza;
    private final zzaxr zzdzh;
    private final Object lock = new Object();
    private final HashSet<zzaxj> zzdzi = new HashSet<>();
    private final HashSet<zzaxs> zzdzj = new HashSet<>();
    private final zzaxt zzdzg = new zzaxt();

    public zzaxv(String str, zzaya zzayaVar) {
        this.zzdzh = new zzaxr(str, zzayaVar);
        this.zzdza = zzayaVar;
    }

    public final void zzb(zzaxj zzaxjVar) {
        synchronized (this.lock) {
            this.zzdzi.add(zzaxjVar);
        }
    }

    public final void zzb(HashSet<zzaxj> hashSet) {
        synchronized (this.lock) {
            this.zzdzi.addAll(hashSet);
        }
    }

    public final Bundle zza(Context context, zzaxq zzaxqVar) {
        HashSet<zzaxj> hashSet = new HashSet<>();
        synchronized (this.lock) {
            hashSet.addAll(this.zzdzi);
            this.zzdzi.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.zzdzh.zzp(context, this.zzdzg.zzwu()));
        Bundle bundle2 = new Bundle();
        Iterator<zzaxs> it = this.zzdzj.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NoSuchMethodError();
        }
        bundle.putBundle("slots", bundle2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator<zzaxj> it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().toBundle());
        }
        bundle.putParcelableArrayList("ads", arrayList);
        zzaxqVar.zza(hashSet);
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzrh
    public final void zzp(boolean z) {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzp.zzkw().currentTimeMillis();
        if (z) {
            if (currentTimeMillis - this.zzdza.zzxf() > ((Long) zzwe.zzpu().zzd(zzaat.zzcof)).longValue()) {
                this.zzdzh.zzdyx = -1;
                return;
            }
            this.zzdzh.zzdyx = this.zzdza.zzxg();
            return;
        }
        this.zzdza.zzez(currentTimeMillis);
        this.zzdza.zzdg(this.zzdzh.zzdyx);
    }

    public final void zzwa() {
        synchronized (this.lock) {
            this.zzdzh.zzwa();
        }
    }

    public final void zzvz() {
        synchronized (this.lock) {
            this.zzdzh.zzvz();
        }
    }

    public final void zza(zzvc zzvcVar, long j) {
        synchronized (this.lock) {
            this.zzdzh.zza(zzvcVar, j);
        }
    }

    public final zzaxj zza(Clock clock, String str) {
        return new zzaxj(clock, this, this.zzdzg.zzwt(), str);
    }
}
