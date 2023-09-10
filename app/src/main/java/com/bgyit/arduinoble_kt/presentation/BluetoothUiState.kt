package com.bgyit.arduinoble_kt.presentation

import com.bgyit.arduinoble_kt.domain.chat.BluetoothDevice

data class BluetoothUiState(
    val scannedDevices: List<BluetoothDevice> = emptyList(),
    val pairedDevices: List<BluetoothDevice> = emptyList()
)