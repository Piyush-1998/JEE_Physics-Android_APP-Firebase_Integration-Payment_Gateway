package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.util.Clock;
import com.google.firebase.database.core.ServerValues;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzclu {
    private final Clock zzbpw;

    public zzclu(Clock clock) {
        this.zzbpw = clock;
    }

    public final void zza(List<Object> list, String str, String str2, Object... objArr) {
        if (zzacn.zzdaw.get().booleanValue()) {
            long currentTimeMillis = this.zzbpw.currentTimeMillis();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name(ServerValues.NAME_OP_TIMESTAMP).value(currentTimeMillis);
                jsonWriter.name("source").value(str);
                jsonWriter.name(NotificationCompat.CATEGORY_EVENT).value(str2);
                jsonWriter.name("components").beginArray();
                for (Object obj : list) {
                    jsonWriter.value(obj.toString());
                }
                jsonWriter.endArray();
                jsonWriter.name("params").beginArray();
                int length = objArr.length;
                for (int i = 0; i < length; i++) {
                    Object obj2 = objArr[i];
                    jsonWriter.value(obj2 != null ? obj2.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e) {
                zzaxy.zzc("unable to log", e);
            }
            String valueOf = String.valueOf(stringWriter.toString());
            zzaxy.zzfd(valueOf.length() != 0 ? "AD-DBG ".concat(valueOf) : new String("AD-DBG "));
        }
    }
}
