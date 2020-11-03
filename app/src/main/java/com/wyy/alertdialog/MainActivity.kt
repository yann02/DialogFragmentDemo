package com.wyy.alertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.wyy.alertdialog.commons.widgets.dialogs.NormalDialogByFragment

class MainActivity : AppCompatActivity(),NormalDialogByFragment.NoticeDialogListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onDialogPositiveClick(dialog: DialogFragment) {
        Toast.makeText(this, "onDialogPositiveClick DialogFragment's tag is ${dialog.tag}", Toast.LENGTH_LONG).show()
    }

    override fun onDialogNegativeClick(dialog: DialogFragment) {
        Toast.makeText(this, "onDialogNegativeClick DialogFragment's tag is ${dialog.tag}", Toast.LENGTH_LONG).show()
    }
}
