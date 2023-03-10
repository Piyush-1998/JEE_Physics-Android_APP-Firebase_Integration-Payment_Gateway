package com.google.firebase.database;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class DatabaseError {
    public static final int DATA_STALE = -1;
    public static final int DISCONNECTED = -4;
    public static final int EXPIRED_TOKEN = -6;
    public static final int INVALID_TOKEN = -7;
    public static final int MAX_RETRIES = -8;
    public static final int NETWORK_ERROR = -24;
    public static final int OPERATION_FAILED = -2;
    public static final int OVERRIDDEN_BY_SET = -9;
    public static final int PERMISSION_DENIED = -3;
    public static final int UNAVAILABLE = -10;
    public static final int UNKNOWN_ERROR = -999;
    public static final int USER_CODE_EXCEPTION = -11;
    public static final int WRITE_CANCELED = -25;
    private static final Map<String, Integer> errorCodes;
    private static final Map<Integer, String> errorReasons;
    private final int code;
    private final String details;
    private final String message;

    static {
        HashMap hashMap = new HashMap();
        errorReasons = hashMap;
        hashMap.put(-1, "The transaction needs to be run again with current data");
        errorReasons.put(-2, "The server indicated that this operation failed");
        errorReasons.put(-3, "This client does not have permission to perform this operation");
        errorReasons.put(-4, "The operation had to be aborted due to a network disconnect");
        errorReasons.put(-6, "The supplied auth token has expired");
        errorReasons.put(-7, "The supplied auth token was invalid");
        errorReasons.put(-8, "The transaction had too many retries");
        errorReasons.put(-9, "The transaction was overridden by a subsequent set");
        errorReasons.put(-10, "The service is unavailable");
        errorReasons.put(-11, "User code called from the Firebase Database runloop threw an exception:\n");
        errorReasons.put(-24, "The operation could not be performed due to a network error");
        errorReasons.put(-25, "The write was canceled by the user.");
        errorReasons.put(Integer.valueOf((int) UNKNOWN_ERROR), "An unknown error occurred");
        HashMap hashMap2 = new HashMap();
        errorCodes = hashMap2;
        hashMap2.put("datastale", -1);
        errorCodes.put("failure", -2);
        errorCodes.put("permission_denied", -3);
        errorCodes.put("disconnected", -4);
        errorCodes.put("expired_token", -6);
        errorCodes.put("invalid_token", -7);
        errorCodes.put("maxretries", -8);
        errorCodes.put("overriddenbyset", -9);
        errorCodes.put("unavailable", -10);
        errorCodes.put("network_error", -24);
        errorCodes.put("write_canceled", -25);
    }

    public static DatabaseError fromStatus(String str) {
        return fromStatus(str, null);
    }

    public static DatabaseError fromStatus(String str, String str2) {
        return fromStatus(str, str2, null);
    }

    public static DatabaseError fromCode(int i) {
        if (!errorReasons.containsKey(Integer.valueOf(i))) {
            throw new IllegalArgumentException("Invalid Firebase Database error code: " + i);
        }
        return new DatabaseError(i, errorReasons.get(Integer.valueOf(i)), null);
    }

    public static DatabaseError fromStatus(String str, String str2, String str3) {
        Integer num = errorCodes.get(str.toLowerCase());
        if (num == null) {
            num = Integer.valueOf((int) UNKNOWN_ERROR);
        }
        if (str2 == null) {
            str2 = errorReasons.get(num);
        }
        return new DatabaseError(num.intValue(), str2, str3);
    }

    public static DatabaseError fromException(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return new DatabaseError(-11, errorReasons.get(-11) + stringWriter.toString());
    }

    private DatabaseError(int i, String str) {
        this(i, str, null);
    }

    private DatabaseError(int i, String str, String str2) {
        this.code = i;
        this.message = str;
        this.details = str2 == null ? "" : str2;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public String getDetails() {
        return this.details;
    }

    public String toString() {
        return "DatabaseError: " + this.message;
    }

    public DatabaseException toException() {
        return new DatabaseException("Firebase Database error: " + this.message);
    }
}
