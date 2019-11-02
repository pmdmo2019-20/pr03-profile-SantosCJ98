package es.iessaladillo.pedrojoya.profile.ui.avatar

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import es.iessaladillo.pedrojoya.profile.R
import es.iessaladillo.pedrojoya.profile.data.local.Database
import es.iessaladillo.pedrojoya.profile.data.local.entity.Avatar
import es.iessaladillo.pedrojoya.profile.ui.main.ProfileActivity
import kotlinx.android.synthetic.main.avatar_activity.*

var check1: Boolean = true
var check2: Boolean = false
var check3: Boolean = false
var check4: Boolean = false
var check5: Boolean = false
var check6: Boolean = false
var check7: Boolean = false
var check8: Boolean = false
var check9: Boolean = false

private const val STATE_C1: String = "STATE_C1"
private const val STATE_C2: String = "STATE_C2"
private const val STATE_C3: String = "STATE_C3"
private const val STATE_C4: String = "STATE_C4"
private const val STATE_C5: String = "STATE_C5"
private const val STATE_C6: String = "STATE_C6"
private const val STATE_C7: String = "STATE_C7"
private const val STATE_C8: String = "STATE_C8"
private const val STATE_C9: String = "STATE_C9"
private const val STATE_POKENAME: String = "STATE_POKENAME"
private const val STATE_IMAGE: String = "STATE_IMAGE"


class AvatarActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.avatar_activity)
        onRestoreInstanceState(savedInstanceState)
        setupViews()
        controlChecks()
    }

    private fun setupViews() {

        chkAvatar1.setChecked(check1)

        chkAvatar2.setChecked(check2)

        chkAvatar3.setChecked(check3)

        chkAvatar4.setChecked(check4)

        chkAvatar5.setChecked(check5)

        chkAvatar6.setChecked(check6)

        chkAvatar7.setChecked(check7)

        chkAvatar8.setChecked(check8)

        chkAvatar9.setChecked(check9)




    }

    private fun controlChecks() {

        chkAvatar1.setOnClickListener {

            chkAvatar1.setChecked(true)
            chkAvatar2.setChecked(false)
            chkAvatar3.setChecked(false)
            chkAvatar4.setChecked(false)
            chkAvatar5.setChecked(false)
            chkAvatar6.setChecked(false)
            chkAvatar7.setChecked(false)
            chkAvatar8.setChecked(false)
            chkAvatar9.setChecked(false)
        }

        chkAvatar2.setOnClickListener {

            chkAvatar2.setChecked(true)
            chkAvatar1.setChecked(false)
            chkAvatar3.setChecked(false)
            chkAvatar4.setChecked(false)
            chkAvatar5.setChecked(false)
            chkAvatar6.setChecked(false)
            chkAvatar7.setChecked(false)
            chkAvatar8.setChecked(false)
            chkAvatar9.setChecked(false)
        }

        chkAvatar3.setOnClickListener {

            chkAvatar3.setChecked(true)
            chkAvatar2.setChecked(false)
            chkAvatar1.setChecked(false)
            chkAvatar4.setChecked(false)
            chkAvatar5.setChecked(false)
            chkAvatar6.setChecked(false)
            chkAvatar7.setChecked(false)
            chkAvatar8.setChecked(false)
            chkAvatar9.setChecked(false)
        }

        chkAvatar4.setOnClickListener {

            chkAvatar4.setChecked(true)
            chkAvatar2.setChecked(false)
            chkAvatar3.setChecked(false)
            chkAvatar1.setChecked(false)
            chkAvatar5.setChecked(false)
            chkAvatar6.setChecked(false)
            chkAvatar7.setChecked(false)
            chkAvatar8.setChecked(false)
            chkAvatar9.setChecked(false)
        }

        chkAvatar5.setOnClickListener {

            chkAvatar5.setChecked(true)
            chkAvatar2.setChecked(false)
            chkAvatar3.setChecked(false)
            chkAvatar4.setChecked(false)
            chkAvatar1.setChecked(false)
            chkAvatar6.setChecked(false)
            chkAvatar7.setChecked(false)
            chkAvatar8.setChecked(false)
            chkAvatar9.setChecked(false)
        }

        chkAvatar6.setOnClickListener {

            chkAvatar6.setChecked(true)
            chkAvatar2.setChecked(false)
            chkAvatar3.setChecked(false)
            chkAvatar4.setChecked(false)
            chkAvatar5.setChecked(false)
            chkAvatar1.setChecked(false)
            chkAvatar7.setChecked(false)
            chkAvatar8.setChecked(false)
            chkAvatar9.setChecked(false)
        }

        chkAvatar7.setOnClickListener {

            chkAvatar7.setChecked(true)
            chkAvatar2.setChecked(false)
            chkAvatar3.setChecked(false)
            chkAvatar4.setChecked(false)
            chkAvatar5.setChecked(false)
            chkAvatar6.setChecked(false)
            chkAvatar1.setChecked(false)
            chkAvatar8.setChecked(false)
            chkAvatar9.setChecked(false)
        }

        chkAvatar8.setOnClickListener {

            chkAvatar8.setChecked(true)
            chkAvatar2.setChecked(false)
            chkAvatar3.setChecked(false)
            chkAvatar4.setChecked(false)
            chkAvatar5.setChecked(false)
            chkAvatar6.setChecked(false)
            chkAvatar7.setChecked(false)
            chkAvatar1.setChecked(false)
            chkAvatar9.setChecked(false)
        }

        chkAvatar9.setOnClickListener {

            chkAvatar9.setChecked(true)
            chkAvatar2.setChecked(false)
            chkAvatar3.setChecked(false)
            chkAvatar4.setChecked(false)
            chkAvatar5.setChecked(false)
            chkAvatar6.setChecked(false)
            chkAvatar7.setChecked(false)
            chkAvatar8.setChecked(false)
            chkAvatar1.setChecked(false)
        }

        imgAvatar1.setOnClickListener {

            chkAvatar1.setChecked(true)
            chkAvatar2.setChecked(false)
            chkAvatar3.setChecked(false)
            chkAvatar4.setChecked(false)
            chkAvatar5.setChecked(false)
            chkAvatar6.setChecked(false)
            chkAvatar7.setChecked(false)
            chkAvatar8.setChecked(false)
            chkAvatar9.setChecked(false)
        }

        imgAvatar2.setOnClickListener {

            chkAvatar2.setChecked(true)
            chkAvatar1.setChecked(false)
            chkAvatar3.setChecked(false)
            chkAvatar4.setChecked(false)
            chkAvatar5.setChecked(false)
            chkAvatar6.setChecked(false)
            chkAvatar7.setChecked(false)
            chkAvatar8.setChecked(false)
            chkAvatar9.setChecked(false)
        }

        imgAvatar3.setOnClickListener {

            chkAvatar3.setChecked(true)
            chkAvatar2.setChecked(false)
            chkAvatar1.setChecked(false)
            chkAvatar4.setChecked(false)
            chkAvatar5.setChecked(false)
            chkAvatar6.setChecked(false)
            chkAvatar7.setChecked(false)
            chkAvatar8.setChecked(false)
            chkAvatar9.setChecked(false)
        }

        imgAvatar4.setOnClickListener {

            chkAvatar4.setChecked(true)
            chkAvatar2.setChecked(false)
            chkAvatar3.setChecked(false)
            chkAvatar1.setChecked(false)
            chkAvatar5.setChecked(false)
            chkAvatar6.setChecked(false)
            chkAvatar7.setChecked(false)
            chkAvatar8.setChecked(false)
            chkAvatar9.setChecked(false)
        }

        imgAvatar5.setOnClickListener {

            chkAvatar5.setChecked(true)
            chkAvatar2.setChecked(false)
            chkAvatar3.setChecked(false)
            chkAvatar4.setChecked(false)
            chkAvatar1.setChecked(false)
            chkAvatar6.setChecked(false)
            chkAvatar7.setChecked(false)
            chkAvatar8.setChecked(false)
            chkAvatar9.setChecked(false)
        }

        imgAvatar6.setOnClickListener {

            chkAvatar6.setChecked(true)
            chkAvatar2.setChecked(false)
            chkAvatar3.setChecked(false)
            chkAvatar4.setChecked(false)
            chkAvatar5.setChecked(false)
            chkAvatar1.setChecked(false)
            chkAvatar7.setChecked(false)
            chkAvatar8.setChecked(false)
            chkAvatar9.setChecked(false)
        }

        imgAvatar7.setOnClickListener {

            chkAvatar7.setChecked(true)
            chkAvatar2.setChecked(false)
            chkAvatar3.setChecked(false)
            chkAvatar4.setChecked(false)
            chkAvatar5.setChecked(false)
            chkAvatar6.setChecked(false)
            chkAvatar1.setChecked(false)
            chkAvatar8.setChecked(false)
            chkAvatar9.setChecked(false)
        }

        imgAvatar8.setOnClickListener {

            chkAvatar8.setChecked(true)
            chkAvatar2.setChecked(false)
            chkAvatar3.setChecked(false)
            chkAvatar4.setChecked(false)
            chkAvatar5.setChecked(false)
            chkAvatar6.setChecked(false)
            chkAvatar7.setChecked(false)
            chkAvatar1.setChecked(false)
            chkAvatar9.setChecked(false)
        }

        imgAvatar9.setOnClickListener {

            chkAvatar9.setChecked(true)
            chkAvatar2.setChecked(false)
            chkAvatar3.setChecked(false)
            chkAvatar4.setChecked(false)
            chkAvatar5.setChecked(false)
            chkAvatar6.setChecked(false)
            chkAvatar7.setChecked(false)
            chkAvatar8.setChecked(false)
            chkAvatar1.setChecked(false)
        }

        lblAvatar1.setOnClickListener {

            chkAvatar1.setChecked(true)
            chkAvatar2.setChecked(false)
            chkAvatar3.setChecked(false)
            chkAvatar4.setChecked(false)
            chkAvatar5.setChecked(false)
            chkAvatar6.setChecked(false)
            chkAvatar7.setChecked(false)
            chkAvatar8.setChecked(false)
            chkAvatar9.setChecked(false)
        }

        lblAvatar2.setOnClickListener {

            chkAvatar2.setChecked(true)
            chkAvatar1.setChecked(false)
            chkAvatar3.setChecked(false)
            chkAvatar4.setChecked(false)
            chkAvatar5.setChecked(false)
            chkAvatar6.setChecked(false)
            chkAvatar7.setChecked(false)
            chkAvatar8.setChecked(false)
            chkAvatar9.setChecked(false)
        }

        lblAvatar3.setOnClickListener {

            chkAvatar3.setChecked(true)
            chkAvatar2.setChecked(false)
            chkAvatar1.setChecked(false)
            chkAvatar4.setChecked(false)
            chkAvatar5.setChecked(false)
            chkAvatar6.setChecked(false)
            chkAvatar7.setChecked(false)
            chkAvatar8.setChecked(false)
            chkAvatar9.setChecked(false)
        }

        lblAvatar4.setOnClickListener {

            chkAvatar4.setChecked(true)
            chkAvatar2.setChecked(false)
            chkAvatar3.setChecked(false)
            chkAvatar1.setChecked(false)
            chkAvatar5.setChecked(false)
            chkAvatar6.setChecked(false)
            chkAvatar7.setChecked(false)
            chkAvatar8.setChecked(false)
            chkAvatar9.setChecked(false)
        }

        lblAvatar5.setOnClickListener {

            chkAvatar5.setChecked(true)
            chkAvatar2.setChecked(false)
            chkAvatar3.setChecked(false)
            chkAvatar4.setChecked(false)
            chkAvatar1.setChecked(false)
            chkAvatar6.setChecked(false)
            chkAvatar7.setChecked(false)
            chkAvatar8.setChecked(false)
            chkAvatar9.setChecked(false)
        }

        lblAvatar6.setOnClickListener {

            chkAvatar6.setChecked(true)
            chkAvatar2.setChecked(false)
            chkAvatar3.setChecked(false)
            chkAvatar4.setChecked(false)
            chkAvatar5.setChecked(false)
            chkAvatar1.setChecked(false)
            chkAvatar7.setChecked(false)
            chkAvatar8.setChecked(false)
            chkAvatar9.setChecked(false)
        }

        lblAvatar7.setOnClickListener {

            chkAvatar7.setChecked(true)
            chkAvatar2.setChecked(false)
            chkAvatar3.setChecked(false)
            chkAvatar4.setChecked(false)
            chkAvatar5.setChecked(false)
            chkAvatar6.setChecked(false)
            chkAvatar1.setChecked(false)
            chkAvatar8.setChecked(false)
            chkAvatar9.setChecked(false)
        }

        lblAvatar8.setOnClickListener {

            chkAvatar8.setChecked(true)
            chkAvatar2.setChecked(false)
            chkAvatar3.setChecked(false)
            chkAvatar4.setChecked(false)
            chkAvatar5.setChecked(false)
            chkAvatar6.setChecked(false)
            chkAvatar7.setChecked(false)
            chkAvatar1.setChecked(false)
            chkAvatar9.setChecked(false)
        }

        lblAvatar9.setOnClickListener {

            chkAvatar9.setChecked(true)
            chkAvatar2.setChecked(false)
            chkAvatar3.setChecked(false)
            chkAvatar4.setChecked(false)
            chkAvatar5.setChecked(false)
            chkAvatar6.setChecked(false)
            chkAvatar7.setChecked(false)
            chkAvatar8.setChecked(false)
            chkAvatar1.setChecked(false)
        }

    }



    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.avatar_activity, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.mnuSelect) {
            save()
            sendAvatar()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    private fun sendAvatar() {

        var i: Intent? = null

        if (check1) {

            i = Intent(this, ProfileActivity::class.java)
                .putExtra(STATE_POKENAME, "Pikachu")
                .putExtra(STATE_IMAGE, R.drawable.pikachu)
        }

        else if (check2) {

            i = Intent(this, ProfileActivity::class.java)
                .putExtra(STATE_POKENAME, "Cubone")
                .putExtra(STATE_IMAGE, R.drawable.cubone)
        }

        else if (check3) {

            i = Intent(this, ProfileActivity::class.java)
                .putExtra(STATE_POKENAME, "Gyarados")
                .putExtra(STATE_IMAGE, R.drawable.gyarados)
        }

        else if (check4) {

            i = Intent(this, ProfileActivity::class.java)
                .putExtra(STATE_POKENAME, "Bulbasur")
                .putExtra(STATE_IMAGE, R.drawable.bulbasur)
        }

        else if (check5) {

            i = Intent(this, ProfileActivity::class.java)
                .putExtra(STATE_POKENAME, "Feebas")
                .putExtra(STATE_IMAGE, R.drawable.feebas)
        }

        else if (check6) {

            i = Intent(this, ProfileActivity::class.java)
                .putExtra(STATE_POKENAME, "Jigglypuff")
                .putExtra(STATE_IMAGE, R.drawable.jigglypuff)
        }

        else if (check7) {

            i = Intent(this, ProfileActivity::class.java)
                .putExtra(STATE_POKENAME, "Chikorita")
                .putExtra(STATE_IMAGE, R.drawable.chikorita)
        }

        else if (check8) {

            i = Intent(this, ProfileActivity::class.java)
                .putExtra(STATE_POKENAME, "Giratina")
                .putExtra(STATE_IMAGE, R.drawable.giratina)
        }

        else if (check9) {

            i = Intent(this, ProfileActivity::class.java)
                .putExtra(STATE_POKENAME, "Pachirisu")
                .putExtra(STATE_IMAGE, R.drawable.pachirisu)
        }



        startActivity(i)
    }

    private fun save() {
        check1 = chkAvatar1.isChecked
        check2 = chkAvatar2.isChecked
        check3 = chkAvatar3.isChecked
        check4 = chkAvatar4.isChecked
        check5 = chkAvatar5.isChecked
        check6 = chkAvatar6.isChecked
        check7 = chkAvatar7.isChecked
        check8 = chkAvatar8.isChecked
        check9 = chkAvatar9.isChecked
    }

    companion object {

        const val EXTRA_AVATAR = "EXTRA_AVATAR"

    }

    override fun onRestoreInstanceState(outState: Bundle?) {
        if (outState != null) {
            check1 = outState.getBoolean(STATE_C1)
            check2 = outState.getBoolean(STATE_C2)
            check3 = outState.getBoolean(STATE_C3)
            check4 = outState.getBoolean(STATE_C4)
            check5 = outState.getBoolean(STATE_C5)
            check6 = outState.getBoolean(STATE_C6)
            check7 = outState.getBoolean(STATE_C7)
            check8 = outState.getBoolean(STATE_C8)
            check9 = outState.getBoolean(STATE_C9)




        }
    }

    override fun onSaveInstanceState(outState: Bundle) {

        check1 = chkAvatar1.isChecked
        check2 = chkAvatar2.isChecked
        check3 = chkAvatar3.isChecked
        check4 = chkAvatar4.isChecked
        check5 = chkAvatar5.isChecked
        check6 = chkAvatar6.isChecked
        check7 = chkAvatar7.isChecked
        check8 = chkAvatar8.isChecked
        check9 = chkAvatar9.isChecked

        super.onSaveInstanceState(outState)
        outState.putBoolean(STATE_C1, check1)
        outState.putBoolean(STATE_C2, check2)
        outState.putBoolean(STATE_C3, check3)
        outState.putBoolean(STATE_C4, check4)
        outState.putBoolean(STATE_C5, check5)
        outState.putBoolean(STATE_C6, check6)
        outState.putBoolean(STATE_C7, check7)
        outState.putBoolean(STATE_C8, check8)
        outState.putBoolean(STATE_C9, check9)

    }

}


