
package dev.enegine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var storyTextView: TextView
    private lateinit var choiceButton1: Button
    private lateinit var choiceButton2: Button
    val les: String = "Аокигахара"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        storyTextView = findViewById(R.id.storyTextView)
        choiceButton1 = findViewById(R.id.choiceButton1)
        choiceButton2 = findViewById(R.id.choiceButton2)

        choiceButton1.setBackgroundColor(resources.getColor(R.color.BC))
        choiceButton2.setBackgroundColor(resources.getColor(R.color.BC))
        
        choiceButton1.setTextColor(resources.getColor(R.color.TC))
        choiceButton2.setTextColor(resources.getColor(R.color.TC))

        startStory()
    }

    private fun startStory() {
        storyTextView.text = "Лор игры:\nВы отправляетесь в експедицию, Япони 2013г: Состояния Японии: Стабильное. Вы являетесь туристом и решаете посетить место: \"Аокигахара\" или \"Лес самоубийц\"\nЧто вы возьмете с собой? "
        choiceButton1.text = "Фонарик, нож"
        choiceButton2.text = "Соль, фонарик, камера"

        choiceButton1.setOnClickListener {
            var item = 1
            storyTextView.text = "Вы взяли Фонарик и нож, теперь за вами следует выбор: пойти самим или дождаться експедиции"
            choiceButton1.text = "Дождаться группы"
            choiceButton2.text = "Пойти самим"
            choiceButton1.setOnClickListener {
                storyTextView.text = "Ну камон"
                choiceButton1.text = "Все игра окончена"
                choiceButton2.visibility = View.GONE
            }
            
        }

        choiceButton2.setOnClickListener {
            var item = 2
            storyTextView.text = "Взяв с собой нож, вы двинулись сами в $les\nНа пути вы видели вножество людей с коммерческие организации Tokyo Mental Health и Lifelink."
            choiceButton1.text = "Остановится, и подождать експедицию"
            choiceButton2.text = "Пойти дальше"
            choiceButton2.setOnClickListener {
                storyTextView.text = "Все мне лень альфа окончена."
                choiceButton1.visibility = View.GONE
                choiceButton2.visibility = View.GONE
            }
        }
    }
}
