package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzhj implements zzhc {
    private int repeatMode;
    private final zzhx[] zzael;
    private final zzog zzaem;
    private final zzod zzaen;
    private final Handler zzaeo;
    private final zzhl zzaep;
    private final CopyOnWriteArraySet<zzhf> zzaeq;
    private final zzid zzaer;
    private final zzia zzaes;
    private boolean zzaet;
    private boolean zzaeu;
    private int zzaev;
    private int zzaew;
    private int zzaex;
    private boolean zzaey;
    private zzhy zzaez;
    private Object zzafa;
    private zznp zzafb;
    private zzod zzafc;
    private zzhu zzafd;
    private zzhn zzafe;
    private int zzaff;
    private int zzafg;
    private long zzafh;

    public zzhj(zzhx[] zzhxVarArr, zzog zzogVar, zzhs zzhsVar) {
        String str = zzpq.zzbki;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
        sb.append("Init ExoPlayerLib/2.4.2 [");
        sb.append(str);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
        zzoz.checkState(zzhxVarArr.length > 0);
        this.zzael = (zzhx[]) zzoz.checkNotNull(zzhxVarArr);
        this.zzaem = (zzog) zzoz.checkNotNull(zzogVar);
        this.zzaeu = false;
        this.repeatMode = 0;
        this.zzaev = 1;
        this.zzaeq = new CopyOnWriteArraySet<>();
        this.zzaen = new zzod(new zzob[zzhxVarArr.length]);
        this.zzaez = zzhy.zzahz;
        this.zzaer = new zzid();
        this.zzaes = new zzia();
        this.zzafb = zznp.zzbgq;
        this.zzafc = this.zzaen;
        this.zzafd = zzhu.zzahv;
        this.zzaeo = new zzhi(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.zzafe = new zzhn(0, 0L);
        this.zzaep = new zzhl(zzhxVarArr, zzogVar, zzhsVar, this.zzaeu, 0, this.zzaeo, this.zzafe, this);
    }

    @Override // com.google.android.gms.internal.ads.zzhc
    public final void zza(zzhf zzhfVar) {
        this.zzaeq.add(zzhfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhc
    public final void zzb(zzhf zzhfVar) {
        this.zzaeq.remove(zzhfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhc
    public final int getPlaybackState() {
        return this.zzaev;
    }

    @Override // com.google.android.gms.internal.ads.zzhc
    public final void zza(zzmz zzmzVar) {
        if (!this.zzaez.isEmpty() || this.zzafa != null) {
            this.zzaez = zzhy.zzahz;
            this.zzafa = null;
            Iterator<zzhf> it = this.zzaeq.iterator();
            while (it.hasNext()) {
                it.next().zza(this.zzaez, this.zzafa);
            }
        }
        if (this.zzaet) {
            this.zzaet = false;
            this.zzafb = zznp.zzbgq;
            this.zzafc = this.zzaen;
            this.zzaem.zzd(null);
            Iterator<zzhf> it2 = this.zzaeq.iterator();
            while (it2.hasNext()) {
                it2.next().zza(this.zzafb, this.zzafc);
            }
        }
        this.zzaex++;
        this.zzaep.zza(zzmzVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzhc
    public final void zzf(boolean z) {
        if (this.zzaeu != z) {
            this.zzaeu = z;
            this.zzaep.zzf(z);
            Iterator<zzhf> it = this.zzaeq.iterator();
            while (it.hasNext()) {
                it.next().zza(z, this.zzaev);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhc
    public final boolean zzei() {
        return this.zzaeu;
    }

    @Override // com.google.android.gms.internal.ads.zzhc
    public final void seekTo(long j) {
        long zzdn;
        int zzem = zzem();
        if (zzem < 0 || (!this.zzaez.isEmpty() && zzem >= this.zzaez.zzfd())) {
            throw new zzht(this.zzaez, zzem, j);
        }
        this.zzaew++;
        this.zzaff = zzem;
        if (!this.zzaez.isEmpty()) {
            this.zzaez.zza(zzem, this.zzaer, false);
            if (j == -9223372036854775807L) {
                zzdn = this.zzaer.zzais;
            } else {
                zzdn = zzha.zzdn(j);
            }
            long j2 = this.zzaer.zzait + zzdn;
            long j3 = this.zzaez.zza(0, this.zzaes, false).zzaid;
            if (j3 != -9223372036854775807L) {
                int i = (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1));
            }
        }
        this.zzafg = 0;
        if (j == -9223372036854775807L) {
            this.zzafh = 0L;
            this.zzaep.zza(this.zzaez, zzem, -9223372036854775807L);
            return;
        }
        this.zzafh = j;
        this.zzaep.zza(this.zzaez, zzem, zzha.zzdn(j));
        Iterator<zzhf> it = this.zzaeq.iterator();
        while (it.hasNext()) {
            it.next().zzel();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhc
    public final void stop() {
        this.zzaep.stop();
    }

    @Override // com.google.android.gms.internal.ads.zzhc
    public final void release() {
        this.zzaep.release();
        this.zzaeo.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhc
    public final void zza(zzhh... zzhhVarArr) {
        this.zzaep.zza(zzhhVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzhc
    public final void zzb(zzhh... zzhhVarArr) {
        this.zzaep.zzb(zzhhVarArr);
    }

    private final int zzem() {
        if (this.zzaez.isEmpty() || this.zzaew > 0) {
            return this.zzaff;
        }
        this.zzaez.zza(this.zzafe.zzafn, this.zzaes, false);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzhc
    public final long getDuration() {
        if (this.zzaez.isEmpty()) {
            return -9223372036854775807L;
        }
        return zzha.zzdm(this.zzaez.zza(zzem(), this.zzaer, false).zzaid);
    }

    @Override // com.google.android.gms.internal.ads.zzhc
    public final long zzek() {
        if (this.zzaez.isEmpty() || this.zzaew > 0) {
            return this.zzafh;
        }
        this.zzaez.zza(this.zzafe.zzafn, this.zzaes, false);
        return this.zzaes.zzff() + zzha.zzdm(this.zzafe.zzagr);
    }

    @Override // com.google.android.gms.internal.ads.zzhc
    public final long getBufferedPosition() {
        if (this.zzaez.isEmpty() || this.zzaew > 0) {
            return this.zzafh;
        }
        this.zzaez.zza(this.zzafe.zzafn, this.zzaes, false);
        return this.zzaes.zzff() + zzha.zzdm(this.zzafe.zzags);
    }

    @Override // com.google.android.gms.internal.ads.zzhc
    public final int zzej() {
        return this.zzael.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(Message message) {
        switch (message.what) {
            case 0:
                this.zzaex--;
                return;
            case 1:
                this.zzaev = message.arg1;
                Iterator<zzhf> it = this.zzaeq.iterator();
                while (it.hasNext()) {
                    it.next().zza(this.zzaeu, this.zzaev);
                }
                return;
            case 2:
                this.zzaey = message.arg1 != 0;
                Iterator<zzhf> it2 = this.zzaeq.iterator();
                while (it2.hasNext()) {
                    it2.next().zzg(this.zzaey);
                }
                return;
            case 3:
                if (this.zzaex == 0) {
                    zzoi zzoiVar = (zzoi) message.obj;
                    this.zzaet = true;
                    this.zzafb = zzoiVar.zzbhs;
                    this.zzafc = zzoiVar.zzbht;
                    this.zzaem.zzd(zzoiVar.zzbhu);
                    Iterator<zzhf> it3 = this.zzaeq.iterator();
                    while (it3.hasNext()) {
                        it3.next().zza(this.zzafb, this.zzafc);
                    }
                    return;
                }
                return;
            case 4:
                int i = this.zzaew - 1;
                this.zzaew = i;
                if (i == 0) {
                    this.zzafe = (zzhn) message.obj;
                    if (message.arg1 != 0) {
                        Iterator<zzhf> it4 = this.zzaeq.iterator();
                        while (it4.hasNext()) {
                            it4.next().zzel();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (this.zzaew == 0) {
                    this.zzafe = (zzhn) message.obj;
                    Iterator<zzhf> it5 = this.zzaeq.iterator();
                    while (it5.hasNext()) {
                        it5.next().zzel();
                    }
                    return;
                }
                return;
            case 6:
                zzhp zzhpVar = (zzhp) message.obj;
                this.zzaew -= zzhpVar.zzahs;
                if (this.zzaex == 0) {
                    this.zzaez = zzhpVar.zzaez;
                    this.zzafa = zzhpVar.zzafa;
                    this.zzafe = zzhpVar.zzafe;
                    Iterator<zzhf> it6 = this.zzaeq.iterator();
                    while (it6.hasNext()) {
                        it6.next().zza(this.zzaez, this.zzafa);
                    }
                    return;
                }
                return;
            case 7:
                zzhu zzhuVar = (zzhu) message.obj;
                if (this.zzafd.equals(zzhuVar)) {
                    return;
                }
                this.zzafd = zzhuVar;
                Iterator<zzhf> it7 = this.zzaeq.iterator();
                while (it7.hasNext()) {
                    it7.next().zza(zzhuVar);
                }
                return;
            case 8:
                zzhd zzhdVar = (zzhd) message.obj;
                Iterator<zzhf> it8 = this.zzaeq.iterator();
                while (it8.hasNext()) {
                    it8.next().zza(zzhdVar);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }
}
