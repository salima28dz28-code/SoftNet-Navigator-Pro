package com.softnet.navigator.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.softnet.navigator.ui.components.DashboardOverlay
import com.softnet.navigator.ui.components.SearchBarOverlay

@Composable
fun MapScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        // MapLibre Map View integration would go here using AndroidView
        // For now, it will be the background layer.
        
        // UI Overlays
        SearchBarOverlay()
        DashboardOverlay()
    }
}
