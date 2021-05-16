package com.merveoktay.nasamars

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.DataBindingUtil
import com.merveoktay.nasamars.databinding.RoverBinding
import com.squareup.picasso.Picasso
import okhttp3.HttpUrl


class Rover : ConstraintLayout {

    var mBinding: RoverBinding

    var roverModel: RoverModel?=null
    set(value) {
        field = value
        mBinding.rover=value

        renderImage()
    }
    var screenWidth: Int=300
        set(value) {
           field=value
           var root: View = findViewById<ConstraintLayout>(R.id.root)
            val layoutParams= root.getLayoutParams()
            layoutParams.width= value
            root.setLayoutParams(layoutParams)


        }



    constructor(context: Context) : this(context, null)
    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {

        val inflater= context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)as LayoutInflater
        mBinding=DataBindingUtil.inflate(inflater,R.layout.rover,this,true)



    }

    fun renderImage(){
        var imageView: ImageView=findViewById(R.id.imageView)
        Picasso.get().load(roverModel?.imageUrl).into(imageView)
    }
}