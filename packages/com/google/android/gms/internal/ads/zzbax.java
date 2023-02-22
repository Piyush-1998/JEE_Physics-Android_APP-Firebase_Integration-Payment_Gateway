package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.JsonWriter;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.database.core.ServerValues;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbax {
    private final List<String> zzedm;
    private static Object lock = new Object();
    private static boolean zzedk = false;
    private static boolean enabled = false;
    private static Clock zzbpw = DefaultClock.getInstance();
    private static final Set<String> zzedl = new HashSet(Arrays.asList(new String[0]));

    public zzbax() {
        this(null);
    }

    public zzbax(String str) {
        List<String> asList;
        if (!isEnabled()) {
            asList = new ArrayList<>();
        } else {
            String[] strArr = new String[1];
            String valueOf = String.valueOf(UUID.randomUUID().toString());
            strArr[0] = valueOf.length() != 0 ? "network_request_".concat(valueOf) : new String("network_request_");
            asList = Arrays.asList(strArr);
        }
        this.zzedm = asList;
    }

    public final void zza(HttpURLConnection httpURLConnection, byte[] bArr) {
        if (isEnabled()) {
            zzb(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    public final void zza(String str, String str2, Map<String, ?> map, byte[] bArr) {
        if (isEnabled()) {
            zzb(str, str2, map, bArr);
        }
    }

    private final void zzb(final String str, final String str2, final Map<String, ?> map, final byte[] bArr) {
        zza("onNetworkRequest", new zzbba(str, str2, map, bArr) { // from class: com.google.android.gms.internal.ads.zzbaw
            private final String zzdft;
            private final Map zzdfy;
            private final String zzdgb;
            private final byte[] zzedj;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdgb = str;
                this.zzdft = str2;
                this.zzdfy = map;
                this.zzedj = bArr;
            }

            @Override // com.google.android.gms.internal.ads.zzbba
            public final void zzb(JsonWriter jsonWriter) {
                zzbax.zza(this.zzdgb, this.zzdft, this.zzdfy, this.zzedj, jsonWriter);
            }
        });
    }

    public final void zza(HttpURLConnection httpURLConnection, int i) {
        if (isEnabled()) {
            String str = null;
            zzb(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i);
            if (i < 200 || i >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e) {
                    String valueOf = String.valueOf(e.getMessage());
                    zzbbd.zzfe(valueOf.length() != 0 ? "Can not get error message from error HttpURLConnection\n".concat(valueOf) : new String("Can not get error message from error HttpURLConnection\n"));
                }
                zzfa(str);
            }
        }
    }

    public final void zza(Map<String, ?> map, int i) {
        if (isEnabled()) {
            zzb(map, i);
            if (i < 200 || i >= 300) {
                zzfa(null);
            }
        }
    }

    private final void zzb(final Map<String, ?> map, final int i) {
        zza("onNetworkResponse", new zzbba(i, map) { // from class: com.google.android.gms.internal.ads.zzbaz
            private final int zzedo;
            private final Map zzedp;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzedo = i;
                this.zzedp = map;
            }

            @Override // com.google.android.gms.internal.ads.zzbba
            public final void zzb(JsonWriter jsonWriter) {
                zzbax.zza(this.zzedo, this.zzedp, jsonWriter);
            }
        });
    }

    public final void zzez(String str) {
        if (isEnabled() && str != null) {
            zzi(str.getBytes());
        }
    }

    public final void zzi(final byte[] bArr) {
        zza("onNetworkResponseBody", new zzbba(bArr) { // from class: com.google.android.gms.internal.ads.zzbay
            private final byte[] zzedn;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzedn = bArr;
            }

            @Override // com.google.android.gms.internal.ads.zzbba
            public final void zzb(JsonWriter jsonWriter) {
                zzbax.zza(this.zzedn, jsonWriter);
            }
        });
    }

    private final void zzfa(final String str) {
        zza("onNetworkRequestError", new zzbba(str) { // from class: com.google.android.gms.internal.ads.zzbbb
            private final String zzdgb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdgb = str;
            }

            @Override // com.google.android.gms.internal.ads.zzbba
            public final void zzb(JsonWriter jsonWriter) {
                zzbax.zza(this.zzdgb, jsonWriter);
            }
        });
    }

    private static void zza(JsonWriter jsonWriter, Map<String, ?> map) throws IOException {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator<Map.Entry<String, ?>> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it.next();
            String key = next.getKey();
            if (!zzedl.contains(key)) {
                if (next.getValue() instanceof List) {
                    for (String str : (List) next.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name(AppMeasurementSdk.ConditionalUserProperty.NAME).value(key);
                        jsonWriter.name(AppMeasurementSdk.ConditionalUserProperty.VALUE).value(str);
                        jsonWriter.endObject();
                    }
                } else if (next.getValue() instanceof String) {
                    jsonWriter.beginObject();
                    jsonWriter.name(AppMeasurementSdk.ConditionalUserProperty.NAME).value(key);
                    jsonWriter.name(AppMeasurementSdk.ConditionalUserProperty.VALUE).value((String) next.getValue());
                    jsonWriter.endObject();
                } else {
                    zzbbd.zzfc("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                    break;
                }
            }
        }
        jsonWriter.endArray();
    }

    private final void zza(String str, zzbba zzbbaVar) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name(ServerValues.NAME_OP_TIMESTAMP).value(zzbpw.currentTimeMillis());
            jsonWriter.name(NotificationCompat.CATEGORY_EVENT).value(str);
            jsonWriter.name("components").beginArray();
            for (String str2 : this.zzedm) {
                jsonWriter.value(str2);
            }
            jsonWriter.endArray();
            zzbbaVar.zzb(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e) {
            zzbbd.zzc("unable to log", e);
        }
        zzfb(stringWriter.toString());
    }

    private static synchronized void zzfb(String str) {
        synchronized (zzbax.class) {
            zzbbd.zzfd("GMA Debug BEGIN");
            int i = 0;
            while (i < str.length()) {
                int i2 = i + 4000;
                String valueOf = String.valueOf(str.substring(i, Math.min(i2, str.length())));
                zzbbd.zzfd(valueOf.length() != 0 ? "GMA Debug CONTENT ".concat(valueOf) : new String("GMA Debug CONTENT "));
                i = i2;
            }
            zzbbd.zzfd("GMA Debug FINISH");
        }
    }

    public static void zzyp() {
        synchronized (lock) {
            zzedk = false;
            enabled = false;
            zzbbd.zzfe("Ad debug logging enablement is out of date.");
        }
    }

    public static void zzar(boolean z) {
        synchronized (lock) {
            zzedk = true;
            enabled = z;
        }
    }

    public static boolean zzyq() {
        boolean z;
        synchronized (lock) {
            z = zzedk;
        }
        return z;
    }

    public static boolean isEnabled() {
        boolean z;
        synchronized (lock) {
            z = zzedk && enabled;
        }
        return z;
    }

    public static boolean zzbs(Context context) {
        if (Build.VERSION.SDK_INT >= 17 && zzacj.zzdac.get().booleanValue()) {
            try {
                return Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0;
            } catch (Exception e) {
                zzbbd.zzd("Fail to determine debug setting.", e);
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zza(String str, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zza(byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        int length = bArr.length;
        String encode = Base64Utils.encode(bArr);
        if (length < 10000) {
            jsonWriter.name("body").value(encode);
        } else {
            String zzex = zzbat.zzex(encode);
            if (zzex != null) {
                jsonWriter.name("bodydigest").value(zzex);
            }
        }
        jsonWriter.name("bodylength").value(length);
        jsonWriter.endObject();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zza(int i, Map map, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i);
        jsonWriter.endObject();
        zza(jsonWriter, map);
        jsonWriter.endObject();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zza(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        zza(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(Base64Utils.encode(bArr));
        }
        jsonWriter.endObject();
    }
}
