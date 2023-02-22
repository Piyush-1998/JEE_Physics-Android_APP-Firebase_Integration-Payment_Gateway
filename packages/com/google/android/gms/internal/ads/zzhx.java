package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public interface zzhx extends zzhe {
    void disable();

    int getState();

    int getTrackType();

    boolean isReady();

    void setIndex(int i);

    void start() throws zzhd;

    void stop() throws zzhd;

    void zza(zzhz zzhzVar, zzho[] zzhoVarArr, zznm zznmVar, long j, boolean z, long j2) throws zzhd;

    void zza(zzho[] zzhoVarArr, zznm zznmVar, long j) throws zzhd;

    void zzb(long j, long j2) throws zzhd;

    void zzdo(long j) throws zzhd;

    zzhw zzdx();

    zzpd zzdy();

    zznm zzdz();

    boolean zzea();

    void zzeb();

    boolean zzec();

    void zzed() throws IOException;

    boolean zzfc();
}
