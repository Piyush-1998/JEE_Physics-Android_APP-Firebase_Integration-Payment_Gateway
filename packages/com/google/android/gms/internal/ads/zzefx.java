package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzefx implements zzeip {
    private int tag;
    private final zzefq zzicd;
    private int zzice;
    private int zzicf = 0;

    public static zzefx zza(zzefq zzefqVar) {
        if (zzefqVar.zzibs != null) {
            return zzefqVar.zzibs;
        }
        return new zzefx(zzefqVar);
    }

    private zzefx(zzefq zzefqVar) {
        zzefq zzefqVar2 = (zzefq) zzegr.zza(zzefqVar, "input");
        this.zzicd = zzefqVar2;
        zzefqVar2.zzibs = this;
    }

    @Override // com.google.android.gms.internal.ads.zzeip
    public final int zzber() throws IOException {
        int i = this.zzicf;
        if (i != 0) {
            this.tag = i;
            this.zzicf = 0;
        } else {
            this.tag = this.zzicd.zzbdt();
        }
        int i2 = this.tag;
        if (i2 == 0 || i2 == this.zzice) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.zzeip
    public final int getTag() {
        return this.tag;
    }

    @Override // com.google.android.gms.internal.ads.zzeip
    public final boolean zzbes() throws IOException {
        int i;
        if (this.zzicd.zzbej() || (i = this.tag) == this.zzice) {
            return false;
        }
        return this.zzicd.zzfz(i);
    }

    private final void zzgi(int i) throws IOException {
        if ((this.tag & 7) != i) {
            throw zzegz.zzbgg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeip
    public final double readDouble() throws IOException {
        zzgi(1);
        return this.zzicd.readDouble();
    }

    @Override // com.google.android.gms.internal.ads.zzeip
    public final float readFloat() throws IOException {
        zzgi(5);
        return this.zzicd.readFloat();
    }

    @Override // com.google.android.gms.internal.ads.zzeip
    public final long zzbdu() throws IOException {
        zzgi(0);
        return this.zzicd.zzbdu();
    }

    @Override // com.google.android.gms.internal.ads.zzeip
    public final long zzbdv() throws IOException {
        zzgi(0);
        return this.zzicd.zzbdv();
    }

    @Override // com.google.android.gms.internal.ads.zzeip
    public final int zzbdw() throws IOException {
        zzgi(0);
        return this.zzicd.zzbdw();
    }

    @Override // com.google.android.gms.internal.ads.zzeip
    public final long zzbdx() throws IOException {
        zzgi(1);
        return this.zzicd.zzbdx();
    }

    @Override // com.google.android.gms.internal.ads.zzeip
    public final int zzbdy() throws IOException {
        zzgi(5);
        return this.zzicd.zzbdy();
    }

    @Override // com.google.android.gms.internal.ads.zzeip
    public final boolean zzbdz() throws IOException {
        zzgi(0);
        return this.zzicd.zzbdz();
    }

    @Override // com.google.android.gms.internal.ads.zzeip
    public final String readString() throws IOException {
        zzgi(2);
        return this.zzicd.readString();
    }

    @Override // com.google.android.gms.internal.ads.zzeip
    public final String zzbea() throws IOException {
        zzgi(2);
        return this.zzicd.zzbea();
    }

    @Override // com.google.android.gms.internal.ads.zzeip
    public final <T> T zza(zzeiv<T> zzeivVar, zzegc zzegcVar) throws IOException {
        zzgi(2);
        return (T) zzc(zzeivVar, zzegcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeip
    public final <T> T zzb(zzeiv<T> zzeivVar, zzegc zzegcVar) throws IOException {
        zzgi(3);
        return (T) zzd(zzeivVar, zzegcVar);
    }

    private final <T> T zzc(zzeiv<T> zzeivVar, zzegc zzegcVar) throws IOException {
        int zzbec = this.zzicd.zzbec();
        if (this.zzicd.zzibp >= this.zzicd.zzibq) {
            throw new zzegz("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int zzga = this.zzicd.zzga(zzbec);
        T newInstance = zzeivVar.newInstance();
        this.zzicd.zzibp++;
        zzeivVar.zza(newInstance, this, zzegcVar);
        zzeivVar.zzaj(newInstance);
        this.zzicd.zzfy(0);
        zzefq zzefqVar = this.zzicd;
        zzefqVar.zzibp--;
        this.zzicd.zzgb(zzga);
        return newInstance;
    }

    private final <T> T zzd(zzeiv<T> zzeivVar, zzegc zzegcVar) throws IOException {
        int i = this.zzice;
        this.zzice = ((this.tag >>> 3) << 3) | 4;
        try {
            T newInstance = zzeivVar.newInstance();
            zzeivVar.zza(newInstance, this, zzegcVar);
            zzeivVar.zzaj(newInstance);
            if (this.tag == this.zzice) {
                return newInstance;
            }
            throw zzegz.zzbgi();
        } finally {
            this.zzice = i;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeip
    public final zzeff zzbeb() throws IOException {
        zzgi(2);
        return this.zzicd.zzbeb();
    }

    @Override // com.google.android.gms.internal.ads.zzeip
    public final int zzbec() throws IOException {
        zzgi(0);
        return this.zzicd.zzbec();
    }

    @Override // com.google.android.gms.internal.ads.zzeip
    public final int zzbed() throws IOException {
        zzgi(0);
        return this.zzicd.zzbed();
    }

    @Override // com.google.android.gms.internal.ads.zzeip
    public final int zzbee() throws IOException {
        zzgi(5);
        return this.zzicd.zzbee();
    }

    @Override // com.google.android.gms.internal.ads.zzeip
    public final long zzbef() throws IOException {
        zzgi(1);
        return this.zzicd.zzbef();
    }

    @Override // com.google.android.gms.internal.ads.zzeip
    public final int zzbeg() throws IOException {
        zzgi(0);
        return this.zzicd.zzbeg();
    }

    @Override // com.google.android.gms.internal.ads.zzeip
    public final long zzbeh() throws IOException {
        zzgi(0);
        return this.zzicd.zzbeh();
    }

    @Override // com.google.android.gms.internal.ads.zzeip
    public final void zzk(List<Double> list) throws IOException {
        int zzbdt;
        int zzbdt2;
        if (list instanceof zzega) {
            zzega zzegaVar = (zzega) list;
            int i = this.tag & 7;
            if (i == 1) {
                do {
                    zzegaVar.zzd(this.zzicd.readDouble());
                    if (this.zzicd.zzbej()) {
                        return;
                    }
                    zzbdt2 = this.zzicd.zzbdt();
                } while (zzbdt2 == this.tag);
                this.zzicf = zzbdt2;
                return;
            } else if (i == 2) {
                int zzbec = this.zzicd.zzbec();
                zzgj(zzbec);
                int zzbek = this.zzicd.zzbek() + zzbec;
                do {
                    zzegaVar.zzd(this.zzicd.readDouble());
                } while (this.zzicd.zzbek() < zzbek);
                return;
            } else {
                throw zzegz.zzbgg();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 1) {
            do {
                list.add(Double.valueOf(this.zzicd.readDouble()));
                if (this.zzicd.zzbej()) {
                    return;
                }
                zzbdt = this.zzicd.zzbdt();
            } while (zzbdt == this.tag);
            this.zzicf = zzbdt;
        } else if (i2 == 2) {
            int zzbec2 = this.zzicd.zzbec();
            zzgj(zzbec2);
            int zzbek2 = this.zzicd.zzbek() + zzbec2;
            do {
                list.add(Double.valueOf(this.zzicd.readDouble()));
            } while (this.zzicd.zzbek() < zzbek2);
        } else {
            throw zzegz.zzbgg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeip
    public final void zzl(List<Float> list) throws IOException {
        int zzbdt;
        int zzbdt2;
        if (list instanceof zzego) {
            zzego zzegoVar = (zzego) list;
            int i = this.tag & 7;
            if (i == 2) {
                int zzbec = this.zzicd.zzbec();
                zzgk(zzbec);
                int zzbek = this.zzicd.zzbek() + zzbec;
                do {
                    zzegoVar.zzh(this.zzicd.readFloat());
                } while (this.zzicd.zzbek() < zzbek);
                return;
            } else if (i == 5) {
                do {
                    zzegoVar.zzh(this.zzicd.readFloat());
                    if (this.zzicd.zzbej()) {
                        return;
                    }
                    zzbdt2 = this.zzicd.zzbdt();
                } while (zzbdt2 == this.tag);
                this.zzicf = zzbdt2;
                return;
            } else {
                throw zzegz.zzbgg();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 2) {
            int zzbec2 = this.zzicd.zzbec();
            zzgk(zzbec2);
            int zzbek2 = this.zzicd.zzbek() + zzbec2;
            do {
                list.add(Float.valueOf(this.zzicd.readFloat()));
            } while (this.zzicd.zzbek() < zzbek2);
        } else if (i2 == 5) {
            do {
                list.add(Float.valueOf(this.zzicd.readFloat()));
                if (this.zzicd.zzbej()) {
                    return;
                }
                zzbdt = this.zzicd.zzbdt();
            } while (zzbdt == this.tag);
            this.zzicf = zzbdt;
        } else {
            throw zzegz.zzbgg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeip
    public final void zzm(List<Long> list) throws IOException {
        int zzbdt;
        int zzbdt2;
        if (list instanceof zzehn) {
            zzehn zzehnVar = (zzehn) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzehnVar.zzfs(this.zzicd.zzbdu());
                    if (this.zzicd.zzbej()) {
                        return;
                    }
                    zzbdt2 = this.zzicd.zzbdt();
                } while (zzbdt2 == this.tag);
                this.zzicf = zzbdt2;
                return;
            } else if (i == 2) {
                int zzbek = this.zzicd.zzbek() + this.zzicd.zzbec();
                do {
                    zzehnVar.zzfs(this.zzicd.zzbdu());
                } while (this.zzicd.zzbek() < zzbek);
                zzgl(zzbek);
                return;
            } else {
                throw zzegz.zzbgg();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(this.zzicd.zzbdu()));
                if (this.zzicd.zzbej()) {
                    return;
                }
                zzbdt = this.zzicd.zzbdt();
            } while (zzbdt == this.tag);
            this.zzicf = zzbdt;
        } else if (i2 == 2) {
            int zzbek2 = this.zzicd.zzbek() + this.zzicd.zzbec();
            do {
                list.add(Long.valueOf(this.zzicd.zzbdu()));
            } while (this.zzicd.zzbek() < zzbek2);
            zzgl(zzbek2);
        } else {
            throw zzegz.zzbgg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeip
    public final void zzn(List<Long> list) throws IOException {
        int zzbdt;
        int zzbdt2;
        if (list instanceof zzehn) {
            zzehn zzehnVar = (zzehn) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzehnVar.zzfs(this.zzicd.zzbdv());
                    if (this.zzicd.zzbej()) {
                        return;
                    }
                    zzbdt2 = this.zzicd.zzbdt();
                } while (zzbdt2 == this.tag);
                this.zzicf = zzbdt2;
                return;
            } else if (i == 2) {
                int zzbek = this.zzicd.zzbek() + this.zzicd.zzbec();
                do {
                    zzehnVar.zzfs(this.zzicd.zzbdv());
                } while (this.zzicd.zzbek() < zzbek);
                zzgl(zzbek);
                return;
            } else {
                throw zzegz.zzbgg();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(this.zzicd.zzbdv()));
                if (this.zzicd.zzbej()) {
                    return;
                }
                zzbdt = this.zzicd.zzbdt();
            } while (zzbdt == this.tag);
            this.zzicf = zzbdt;
        } else if (i2 == 2) {
            int zzbek2 = this.zzicd.zzbek() + this.zzicd.zzbec();
            do {
                list.add(Long.valueOf(this.zzicd.zzbdv()));
            } while (this.zzicd.zzbek() < zzbek2);
            zzgl(zzbek2);
        } else {
            throw zzegz.zzbgg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeip
    public final void zzo(List<Integer> list) throws IOException {
        int zzbdt;
        int zzbdt2;
        if (list instanceof zzegs) {
            zzegs zzegsVar = (zzegs) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzegsVar.zzhc(this.zzicd.zzbdw());
                    if (this.zzicd.zzbej()) {
                        return;
                    }
                    zzbdt2 = this.zzicd.zzbdt();
                } while (zzbdt2 == this.tag);
                this.zzicf = zzbdt2;
                return;
            } else if (i == 2) {
                int zzbek = this.zzicd.zzbek() + this.zzicd.zzbec();
                do {
                    zzegsVar.zzhc(this.zzicd.zzbdw());
                } while (this.zzicd.zzbek() < zzbek);
                zzgl(zzbek);
                return;
            } else {
                throw zzegz.zzbgg();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.zzicd.zzbdw()));
                if (this.zzicd.zzbej()) {
                    return;
                }
                zzbdt = this.zzicd.zzbdt();
            } while (zzbdt == this.tag);
            this.zzicf = zzbdt;
        } else if (i2 == 2) {
            int zzbek2 = this.zzicd.zzbek() + this.zzicd.zzbec();
            do {
                list.add(Integer.valueOf(this.zzicd.zzbdw()));
            } while (this.zzicd.zzbek() < zzbek2);
            zzgl(zzbek2);
        } else {
            throw zzegz.zzbgg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeip
    public final void zzp(List<Long> list) throws IOException {
        int zzbdt;
        int zzbdt2;
        if (list instanceof zzehn) {
            zzehn zzehnVar = (zzehn) list;
            int i = this.tag & 7;
            if (i == 1) {
                do {
                    zzehnVar.zzfs(this.zzicd.zzbdx());
                    if (this.zzicd.zzbej()) {
                        return;
                    }
                    zzbdt2 = this.zzicd.zzbdt();
                } while (zzbdt2 == this.tag);
                this.zzicf = zzbdt2;
                return;
            } else if (i == 2) {
                int zzbec = this.zzicd.zzbec();
                zzgj(zzbec);
                int zzbek = this.zzicd.zzbek() + zzbec;
                do {
                    zzehnVar.zzfs(this.zzicd.zzbdx());
                } while (this.zzicd.zzbek() < zzbek);
                return;
            } else {
                throw zzegz.zzbgg();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 1) {
            do {
                list.add(Long.valueOf(this.zzicd.zzbdx()));
                if (this.zzicd.zzbej()) {
                    return;
                }
                zzbdt = this.zzicd.zzbdt();
            } while (zzbdt == this.tag);
            this.zzicf = zzbdt;
        } else if (i2 == 2) {
            int zzbec2 = this.zzicd.zzbec();
            zzgj(zzbec2);
            int zzbek2 = this.zzicd.zzbek() + zzbec2;
            do {
                list.add(Long.valueOf(this.zzicd.zzbdx()));
            } while (this.zzicd.zzbek() < zzbek2);
        } else {
            throw zzegz.zzbgg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeip
    public final void zzq(List<Integer> list) throws IOException {
        int zzbdt;
        int zzbdt2;
        if (list instanceof zzegs) {
            zzegs zzegsVar = (zzegs) list;
            int i = this.tag & 7;
            if (i == 2) {
                int zzbec = this.zzicd.zzbec();
                zzgk(zzbec);
                int zzbek = this.zzicd.zzbek() + zzbec;
                do {
                    zzegsVar.zzhc(this.zzicd.zzbdy());
                } while (this.zzicd.zzbek() < zzbek);
                return;
            } else if (i == 5) {
                do {
                    zzegsVar.zzhc(this.zzicd.zzbdy());
                    if (this.zzicd.zzbej()) {
                        return;
                    }
                    zzbdt2 = this.zzicd.zzbdt();
                } while (zzbdt2 == this.tag);
                this.zzicf = zzbdt2;
                return;
            } else {
                throw zzegz.zzbgg();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 2) {
            int zzbec2 = this.zzicd.zzbec();
            zzgk(zzbec2);
            int zzbek2 = this.zzicd.zzbek() + zzbec2;
            do {
                list.add(Integer.valueOf(this.zzicd.zzbdy()));
            } while (this.zzicd.zzbek() < zzbek2);
        } else if (i2 == 5) {
            do {
                list.add(Integer.valueOf(this.zzicd.zzbdy()));
                if (this.zzicd.zzbej()) {
                    return;
                }
                zzbdt = this.zzicd.zzbdt();
            } while (zzbdt == this.tag);
            this.zzicf = zzbdt;
        } else {
            throw zzegz.zzbgg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeip
    public final void zzr(List<Boolean> list) throws IOException {
        int zzbdt;
        int zzbdt2;
        if (list instanceof zzefd) {
            zzefd zzefdVar = (zzefd) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzefdVar.addBoolean(this.zzicd.zzbdz());
                    if (this.zzicd.zzbej()) {
                        return;
                    }
                    zzbdt2 = this.zzicd.zzbdt();
                } while (zzbdt2 == this.tag);
                this.zzicf = zzbdt2;
                return;
            } else if (i == 2) {
                int zzbek = this.zzicd.zzbek() + this.zzicd.zzbec();
                do {
                    zzefdVar.addBoolean(this.zzicd.zzbdz());
                } while (this.zzicd.zzbek() < zzbek);
                zzgl(zzbek);
                return;
            } else {
                throw zzegz.zzbgg();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Boolean.valueOf(this.zzicd.zzbdz()));
                if (this.zzicd.zzbej()) {
                    return;
                }
                zzbdt = this.zzicd.zzbdt();
            } while (zzbdt == this.tag);
            this.zzicf = zzbdt;
        } else if (i2 == 2) {
            int zzbek2 = this.zzicd.zzbek() + this.zzicd.zzbec();
            do {
                list.add(Boolean.valueOf(this.zzicd.zzbdz()));
            } while (this.zzicd.zzbek() < zzbek2);
            zzgl(zzbek2);
        } else {
            throw zzegz.zzbgg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeip
    public final void readStringList(List<String> list) throws IOException {
        zza(list, false);
    }

    @Override // com.google.android.gms.internal.ads.zzeip
    public final void zzs(List<String> list) throws IOException {
        zza(list, true);
    }

    private final void zza(List<String> list, boolean z) throws IOException {
        int zzbdt;
        int zzbdt2;
        if ((this.tag & 7) != 2) {
            throw zzegz.zzbgg();
        }
        if ((list instanceof zzehk) && !z) {
            zzehk zzehkVar = (zzehk) list;
            do {
                zzehkVar.zzaj(zzbeb());
                if (this.zzicd.zzbej()) {
                    return;
                }
                zzbdt2 = this.zzicd.zzbdt();
            } while (zzbdt2 == this.tag);
            this.zzicf = zzbdt2;
            return;
        }
        do {
            list.add(z ? zzbea() : readString());
            if (this.zzicd.zzbej()) {
                return;
            }
            zzbdt = this.zzicd.zzbdt();
        } while (zzbdt == this.tag);
        this.zzicf = zzbdt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzeip
    public final <T> void zza(List<T> list, zzeiv<T> zzeivVar, zzegc zzegcVar) throws IOException {
        int zzbdt;
        int i = this.tag;
        if ((i & 7) != 2) {
            throw zzegz.zzbgg();
        }
        do {
            list.add(zzc(zzeivVar, zzegcVar));
            if (this.zzicd.zzbej() || this.zzicf != 0) {
                return;
            }
            zzbdt = this.zzicd.zzbdt();
        } while (zzbdt == i);
        this.zzicf = zzbdt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzeip
    public final <T> void zzb(List<T> list, zzeiv<T> zzeivVar, zzegc zzegcVar) throws IOException {
        int zzbdt;
        int i = this.tag;
        if ((i & 7) != 3) {
            throw zzegz.zzbgg();
        }
        do {
            list.add(zzd(zzeivVar, zzegcVar));
            if (this.zzicd.zzbej() || this.zzicf != 0) {
                return;
            }
            zzbdt = this.zzicd.zzbdt();
        } while (zzbdt == i);
        this.zzicf = zzbdt;
    }

    @Override // com.google.android.gms.internal.ads.zzeip
    public final void zzt(List<zzeff> list) throws IOException {
        int zzbdt;
        if ((this.tag & 7) != 2) {
            throw zzegz.zzbgg();
        }
        do {
            list.add(zzbeb());
            if (this.zzicd.zzbej()) {
                return;
            }
            zzbdt = this.zzicd.zzbdt();
        } while (zzbdt == this.tag);
        this.zzicf = zzbdt;
    }

    @Override // com.google.android.gms.internal.ads.zzeip
    public final void zzu(List<Integer> list) throws IOException {
        int zzbdt;
        int zzbdt2;
        if (list instanceof zzegs) {
            zzegs zzegsVar = (zzegs) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzegsVar.zzhc(this.zzicd.zzbec());
                    if (this.zzicd.zzbej()) {
                        return;
                    }
                    zzbdt2 = this.zzicd.zzbdt();
                } while (zzbdt2 == this.tag);
                this.zzicf = zzbdt2;
                return;
            } else if (i == 2) {
                int zzbek = this.zzicd.zzbek() + this.zzicd.zzbec();
                do {
                    zzegsVar.zzhc(this.zzicd.zzbec());
                } while (this.zzicd.zzbek() < zzbek);
                zzgl(zzbek);
                return;
            } else {
                throw zzegz.zzbgg();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.zzicd.zzbec()));
                if (this.zzicd.zzbej()) {
                    return;
                }
                zzbdt = this.zzicd.zzbdt();
            } while (zzbdt == this.tag);
            this.zzicf = zzbdt;
        } else if (i2 == 2) {
            int zzbek2 = this.zzicd.zzbek() + this.zzicd.zzbec();
            do {
                list.add(Integer.valueOf(this.zzicd.zzbec()));
            } while (this.zzicd.zzbek() < zzbek2);
            zzgl(zzbek2);
        } else {
            throw zzegz.zzbgg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeip
    public final void zzv(List<Integer> list) throws IOException {
        int zzbdt;
        int zzbdt2;
        if (list instanceof zzegs) {
            zzegs zzegsVar = (zzegs) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzegsVar.zzhc(this.zzicd.zzbed());
                    if (this.zzicd.zzbej()) {
                        return;
                    }
                    zzbdt2 = this.zzicd.zzbdt();
                } while (zzbdt2 == this.tag);
                this.zzicf = zzbdt2;
                return;
            } else if (i == 2) {
                int zzbek = this.zzicd.zzbek() + this.zzicd.zzbec();
                do {
                    zzegsVar.zzhc(this.zzicd.zzbed());
                } while (this.zzicd.zzbek() < zzbek);
                zzgl(zzbek);
                return;
            } else {
                throw zzegz.zzbgg();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.zzicd.zzbed()));
                if (this.zzicd.zzbej()) {
                    return;
                }
                zzbdt = this.zzicd.zzbdt();
            } while (zzbdt == this.tag);
            this.zzicf = zzbdt;
        } else if (i2 == 2) {
            int zzbek2 = this.zzicd.zzbek() + this.zzicd.zzbec();
            do {
                list.add(Integer.valueOf(this.zzicd.zzbed()));
            } while (this.zzicd.zzbek() < zzbek2);
            zzgl(zzbek2);
        } else {
            throw zzegz.zzbgg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeip
    public final void zzw(List<Integer> list) throws IOException {
        int zzbdt;
        int zzbdt2;
        if (list instanceof zzegs) {
            zzegs zzegsVar = (zzegs) list;
            int i = this.tag & 7;
            if (i == 2) {
                int zzbec = this.zzicd.zzbec();
                zzgk(zzbec);
                int zzbek = this.zzicd.zzbek() + zzbec;
                do {
                    zzegsVar.zzhc(this.zzicd.zzbee());
                } while (this.zzicd.zzbek() < zzbek);
                return;
            } else if (i == 5) {
                do {
                    zzegsVar.zzhc(this.zzicd.zzbee());
                    if (this.zzicd.zzbej()) {
                        return;
                    }
                    zzbdt2 = this.zzicd.zzbdt();
                } while (zzbdt2 == this.tag);
                this.zzicf = zzbdt2;
                return;
            } else {
                throw zzegz.zzbgg();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 2) {
            int zzbec2 = this.zzicd.zzbec();
            zzgk(zzbec2);
            int zzbek2 = this.zzicd.zzbek() + zzbec2;
            do {
                list.add(Integer.valueOf(this.zzicd.zzbee()));
            } while (this.zzicd.zzbek() < zzbek2);
        } else if (i2 == 5) {
            do {
                list.add(Integer.valueOf(this.zzicd.zzbee()));
                if (this.zzicd.zzbej()) {
                    return;
                }
                zzbdt = this.zzicd.zzbdt();
            } while (zzbdt == this.tag);
            this.zzicf = zzbdt;
        } else {
            throw zzegz.zzbgg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeip
    public final void zzx(List<Long> list) throws IOException {
        int zzbdt;
        int zzbdt2;
        if (list instanceof zzehn) {
            zzehn zzehnVar = (zzehn) list;
            int i = this.tag & 7;
            if (i == 1) {
                do {
                    zzehnVar.zzfs(this.zzicd.zzbef());
                    if (this.zzicd.zzbej()) {
                        return;
                    }
                    zzbdt2 = this.zzicd.zzbdt();
                } while (zzbdt2 == this.tag);
                this.zzicf = zzbdt2;
                return;
            } else if (i == 2) {
                int zzbec = this.zzicd.zzbec();
                zzgj(zzbec);
                int zzbek = this.zzicd.zzbek() + zzbec;
                do {
                    zzehnVar.zzfs(this.zzicd.zzbef());
                } while (this.zzicd.zzbek() < zzbek);
                return;
            } else {
                throw zzegz.zzbgg();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 1) {
            do {
                list.add(Long.valueOf(this.zzicd.zzbef()));
                if (this.zzicd.zzbej()) {
                    return;
                }
                zzbdt = this.zzicd.zzbdt();
            } while (zzbdt == this.tag);
            this.zzicf = zzbdt;
        } else if (i2 == 2) {
            int zzbec2 = this.zzicd.zzbec();
            zzgj(zzbec2);
            int zzbek2 = this.zzicd.zzbek() + zzbec2;
            do {
                list.add(Long.valueOf(this.zzicd.zzbef()));
            } while (this.zzicd.zzbek() < zzbek2);
        } else {
            throw zzegz.zzbgg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeip
    public final void zzy(List<Integer> list) throws IOException {
        int zzbdt;
        int zzbdt2;
        if (list instanceof zzegs) {
            zzegs zzegsVar = (zzegs) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzegsVar.zzhc(this.zzicd.zzbeg());
                    if (this.zzicd.zzbej()) {
                        return;
                    }
                    zzbdt2 = this.zzicd.zzbdt();
                } while (zzbdt2 == this.tag);
                this.zzicf = zzbdt2;
                return;
            } else if (i == 2) {
                int zzbek = this.zzicd.zzbek() + this.zzicd.zzbec();
                do {
                    zzegsVar.zzhc(this.zzicd.zzbeg());
                } while (this.zzicd.zzbek() < zzbek);
                zzgl(zzbek);
                return;
            } else {
                throw zzegz.zzbgg();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.zzicd.zzbeg()));
                if (this.zzicd.zzbej()) {
                    return;
                }
                zzbdt = this.zzicd.zzbdt();
            } while (zzbdt == this.tag);
            this.zzicf = zzbdt;
        } else if (i2 == 2) {
            int zzbek2 = this.zzicd.zzbek() + this.zzicd.zzbec();
            do {
                list.add(Integer.valueOf(this.zzicd.zzbeg()));
            } while (this.zzicd.zzbek() < zzbek2);
            zzgl(zzbek2);
        } else {
            throw zzegz.zzbgg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeip
    public final void zzz(List<Long> list) throws IOException {
        int zzbdt;
        int zzbdt2;
        if (list instanceof zzehn) {
            zzehn zzehnVar = (zzehn) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzehnVar.zzfs(this.zzicd.zzbeh());
                    if (this.zzicd.zzbej()) {
                        return;
                    }
                    zzbdt2 = this.zzicd.zzbdt();
                } while (zzbdt2 == this.tag);
                this.zzicf = zzbdt2;
                return;
            } else if (i == 2) {
                int zzbek = this.zzicd.zzbek() + this.zzicd.zzbec();
                do {
                    zzehnVar.zzfs(this.zzicd.zzbeh());
                } while (this.zzicd.zzbek() < zzbek);
                zzgl(zzbek);
                return;
            } else {
                throw zzegz.zzbgg();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(this.zzicd.zzbeh()));
                if (this.zzicd.zzbej()) {
                    return;
                }
                zzbdt = this.zzicd.zzbdt();
            } while (zzbdt == this.tag);
            this.zzicf = zzbdt;
        } else if (i2 == 2) {
            int zzbek2 = this.zzicd.zzbek() + this.zzicd.zzbec();
            do {
                list.add(Long.valueOf(this.zzicd.zzbeh()));
            } while (this.zzicd.zzbek() < zzbek2);
            zzgl(zzbek2);
        } else {
            throw zzegz.zzbgg();
        }
    }

    private static void zzgj(int i) throws IOException {
        if ((i & 7) != 0) {
            throw zzegz.zzbgi();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzeip
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <K, V> void zza(java.util.Map<K, V> r8, com.google.android.gms.internal.ads.zzehu<K, V> r9, com.google.android.gms.internal.ads.zzegc r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.zzgi(r0)
            com.google.android.gms.internal.ads.zzefq r1 = r7.zzicd
            int r1 = r1.zzbec()
            com.google.android.gms.internal.ads.zzefq r2 = r7.zzicd
            int r1 = r2.zzga(r1)
            K r2 = r9.zzihv
            V r3 = r9.zzckv
        L14:
            int r4 = r7.zzber()     // Catch: java.lang.Throwable -> L64
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5b
            com.google.android.gms.internal.ads.zzefq r5 = r7.zzicd     // Catch: java.lang.Throwable -> L64
            boolean r5 = r5.zzbej()     // Catch: java.lang.Throwable -> L64
            if (r5 != 0) goto L5b
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L46
            if (r4 == r0) goto L39
            boolean r4 = r7.zzbes()     // Catch: com.google.android.gms.internal.ads.zzehc -> L4e java.lang.Throwable -> L64
            if (r4 == 0) goto L33
            goto L14
        L33:
            com.google.android.gms.internal.ads.zzegz r4 = new com.google.android.gms.internal.ads.zzegz     // Catch: com.google.android.gms.internal.ads.zzehc -> L4e java.lang.Throwable -> L64
            r4.<init>(r6)     // Catch: com.google.android.gms.internal.ads.zzehc -> L4e java.lang.Throwable -> L64
            throw r4     // Catch: com.google.android.gms.internal.ads.zzehc -> L4e java.lang.Throwable -> L64
        L39:
            com.google.android.gms.internal.ads.zzeke r4 = r9.zzihw     // Catch: com.google.android.gms.internal.ads.zzehc -> L4e java.lang.Throwable -> L64
            V r5 = r9.zzckv     // Catch: com.google.android.gms.internal.ads.zzehc -> L4e java.lang.Throwable -> L64
            java.lang.Class r5 = r5.getClass()     // Catch: com.google.android.gms.internal.ads.zzehc -> L4e java.lang.Throwable -> L64
            java.lang.Object r3 = r7.zza(r4, r5, r10)     // Catch: com.google.android.gms.internal.ads.zzehc -> L4e java.lang.Throwable -> L64
            goto L14
        L46:
            com.google.android.gms.internal.ads.zzeke r4 = r9.zzihu     // Catch: com.google.android.gms.internal.ads.zzehc -> L4e java.lang.Throwable -> L64
            r5 = 0
            java.lang.Object r2 = r7.zza(r4, r5, r5)     // Catch: com.google.android.gms.internal.ads.zzehc -> L4e java.lang.Throwable -> L64
            goto L14
        L4e:
            boolean r4 = r7.zzbes()     // Catch: java.lang.Throwable -> L64
            if (r4 == 0) goto L55
            goto L14
        L55:
            com.google.android.gms.internal.ads.zzegz r8 = new com.google.android.gms.internal.ads.zzegz     // Catch: java.lang.Throwable -> L64
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L64
            throw r8     // Catch: java.lang.Throwable -> L64
        L5b:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L64
            com.google.android.gms.internal.ads.zzefq r8 = r7.zzicd
            r8.zzgb(r1)
            return
        L64:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzefq r9 = r7.zzicd
            r9.zzgb(r1)
            goto L6c
        L6b:
            throw r8
        L6c:
            goto L6b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzefx.zza(java.util.Map, com.google.android.gms.internal.ads.zzehu, com.google.android.gms.internal.ads.zzegc):void");
    }

    private final Object zza(zzeke zzekeVar, Class<?> cls, zzegc zzegcVar) throws IOException {
        switch (zzefw.zzicc[zzekeVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(zzbdz());
            case 2:
                return zzbeb();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(zzbed());
            case 5:
                return Integer.valueOf(zzbdy());
            case 6:
                return Long.valueOf(zzbdx());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(zzbdw());
            case 9:
                return Long.valueOf(zzbdv());
            case 10:
                zzgi(2);
                return zzc(zzeio.zzbhg().zzh(cls), zzegcVar);
            case 11:
                return Integer.valueOf(zzbee());
            case 12:
                return Long.valueOf(zzbef());
            case 13:
                return Integer.valueOf(zzbeg());
            case 14:
                return Long.valueOf(zzbeh());
            case 15:
                return zzbea();
            case 16:
                return Integer.valueOf(zzbec());
            case 17:
                return Long.valueOf(zzbdu());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static void zzgk(int i) throws IOException {
        if ((i & 3) != 0) {
            throw zzegz.zzbgi();
        }
    }

    private final void zzgl(int i) throws IOException {
        if (this.zzicd.zzbek() != i) {
            throw zzegz.zzbgb();
        }
    }
}
