package com.example.submissiondicodingpemula;

import java.util.ArrayList;

public class KabupatenData {
    public static String[] [] data = new String[][]{
            {"Yogyakarta","Mangayu Hayuning Bawana","https://upload.wikimedia.org/wikipedia/id/9/95/" +
                    "Logo_Kota_Yogyakarta.png","7 Oktober 1759","422.732 jiwa","Ibu kota dan pusat " +
                    "pemerintahan Daerah Istimewa Yogyakarta, Indonesia. Kota Yogyakarta adalah kediaman " +
                    "bagi Sultan Hamengkubuwana dan Adipati Paku Alam. Kota Yogyakarta merupakan salah " +
                    "satu kota terbesar di Indonesia dan kota terbesar kempat di wilayah Pulau Jawa " +
                    "bagian selatan setelah Bandung, Malang, dan Surakarta menurut jumlah penduduk."},

            {"Sleman","Sleman SEMBADA","https://upload.wikimedia.org/wikipedia/id/4/43/Sleman.png",
                    "8 Agustus 1950","1.193.572 jiwa","Sebuah kabupaten di Daerah Istimewa Yogyakarta," +
                    " Indonesia. Ibukota kabupaten ini adalah Sleman. Sleman dikenal sebagai asal buah " +
                    "salak pondoh. Berbagai perguruan tinggi yang ada di Yogyakarta sebenarnya secara " +
                    "administratif terletak di wilayah kabupaten ini, di antaranya Universitas Gadjah " +
                    "Mada dan Universitas Negeri Yogyakarta."},

            {"Kulon Progo"," Kulon Progo BINANGUN","https://upload.wikimedia.org/wikipedia/id/b/b8/Kulon_Progo.png",
                    "15 Oktober 1951","470.520 jiwa","Adalah sebuah kabupaten di Provinsi Daerah " +
                    "Istimewa Yogyakarta, Indonesia. Ibukotanya adalah Wates. Kabupaten ini berbatasan " +
                    "dengan Kabupaten Sleman dan Kabupaten Bantul di timur, Samudra Hindia di selatan, " +
                    "Kabupaten Purworejo di barat, serta Kabupaten Magelang di utara. Nama Kulon Progo " +
                    "berarti sebelah barat Sungai Progo (kata kulon dalam Bahasa Jawa artinya barat). " +
                    "Kali Progo membatasi kabupaten ini di sebelah timur."},

            {"Bantul","Bantul PROJOTAMANSARI","https://upload.wikimedia.org/wikipedia/id/a/a9/Bantul.png",
                    "8 Agustus 1950","995.264 jiwa","Merupakan salah satu kabupaten yang berada di " +
                    "Daerah Istimewa Yogyakarta, Indonesia. Ibukotanya adalah Bantul. Moto kabupaten " +
                    "ini adalah Projotamansari, yang merupakan singkatan dari Produktif-Profesional, " +
                    "Ijo royo royo, Tertib, Aman, Sehat, dan Asri. Kabupaten Bantul berbatasan dengan " +
                    "Kota Yogyakarta dan Kabupaten Sleman di sebelah utara, Kabupaten Gunung Kidul di " +
                    "sebelah timur, Samudra Hindia di sebelah selatan, serta Kabupaten Kulon Progo di " +
                    "sebelah barat."},

            {"Gunung Kidul","Gunungkidul HANDAYANI","https://upload.wikimedia.org/wikipedia/commons/7/72/Logo_Kabupaten_GunungKidul.jpg",
                    "27 Mei 1831","729.364 jiwa","adalah salah satu kabupaten di Daerah Istimewa Yogyakarta, " +
                    "Indonesia. Pusat pemerintahan berada di Kecamatan Wonosari"}
    };

    public static ArrayList<Kabupaten> getListData(){
        Kabupaten kabupaten = null;
        ArrayList<Kabupaten> list = new ArrayList<>();
        for (String[] adata : data){
            kabupaten = new Kabupaten();
            kabupaten.setName(adata[0]);
            kabupaten.setRemarks(adata[1]);
            kabupaten.setPhoto(adata[2]);
            kabupaten.setUltah(adata[3]);
            kabupaten.setPenduduk(adata[4]);
            kabupaten.setKeterangan(adata[5]);

            list.add(kabupaten);
        }
        return list;
    }
}
