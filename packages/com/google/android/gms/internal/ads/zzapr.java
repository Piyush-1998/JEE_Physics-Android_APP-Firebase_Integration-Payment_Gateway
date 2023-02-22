package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.gms.ads.impl.R;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzapr extends zzaqg {
    private final Map<String, String> zzcyu;
    private String zzdma;
    private long zzdmb;
    private long zzdmc;
    private String zzdmd;
    private String zzdme;
    private final Context zzvr;

    public zzapr(zzbfq zzbfqVar, Map<String, String> map) {
        super(zzbfqVar, "createCalendarEvent");
        this.zzcyu = map;
        this.zzvr = zzbfqVar.zzzq();
        this.zzdma = zzdv("description");
        this.zzdmd = zzdv("summary");
        this.zzdmb = zzdw("start_ticks");
        this.zzdmc = zzdw("end_ticks");
        this.zzdme = zzdv("location");
    }

    private final String zzdv(String str) {
        return TextUtils.isEmpty(this.zzcyu.get(str)) ? "" : this.zzcyu.get(str);
    }

    private final long zzdw(String str) {
        String str2 = this.zzcyu.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public final void execute() {
        if (this.zzvr == null) {
            zzdx("Activity context is not available.");
            return;
        }
        com.google.android.gms.ads.internal.zzp.zzkp();
        if (!zzayh.zzat(this.zzvr).zzrb()) {
            zzdx("This feature is not available on the device.");
            return;
        }
        com.google.android.gms.ads.internal.zzp.zzkp();
        AlertDialog.Builder zzas = zzayh.zzas(this.zzvr);
        Resources resources = com.google.android.gms.ads.internal.zzp.zzkt().getResources();
        zzas.setTitle(resources != null ? resources.getString(R.string.s5) : "Create calendar event");
        zzas.setMessage(resources != null ? resources.getString(R.string.s6) : "Allow Ad to create a calendar event?");
        zzas.setPositiveButton(resources != null ? resources.getString(R.string.s3) : "Accept", new zzapu(this));
        zzas.setNegativeButton(resources != null ? resources.getString(R.string.s4) : "Decline", new zzapt(this));
        zzas.create().show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Intent createIntent() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.zzdma);
        data.putExtra("eventLocation", this.zzdme);
        data.putExtra("description", this.zzdmd);
        long j = this.zzdmb;
        if (j > -1) {
            data.putExtra("beginTime", j);
        }
        long j2 = this.zzdmc;
        if (j2 > -1) {
            data.putExtra("endTime", j2);
        }
        data.setFlags(268435456);
        return data;
    }
}
