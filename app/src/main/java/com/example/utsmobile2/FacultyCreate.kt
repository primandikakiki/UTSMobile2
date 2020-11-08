package com.example.utsmobile2

fun CreateFac(): List<FacultyData> {
    val partListFac = ArrayList<FacultyData>()
    partListFac.add(
        FacultyData(
            "FAKULTAS ILMU KOMPUTER",
            "Fakultas Ilmu Komputer merupakan salah satu dari 7 Fakultas di UPN 'Veteran' Jawa Timur. Yang terdiri dari program studi: ",
            "1. Prodi S1 Teknik Informatika\n" +
                    "2. Prodi S1 Sistem Informasi\n" +
                    "3. Prodi S1 Data Sains",
            R.drawable.fik,
            "fik@upnjatim.ac.id",
            "https://fik.upnjatim.ac.id/"
        )
    )
    partListFac.add(
        FacultyData(
            "FAKULTAS TEKNIK",
            "Fakultas Teknik merupakan salah satu dari 7 Fakultas di UPN 'Veteran' Jawa Timur. Yang terdiri dari program studi: ",
            "1. Prodi S1 Teknik Kimia\n" +
                    "2. Prodi S1 Teknik Industri\n" +
                    "3. Prodi S1 Teknik Sipil\n" +
                    "4. Prodi S1 Teknik Lingkungan\n" +
                    "5. Prodi S1 Teknologi Pangan",
            R.drawable.ft,
            "ft@upnjatim.ac.id",
            "https://ft.upnjatim.ac.id/"
        )
    )
    partListFac.add(
        FacultyData(
            "FAKULTAS EKONOMI DAN BISNIS",
            "Fakultas Ekonomi dan Bisnis merupakan salah satu dari 7 Fakultas di UPN 'Veteran' Jawa Timur. Yang terdiri dari program studi: ",
            "1. Prodi S1 Ekonomi Pembangunan\n" +
                    "2. Prodi S1 Akuntansi\n" +
                    "3. Prodi S1 Manajemen",
            R.drawable.feb,
            "feb@upnjatim.ac.id",
            "https://febis.upnjatim.ac.id/"
        )
    )
    partListFac.add(
        FacultyData(
            "FAKULTAS PERTANIAN",
            "Fakultas Pertanian merupakan salah satu dari 7 Fakultas di UPN 'Veteran' Jawa Timur. Yang terdiri dari program studi: ",
            "1. Prodi S1 Agroteknologi\n" +
                    "2. Prodi S1 Agribisnis",
            R.drawable.faperta,
            "fp@upnjatim.ac.id",
            "https://faperta.upnjatim.ac.id/"
        )
    )
    partListFac.add(
        FacultyData(
            "FAKULTAS HUKUM",
            "Fakultas Pertanian merupakan salah satu dari 7 Fakultas di UPN 'Veteran' Jawa Timur. Yang terdiri dari program studi: ",
            "1. Prodi S1 Hukum",
            R.drawable.fh,
            "fh@upnjatim.ac.id",
            "https://fhukum.upnjatim.ac.id/"
        )
    )
    partListFac.add(
        FacultyData(
            "FAKULTAS ILMU SOSIAL DAN POLITIK",
            "Fakultas Pertanian merupakan salah satu dari 7 Fakultas di UPN 'Veteran' Jawa Timur. Yang terdiri dari program studi: ",
            "1. Prodi S1 Ilmu Komunikasi\n" +
                    "2. Prodi S1 Ilmu Administrasi Bisnis\n" +
                    "3. Prodi S1 Ilmu Administrasi Negara\n" +
                    "4. Prodi S1 Hubungan Internasional\n" +
                    "5. Prodi S1 Pariwisata",
            R.drawable.fisip,
            "fisip@upnjatim.ac.id",
            "https://fisip.upnjatim.ac.id/"
        )
    )
    partListFac.add(
        FacultyData(
            "FAKULTAS ARSITEKTUR DAN DESAIN",
            "Fakultas Pertanian merupakan salah satu dari 7 Fakultas di UPN 'Veteran' Jawa Timur. Yang terdiri dari program studi: ",
            "1. Prodi S1 Teknik Arsitektur\n" +
                    "2. Prodi S1 Desain Komunikasi Visual",
            R.drawable.fad,
            "fad@upnjatim.ac.id",
            "https://fad.upnjatim.ac.id/"
        )
    )
    partListFac.add(
        FacultyData(
            "PROFIL SINGKAT",
            "Nama : Primandika Hakiki\n"+
                    "TTL : Surabaya, 15 April 2000\n" +
                    "Alamat : Kendangsari YKP Blok F-25, Surabaya\n" +
                    "No. HP : 082333811976\n" +
                    "Email : primandikakiki@gmail.com\n" +
                    "Github : https://github.com/primandikakiki\n",
            "Riwayat Pendidikan : \n" +
                    "\t\t 1. SDN Kendangsari 1 Surabaya \n" +
                    "\t\t 2. SMPN 35 Surabaya \n" +
                    "\t\t 3. SMAN 17 Surabaya \n\n" +
                    "Penghargaan : -",
            R.drawable.me,
            "primandikakiki@gmail.com",
            "https://github.com/primandikakiki"
        )
    )
    return partListFac
}