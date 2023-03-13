package id.ac.ubaya.informatika.adv160420152week2_homework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_main.*


class MainFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var ques_1 = (0..20).random()
        var ques_2 = (0..20).random()
        var comAns = ques_1 + ques_2
        txtQuestion.setText("$ques_1 + $ques_2")
        var play_points = 0
        btnSubmit.setOnClickListener {
            var playerAns = (txtInputAns.text.toString()).toInt()
            if (playerAns == comAns){
                play_points++
                ques_1 = (0..20).random()
                ques_2 = (0..20).random()
                comAns = ques_1 + ques_2
                txtQuestion.setText("$ques_1 + $ques_2")

            }
            else{
                val action = MainFragmentDirections.actionEndFragment(play_points.toString())
                Navigation.findNavController(it).navigate(action)

            }

        }
    }


}