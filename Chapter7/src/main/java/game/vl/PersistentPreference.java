package game.vl;

import java.util.prefs.Preferences;

public interface PersistentPreference {
    default void store(String key, String value) {
        Preferences.userRoot().put(key, value);
    }
    default String get(String key) {
        return Preferences.userRoot().get(key, "");
    }
}
