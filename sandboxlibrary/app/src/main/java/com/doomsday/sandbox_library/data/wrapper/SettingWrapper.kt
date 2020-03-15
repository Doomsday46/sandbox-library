package com.doomsday.sandbox_library.data.wrapper

interface SettingWrapper {

    fun saveSetting(settingEntity: SettingEntity)
    fun getSetting(): SettingEntity
    fun getDefaultSetting(): SettingEntity
    fun clearSetting()
}