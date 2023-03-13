package id.ac.ubaya.informatika.adv160420152week2_homework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_end.*


class EndFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragmenttt
        return inflater.inflate(R.layout.fragment_end, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (arguments != null){
            val playerScore = EndFragmentArgs.fromBundle(requireArguments()).playerScore

            txtRes.text = "Your score is $playerScore"
        }
        btnBackMain.setOnClickListener {
            val action = EndFragmentDirections.actionMainFragment()
            Navigation.findNavController(it).navigate(action)
        }
    }


}