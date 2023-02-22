package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
final class zzeif<T> implements zzeiv<T> {
    private final zzehz zziie;
    private final boolean zziif;
    private final zzejn<?, ?> zziio;
    private final zzege<?> zziip;

    private zzeif(zzejn<?, ?> zzejnVar, zzege<?> zzegeVar, zzehz zzehzVar) {
        this.zziio = zzejnVar;
        this.zziif = zzegeVar.zzj(zzehzVar);
        this.zziip = zzegeVar;
        this.zziie = zzehzVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> zzeif<T> zza(zzejn<?, ?> zzejnVar, zzege<?> zzegeVar, zzehz zzehzVar) {
        return new zzeif<>(zzejnVar, zzegeVar, zzehzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeiv
    public final T newInstance() {
        return (T) this.zziie.zzbfq().zzbfw();
    }

    @Override // com.google.android.gms.internal.ads.zzeiv
    public final boolean equals(T t, T t2) {
        if (this.zziio.zzax(t).equals(this.zziio.zzax(t2))) {
            if (this.zziif) {
                return this.zziip.zzah(t).equals(this.zziip.zzah(t2));
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzeiv
    public final int hashCode(T t) {
        int hashCode = this.zziio.zzax(t).hashCode();
        return this.zziif ? (hashCode * 53) + this.zziip.zzah(t).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzeiv
    public final void zzg(T t, T t2) {
        zzeix.zza(this.zziio, t, t2);
        if (this.zziif) {
            zzeix.zza(this.zziip, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeiv
    public final void zza(T t, zzekk zzekkVar) throws IOException {
        Iterator<Map.Entry<?, Object>> it = this.zziip.zzah(t).iterator();
        while (it.hasNext()) {
            Map.Entry<?, Object> next = it.next();
            zzegk zzegkVar = (zzegk) next.getKey();
            if (zzegkVar.zzbff() != zzekh.MESSAGE || zzegkVar.zzbfg() || zzegkVar.zzbfh()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (next instanceof zzehg) {
                zzekkVar.zzc(zzegkVar.zzv(), ((zzehg) next).zzbgm().zzbda());
            } else {
                zzekkVar.zzc(zzegkVar.zzv(), next.getValue());
            }
        }
        zzejn<?, ?> zzejnVar = this.zziio;
        zzejnVar.zzc(zzejnVar.zzax(t), zzekkVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099 A[EDGE_INSN: B:58:0x0099->B:34:0x0099 ?: BREAK  , SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzeiv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.ads.zzefa r14) throws java.io.IOException {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.ads.zzegp r0 = (com.google.android.gms.internal.ads.zzegp) r0
            com.google.android.gms.internal.ads.zzejq r1 = r0.zzifo
            com.google.android.gms.internal.ads.zzejq r2 = com.google.android.gms.internal.ads.zzejq.zzbhz()
            if (r1 != r2) goto L11
            com.google.android.gms.internal.ads.zzejq r1 = com.google.android.gms.internal.ads.zzejq.zzbia()
            r0.zzifo = r1
        L11:
            com.google.android.gms.internal.ads.zzegp$zzd r10 = (com.google.android.gms.internal.ads.zzegp.zzd) r10
            r10.zzbfy()
            r10 = 0
            r0 = r10
        L18:
            if (r12 >= r13) goto La4
            int r4 = com.google.android.gms.internal.ads.zzefb.zza(r11, r12, r14)
            int r2 = r14.zziaw
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L51
            r12 = r2 & 7
            if (r12 != r3) goto L4c
            com.google.android.gms.internal.ads.zzege<?> r12 = r9.zziip
            com.google.android.gms.internal.ads.zzegc r0 = r14.zziaz
            com.google.android.gms.internal.ads.zzehz r3 = r9.zziie
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.zza(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.ads.zzegp$zzf r0 = (com.google.android.gms.internal.ads.zzegp.zzf) r0
            if (r0 != 0) goto L43
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.ads.zzefb.zza(r2, r3, r4, r5, r6, r7)
            goto L18
        L43:
            com.google.android.gms.internal.ads.zzeio.zzbhg()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L4c:
            int r12 = com.google.android.gms.internal.ads.zzefb.zza(r2, r11, r4, r13, r14)
            goto L18
        L51:
            r12 = 0
            r2 = r10
        L53:
            if (r4 >= r13) goto L99
            int r4 = com.google.android.gms.internal.ads.zzefb.zza(r11, r4, r14)
            int r5 = r14.zziaw
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L7b
            r8 = 3
            if (r6 == r8) goto L65
            goto L90
        L65:
            if (r0 != 0) goto L72
            if (r7 != r3) goto L90
            int r4 = com.google.android.gms.internal.ads.zzefb.zze(r11, r4, r14)
            java.lang.Object r2 = r14.zziay
            com.google.android.gms.internal.ads.zzeff r2 = (com.google.android.gms.internal.ads.zzeff) r2
            goto L53
        L72:
            com.google.android.gms.internal.ads.zzeio.zzbhg()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L7b:
            if (r7 != 0) goto L90
            int r4 = com.google.android.gms.internal.ads.zzefb.zza(r11, r4, r14)
            int r12 = r14.zziaw
            com.google.android.gms.internal.ads.zzege<?> r0 = r9.zziip
            com.google.android.gms.internal.ads.zzegc r5 = r14.zziaz
            com.google.android.gms.internal.ads.zzehz r6 = r9.zziie
            java.lang.Object r0 = r0.zza(r5, r6, r12)
            com.google.android.gms.internal.ads.zzegp$zzf r0 = (com.google.android.gms.internal.ads.zzegp.zzf) r0
            goto L53
        L90:
            r6 = 12
            if (r5 == r6) goto L99
            int r4 = com.google.android.gms.internal.ads.zzefb.zza(r5, r11, r4, r13, r14)
            goto L53
        L99:
            if (r2 == 0) goto La1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.zzd(r12, r2)
        La1:
            r12 = r4
            goto L18
        La4:
            if (r12 != r13) goto La7
            return
        La7:
            com.google.android.gms.internal.ads.zzegz r10 = com.google.android.gms.internal.ads.zzegz.zzbgi()
            goto Lad
        Lac:
            throw r10
        Lad:
            goto Lac
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeif.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.zzefa):void");
    }

    @Override // com.google.android.gms.internal.ads.zzeiv
    public final void zza(T t, zzeip zzeipVar, zzegc zzegcVar) throws IOException {
        boolean z;
        zzejn<?, ?> zzejnVar = this.zziio;
        zzege<?> zzegeVar = this.zziip;
        Object zzay = zzejnVar.zzay(t);
        zzegi<?> zzai = zzegeVar.zzai(t);
        do {
            try {
                if (zzeipVar.zzber() == Integer.MAX_VALUE) {
                    return;
                }
                int tag = zzeipVar.getTag();
                if (tag == 11) {
                    int i = 0;
                    Object obj = null;
                    zzeff zzeffVar = null;
                    while (zzeipVar.zzber() != Integer.MAX_VALUE) {
                        int tag2 = zzeipVar.getTag();
                        if (tag2 == 16) {
                            i = zzeipVar.zzbec();
                            obj = zzegeVar.zza(zzegcVar, this.zziie, i);
                        } else if (tag2 == 26) {
                            if (obj != null) {
                                zzegeVar.zza(zzeipVar, obj, zzegcVar, zzai);
                            } else {
                                zzeffVar = zzeipVar.zzbeb();
                            }
                        } else if (!zzeipVar.zzbes()) {
                            break;
                        }
                    }
                    if (zzeipVar.getTag() != 12) {
                        throw zzegz.zzbgf();
                    } else if (zzeffVar != null) {
                        if (obj != null) {
                            zzegeVar.zza(zzeffVar, obj, zzegcVar, zzai);
                        } else {
                            zzejnVar.zza((zzejn<?, ?>) zzay, i, zzeffVar);
                        }
                    }
                } else if ((tag & 7) == 2) {
                    Object zza = zzegeVar.zza(zzegcVar, this.zziie, tag >>> 3);
                    if (zza != null) {
                        zzegeVar.zza(zzeipVar, zza, zzegcVar, zzai);
                    } else {
                        z = zzejnVar.zza((zzejn<?, ?>) zzay, zzeipVar);
                        continue;
                    }
                } else {
                    z = zzeipVar.zzbes();
                    continue;
                }
                z = true;
                continue;
            } finally {
                zzejnVar.zzj(t, zzay);
            }
        } while (z);
    }

    @Override // com.google.android.gms.internal.ads.zzeiv
    public final void zzaj(T t) {
        this.zziio.zzaj(t);
        this.zziip.zzaj(t);
    }

    @Override // com.google.android.gms.internal.ads.zzeiv
    public final boolean zzav(T t) {
        return this.zziip.zzah(t).isInitialized();
    }

    @Override // com.google.android.gms.internal.ads.zzeiv
    public final int zzat(T t) {
        zzejn<?, ?> zzejnVar = this.zziio;
        int zzaz = zzejnVar.zzaz(zzejnVar.zzax(t)) + 0;
        return this.zziif ? zzaz + this.zziip.zzah(t).zzbfd() : zzaz;
    }
}
