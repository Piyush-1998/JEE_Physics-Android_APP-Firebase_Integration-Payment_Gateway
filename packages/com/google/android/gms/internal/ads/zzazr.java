package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzazr {
    public final int count;
    public final String name;
    private final double zzebr;
    private final double zzebs;
    public final double zzebt;

    public zzazr(String str, double d, double d2, double d3, int i) {
        this.name = str;
        this.zzebs = d;
        this.zzebr = d2;
        this.zzebt = d3;
        this.count = i;
    }

    public final String toString() {
        return Objects.toStringHelper(this).add(AppMeasurementSdk.ConditionalUserProperty.NAME, this.name).add("minBound", Double.valueOf(this.zzebs)).add("maxBound", Double.valueOf(this.zzebr)).add("percent", Double.valueOf(this.zzebt)).add("count", Integer.valueOf(this.count)).toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzazr) {
            zzazr zzazrVar = (zzazr) obj;
            return Objects.equal(this.name, zzazrVar.name) && this.zzebr == zzazrVar.zzebr && this.zzebs == zzazrVar.zzebs && this.count == zzazrVar.count && Double.compare(this.zzebt, zzazrVar.zzebt) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.name, Double.valueOf(this.zzebr), Double.valueOf(this.zzebs), Double.valueOf(this.zzebt), Integer.valueOf(this.count));
    }
}
