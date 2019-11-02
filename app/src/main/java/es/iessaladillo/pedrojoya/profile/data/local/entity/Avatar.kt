package es.iessaladillo.pedrojoya.profile.data.local.entity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.io.Serializable

// TODO: Avatar class

@Parcelize

class Avatar(val id:Int, val imageResId: Int, val name: String): Serializable, Parcelable