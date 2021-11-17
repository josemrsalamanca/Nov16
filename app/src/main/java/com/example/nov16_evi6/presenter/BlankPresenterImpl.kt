package com.example.nov16_evi6.presenter

import androidx.fragment.app.Fragment
import com.example.nov16_evi6.interfaces.BlankPresenter
import com.example.nov16_evi6.interfaces.BlankView
import com.example.nov16_evi6.interfaces.HomeView

class BlankPresenterImpl: Fragment(),BlankPresenter {
    private lateinit var view: BlankView


    override fun showDatos(int: Int) {
        if (int.toString().trim().isEmpty()){
            view.showmErrorMessage()
        }else{

            view.navigate()
        }
    }
}