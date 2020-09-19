package sheridan.plazab.exerciseonepointone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.text.Editable
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var dominoBut:Button
    lateinit var edtNumber1:EditText
    lateinit var edtNumber2:EditText
    lateinit var displayDominoNumber:TextView
    lateinit var dominoPiece: DominoPiece
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dominoBut = findViewById(R.id.makeDom)
        dominoBut.setOnClickListener(this)
        edtNumber1 = findViewById(R.id.editNumber1)
        edtNumber2 = findViewById(R.id.editNumber2)
        displayDominoNumber = findViewById(R.id.dominoDisplay)
    }

    override fun onClick(v: View?){
        if (v != null){
            when(v.id){
                R.id.makeDom -> {
                    this.makeADomino()
                }
            }
        }
    }
    fun makeADomino(){
        dominoPiece = DominoPiece(edtNumber1.text.toString().toInt(), edtNumber2.text.toString().toInt())
        displayDominoNumber.setText("${dominoPiece.n1}/${dominoPiece.n2}")
    }
}