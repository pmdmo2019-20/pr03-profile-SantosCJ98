package es.iessaladillo.pedrojoya.profile.ui.main

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.TextUtils
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri
import es.iessaladillo.pedrojoya.profile.R
import es.iessaladillo.pedrojoya.profile.data.local.Database
import es.iessaladillo.pedrojoya.profile.data.local.entity.Avatar
import es.iessaladillo.pedrojoya.profile.ui.avatar.AvatarActivity
import es.iessaladillo.pedrojoya.profile.utils.*
import kotlinx.android.synthetic.main.profile_activity.*


private const val STATE_ID: String = "STATE_ID"
private const val STATE_LABEL: String = "STATE_LABEL"
private const val STATE_NAME: String = "STATE_NAME"
private const val STATE_EMAIL: String = "STATE_EMAIL"
private const val STATE_PHONE: String = "STATE_PHONE"
private const val STATE_ADDRESS: String = "STATE_ADDRESS"
private const val STATE_WEB: String = "STATE_WEB"


var avatar_label: String? = "Pikachu"
var resId: Int = R.drawable.pikachu
var nombre: String? = ""
var email: String? = ""
var phone: String? = ""
var address: String? = ""
var web: String? = ""


class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_activity)
        onRestoreInstanceState(savedInstanceState)
        setupViews()
        clickImage()
        intents()

    }

    private fun intents() {

        imgEmail.setOnClickListener{openEmailIntent()}

        imgPhonenumber.setOnClickListener{openPhoneIntent()}

        imgAddress.setOnClickListener{openAddressIntent()}

        imgWeb.setOnClickListener{openWebIntent()}

    }

    private fun openWebIntent() {
        if (txtWeb.text.toString().isValidUrl()) {

            val i = newViewUriIntent(Uri.parse(txtEmail.text.toString()))

            if (isActivityAvailable(this, i)) {

                startActivity(i)

            }

            else {

                toast(getString(R.string.no_app_found))

            }

        }

        else {

            toast(getString(R.string.profile_invalid_web))

        }
    }

    private fun openAddressIntent() {
        if (isValidAddress()) {

            val i = newSearchInMapIntent(txtAddress.text.toString())

            if (isActivityAvailable(this, i)) {

                startActivity(i)

            }

            else {

                toast(getString(R.string.no_app_found))

            }

        }

        else {

            toast(getString(R.string.profile_invalid_address))

        }
    }

    private fun openPhoneIntent() {
        if (txtPhonenumber.text.toString().isValidPhone()) {

            val i = newDialIntent(txtPhonenumber.text.toString())

            if (isActivityAvailable(this, i)) {

                startActivity(i)

            }

            else {

                toast(getString(R.string.no_app_found))

            }

        }

        else {

            toast(getString(R.string.profile_invalid_phonenumber))

        }
    }

    private fun openEmailIntent() {

        if (txtEmail.text.toString().isValidEmail()) {

            val i = newEmailIntent(txtEmail.text.toString())

            if (isActivityAvailable(this, i)) {

                startActivity(i)

            }

            else {

                toast(getString(R.string.no_app_found))

            }

        }

        else {

            toast(getString(R.string.profile_invalid_email))

        }


    }


    private fun setupViews() {

        val newLabel: String? = getIntent().getStringExtra("STATE_POKENAME")

        val newId: Int =  getIntent().getIntExtra("STATE_IMAGE", R.drawable.pikachu)

        if (newLabel != null) {

            avatar_label = newLabel

            resId = newId

        }



        lblAvatar.setText(avatar_label.toString())

        imgAvatar.setImageResource(resId)

        txtName.setText(nombre.toString())

        txtEmail.setText(email.toString())

        txtPhonenumber.setText(phone.toString())

        txtAddress.setText(address.toString())

        txtWeb.setText(web.toString())

    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.profile_activity, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.mnuSave) {
            save()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    private fun save() {

        if (!isValidName()) {

            txtName.setError(getString(R.string.profile_invalid_name))

        }

        if (!txtEmail.text.toString().isValidEmail()) {

            txtEmail.setError(getString(R.string.profile_invalid_email))

        }

        if (!txtPhonenumber.text.toString().isValidPhone()) {

            txtPhonenumber.setError(getString(R.string.profile_invalid_phonenumber))

        }

        if (!isValidAddress()) {

            txtAddress.setError(getString(R.string.profile_invalid_address))

        }

        if (!txtWeb.text.toString().isValidUrl()) {

            txtWeb.setError(getString(R.string.profile_invalid_web))

        }

        if (isValidName() && txtEmail.text.toString().isValidEmail() && txtPhonenumber.text.toString().isValidPhone() && txtWeb.text.toString().isValidUrl() && isValidAddress()) {

            txtName.setError(null)

            txtEmail.setError(null)

            txtPhonenumber.setError(null)

            txtAddress.setError(null)

            txtWeb.setError(null)

            avatar_label = lblAvatar.text.toString()

            nombre = txtName.text.toString()

            email = txtEmail.text.toString()

            phone = txtPhonenumber.text.toString()

            address = txtAddress.text.toString()

            web = txtWeb.text.toString()

            toast(getString(R.string.toast))

        }

        }

        private fun callAvatarActivity() {

            val avatarActivity =
                Intent(this, AvatarActivity::class.java).putExtra(STATE_LABEL, avatar_label)

            startActivity(avatarActivity)

        }

        private fun clickImage() {
            imgAvatar.setOnClickListener { callAvatarActivity() }
            lblAvatar.setOnClickListener { callAvatarActivity() }
        }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {

        if (savedInstanceState != null) {
            resId = savedInstanceState.getInt(STATE_ID)
            avatar_label = savedInstanceState.getString(STATE_LABEL)
            nombre = savedInstanceState.getString(STATE_NAME)
            email = savedInstanceState.getString(STATE_EMAIL)
            phone = savedInstanceState.getString(STATE_PHONE)
            address = savedInstanceState.getString(STATE_ADDRESS)
            web = savedInstanceState.getString(STATE_WEB)




        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        nombre = txtName.text.toString()

        email = txtEmail.text.toString()

        phone = txtPhonenumber.text.toString()

        address = txtAddress.text.toString()

        web = txtWeb.text.toString()

        outState.putInt(STATE_ID, resId)
        outState.putString(STATE_LABEL, avatar_label)
        outState.putString(STATE_NAME, nombre)
        outState.putString(STATE_EMAIL, email)
        outState.putString(STATE_PHONE, phone)
        outState.putString(STATE_ADDRESS, address)
        outState.putString(STATE_WEB, web)

    }

    private fun isValidName(): Boolean {

        return (!txtName.text.toString().isNullOrEmpty() || !txtName.text.toString().isNullOrBlank())


    }

    private fun isValidAddress(): Boolean {

        return (!txtAddress.text.toString().isNullOrEmpty() || !txtAddress.text.toString().isNullOrBlank())

    }

    }







