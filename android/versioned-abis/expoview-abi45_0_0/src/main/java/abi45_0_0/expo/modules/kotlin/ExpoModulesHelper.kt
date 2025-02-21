package abi45_0_0.expo.modules.kotlin

import android.util.Log

class ExpoModulesHelper {
  companion object {
    @Suppress("unchecked_cast")
    val modulesProvider by lazy {
      try {
        val expoModules = Class.forName("expo.modules.ExpoModulesPackageList")
        expoModules.newInstance() as ModulesProvider
      } catch (e: Exception) {
        Log.e("ExpoModulesHelper", "Couldn't get abi45_0_0.expo.modules list.", e)
        null
      }
    }
  }
}
