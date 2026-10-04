package com.example.data

import com.google.gson.annotations.SerializedName

data class VersionConfig(
    @SerializedName("versionCode") val versionCode: Int = 0,
    @SerializedName("versionName") val versionName: String = "",
    @SerializedName("apkUrl") val apkUrl: String = "",
    @SerializedName("patchUrl") val patchUrl: String? = null,
    @SerializedName("releaseNotes") val releaseNotes: String = "",
    @SerializedName("minRequiredVersion") val minRequiredVersion: Int = 0
)
