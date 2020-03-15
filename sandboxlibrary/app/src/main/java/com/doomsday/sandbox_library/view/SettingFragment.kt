package com.doomsday.sandbox_library.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.doomsday.sandbox_library.R
import com.doomsday.sandbox_library.R.layout.setting_fragment_layout

class SettingFragment : Fragment(setting_fragment_layout), SettingView {

    companion object {

        @JvmStatic
        fun getInstance() : SettingFragment {
            return SettingFragment()
        }
    }

    override fun setSetting(setting: List<SettingVO>) {

    }
}