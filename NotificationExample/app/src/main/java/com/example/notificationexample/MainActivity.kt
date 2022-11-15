package com.example.notificationexample

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnCreateNotification = findViewById<Button>(R.id.btnCreateNotification)
        btnCreateNotification.setOnClickListener {
            val snoozeIntent = Intent(this@MainActivity, MainActivity::class.java)
            snoozeIntent.action = "ACTION_SNOOZE"
            snoozeIntent.putExtra("EXTRA_NOTIFICATION_ID", 0)
            val snoozePendingIntent =
                PendingIntent.getBroadcast(this@MainActivity, 0, snoozeIntent, 0)
            val mNotificationManager =
                getSystemService(NOTIFICATION_SERVICE) as NotificationManager
            val mBuilder = NotificationCompat.Builder(
                this@MainActivity,
                default_notification_channel_id
            )
            mBuilder.setContentTitle("My Notification")
            mBuilder.setContentText("Notification Listener Service Example")
            mBuilder.setTicker("Notification Listener Service Example")
            mBuilder.setSmallIcon(R.drawable.ic_launcher_foreground)
            mBuilder.addAction(R.drawable.ic_launcher_foreground, "Snooze", snoozePendingIntent)
            mBuilder.setAutoCancel(true)
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                val importance = NotificationManager.IMPORTANCE_HIGH
                val notificationChannel = NotificationChannel(
                    NOTIFICATION_CHANNEL_ID,
                    "NOTIFICATION_CHANNEL_NAME",
                    importance
                )
                mBuilder.setChannelId(NOTIFICATION_CHANNEL_ID)
                assert(mNotificationManager != null)
                mNotificationManager.createNotificationChannel(notificationChannel)
            }
            assert(mNotificationManager != null)
            mNotificationManager.notify(
                System.currentTimeMillis().toInt(),
                mBuilder.build()
            )
        }
    }

    companion object {
        const val NOTIFICATION_CHANNEL_ID = "10001"
        private const val default_notification_channel_id = "default"
    }
}