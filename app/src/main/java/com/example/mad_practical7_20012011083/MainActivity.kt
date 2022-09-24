package com.example.mad_practical7_20012011083

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.Calendar
import java.util.Date

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var alrmbtn = findViewById<Button>(R.id.alrmbtn)
//        var tdDate = findViewById<TextView>(R.id.date)

//        val simpleDateFormat = SimpleDateFormat("hh:mm:ss a MMM-dd-yyyy")
//        tdDate.setText(simpleDateFormat.format(Date()))

        alrmbtn.setOnClickListener {
            showTimeDialog()
        }

    }

    private fun showTimeDialog() {
        val cldr: Calendar = Calendar.getInstance()
        val hour: Int = cldr.get(Calendar.HOUR_OF_DAY)
        val min: Int = cldr.get(Calendar.MINUTE)
//        val picker = TimePickerDialog(
//            this,
//            { tp, sHour, sMinute -> sendDialogDataToActivity(sHour, sMinute) },
//            hour,
//            min,
//            false
//        )
//        picker.show()

    }
}