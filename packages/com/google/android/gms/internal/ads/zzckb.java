package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zztq;
import com.google.android.gms.internal.ads.zztw;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzckb implements zzbsz, zzbtm, zzbuj, zzbvj, zzbxf, zzut {
    private final zzto zzgei;
    private boolean zzgej = false;

    public zzckb(zzto zztoVar, @Nullable zzdjf zzdjfVar) {
        this.zzgei = zztoVar;
        zztoVar.zza(zztq.zza.zzb.AD_REQUEST);
        if (zzdjfVar != null) {
            zztoVar.zza(zztq.zza.zzb.REQUEST_IS_PREFETCH);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzd(zzasp zzaspVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzb(final zzdlj zzdljVar) {
        this.zzgei.zza(new zztn(zzdljVar) { // from class: com.google.android.gms.internal.ads.zzcke
            private final zzdlj zzfte;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfte = zzdljVar;
            }

            @Override // com.google.android.gms.internal.ads.zztn
            public final void zza(zztw.zzi.zza zzaVar) {
                zzaVar.zza(zzaVar.zznx().zzbfk().zza(zzaVar.zznx().zznb().zzbfk().zzbx(this.zzfte.zzhbq.zzhbn.zzdsg)));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void onAdLoaded() {
        this.zzgei.zza(zztq.zza.zzb.AD_LOADED);
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final void zzg(zzuw zzuwVar) {
        switch (zzuwVar.errorCode) {
            case 1:
                this.zzgei.zza(zztq.zza.zzb.AD_FAILED_TO_LOAD_INVALID_REQUEST);
                return;
            case 2:
                this.zzgei.zza(zztq.zza.zzb.AD_FAILED_TO_LOAD_NETWORK_ERROR);
                return;
            case 3:
                this.zzgei.zza(zztq.zza.zzb.AD_FAILED_TO_LOAD_NO_FILL);
                return;
            case 4:
                this.zzgei.zza(zztq.zza.zzb.AD_FAILED_TO_LOAD_TIMEOUT);
                return;
            case 5:
                this.zzgei.zza(zztq.zza.zzb.AD_FAILED_TO_LOAD_CANCELLED);
                return;
            case 6:
                this.zzgei.zza(zztq.zza.zzb.AD_FAILED_TO_LOAD_NO_ERROR);
                return;
            case 7:
                this.zzgei.zza(zztq.zza.zzb.AD_FAILED_TO_LOAD_NOT_FOUND);
                return;
            default:
                this.zzgei.zza(zztq.zza.zzb.AD_FAILED_TO_LOAD);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final synchronized void onAdImpression() {
        this.zzgei.zza(zztq.zza.zzb.AD_IMPRESSION);
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final synchronized void onAdClicked() {
        if (!this.zzgej) {
            this.zzgei.zza(zztq.zza.zzb.AD_FIRST_CLICK);
            this.zzgej = true;
            return;
        }
        this.zzgei.zza(zztq.zza.zzb.AD_SUBSEQUENT_CLICK);
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzc(final zztw.zzb zzbVar) {
        this.zzgei.zza(new zztn(zzbVar) { // from class: com.google.android.gms.internal.ads.zzckd
            private final zztw.zzb zzftr;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzftr = zzbVar;
            }

            @Override // com.google.android.gms.internal.ads.zztn
            public final void zza(zztw.zzi.zza zzaVar) {
                zzaVar.zza(this.zzftr);
            }
        });
        this.zzgei.zza(zztq.zza.zzb.REQUEST_LOADED_FROM_CACHE);
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzd(final zztw.zzb zzbVar) {
        this.zzgei.zza(new zztn(zzbVar) { // from class: com.google.android.gms.internal.ads.zzckg
            private final zztw.zzb zzftr;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzftr = zzbVar;
            }

            @Override // com.google.android.gms.internal.ads.zztn
            public final void zza(zztw.zzi.zza zzaVar) {
                zzaVar.zza(this.zzftr);
            }
        });
        this.zzgei.zza(zztq.zza.zzb.REQUEST_SAVED_TO_CACHE);
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zze(final zztw.zzb zzbVar) {
        this.zzgei.zza(new zztn(zzbVar) { // from class: com.google.android.gms.internal.ads.zzckf
            private final zztw.zzb zzftr;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzftr = zzbVar;
            }

            @Override // com.google.android.gms.internal.ads.zztn
            public final void zza(zztw.zzi.zza zzaVar) {
                zzaVar.zza(this.zzftr);
            }
        });
        this.zzgei.zza(zztq.zza.zzb.REQUEST_PREFETCH_INTERCEPTED);
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzbg(boolean z) {
        zztq.zza.zzb zzbVar;
        zzto zztoVar = this.zzgei;
        if (z) {
            zzbVar = zztq.zza.zzb.REQUESTED_CACHE_KEY_FROM_SERVICE_SUCCEEDED;
        } else {
            zzbVar = zztq.zza.zzb.REQUESTED_CACHE_KEY_FROM_SERVICE_FAILED;
        }
        zztoVar.zza(zzbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzbh(boolean z) {
        zztq.zza.zzb zzbVar;
        zzto zztoVar = this.zzgei;
        if (z) {
            zzbVar = zztq.zza.zzb.NOTIFIED_CACHE_HIT_TO_SERVICE_SUCCEEDED;
        } else {
            zzbVar = zztq.zza.zzb.NOTIFIED_CACHE_HIT_TO_SERVICE_FAILED;
        }
        zztoVar.zza(zzbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzajs() {
        this.zzgei.zza(zztq.zza.zzb.REQUEST_FAILED_TO_LOAD_FROM_CACHE);
    }
}
