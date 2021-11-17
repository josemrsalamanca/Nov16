package com.example.nov16_evi6.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.nov16_evi6.R
import com.example.nov16_evi6.databinding.FragmentBlankBinding
import com.example.nov16_evi6.interfaces.BlankPresenter
import com.example.nov16_evi6.interfaces.BlankView

class BlankFragment : Fragment(),BlankView{

    private lateinit var b: FragmentBlankBinding
    private lateinit var presenter: BlankPresenter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        b = FragmentBlankBinding.inflate(inflater,container,false)
        presenter = BlankPresenter
        return b.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupButton()
    }

    private fun setupButton() {
        b.btn1.setOnClickListener {
            val valor = b.edtFiltro1.text.toString()
            presenter.showDatos(numero = valor.toInt())
        }
    }

    override fun showmErrorMessage() {
        Toast.makeText(context,"Debe ingresar un numero",Toast.LENGTH_LONG).show()
    }

    override fun navigate() {
        Navigation.findNavController(b.root).navigate(R.id.action_blankFragment_to_blankFragment2)
    }
}

