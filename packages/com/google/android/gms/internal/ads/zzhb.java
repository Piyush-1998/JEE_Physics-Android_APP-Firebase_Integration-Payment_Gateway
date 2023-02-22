package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public abstract class zzhb implements zzhw, zzhx {
    private int index;
    private int state;
    private final int zzaea;
    private zzhz zzaeb;
    private zznm zzaec;
    private long zzaed;
    private boolean zzaee = true;
    private boolean zzaef;

    public zzhb(int i) {
        this.zzaea = i;
    }

    protected void onStarted() throws zzhd {
    }

    protected void onStopped() throws zzhd {
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public void zza(int i, Object obj) throws zzhd {
    }

    protected void zza(long j, boolean z) throws zzhd {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zza(zzho[] zzhoVarArr, long j) throws zzhd {
    }

    @Override // com.google.android.gms.internal.ads.zzhx
    public final zzhw zzdx() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzhx
    public zzpd zzdy() {
        return null;
    }

    protected void zze(boolean z) throws zzhd {
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public int zzee() throws zzhd {
        return 0;
    }

    protected void zzef() {
    }

    @Override // com.google.android.gms.internal.ads.zzhw, com.google.android.gms.internal.ads.zzhx
    public final int getTrackType() {
        return this.zzaea;
    }

    @Override // com.google.android.gms.internal.ads.zzhx
    public final void setIndex(int i) {
        this.index = i;
    }

    @Override // com.google.android.gms.internal.ads.zzhx
    public final int getState() {
        return this.state;
    }

    @Override // com.google.android.gms.internal.ads.zzhx
    public final void zza(zzhz zzhzVar, zzho[] zzhoVarArr, zznm zznmVar, long j, boolean z, long j2) throws zzhd {
        zzoz.checkState(this.state == 0);
        this.zzaeb = zzhzVar;
        this.state = 1;
        zze(z);
        zza(zzhoVarArr, zznmVar, j2);
        zza(j, z);
    }

    @Override // com.google.android.gms.internal.ads.zzhx
    public final void start() throws zzhd {
        zzoz.checkState(this.state == 1);
        this.state = 2;
        onStarted();
    }

    @Override // com.google.android.gms.internal.ads.zzhx
    public final void zza(zzho[] zzhoVarArr, zznm zznmVar, long j) throws zzhd {
        zzoz.checkState(!this.zzaef);
        this.zzaec = zznmVar;
        this.zzaee = false;
        this.zzaed = j;
        zza(zzhoVarArr, j);
    }

    @Override // com.google.android.gms.internal.ads.zzhx
    public final zznm zzdz() {
        return this.zzaec;
    }

    @Override // com.google.android.gms.internal.ads.zzhx
    public final boolean zzea() {
        return this.zzaee;
    }

    @Override // com.google.android.gms.internal.ads.zzhx
    public final void zzeb() {
        this.zzaef = true;
    }

    @Override // com.google.android.gms.internal.ads.zzhx
    public final boolean zzec() {
        return this.zzaef;
    }

    @Override // com.google.android.gms.internal.ads.zzhx
    public final void zzed() throws IOException {
        this.zzaec.zzhq();
    }

    @Override // com.google.android.gms.internal.ads.zzhx
    public final void zzdo(long j) throws zzhd {
        this.zzaef = false;
        this.zzaee = false;
        zza(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzhx
    public final void stop() throws zzhd {
        zzoz.checkState(this.state == 2);
        this.state = 1;
        onStopped();
    }

    @Override // com.google.android.gms.internal.ads.zzhx
    public final void disable() {
        zzoz.checkState(this.state == 1);
        this.state = 0;
        this.zzaec = null;
        this.zzaef = false;
        zzef();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzhz zzeg() {
        return this.zzaeb;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int zza(zzhq zzhqVar, zzjk zzjkVar, boolean z) {
        int zzb = this.zzaec.zzb(zzhqVar, zzjkVar, z);
        if (zzb == -4) {
            if (zzjkVar.zzgj()) {
                this.zzaee = true;
                return this.zzaef ? -4 : -3;
            }
            zzjkVar.zzanx += this.zzaed;
        } else if (zzb == -5) {
            zzho zzhoVar = zzhqVar.zzaht;
            if (zzhoVar.zzahn != Long.MAX_VALUE) {
                zzhqVar.zzaht = zzhoVar.zzds(zzhoVar.zzahn + this.zzaed);
            }
        }
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzdp(long j) {
        this.zzaec.zzeh(j - this.zzaed);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzeh() {
        return this.zzaee ? this.zzaef : this.zzaec.isReady();
    }
}
