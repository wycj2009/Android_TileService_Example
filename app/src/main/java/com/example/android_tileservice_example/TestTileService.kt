package com.example.android_tileservice_example

import android.service.quicksettings.Tile
import android.service.quicksettings.TileService

class TestTileService : TileService() {

    /** Quick Settings에 Tile이 추가될 때 호출. */
    override fun onTileAdded() {}

    /** Quick Settings에 Tile이 제거될 때 호출. */
    override fun onTileRemoved() {}

    /** Tile에 변화가 있을 때 호출. onClick() 이전에 호출. */
    override fun onStartListening() {}

    /** Tile에 변화가 있을 때 호출. onClick() 이후에 호출. */
    override fun onStopListening() {}

    /** Tile을 클릭했을 때 호출. */
    override fun onClick() {
        when (qsTile.state) {
            Tile.STATE_ACTIVE -> {
                qsTile.state = Tile.STATE_INACTIVE
            }
            Tile.STATE_INACTIVE -> {
                qsTile.state = Tile.STATE_ACTIVE
            }
        }
        qsTile.updateTile()
    }
}
