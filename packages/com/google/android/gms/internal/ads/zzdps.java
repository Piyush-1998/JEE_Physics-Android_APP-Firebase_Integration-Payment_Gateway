package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdps {
    private final Executor executor;
    private final Clock zzbpw;
    private final String zzbra;
    private final String zzciq;
    private final String zzdpz;
    private final zzeg zzflj;
    private final zzdli zzfsl;
    private final zzcud zzfuf;
    private final zzbbh zzhif;
    private final Context zzvr;

    public zzdps(Executor executor, zzbbh zzbbhVar, zzcud zzcudVar, zzbbg zzbbgVar, String str, String str2, Context context, zzdli zzdliVar, Clock clock, zzeg zzegVar) {
        this.executor = executor;
        this.zzhif = zzbbhVar;
        this.zzfuf = zzcudVar;
        this.zzbra = zzbbgVar.zzbra;
        this.zzdpz = str;
        this.zzciq = str2;
        this.zzvr = context;
        this.zzfsl = zzdliVar;
        this.zzbpw = clock;
        this.zzflj = zzegVar;
    }

    public final void zza(zzdlj zzdljVar, zzdkx zzdkxVar, List<String> list) {
        zza(zzdljVar, zzdkxVar, false, "", "", list);
    }

    public final void zza(zzdlj zzdljVar, zzdkx zzdkxVar, boolean z, String str, String str2, List<String> list) {
        ArrayList arrayList = new ArrayList();
        String str3 = z ? "1" : "0";
        for (String str4 : list) {
            String zzc = zzc(zzc(zzc(str4, "@gw_adlocid@", zzdljVar.zzhbp.zzfqn.zzhbv), "@gw_adnetrefresh@", str3), "@gw_sdkver@", this.zzbra);
            if (zzdkxVar != null) {
                zzc = zzawq.zzc(zzc(zzc(zzc(zzc, "@gw_qdata@", zzdkxVar.zzdiy), "@gw_adnetid@", zzdkxVar.zzagt), "@gw_allocid@", zzdkxVar.zzdjo), this.zzvr, zzdkxVar.zzdsu);
            }
            String zzc2 = zzc(zzc(zzc(zzc, "@gw_adnetstatus@", this.zzfuf.zzapv()), "@gw_seqnum@", this.zzdpz), "@gw_sessid@", this.zzciq);
            boolean z2 = ((Boolean) zzwe.zzpu().zzd(zzaat.zzcre)).booleanValue() && !TextUtils.isEmpty(str);
            boolean isEmpty = true ^ TextUtils.isEmpty(str2);
            if (z2 || isEmpty) {
                if (this.zzflj.zzb(Uri.parse(zzc2))) {
                    Uri.Builder buildUpon = Uri.parse(zzc2).buildUpon();
                    if (z2) {
                        buildUpon = buildUpon.appendQueryParameter("ms", str);
                    }
                    if (isEmpty) {
                        buildUpon = buildUpon.appendQueryParameter("attok", str2);
                    }
                    zzc2 = buildUpon.build().toString();
                }
            }
            arrayList.add(zzc2);
        }
        zzi(arrayList);
    }

    public final void zza(zzdlj zzdljVar, zzdkx zzdkxVar, List<String> list, zzatj zzatjVar) {
        long currentTimeMillis = this.zzbpw.currentTimeMillis();
        try {
            String type = zzatjVar.getType();
            String num = Integer.toString(zzatjVar.getAmount());
            ArrayList arrayList = new ArrayList();
            zzdli zzdliVar = this.zzfsl;
            String zzgy = zzdliVar == null ? "" : zzgy(zzdliVar.zzdve);
            zzdli zzdliVar2 = this.zzfsl;
            String zzgy2 = zzdliVar2 != null ? zzgy(zzdliVar2.zzdvf) : "";
            for (String str : list) {
                arrayList.add(zzawq.zzc(zzc(zzc(zzc(zzc(zzc(zzc(str, "@gw_rwd_userid@", Uri.encode(zzgy)), "@gw_rwd_custom_data@", Uri.encode(zzgy2)), "@gw_tmstmp@", Long.toString(currentTimeMillis)), "@gw_rwd_itm@", Uri.encode(type)), "@gw_rwd_amt@", num), "@gw_sdkver@", this.zzbra), this.zzvr, zzdkxVar.zzdsu));
            }
            zzi(arrayList);
        } catch (RemoteException unused) {
        }
    }

    public final void zzi(List<String> list) {
        for (String str : list) {
            zzes(str);
        }
    }

    public final void zzes(final String str) {
        this.executor.execute(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.zzdpr
            private final String zzdft;
            private final zzdps zzhie;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhie = this;
                this.zzdft = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzhie.zzgz(this.zzdft);
            }
        });
    }

    private static String zzc(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    private static String zzgy(String str) {
        return (TextUtils.isEmpty(str) || !zzbax.isEnabled()) ? str : "fakeForAdDebugLog";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzgz(String str) {
        this.zzhif.zzes(str);
    }
}
