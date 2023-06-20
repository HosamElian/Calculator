package com.hossam.calculator

import android.graphics.Path
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var isnewop = true
    fun bunumber(view:View){
        if (isnewop){ shownum.text=""
        isnewop= false }
        var tvnum:String=shownum.text.toString()
        val buselect= view as Button
        when (buselect.id){
            bu0.id->{
                tvnum+="0"
            }
            bu1.id->{
                tvnum+="1"
            }
            bu2.id->{
                tvnum+="2"
            }
            bu3.id->{
                tvnum+="3"
            }
            bu4.id->{
                tvnum+="4"
            }
            bu5.id->{
                tvnum+="5"
            }
            bu6.id->{
                tvnum+="6"
            }
            bu7.id->{
                tvnum+="7"
            }
            bu8.id->{
                tvnum+="8"
            }
            bu9.id->{
                tvnum+="9"
            }
            buplusmi.id->{
                tvnum+="-"
            }
            budot.id->{
                tvnum+="."
            }
        }
        shownum.text=tvnum
    }
    var oldNumber = ""
    var op=""
    fun buop(view:View){
        oldNumber=shownum.text.toString()
        isnewop=true
        var buselect=view as Button
        when (buselect.id)
        {
        buadd.id->{
            op="+"
        }
            budiv.id->{
                op="/"
            }
            busub.id->{
                op="-"
            }
            bumul.id->{
                op="*"
            }
            bupare.id->{
                op="%"
            }
        }



    }
    fun bueq(view: View){
        var newnumber=shownum.text.toString()
        var finalnum:Double?=null
        var buselect =view as Button
        when (op){
            "+"->{
                finalnum=oldNumber.toDouble()+newnumber.toDouble()
            }
            "-"->{
                finalnum=oldNumber.toDouble()-newnumber.toDouble()
            }
            "/"->{
                finalnum=oldNumber.toDouble()/newnumber.toDouble()
            }
            "*"->{
                finalnum=oldNumber.toDouble()*newnumber.toDouble()
            }
            "%"->{
                finalnum=oldNumber.toDouble() %newnumber.toDouble()
            }





        }
        shownum.text=finalnum.toString()
        isnewop=true
    }
    fun buac(view: View){
        isnewop=true
        shownum.text="0"
    }
}
