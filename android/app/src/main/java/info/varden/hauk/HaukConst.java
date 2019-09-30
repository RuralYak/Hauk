package info.varden.hauk;

import info.varden.hauk.struct.Version;

/**
 * Constants used in the Hauk app.
 *
 * @author Marius Lindvall
 */
@SuppressWarnings("HardCodedStringLiteral")
public final class HaukConst {
    // Duration units.
    public static final int DURATION_UNIT_MINUTES = 0;
    public static final int DURATION_UNIT_HOURS = 1;
    public static final int DURATION_UNIT_DAYS = 2;

    // Shared preferences dictionaries.
    public static final String SHARED_PREFS_CONNECTION = "connectionPrefs";
    public static final String SHARED_PREFS_RESUMABLE = "sessionResumption";

    // Keys for use in stored server preferences.
    public static final String PREF_SERVER = "server";
    public static final String PREF_PASSWORD = "password";
    public static final String PREF_DURATION = "duration";
    public static final String PREF_INTERVAL = "interval";
    public static final String PREF_NICKNAME = "nickname";
    public static final String PREF_DURATION_UNIT = "durUnit";
    public static final String PREF_REMEMBER_PASSWORD = "rememberPassword";
    public static final String PREF_ALLOW_ADOPTION = "allowAdoption";

    // Keys for use in session resumption preferences.
    public static final String RESUME_AVAILABLE = "canResume";
    public static final String RESUME_CLIENT_VERSION = "clientVersion";
    public static final String RESUME_SESSION_PARAMS = "sessionParams";
    public static final String RESUME_SHARE_PARAMS = "shareParams";

    // Regular expression for extracting a share ID from a URL when adopting a share.
    public static final String REGEX_ADOPT_ID_FROM_LINK = "\\?([A-Za-z0-9-]+)";

    // Default date format.
    public static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss z";

    // Keys for intent extras.
    public static final String EXTRA_SHARE = "share";
    public static final String EXTRA_STOP_TASK = "stopTask";
    public static final String EXTRA_GNSS_ACTIVE_TASK = "gnssActiveTask";

    // Backend URLs.
    public static final String URL_PATH_ADOPT_SHARE = "api/adopt.php";
    public static final String URL_PATH_CREATE_SHARE = "api/create.php";
    public static final String URL_PATH_CREATE_NEW_LINK = "api/newlink.php";
    public static final String URL_PATH_POST_LOCATION = "api/post.php";
    public static final String URL_PATH_STOP_SHARING = "api/stop.php";

    // Packet parameter keys.
    public static final String PACKET_PARAM_ACCURACY = "acc";
    public static final String PACKET_PARAM_ADOPTABLE = "ado";
    public static final String PACKET_PARAM_DURATION = "dur";
    public static final String PACKET_PARAM_GROUP_PIN = "pin";
    public static final String PACKET_PARAM_ID_TO_ADOPT = "aid";
    public static final String PACKET_PARAM_INTERVAL = "int";
    public static final String PACKET_PARAM_LATITUDE = "lat";
    public static final String PACKET_PARAM_LONGITUDE = "lon";
    public static final String PACKET_PARAM_NICKNAME = "nic";
    public static final String PACKET_PARAM_PASSWORD = "pwd";
    public static final String PACKET_PARAM_SESSION_ID = "sid";
    public static final String PACKET_PARAM_SHARE_ID = "lid";
    public static final String PACKET_PARAM_SHARE_MODE = "mod";
    public static final String PACKET_PARAM_SPEED = "spd";
    public static final String PACKET_PARAM_TIMESTAMP = "time";

    // Packet OK response header. All valid packets start with this line.
    public static final String PACKET_RESPONSE_OK = "OK";

    // HTTP data.
    public static final String HTTP_HEADER_HAUK_VERSION = "X-Hauk-Version";

    // Minimum backend version supporting group shares.
    public static final Version VERSION_COMPAT_GROUP_SHARE = new Version("1.1");

    // Minimum backend version that sends the link ID as well as the view link itself.
    public static final Version VERSION_COMPAT_VIEW_ID = new Version("1.2");
}
