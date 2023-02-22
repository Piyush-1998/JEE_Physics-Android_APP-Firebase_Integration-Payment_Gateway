package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzaba {
    private File file;
    private String zzbra;
    private String zzcya;
    private BlockingQueue<zzabk> zzcyd = new ArrayBlockingQueue(100);
    private LinkedHashMap<String, String> zzcye = new LinkedHashMap<>();
    private Map<String, zzabe> zzcyf = new HashMap();
    private final HashSet<String> zzcyg = new HashSet<>(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));
    private AtomicBoolean zzcyh;
    private Context zzvr;

    public final void zza(Context context, String str, String str2, Map<String, String> map) {
        File externalStorageDirectory;
        this.zzvr = context;
        this.zzbra = str;
        this.zzcya = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.zzcyh = atomicBoolean;
        atomicBoolean.set(zzack.zzdag.get().booleanValue());
        if (this.zzcyh.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.file = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.zzcye.put(entry.getKey(), entry.getValue());
        }
        zzbbi.zzedu.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzaaz
            private final zzaba zzcyc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzcyc = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzcyc.zzrl();
            }
        });
        this.zzcyf.put("action", zzabe.zzcyj);
        this.zzcyf.put("ad_format", zzabe.zzcyj);
        this.zzcyf.put("e", zzabe.zzcyk);
    }

    public final boolean zza(zzabk zzabkVar) {
        return this.zzcyd.offer(zzabkVar);
    }

    private final void zza(Map<String, String> map, String str) {
        Uri.Builder buildUpon = Uri.parse(this.zzcya).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        StringBuilder sb = new StringBuilder(buildUpon.build().toString());
        if (!TextUtils.isEmpty(str)) {
            sb.append("&it=");
            sb.append(str);
        }
        String sb2 = sb.toString();
        if (this.zzcyh.get()) {
            File file = this.file;
            if (file != null) {
                FileOutputStream fileOutputStream = null;
                try {
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
                        try {
                            fileOutputStream2.write(sb2.getBytes());
                            fileOutputStream2.write(10);
                            try {
                                fileOutputStream2.close();
                            } catch (IOException e) {
                                zzaxy.zzd("CsiReporter: Cannot close file: sdk_csi_data.txt.", e);
                            }
                        } catch (IOException e2) {
                            e = e2;
                            fileOutputStream = fileOutputStream2;
                            zzaxy.zzd("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e3) {
                                    zzaxy.zzd("CsiReporter: Cannot close file: sdk_csi_data.txt.", e3);
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e4) {
                                    zzaxy.zzd("CsiReporter: Cannot close file: sdk_csi_data.txt.", e4);
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException e5) {
                    e = e5;
                }
            } else {
                zzaxy.zzfe("CsiReporter: File doesn't exists. Cannot write CSI data to file.");
            }
        } else {
            com.google.android.gms.ads.internal.zzp.zzkp();
            zzayh.zzb(this.zzvr, this.zzbra, sb2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<String, String> zza(Map<String, String> map, Map<String, String> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        if (map2 == null) {
            return linkedHashMap;
        }
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            String key = entry.getKey();
            String str = (String) linkedHashMap.get(key);
            linkedHashMap.put(key, zzcu(key).zzg(str, entry.getValue()));
        }
        return linkedHashMap;
    }

    public final zzabe zzcu(String str) {
        zzabe zzabeVar = this.zzcyf.get(str);
        return zzabeVar != null ? zzabeVar : zzabe.zzcyi;
    }

    public final void zzcv(String str) {
        if (this.zzcyg.contains(str)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sdkVersion", this.zzbra);
        linkedHashMap.put("ue", str);
        zza(zza(this.zzcye, linkedHashMap), "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzrl() {
        while (true) {
            try {
                zzabk take = this.zzcyd.take();
                String zzrq = take.zzrq();
                if (!TextUtils.isEmpty(zzrq)) {
                    zza(zza(this.zzcye, take.zzrr()), zzrq);
                }
            } catch (InterruptedException e) {
                zzaxy.zzd("CsiReporter:reporter interrupted", e);
                return;
            }
        }
    }
}
