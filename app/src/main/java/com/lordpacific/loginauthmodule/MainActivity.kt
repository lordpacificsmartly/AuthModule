package com.lordpacific.loginauthmodule

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.graphics.toArgb
import com.lordpacific.loginauthmodule.ui.theme.LoginAuthModuleTheme
import com.lordpacific.loginauthmodule.ui.theme.whiteGray
import com.lordpacific.loginauthmodule.util.Navigation
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = whiteGray.toArgb()
        window.navigationBarColor = whiteGray.toArgb()
        setContent {
            LoginAuthModuleTheme {
              Navigation()
            }
        }
    }
}