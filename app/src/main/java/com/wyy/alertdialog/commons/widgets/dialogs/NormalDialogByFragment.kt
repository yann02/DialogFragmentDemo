package com.wyy.alertdialog.commons.widgets.dialogs

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import com.wyy.alertdialog.R

/**
 * @author Yan
 * A dialog by simple [Fragment] subclass.
 * @since 2020/11/02
 */
const val TITLE = "title"
const val MESSAGE = "message"
const val NEGATIVE = "negative"
const val POSITIVE = "positive"

class NormalDialogByFragment : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            // Use the Builder class for convenient dialog construction
            val builder = AlertDialog.Builder(it)
            builder.setView(R.layout.dialog_normal)
            // Create the AlertDialog object and return it
            val dialog = builder.create()
            dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialog
        } ?: throw IllegalStateException("Activity cannot be null")
    }

    companion object {
        fun getInstance(title: String, message: String, negative: String, positive: String): NormalDialogByFragment {
            val f = NormalDialogByFragment()
            val args = Bundle()
            args.putString(TITLE, title)
            args.putString(MESSAGE, message)
            args.putString(NEGATIVE, negative)
            args.putString(POSITIVE, positive)
            f.arguments = args
            return f
        }
    }

}
