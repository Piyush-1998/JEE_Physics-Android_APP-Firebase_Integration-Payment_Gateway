package com.google.ads.mediation;

import android.location.Location;
import com.google.ads.AdRequest;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
@Deprecated
/* loaded from: classes.dex */
public class MediationAdRequest {
    private final Date zzmx;
    private final AdRequest.Gender zzmy;
    private final Set<String> zzmz;
    private final boolean zzna;
    private final Location zznb;

    public MediationAdRequest(Date date, AdRequest.Gender gender, Set<String> set, boolean z, Location location) {
        this.zzmx = date;
        this.zzmy = gender;
        this.zzmz = set;
        this.zzna = z;
        this.zznb = location;
    }

    public Integer getAgeInYears() {
        if (this.zzmx != null) {
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar.setTime(this.zzmx);
            Integer valueOf = Integer.valueOf(calendar2.get(1) - calendar.get(1));
            return (calendar2.get(2) < calendar.get(2) || (calendar2.get(2) == calendar.get(2) && calendar2.get(5) < calendar.get(5))) ? Integer.valueOf(valueOf.intValue() - 1) : valueOf;
        }
        return null;
    }

    public Date getBirthday() {
        return this.zzmx;
    }

    public AdRequest.Gender getGender() {
        return this.zzmy;
    }

    public Set<String> getKeywords() {
        return this.zzmz;
    }

    public Location getLocation() {
        return this.zznb;
    }

    public boolean isTesting() {
        return this.zzna;
    }
}
