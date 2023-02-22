package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzazp {
    private final String[] zzebj;
    private final double[] zzebk;
    private final double[] zzebl;
    private final int[] zzebm;
    private int zzebn;

    private zzazp(zzazq zzazqVar) {
        List list;
        List list2;
        List list3;
        List list4;
        list = zzazqVar.zzebp;
        int size = list.size();
        list2 = zzazqVar.zzebo;
        this.zzebj = (String[]) list2.toArray(new String[size]);
        list3 = zzazqVar.zzebp;
        this.zzebk = zzg(list3);
        list4 = zzazqVar.zzebq;
        this.zzebl = zzg(list4);
        this.zzebm = new int[size];
        this.zzebn = 0;
    }

    private static double[] zzg(List<Double> list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = list.get(i).doubleValue();
        }
        return dArr;
    }

    public final void zza(double d) {
        this.zzebn++;
        int i = 0;
        while (true) {
            double[] dArr = this.zzebl;
            if (i >= dArr.length) {
                return;
            }
            if (dArr[i] <= d && d < this.zzebk[i]) {
                int[] iArr = this.zzebm;
                iArr[i] = iArr[i] + 1;
            }
            if (d < this.zzebl[i]) {
                return;
            }
            i++;
        }
    }

    public final List<zzazr> zzyd() {
        ArrayList arrayList = new ArrayList(this.zzebj.length);
        for (int i = 0; i < this.zzebj.length; i++) {
            String str = this.zzebj[i];
            double d = this.zzebl[i];
            double d2 = this.zzebk[i];
            int[] iArr = this.zzebm;
            double d3 = iArr[i];
            double d4 = this.zzebn;
            Double.isNaN(d3);
            Double.isNaN(d4);
            arrayList.add(new zzazr(str, d, d2, d3 / d4, iArr[i]));
        }
        return arrayList;
    }
}
