package com.wyy.alertdialog.modules.main

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil

import com.wyy.alertdialog.R
import com.wyy.alertdialog.commons.widgets.dialogs.NormalDialogByFragment
import com.wyy.alertdialog.databinding.FragmentMainBinding

/**
 * The main [Fragment] subclass.
 */
class MainFragment : Fragment() {
    private lateinit var mDataBinding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mDataBinding = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_main, container, false)
        mDataBinding.btnDialog.setOnClickListener {
            Log.d("wyy", "setOnClickListener")
            val mNormalDialogByFragment = NormalDialogByFragment.getInstance(
                getString(R.string.title_on_fragment_dialog),
                getString(R.string.message_on_fragment_dialog),
                getString(R.string.negative_of_button_name_on_dialog),
                getString(R.string.positive_of_button_name_on_dialog)
            )
            mNormalDialogByFragment.show(childFragmentManager, "normal")
        }
        return mDataBinding.root
    }

//    fun showDialog(v: View) {
//        Log.d("wyy","showDialog")
//        val mNormalDialogByFragment = NormalDialogByFragment()
//        mNormalDialogByFragment.show(childFragmentManager,"normal")
//    }
}
