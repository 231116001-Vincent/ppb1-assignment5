package com.vharya.assignment5

import com.vharya.assignment5.data.MataKuliah

class PlaceholderDataMK {
    private val names = listOf(
        "Kewarganegaraan",
        "Bahasa Inggris II",
        "Pemrograman Web II",
        "Desain UI",
        "Paradigma Pemrograman",
        "Pemrograman Perangkat Bergerak I",
        "Statistika",
        "Kewirausahaan II",
        "IDK Insert Extra Class Here",
    )

    private val descriptions = listOf(
        "",
        "Learning English in preparation for business settings",
        "Belajar membuat website dengan menggunakan Laravel",
        "Belajar teknik desain UI dan membuat desain menggunakan Figma",
        "",
        "Mempelajari perancangan dan pengembangan aplikasi android",
        "Mempelajari semua tentang statistika",
        "Belajar kebutuhan dalam membuat sebuah bisnis",
        "Lorem Ipsum",
    )

    private val rooms = listOf(
        "Room 1",
        "Room 2",
        "Room 3",
        "Room 4",
        "Room 5",
        "Room 6",
        "Room 7",
        "Room 8",
        "Room 101"
    )

    private val schedules = listOf(
        "Kamis, 19:30 - 21:00",
        "Jumat, 17:00 - 18:30",
        "Jumat, 18:30 - 20:00",
        "Jumat, 20:00 - 21:30",
        "Sabtu, 08:30 - 10:00",
        "Sabtu, 10:00 - 11:30",
        "Sabtu, 13:00 - 14:30",
        "Sabtu, 14:30 - 16:00",
        "Minggu, 00:00 - 00:01",
    )

    private val lecturers = listOf(
        "Dr. Drs H. Ali Nasith , M.Si., M.Pd.I",
        "Zusana E. Pudyastuti, S.S., M.Pd",
        "Sugeng Widodo, S.Kom., M.Kom",
        "Adnan Zulkarnain ,S.Kom., M.M.S.I",
        "Jozua F. Palandi, M.Kom",
        "Chaulina Alfianti Oktavia, S.Kom., M.T",
        "Siti Aminah, S .Pd., S.Si., M.Pd",
        "Bagus Kristomoyo Kristanto, S.Kom., M.MT",
        "Lecturer A"
    )

    private val sks = listOf(
        2, 2, 3, 3,
        3, 4, 3, 2, 0,
    )

    private val covers = listOf(
        R.drawable.cover1, R.drawable.cover2, R.drawable.cover3,
        R.drawable.cover2, R.drawable.cover3, R.drawable.cover1,
        R.drawable.cover3, R.drawable.cover2, R.drawable.cover1,
    )

    private val icons = listOf(
        R.drawable.icon1, R.drawable.icon2, R.drawable.icon3,
        R.drawable.icon4, R.drawable.icon5, R.drawable.icon6,
        R.drawable.icon7, R.drawable.icon8, R.drawable.ic_launcher_foreground
    )

    val listData: ArrayList<MataKuliah> get() {
        val list = arrayListOf<MataKuliah>()
        for (index in names.indices) {
            val mataKuliah = MataKuliah()

            mataKuliah.name = names[index]
            mataKuliah.description = descriptions[index]
            mataKuliah.room = rooms[index]
            mataKuliah.schedule = schedules[index]
            mataKuliah.lecturer = lecturers[index]
            mataKuliah.sks = sks[index]
            mataKuliah.cover = covers[index]
            mataKuliah.icon = icons[index]

            list.add(mataKuliah)
        }

        return list
    }
}