package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzegi<T extends zzegk<T>> {
    private static final zzegi zzicw = new zzegi(true);
    final zzeja<T, Object> zzict;
    private boolean zzicu;
    private boolean zzicv;

    private zzegi() {
        this.zzict = zzeja.zzho(16);
    }

    private zzegi(boolean z) {
        this(zzeja.zzho(0));
        zzbdg();
    }

    private zzegi(zzeja<T, Object> zzejaVar) {
        this.zzict = zzejaVar;
        zzbdg();
    }

    public static <T extends zzegk<T>> zzegi<T> zzbfc() {
        return zzicw;
    }

    public final void zzbdg() {
        if (this.zzicu) {
            return;
        }
        this.zzict.zzbdg();
        this.zzicu = true;
    }

    public final boolean isImmutable() {
        return this.zzicu;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzegi) {
            return this.zzict.equals(((zzegi) obj).zzict);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzict.hashCode();
    }

    public final Iterator<Map.Entry<T, Object>> iterator() {
        if (this.zzicv) {
            return new zzehf(this.zzict.entrySet().iterator());
        }
        return this.zzict.entrySet().iterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Iterator<Map.Entry<T, Object>> descendingIterator() {
        if (this.zzicv) {
            return new zzehf(this.zzict.zzbhs().iterator());
        }
        return this.zzict.zzbhs().iterator();
    }

    private final Object zza(T t) {
        Object obj = this.zzict.get(t);
        if (obj instanceof zzehe) {
            zzehe zzeheVar = (zzehe) obj;
            return zzehe.zzbgl();
        }
        return obj;
    }

    private final void zza(T t, Object obj) {
        if (t.zzbfg()) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                zza(t.zzbfe(), obj2);
            }
            obj = arrayList;
        } else {
            zza(t.zzbfe(), obj);
        }
        if (obj instanceof zzehe) {
            this.zzicv = true;
        }
        this.zzict.zza((zzeja<T, Object>) t, (T) obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        if ((r3 instanceof com.google.android.gms.internal.ads.zzegu) == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
        if ((r3 instanceof byte[]) == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
        if ((r3 instanceof com.google.android.gms.internal.ads.zzehe) == false) goto L3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zza(com.google.android.gms.internal.ads.zzeke r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.ads.zzegr.checkNotNull(r3)
            int[] r0 = com.google.android.gms.internal.ads.zzegh.zzics
            com.google.android.gms.internal.ads.zzekh r2 = r2.zzbii()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L40;
                case 2: goto L3d;
                case 3: goto L3a;
                case 4: goto L37;
                case 5: goto L34;
                case 6: goto L31;
                case 7: goto L28;
                case 8: goto L1f;
                case 9: goto L16;
                default: goto L14;
            }
        L14:
            r0 = 0
            goto L42
        L16:
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.zzehz
            if (r2 != 0) goto L42
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.zzehe
            if (r2 == 0) goto L14
            goto L42
        L1f:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L42
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.zzegu
            if (r2 == 0) goto L14
            goto L42
        L28:
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.zzeff
            if (r2 != 0) goto L42
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L14
            goto L42
        L31:
            boolean r0 = r3 instanceof java.lang.String
            goto L42
        L34:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L42
        L37:
            boolean r0 = r3 instanceof java.lang.Double
            goto L42
        L3a:
            boolean r0 = r3 instanceof java.lang.Float
            goto L42
        L3d:
            boolean r0 = r3 instanceof java.lang.Long
            goto L42
        L40:
            boolean r0 = r3 instanceof java.lang.Integer
        L42:
            if (r0 == 0) goto L45
            return
        L45:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            goto L4e
        L4d:
            throw r2
        L4e:
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzegi.zza(com.google.android.gms.internal.ads.zzeke, java.lang.Object):void");
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.zzict.zzbhq(); i++) {
            if (!zzb(this.zzict.zzhp(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> entry : this.zzict.zzbhr()) {
            if (!zzb(entry)) {
                return false;
            }
        }
        return true;
    }

    private static <T extends zzegk<T>> boolean zzb(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.zzbff() == zzekh.MESSAGE) {
            if (key.zzbfg()) {
                for (zzehz zzehzVar : (List) entry.getValue()) {
                    if (!zzehzVar.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof zzehz) {
                    if (!((zzehz) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof zzehe) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    public final void zza(zzegi<T> zzegiVar) {
        for (int i = 0; i < zzegiVar.zzict.zzbhq(); i++) {
            zzc(zzegiVar.zzict.zzhp(i));
        }
        for (Map.Entry<T, Object> entry : zzegiVar.zzict.zzbhr()) {
            zzc(entry);
        }
    }

    private static Object zzak(Object obj) {
        if (obj instanceof zzeii) {
            return ((zzeii) obj).zzbdc();
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    private final void zzc(Map.Entry<T, Object> entry) {
        zzehz zzbfx;
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzehe) {
            zzehe zzeheVar = (zzehe) value;
            value = zzehe.zzbgl();
        }
        if (key.zzbfg()) {
            Object zza = zza((zzegi<T>) key);
            if (zza == null) {
                zza = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) zza).add(zzak(obj));
            }
            this.zzict.zza((zzeja<T, Object>) key, (T) zza);
        } else if (key.zzbff() == zzekh.MESSAGE) {
            Object zza2 = zza((zzegi<T>) key);
            if (zza2 == null) {
                this.zzict.zza((zzeja<T, Object>) key, (T) zzak(value));
                return;
            }
            if (zza2 instanceof zzeii) {
                zzbfx = key.zza((zzeii) zza2, (zzeii) value);
            } else {
                zzbfx = key.zza(((zzehz) zza2).zzbfp(), (zzehz) value).zzbfx();
            }
            this.zzict.zza((zzeja<T, Object>) key, (T) zzbfx);
        } else {
            this.zzict.zza((zzeja<T, Object>) key, (T) zzak(value));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(zzefz zzefzVar, zzeke zzekeVar, int i, Object obj) throws IOException {
        if (zzekeVar == zzeke.zzilr) {
            zzehz zzehzVar = (zzehz) obj;
            zzegr.zzk(zzehzVar);
            zzefzVar.writeTag(i, 3);
            zzehzVar.zzb(zzefzVar);
            zzefzVar.writeTag(i, 4);
            return;
        }
        zzefzVar.writeTag(i, zzekeVar.zzbij());
        switch (zzegh.zzicc[zzekeVar.ordinal()]) {
            case 1:
                zzefzVar.zzb(((Double) obj).doubleValue());
                return;
            case 2:
                zzefzVar.zzf(((Float) obj).floatValue());
                return;
            case 3:
                zzefzVar.zzfi(((Long) obj).longValue());
                return;
            case 4:
                zzefzVar.zzfi(((Long) obj).longValue());
                return;
            case 5:
                zzefzVar.zzgm(((Integer) obj).intValue());
                return;
            case 6:
                zzefzVar.zzfk(((Long) obj).longValue());
                return;
            case 7:
                zzefzVar.zzgp(((Integer) obj).intValue());
                return;
            case 8:
                zzefzVar.zzbs(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzehz) obj).zzb(zzefzVar);
                return;
            case 10:
                zzefzVar.zzg((zzehz) obj);
                return;
            case 11:
                if (obj instanceof zzeff) {
                    zzefzVar.zzah((zzeff) obj);
                    return;
                } else {
                    zzefzVar.zzhv((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzeff) {
                    zzefzVar.zzah((zzeff) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zzefzVar.zzk(bArr, 0, bArr.length);
                return;
            case 13:
                zzefzVar.zzgn(((Integer) obj).intValue());
                return;
            case 14:
                zzefzVar.zzgp(((Integer) obj).intValue());
                return;
            case 15:
                zzefzVar.zzfk(((Long) obj).longValue());
                return;
            case 16:
                zzefzVar.zzgo(((Integer) obj).intValue());
                return;
            case 17:
                zzefzVar.zzfj(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof zzegu) {
                    zzefzVar.zzgm(((zzegu) obj).zzv());
                    return;
                } else {
                    zzefzVar.zzgm(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public final int zzbfd() {
        int i = 0;
        for (int i2 = 0; i2 < this.zzict.zzbhq(); i2++) {
            i += zzd(this.zzict.zzhp(i2));
        }
        for (Map.Entry<T, Object> entry : this.zzict.zzbhr()) {
            i += zzd(entry);
        }
        return i;
    }

    private static int zzd(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.zzbff() == zzekh.MESSAGE && !key.zzbfg() && !key.zzbfh()) {
            if (value instanceof zzehe) {
                return zzefz.zzb(entry.getKey().zzv(), (zzehe) value);
            }
            return zzefz.zzb(entry.getKey().zzv(), (zzehz) value);
        }
        return zzb((zzegk<?>) key, value);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzeke zzekeVar, int i, Object obj) {
        int zzgq = zzefz.zzgq(i);
        if (zzekeVar == zzeke.zzilr) {
            zzegr.zzk((zzehz) obj);
            zzgq <<= 1;
        }
        return zzgq + zzb(zzekeVar, obj);
    }

    private static int zzb(zzeke zzekeVar, Object obj) {
        switch (zzegh.zzicc[zzekeVar.ordinal()]) {
            case 1:
                return zzefz.zzc(((Double) obj).doubleValue());
            case 2:
                return zzefz.zzg(((Float) obj).floatValue());
            case 3:
                return zzefz.zzfl(((Long) obj).longValue());
            case 4:
                return zzefz.zzfm(((Long) obj).longValue());
            case 5:
                return zzefz.zzgr(((Integer) obj).intValue());
            case 6:
                return zzefz.zzfo(((Long) obj).longValue());
            case 7:
                return zzefz.zzgu(((Integer) obj).intValue());
            case 8:
                return zzefz.zzbt(((Boolean) obj).booleanValue());
            case 9:
                return zzefz.zzi((zzehz) obj);
            case 10:
                if (obj instanceof zzehe) {
                    return zzefz.zza((zzehe) obj);
                }
                return zzefz.zzh((zzehz) obj);
            case 11:
                if (obj instanceof zzeff) {
                    return zzefz.zzai((zzeff) obj);
                }
                return zzefz.zzhw((String) obj);
            case 12:
                if (obj instanceof zzeff) {
                    return zzefz.zzai((zzeff) obj);
                }
                return zzefz.zzx((byte[]) obj);
            case 13:
                return zzefz.zzgs(((Integer) obj).intValue());
            case 14:
                return zzefz.zzgv(((Integer) obj).intValue());
            case 15:
                return zzefz.zzfp(((Long) obj).longValue());
            case 16:
                return zzefz.zzgt(((Integer) obj).intValue());
            case 17:
                return zzefz.zzfn(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzegu) {
                    return zzefz.zzgw(((zzegu) obj).zzv());
                }
                return zzefz.zzgw(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int zzb(zzegk<?> zzegkVar, Object obj) {
        zzeke zzbfe = zzegkVar.zzbfe();
        int zzv = zzegkVar.zzv();
        if (zzegkVar.zzbfg()) {
            int i = 0;
            if (zzegkVar.zzbfh()) {
                for (Object obj2 : (List) obj) {
                    i += zzb(zzbfe, obj2);
                }
                return zzefz.zzgq(zzv) + i + zzefz.zzgy(i);
            }
            for (Object obj3 : (List) obj) {
                i += zza(zzbfe, zzv, obj3);
            }
            return i;
        }
        return zza(zzbfe, zzv, obj);
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzegi zzegiVar = new zzegi();
        for (int i = 0; i < this.zzict.zzbhq(); i++) {
            Map.Entry<T, Object> zzhp = this.zzict.zzhp(i);
            zzegiVar.zza((zzegi) zzhp.getKey(), zzhp.getValue());
        }
        for (Map.Entry<T, Object> entry : this.zzict.zzbhr()) {
            zzegiVar.zza((zzegi) entry.getKey(), entry.getValue());
        }
        zzegiVar.zzicv = this.zzicv;
        return zzegiVar;
    }
}
