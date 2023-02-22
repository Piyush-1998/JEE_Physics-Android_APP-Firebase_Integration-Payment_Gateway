package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public class zzehi {
    private static final zzegc zziar = zzegc.zzbex();
    private zzeff zzihi;
    private volatile zzehz zzihj;
    private volatile zzeff zzihk;

    public int hashCode() {
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzehi) {
            zzehi zzehiVar = (zzehi) obj;
            zzehz zzehzVar = this.zzihj;
            zzehz zzehzVar2 = zzehiVar.zzihj;
            if (zzehzVar == null && zzehzVar2 == null) {
                return zzbda().equals(zzehiVar.zzbda());
            }
            if (zzehzVar == null || zzehzVar2 == null) {
                if (zzehzVar != null) {
                    return zzehzVar.equals(zzehiVar.zzm(zzehzVar.zzbfr()));
                }
                return zzm(zzehzVar2.zzbfr()).equals(zzehzVar2);
            }
            return zzehzVar.equals(zzehzVar2);
        }
        return false;
    }

    private final zzehz zzm(zzehz zzehzVar) {
        if (this.zzihj == null) {
            synchronized (this) {
                if (this.zzihj == null) {
                    try {
                        this.zzihj = zzehzVar;
                        this.zzihk = zzeff.zzibd;
                    } catch (zzegz unused) {
                        this.zzihj = zzehzVar;
                        this.zzihk = zzeff.zzibd;
                    }
                }
            }
        }
        return this.zzihj;
    }

    public final zzehz zzn(zzehz zzehzVar) {
        zzehz zzehzVar2 = this.zzihj;
        this.zzihi = null;
        this.zzihk = null;
        this.zzihj = zzehzVar;
        return zzehzVar2;
    }

    public final int zzbfl() {
        if (this.zzihk != null) {
            return this.zzihk.size();
        }
        if (this.zzihj != null) {
            return this.zzihj.zzbfl();
        }
        return 0;
    }

    public final zzeff zzbda() {
        if (this.zzihk != null) {
            return this.zzihk;
        }
        synchronized (this) {
            if (this.zzihk != null) {
                return this.zzihk;
            }
            if (this.zzihj == null) {
                this.zzihk = zzeff.zzibd;
            } else {
                this.zzihk = this.zzihj.zzbda();
            }
            return this.zzihk;
        }
    }
}
