package io.github.naatin777.intervaltimer.settings

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import io.github.naatin777.intervaltimer.R

class SettingsFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey)
    }
}