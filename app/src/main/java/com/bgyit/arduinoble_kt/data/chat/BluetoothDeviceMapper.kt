package com.bgyit.arduinoble_kt.data.chat

import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import com.bgyit.arduinoble_kt.domain.chat.BluetoothDeviceDomain

@SuppressLint("MissingPermission")
fun BluetoothDevice.toBluetoothDeviceDomain(): BluetoothDeviceDomain {
    return BluetoothDeviceDomain(
        name = name,
        address = address
    )
}