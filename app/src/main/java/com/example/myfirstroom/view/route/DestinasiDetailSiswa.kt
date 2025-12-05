package com.example.myfirstroom.view.route

import com.example.myfirstroom.R

object DestinasiDetailSiswa: DestinasiNavigasi {
    override val route = "detail_siswa"
    override val titleRes = R.string.detail_siswa
    const val itemIdArg = "idSiswa"
    val routeWithArgs = "$route/{$itemIdArg}"
}