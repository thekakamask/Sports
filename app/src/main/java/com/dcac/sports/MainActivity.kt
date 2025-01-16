package com.dcac.sports

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Surface
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.dcac.sports.ui.SportsApp
import com.dcac.sports.ui.theme.SportsTheme

/**
 * Activity for Sports app
 */
class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContent {
            SportsTheme {
                val windowSize = calculateWindowSizeClass(this)
                Surface {
                    SportsApp(
                        windowSize = windowSize.widthSizeClass
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun SportsListPreview() {
    SportsTheme {
        Surface {
            SportsApp(
                windowSize = WindowWidthSizeClass.Compact)
        }
    }
}