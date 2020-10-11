package com.example.latihan5.indonesiaku;

import android.graphics.Bitmap;

import java.util.ArrayList;

public class ProvinceData {

    private static String[] provinceNames = {
            "Nanggroe Aceh Darussalam",
            "Sumatera Utara",
            "Sumatera Barat",
            "Riau",
            "Kepulauan Riau",
            "Jambi",
            "Bengkulu",
            "Sumatera Selatan",
            "Bangka Belitung",
            "Lampung",
            "Banten",
            "DKI Jakarta",
            "Jawa Barat",
            "Jawa Tengah",
            "DI Yogyakarta",
            "Jawa Timur",
            "Bali",
            "Nusa Tenggara Barat",
            "Nusa Tenggara Timur",
            "Kalimantan Barat",
            "Kalimantan Tengah",
            "Kalimantan Selatan",
            "Kalimantan Timur",
            "Kalimantan Utara",
            "Sulawesi Utara",
            "Sulawesi Barat",
            "Gorontalo",
            "Sulawesi Tengah",
            "Sulawesi Tenggara",
            "Sulawesi Selatan",
            "Maluku",
            "Maluku Utara",
            "Papua",
            "Papua Barat"
    };

    private static  String[] ibukotaProvinsi = {
            "Banda Aceh",
            "Medan",
            "Padang",
            "Pekanbaru",
            "Batam",
            "Jambi",
            "Bengkulu",
            "Palembang",
            "Pangkal Pinang",
            "Bandar Lampung",
            "Serang",
            "Jakarta",
            "Bandung",
            "Semarang",
            "Yogyakarta",
            "Surabaya",
            "Denpasar",
            "Mataram",
            "Kupang",
            "Pontianak",
            "Palangkaraya",
            "Banjarmasin",
            "Samarinda",
            "Tanjung Selor",
            "Manado",
            "Mamuju",
            "Gorontalo",
            "Palu",
            "Kendari",
            "Makasar",
            "Ambon",
            "Ternate",
            "Jayapura",
            "Manokwari"
    };

    private static String[] luasProvinsi = {
            "57.365,57",
            "71.680",
            "42.297",
            "94.561",
            "11.195,52",
            "54.436",
            "19.788",
            "113.339,07",
            "16.424",
            "35.376,84",
            "9.663",
            "661,62",
            "35.378",
            "33.171,78",
            "3.142",
            "47.921,98",
            "5.632,86",
            "20.153,15",
            "47.349",
            "14.680,7",
            "153.800",
            "37.377,53",
            "211.440",
            "72.275",
            "25.768",
            "16.787",
            "12.435",
            "68.033",
            "38.140",
            "62.482,54",
            "851.000",
            "53.836",
            "307.775",
            "116.571"
    };

    private static String[] tanggallahirProvinsi = {
            "7 Desember 1959",
            "29 November 1956",
            "9 Agustus 1957",
            "9 Agustus 1957",
            "25 Oktober 2002",
            "9 Agustus 1957",
            "18 November 1968",
            "14 Agustus 1950",
            "21 November 2000",
            "18 Maret 1964",
            "4 Oktober 2000",
            "28 Agustus 1961",
            "4 Juli 1950",
            "4 Juli 1950",
            "4 Maret 1950",
            "4 Juli 1950",
            "14 Agustus 1958",
            "14 Agustus 1958",
            "14 Agustus 1958",
            "7 Desember 1956",
            "2 Juli 1958",
            "7 Desember 1956",
            "2 Juli 1958",
            "25 Oktober 2012",
            "13 Desember 1960",
            "5 Oktober 2004",
            "22 Desember 2000",
            "23 September 1964",
            "23 September 1964",
            "13 Desember 1960",
            "17 Juni 1958",
            "4 Oktober 1999",
            "10 September 1969",
            "4 Oktober 1999"
    };

    private static String[] posisiProvinsi = {
            "2º-6ºLU dan 95º-99º BT",
            "1º-5ºLU dan 97º-101ºBT",
            "1ºLU-4º LS dan 98º-102º BT",
            "2ºLU-3º LU dan 100º-109º BT",
            "1ºLS-3º LS dan 101º-104º BT",
            "1ºLS-3ºLS dan 101º-105ºBT",
            "2ºLS-6ºLS dan 101º-104ºBT",
            "1ºLS-5ºLS dan 102º-107º BT",
            "1ºLS-4ºLS dan 105º-109ºBT",
            "3ºLS-7ºLS dan 103º-106ºBT",
            "5ºLS-8ºLS dan 105º-107ºBT",
            "6ºLS-7ºLS dan 106º-107ºBT",
            "5ºLS-8ºLS dan 106º-109ºBT",
            "6ºLS-9ºLS dan 108º-112ºBT",
            "7ºLS-9ºLS dan 110º-111ºBT",
            "6ºLS-9ºLS dan 110º-115ºBT",
            "8ºLS-9ºLS dan 114º-116ºBT",
            "8ºLS-10ºLS dan 115º-120ºBT",
            "8ºLS-11ºLS dan 118º-126ºBT",
            "2ºLU-3ºLS dan 108º-114ºBT",
            "1ºLU-4ºLS dan 110º-116ºBT",
            "1ºLS-5ºLS dan 114º-117ºBT",
            "1ºLU-3ºLS dan 113º-120ºBT",
            "0°57′ LU dan 116°26′ BT",
            "0ºLS-8ºLS dan 118º-122ºBT",
            "0ºLS-3ºLS dan 118º-120ºBT",
            "0ºLU-1ºLU dan 120º-124ºBT",
            "2ºLU-4ºLS dan 119º-125ºBT",
            "2ºLS-7ºLS dan 120º-125ºBT",
            "0ºLS-8ºLS dan 118º-122ºBT",
            "0ºLS-9ºLS dan 124º-136ºBT",
            "3ºLU-º3LS dan 124º-129ºBT",
            "1ºLS-6ºLS dan 131º-141ºBT",
            "0ºLS-5ºLS dan 130º-138ºBT"
    };

    private static String[] jumlahJiwa = {
            "5,281",
            "13,22",
            "4,846",
            "6,657",
            "2,082",
            "3,515",
            "1,934",
            "8,267",
            "1,43",
            "8,289",
            "12,448",
            "10,374",
            "48,037",
            "34,257",
            "3,762",
            "39,293",
            "4,246",
            "4,955",
            "5,287",
            "4,932",
            "2,605",
            "4,119",
            "3,575",
            "0,691",
            "2,461",
            "1,331",
            "1,168",
            "2,966",
            "2,602",
            "8,69",
            "1,744",
            "1,209",
            "3,265",
            "0,915"
    };

    private static String[] artiLogo = {
      "Kupiah (Peci) Aceh berbentuk segi 5 (lima), adalah melambangkan Provinsi Nanggroe Aceh Darussalam yang bermakna Falsafah hidup Rakyat dan Pemerintah Daerah yang disebut PANCACITA yang terdiri dari lima unsur.\n" +
              "Dacing atau timbangan melambangkan Keadilan.\n" +
              "Rencong : melambangkan Kepahlawanan.\n" +
              "Padi, Kapas, dan Cerobong Pabrik : melambangkan Kemakmuran.\n" +
              "Kubah Masjid, Kitab dan Kalam : melambangkan Keagamaan dan Ilmu Pengetahuan.\n" +
              "Warna Putih :melambangkan Kemurnian.\n" +
              "Warna Kuning :melambangkan Kejayaan.\n" +
              "Warna Hijau : melambangkan Kesejahteraan dan Kemakmuran.",
      "Kepalan tangan yang diacungkan ke atas dengan menggenggam rantai beserta perisainya melambangkan kebulatan tekad perjuangan rakyat Provinsi Sumatera Utara melawan imperialisme / Kolonialisme, feodalisme dan komunisme.\n" +
              "Batang bersudut lima, Perisai dan Rantai melambangkan kesatuan masyarakat didalam membela dan mempertahankan Pancasila.\n" +
              "Pabrik, Pelabuhan,Pohon karet,Pohon sawit,Daun tembakau, Ikan, Daun padi dan Tulisan “SUMATERA UTARA” melambangkan daerah yang indah permai masyhur dengan kekayaan alamnya yang melimpah-limpah.\n" +
              "Tujuh belas kuntum kapas, delapan sudut sarang laba-laba dan empatpuluh lima butir padi menggambarkan tanggal bulan dan tahun Kemerdekaan dimana ketiga-tiganya ini berikut tongkat dibawah kepalan tangan melambangkan watak kebudayaan yang mencerminkan kebesaran bangsa, patriotisme, pencinta, keadaan dan pembela keadilan.\n" +
              "Bukit Barisan yang berpuncak lima melambangkan tata kemasyarakatan yang berkepribadian luhur, bersemangat Persatuan Kegotongroyongan yang dinamis",
      "Lambang Sumatera Barat berbentuk perisai segi lima. Di dalam lambang, terdapat lukisan kubah masjid dan bintang, rumah gadang, dan gelombang air.\n" +
              "Kubah masjid melambangkan Islam sebagai agama utama rakyat Sumatera Barat. Bintang sebagai simbol Ketuhanan Yang Maha Esa. Rumah gadang memiliki makna semangat demokrasi, karena merupakan tempat masyarakat bermusyawarah. Gelombang air merupakan simbol dinamika rakyat Sumatera Barat",
      "Mata Rantai tak terputus  yang berjumlah 45, adalah lambang persatuan bangsa dan diproklamirkan pada tahun 1945, yaitu tahun Proklamasi Republik Indonesia.\n" +
              " Padi dan Kapas adalah lambang kemakmuran (sandang pangan), padi 17 butir dan 8 Bunga Kapas merupakan tanggal Proklamasi 17 bulan 8 (Agustus).\n" +
              " Lancang Kuning mengandung, adalah lambang kebesaran Rakyat Riau, sedang sogok Lancang berkepala ikan melambangkan bahwa Riau banyak menghasilkan Ikan dan mempunyai sumber-sumber penghidupan dari laut. Gelombang lima lapis melambangkan Pancasila sebagai Dasar Negara, Republik Indonesia.\n" +
              "Keris berhulu Kepala Burung Serindit, adalah lambang Kepahlawanan Rakyat Riau berdasarkan pada kebijaksanaan dan kebenaran",
      "Lambang Daerah Kepulauan Riau terdiri dari 6 (enam) bagian dengan rincian sebagai berikut :\n" +
              "Bintang berwarna kuning melambangkan ketaqwaan terhadap Tuhan Yang Maha Esa;\n" +
              "Mata Rantai berwarna hitam berjumlah 32 (tiga puluh dua) yang berlatar belakang warna hijau muda melambangkan kebersamaan masyarakat Provinsi Kepulauan Riau yang bersatu padu dan menunjukkan berdirinya Provinsi Kepulauan Riau sebagai Provinsi yang ke- 32 di Negara Republik Indonesia;\n" +
              "Perahu berwarna kuning sebagai simbol alat transportasi masyarakat Kepulauan Riau dengan layar berwarna putih yang terkembang melambangkan semangat kebersamaan dalam satu tekad mengisi laju pembangunan di Provinsi Kepulauan Riau;\n" +
              "Padi berwarna kuning berjumlah 24 (dua puluh empat) butir dan Kapas berwarna hijau dan putih berjumlah 9 (sembilan) kuntum melambangkan kesejahteraan masyarakat Provinsi Kepulauan Riau sebagai tujuan utama dan mengingatkan tanggal disyahkannya Undang-Undang terbentuknya Provinsi Kepulauan Riau 24 September 2002,Sebilah Keris berluk 7 (tujuh) berwarna kuning emas berhulu kepala Burung Serindit berwarna hitam, di atas tepak sirih berwarna merah lekuk 5 (lima), di dalam perahu berwarna kuning yang dengan gelombang 7 (tujuh) lapis, yang masing-masing melambangkan sebagai berikut :\n" +
              "Sebilah Keris berluk 7 (tujuh) berwarna kuning emas berhulu kepala Burung Serindit berwarna hitam, melambangkan keberanian dalam menjaga dan memperjuangkan negeri bahari ini untuk menuju kesejahteraan dan kemakmuran,\n" +
              "Tepak Sirih berwarna merah melambangkan persahabatan,\n" +
              "Perahu berwarna kuning sebagai simbol alat transportasi masyarakat Kepulauan Riau dengan layar berwarna putih yang terkembang, melambangkan semangat kebersamaan dalam satu tekad mengisi laju pembangunan di Provinsi Kepulauan Riau,\n" +
              "Gelombang berlapis 7 sebagai simbol bulan Juli, sehingga mengingatkan kita diresmikannya Provinsi Kepulauan Riau yakni tanggal 1 Juli 2004;\n" +
              "Tulisan “PROVINSI KEPULAUAN RIAU” berwarna putih di atas dasar lambang daerah berwarna biru tua sebagai identitas nama daerah Pita berwarna kuning bertuliskan “BERPANCANG AMANAH BERSAUH MARWAH” berwarna hitam adalah MOTTO DAERAH yang mengandung semangat dan tekad serta azam masyarakat Provinsi Kepulauan Riau dalam menuju cita-cita luhurnya",
      "Provinsi Jambi memiliki lambang yang ditetapkan sebagai simbol Pemerintah Daerah Provinsi Jambi sekaligus mewakili insitas provinsi ini sebagai bagian tidak terpisahkan dari Negara Kesatuan Republik Indonesia. Dimana, Lambang Provinsi Jambi ditetapkan dan disahkan melalui Peraturan Daerah Nomor 1 tahun 1969 tentang Kalimat Sepucuk Jambi Sembilan Lurah.\n" +
              "Adapun arti dari Lambang Provinsi Jambi adalah sebagai berikut :\n" +
              "Bidang dasar berbentuk persegi lima yang melambangkan Rakyat Jambi yang memiliki Jiwa dan Semangat Pancasila.\n" +
              "Enam Lubang Mesjid dan Satu Buah Keris dengan gambaran fondasi mesjid yang terdiri dari dua buah susunan batu (terdapat lima batu di bagian atas dan terdapat tujuh batu di bagian bawah) yang melambangkan berdirinya daerah Jambi sebagai sebuah daerah yang otonom pada tanggal 6 Januari 1957\n" +
              "Gambar sebuah Mesjid yang melambangkan Keyakinan dan Ketaatan Rakyat Jambi dalam menjalankan kehidupan beragama\n" +
              "Gambar Keris Siginjai yang merupakan keris pusaka yang melambangkan Jiwa Kepahlawanan Rakyat Jambi dalam menentang bentuk penjajahan dan sebagai perlambang berdirinya Provinsi Jambi pada bulan Januari\n" +
              "Cerana yang pakai kain penutup berbentuk persegi sembilan yang melambangkan Rasa Ikhlas yang bersumber kepada keAgungan Tuhan yang menjiwai Hati Nurani\n" +
              "Gambar Gong yang melambangkan jiwa demokrasi yang ditunjukkan di dalam pepatah adat “BULAT AIR DEK PEMBULUH, BULAT KATO DEK MUFAKAT”\n" +
              "Empat Buah Garis yang melambangkan historis Rakyat Jambi yang dimulai sejak Kerajaan Melayu Jambi hingga akhirnya menjadi Provinsi Jambi\n" +
              "Sebuah kalimat yang berbunyi “SEPUCUK JAMBI SEMBILAN LURAH” di dalam sebuah pita yang bergulung tiga dan bersegi dua dimana melambangkan kesatuan wilayah geografis 9(sembilan) daerah Aliran Sungai dan lingkup wilayah adat dari Jambi “SIALANG BELANTAK BESI SAMPAI DURIAN BATAKUK RAJO DAN DIOMBAK NAN BADABUR, TANJUNG JABUNG",
      "Lambang Daerah Provinsi Bengkulu terdiri atas 3 (tiga) bagian yaitu : Berbentuk tameng. Ditengah-tengah terdapat tameng kecil yang di dalamnya berisikan setangkai padi dan setangkai kopi bersama daunnya. Sedangkan ditengah-tengahnya terdapat bunga Rafllesia, rudus, cerana dan bintang baser. Sebuah pita dengan bertuliskan : “BENGKULU”.\n" +
              "Makna Warna di dalam Lambang sebagai berikut: Hijau : Kesuburan, Biru: Kemakmuran, Merah : Dinamika Kegembiraan, Ungu : Ketenangan kedamaian, Kuning : Kejayaan.\n" +
              "Warna hijau di atas tameng mencerminkan daerah pegunungan Bukit Barisan dengan tanahnya yang subur sebagai batas tanah daerah Provinsi Bengkulu sebelah Timur, warna biru berombak dengan 18 (delapan belas) gelombang berarti Laut dengan sumber kekayaan sebagai batas daerah Provinsi Bengkulu sebelah Barat.\n" +
              "Dalam tameng kecil  terdapat Disebelah kiri setangkai padi yang berwarna kuning. Buah padi bercelah 17 (tujuh belas) butir melambangkan tanggal 17. Disebelah kanan terdapat setangkai bunga kopi  berwarna putih dan buah kopi berwarna hijau, bunga kopi berwarna putih dan buah kopi berjumlah 8 (delapan) melambangkan bulan Agustus. Tulang daun kopi bagian atas berjumlah 4 (empat) garis. bagian bawah berjumlah 5 (lima) garis melambangkan tahun 1945, arti keseluruhannya HARI PROKLAMASI KEMERDEKAAN REPUBLIK INDONESIA ( 17 – 8 – 1945 ).\n" +
              "Garis gelombang 18 (delapan batas) melambangkan tanggal 18, Daun kopi berjumlah 11 (sebelas) helai melambangkan bulan November, Bunga kopi setiap tangkai berjumlah 6 (enam) dan buah kopi setiap tangkai berjumlah 8  (delapan).\n" +
              "Arti keseluruhannya adalah hari kelahiran Provinsi Bengkulu (18 November 1968).\n" +
              "Buah Padi dan Kopi mencerminkan hasil utama di bidang pertanian dan perkebunan.\n" +
              "Bunga raflesia Arnoldi sebagai suatu keistimewaan alam dearah Provinsi Bengkulu.\n" +
              "Bingkai berwarna emas yang mengitari Lambang melukiskan salah satu sumber mineral di daerah Provinsi Bengkulu.\n" +
              "Cerana melukiskan kebudayaan rakyat.\n" +
              "Rudus 2 (dua) buah melambangkan kepahlawanan.\n" +
              "Bintang besar dipertemuan ujung padi dan kopi melambangkan Ketuhanan Yang Maha Esa.",
      "Lambang Sumatera Selatan berbentuk perisai bersudut lima. Di dalamnya terdapat lukisan bunga teratai, batang hari sembilan, jembatan Ampera, dan gunung serta di atasnya terdapat atap rumah khas Sumatera Selatan.\n" +
              "Bunga teratai berkelopak lima berarti keberanian dan keadilan berdasarkan Pancasila. Batang hari sembilan adalah nama lain provinsi Sumatera Selatan yang memiliki sembilan sungai. Jembatan Ampera merupakan ciri yang menjadi kebanggaan masyarakat Sumatera Selatan. Gunung memiliki makna daerah pegunungan yang banyak terdapat di Sumatera Selatan. Sedangkan atap khas Sumatera Selatan yang berujung 17 dan 8 garis genting dan 45 buah genting merupakan simbol kemerdekaan RI pada tanggal 17 Agustus 1945",
      "Perisai Bersudut Lima, melambangkan Pancasila sebagai dasar Negara Kesatuan Republik Indonesia.\n" +
              "Kepulauan Bangka Belitung, melambangkan wilayah, masyarakat, sistem pemerintah, kebudayaan dan sumberdaya alam Propinsi Kepulauan Bangka Belitung.\n" +
              "Lingkaran Bulat Simetrikal, melambangkan kesatuan dan persatuan Provinsi Kepulauan Bangka Belitung dalam menghadapi segala tantangan di tengah – tengah peradaban dunia yang semakin terbuka.\n" +
              "Butir Padi berjumlah 27 buah melambangkan nomor dari Undang-undang pembentukan Provinsi Kepulauan Bangka Belitung, yaitu UU No.27 Tahun 2000,dan Buah Lada, berjumlah 31 buah melambangkan Kepulauan Bangka Belitung merupakan Provinsi ke 31 dalam Negara Kesatuan Republik Indonesia. Padi dan buah lada juga melambangkan kesejahteraan dan kemakmuran.\n" +
              "Balok Timah, melambangkan kekayaan alam (hasil bumi pokok) berupa timah yang dalam sejarah secara social ekonomis telah menopang kehidupan masyarakat Provinsi Kepulauan Bangka Belitung selama lebih dari 300 tahun. (diketemukan dan dikelola sejak tahun 1710 Mary Schommers dalam Bangka Tin)\n" +
              "Biru Tua dan Biru Muda (Dalam Perisai dan Lingkaran Hitam), melambangkan bahari dunia kelautan dari yang dangkal sampai yang terdalam. Menyiratkan lautan dengan segala kekayaan alam yang ada di atasnya, di dalam dan di dasar lautan yang dapat dimanfaatkan untuk sebesar – besarnya bagi kesejahteraan rakyat.\n" +
              "Putih (Tulisan), melambangkan keteguhan dan perdamaian.\n" +
              "Kuning ( Padi dan Semboyan), melambangkan ketentraman dan kekuatan.\n" +
              "Hijau (Pulau dan Lada), melambangkan kesuburan.\n" +
              "Hitam (Outline Lingkaran), melambangkan ketegasan.\n" +
              "Serumpun Sebalai, menunjukan bahwa kekayaan alam dan plularisme masyarakat Provinsi Kepulauan Bangka Belitung tetap merupakan kelurga besar komunitas (serumpun) yang memiliki perjuangan yang sama untuk menciptakan kesejahteraan , kemakmuran, keadilan dan perdamaian.\n" +
              "Untuk mewujudkan perjuangan tersebut, dengan budaya masyarakat melayu berkumpul, bermusyawarah, mufakat, berkerjasama dan bersyukur bersama-sama dalam semangat kekeluargaan (sebalai) merupakan wahana yang paling kuat untuk dilestarikan dan dikembangkan. Nilai- nilai universal budaya ini juga dimiliki oleh beragam etnis yang hidup di Bumi Propinsi Kepulauan Bangka Belitung.\n" +
              "Dengan demikian, Serumpun Sebalai mencerminkan sebuah eksistensi masyarakat Provinsi Kepulauan Bangka Belitung dengan kesadaran dan cita\u00ADcitanya untuk tetap menjadi keluarga besar yang dalam perjuangan dan proses kehidupannya senantiasa mengutamakan dialog secara kekeluargaan, musyawarah dan mufakat serta berkerja sama dan senantiasa mensyukuri nikmat Tuhan untuk mencapai masyarakat adil dan makmur.\n" +
              "Serumpun Sebalai, merupakan semboyan penegakan demokrasi melalui musyawarah dan mufakat.",
      "ARTI LAMBANG DAERAH PROVINSI LAMPUNG\n" +
              "1. Perisai Bersegi Lima : Kesanggupan mempertahankan cita dan membina pembangunan rumah-tangga Yang didiami oleh dua unsur golongan masyarakat untuk mencapai masyarakat makmur, adil berdasarkan pancasila .\n" +
              "2. Pita SAI BUMI RUWAI JURAI : Sai Bumi – Rumah tangga agung yang berbilik-bilik. Rua jurai – dua unsur golongan masyarakat yang berdiam di wilayah Propinsi Lampung.\n" +
              "3. Aksara Lampung berbunyi : “LAMPUNG’\n" +
              "4. Daun dan Buah lada : Daun =17, Buah Lada 8, Lada merupakan produk utama penduduk asli sejak masa lampau sehingga Lampung dikenal bangsa-bangsa Asia dan bangsa-bangsa Barat. Biji lada 64, Menunjukan bahwa terbentuknya Dati I Lampung tahun 1964.\n" +
              "5. Setangkai Padi : Buah padi 45. Padi merupakan produk utama penduduk migrasi sehingga terjadilah kehidupan bersama saling mengisi antara dua unsur golongan masyarakat sehingga terwujudnya Negara RI yang Diproklamirkan 17-08-1945.\n" +
              "6. Laduk : Golok masyarakat serba guna.\n" +
              "7. Payam : Tumbak pusaka tradisional.\n" +
              "8. Gung : Sebagai alat inti seni budaya, sebagai pemberitahuan karya besar dimulai, dan sebagai alat menghimpun masyarakat untuk bermusyawarah.\n" +
              "9. Siger : Mahkota perlambang keaggungan adat budaya dan tingkat kehidupan terhormat.\n" +
              "10. Payung : Jari payung 17, bagian ruas tepi 8, garis batas ruas 19, dan rumbai payung 45. Artinya payung agung yang melambangkan Negara RI Proklamasi 17-08-1945; dan sebagai payung jurai yang melambangkan Propinsi Lampung tempat semua jurai berlindung. Tiang dan bulatan puncak payung : satu cita membangun Bangsa dan Negara RI dengan Ridho Tuhan Yang Maha Esa.\n" +
              "11. Warna :\n" +
              "    * Hijau = dataran tinggi yang subur untuk tanamam keras dan tanaman musim.\n" +
              "    * Coklat = Dataran rendah yang subur untuk sawah dan ladang.\n" +
              "    * Biru = Kekayan sungai dan lautan yang merupakan sumber perikanan dan kehidupan para Nelayan.\n" +
              "    * Putih = Kesucian dan keikhlasan hati masyarakat.\n" +
              "    * Kuning (tua, emas dan muda) =keagungan dan kejayaan serta kebesaran cita masyarakat untuk membangun daerah dan Negaranya.",
      "Kubah Mesjid, melambangkan kultur masyarakat yang agamais.\n" +
              "Bintang bersudut lima, melambangkan Ketuhanan Yang Maha Esa.\n" +
              "Menara Mesjid Agung Banten, melambangkan semangat tinggi, yang berpedoman pada petunjuk Allah SWT.\n" +
              "Gapura Kaibon, melambangkan Daerah Propinsi Banten sebagai pintu gerbang peradaban dunia, perekonomian dan lalu lintas internasional menuju era globalisasi.\n" +
              "Padi berwarna kuning berjumlah 17 dan kapas berwarna putih berjumlah 8 tangkai, 4 kelopak berwana coklat, 5 kuntum bunga melambangkan Propinsi Banten merupakan daerah agraris, cukup sandang pangan. 17-8-45 menunjukkan Proklamasi Republik Indonesia.\n" +
              "Gunung berwarna hitam, melambangkan kekayaan alam dan menunjukkan dataran rendah serta pegunungan.\n" +
              "Badak bercula satu, melambangkan masyarakat yang pantang menyerah dalam menegakkan kebenaran dan dilindungi oleh hukum.\n" +
              "Laut berwarna biru, dengan gelombang putih berjumlah 17 melambangkan daerah maritim, kaya dengan potensi lautnya.\n" +
              "Roda gerigi berwarna abu-abu berjumlah 10, menunjukkan orientasi semangat kerja pembangunan dan sektor industri.\n" +
              "Dua garis marka berwarna putih, menunjukkan landasan pacu Bandara Soekarno Hatta.\n" +
              "Lampu bulatan kuning,  melambangkan pemacu semangat mencapai cita-cita.\n" +
              "Pita berwarna kuning, melambangkan ikatan persatuan dan kesatuan masyarakat Banten.\n" +
              "Semboyan “IMAN TAQWA” sebagai landasan pembangunan menuju Banten Mandiri, Maju dan Sejahtera.\n" +
              "Arti warna yang digunakan dalam simbol daerah:\n" +
              "Merah : melambangkan keberanian\n" +
              "Putih : melambangkan suci, arif dan bijaksana\n" +
              "Kuning : melambangkan kemuliaan, lambang kejayaan dan keluhuran\n" +
              "Hitam : melambangkan keteguhan, kekuatan dan ketabahan hati\n" +
              "Abu-abu : melambangkan ketabahan\n" +
              "Biru : melambangkan kejernihan, kedamaian dan ketenangan\n" +
              "Hijau : melambangkan kesuburan\n" +
              "Coklat : melambangkan kemakmuran\n" +
              "Sumber : Departemen Dalam Negeri",
      "Pintu Gerbang, adalah lambang Kekhususan Jakarta sebagai pintu keluar masuk kegiatan-kegiatan nasional dan hubungan internasional.\n" +
              "Tugu Nasional, adalah lambang Kemegahan, Daya Juang dan Cipta.\n" +
              "Padi dan Kapas, adalah lambang Kemakmuran.\n" +
              "Ombak Laut, adalah lambang Kota, Negeri Kepulauan.\n" +
              "Sloka “Jaya Raya”, adalah Slogan Perjuangan Jakarta.\n" +
              "Perisai Segilima, adalah melambangkan Pancasila.\n" +
              "Warna Emas pada pinggir Perisai, adalah lambang Kemuliaan Pancasila.\n" +
              "Warna Merah pada Sloka, adalah lambang Kepahlawanan.\n" +
              "Warna Putih pada Pintu Gerbang, adalah lambang Kesucian.\n" +
              "Warna Kuning pada Padi, Hijau, Putih dan Kapas, adalah lambang Kemakmuran dan Keadilan.\n" +
              "Warna Biru, adalah lambang angkasa bebas dan luas.\n" +
              "Warna Putih, adalah lambang alam laut yang kasih.\n",
      "Lambang Jawa Barat secara keseluruhan adalah sebuah perisai berbentuk bulat telur dengan hiasan pita di bagian bawahnya yang berisikan motto Jawa Barat. Kemudian di tengahnya ada gambar senjata khas dari Jawa Barat yaitu sebuah kujang.\n" +
              "Simbolika lambang\n" +
              "Makna bentuk dan motif yang terdapat dalam lambang ini ialah :\n" +
              "Bentuk bulat telur pada lambang Jawa Barat berasal dari bentuk perisai sebagai penjagaan diri.\n" +
              "Ditengah-tengah terlihat ada sebilah kujang. Kujang ini adalah senjata suku bangsa Sunda yang merupakan penduduk asli Jawa Barat. Lima lubang pada kujang melambangkan dasar negara Indonesia yaitu Garuda Pancasila.\n" +
              "Padi satu tangkai yang terdapat di sisi sebelah kiri melambangkan bahan makanan pokok masyarakat Jawa Barat sekaligus juga melambangkan kesuburan pangan, dan jumlah padi 17 menggambarkan tanggal Proklamasi Republik Indonesia.\n" +
              "Kapas satu tangkai yang berada di sebelah kanan melambangkan kesuburan sandang, dan 8 kuntum bunga menggambarkan bulan proklamasi Republik Indonesia.\n" +
              "Gunung yang terdapat di bawah padi dan kapas melambangkan bahwa daerah Jawa Barat terdiri atas daerah pegunungan.\n" +
              "Sungai dan terusan yang terdapat di bawah gunung sebelah kiri melambangkan di Jawa Barat banyak terdapat sungai dan saluran air yang sangat berguna untuk pertanian.\n" +
              "Petak-petak yang terdapat di bawah gunung sebelah kanan melambangkan banyaknya pesawahan dan perkebunan. Masyarakat Jawa Barat umumnya hidup mengandalkan kesuburan tanahnya yang diolah menjadi lahan pertanian.\n" +
              "Dam atau bendungan yang terdapat di tengah-tengah bagian bawah antara gambar sungai dan petak, melambangkan kegiatan di bidang irigasi yang merupakan salah satu perhatian pokok mengingat Jawa Barat merupakan daerah agraris. Hal ini juga melambangkan dam-dam yang berada di Jawa Barat seperti Waduk Jatiluhur.\n" +
              "Arti warna\n" +
              "Pada lambang Jawa Barat didapati beberapa warna yaitu: hijau, kuning, hitam, biru, merah dan putih. Warna-warna ini memiliki arti khusus.\n" +
              "Warna hijau artinya melambangkan kesuburan dan kemakmuran tanah Jawa Barat. Kuning artinya melambangkan keagungan, kemuliaan dan kekayaan. Hitam artinya melambangkan keteguhan dan keabadian. Biru artinya melambangkan ketentraman atau kedamaian. Merah artinya melambangkan keberanian. Putih artinya melambangkan kemurnian, kesucian atau kejujuran.\n" +
              "Motto Jawa Barat\n" +
              "Motto Jawa Barat adalah Gemah Ripah Repeh Rapih, yang merupakan sebuah frasa berasal dari bahasa Sunda. Kata gemah-ripah dan repeh-rapih merupakan kata majemuk yang mempunyai arti sebagai berikut :\n" +
              "Gemah-ripah : subur makmur, cukup sandang dan pangan.\n" +
              "Repeh-rapih : rukun dan damai atau aman sentosa.\n" +
              "Arti bebas dari motto daerah Jawa Barat secara keseluruhan ialah menyatakan bahwa Jawa Barat merupakan daerah yang kaya raya dan subur makmur serta didiami oleh banyak penduduk yang hidup rukun dan damai.",
      "Bentuk Kundi Amarta yang berbentuk dasar segi lima melambangkan dasar falsafah Negara yakni Pancasila.\n" +
              "Laut bergelombang melambangkan kehidupan masyarakat di Jawa Tengah.\n" +
              "Candi Borobudur melambangkan Daya Cipta yang besar Tradisi yang baik dan Nilai-nilai Kebudayaan yang khas dari Rakyat Jawa Tengah.\n" +
              "Gunung Kembar mempunyai arti idiil bersatunya rakyat dan  Pemerintah Daerah.\n" +
              "Perpaduan antara Laut dan Gunung Kembar dengan latar belakangnya yang hijau menggambarkan keadaan alamiah Daerah Jawa Tengah dengan bermacam-macam kekayaan alamnya sebagai kehidupan dan penghidupan Rakyat Jawa Tengah.\n" +
              "Bambu Runcing melambangkan Kepahlawanan dan Keksatriaan Rakyat Jawa Tengah.\n" +
              "Bintang bersudut Lima         berwarna kuning emas yang disebut juga “Nur Cahaya” melambangkan kepercayaan Ketuhanan Yang Maha Esa dari Rakyat Jawa Tengah.\n" +
              "Padi dan Kapas melambangkan Kemakmuran Rakyat JawaTengah.\n" +
              "Umbul-umbul Merah Putih melambangkan Daerah Jawa Tengah sebagai bagian dari Negara Kesatuan Republik Indonesia.\n" +
              "Perpaduan antara Bintang, Padi dan Kapas melambangkan hari depan Rakyat Jawa Tengah menuju ke Masyarakat Adil dan Makmur yang diridloi oleh Tuhan Yang Maha Esa.\n" +
              "Perpaduan antara Bulir Padi yang berbiji 17, Bambu Runcing yang beruas 8 serta Ranting Kapas yang berdaun 4 dan berbuah 5 merupakan rangkaian angka-angka yang mewujudkan saat yang bersejarah serta keramat “17 Agustus 1945” yang wajib kita agungkan.",
      "Landasan Idiil Pancasila, digambarkan dengan bintang emas bersegi lima (Ketuhanan Yang Maha Esa), tugu dan sayap mengembang (Kemanusiaan yang adil dan beradab), bulatan-bulatan berwarna merah dan putih (Persatuan Indonesia), ombak, batu penyangga saka guru/tugu (Kerakyatan yang dipimpin oleh hikmah kebijaksanaan dalam permusyawaratan perwakilan), dan padi-kapas (Keadilan sosial bagi seluruh rakyat Indonesia).\n" +
              "17 bunga kapas, 8 daun kapas dan 45 butir padi, adalah lambang Proklamasi Kemerdekaan Republik Indonesia.\n" +
              "Bulatan (golong) dan tugu berbentuk silinder (giling), adalah lambang tata kehidupan gotong royong.\n" +
              "Nilai-nilai keagamaan, pendidikan dan kebudayaan, digambarkan dengan bintang emas bersegi lima dan sekuntum bunga melati di puncak tugu. Bunga melati dan tugu yang mencapai bintang menggambarkan rasa sosial dengan pendidikan dan kebudayaan luhur serta ketaqwaan kepada Tuhan Yang Maha Esa. Bunga melati yang sering digunakan dalam upacara sakral mengandung nilai seni, budaya dan religius.\n" +
              "Warna-warna merah putih yang dominan, serta tugu yang tegak, adalah lambang semangat perjuangan dan kepahlawanan tatanan “mirong?? pada hiasan saka guru sebagai hiasan spesifik Yogyakarta, adalah lambang semangat membangun.\n" +
              "Sejarah terbentuknya Daerah Istimewa Jogjakarta dilukiskan dengan sayap mengembang berbulu 9 helai di bagian luar dan 8 helai di bagian dalam, menggambarkan peranan Sri sultan Hangmengkubuwono IX dan Sri Paku alam VIII, yang pada tanggal 5 September 1945 mengeluarkan amanatnya untuk menggabungkan daerah Kasultanan Jogjakarta dan Kadipaten Pakualaman menjadi Daerah Istimewa Jogjakarta.\n" +
              "Warna hijau tua dan hijau muda, adalah lambang keadaan alam Daerah Istimewa Jogjakarta dilukiskan dengan karena ada bagian ngarai yang subur dan ada daerah perbukitan yang kering.\n" +
              "Candrasengkala / Suryasengkala terbaca dalam huruf jawa adalah lambang rasa Suka Ngesthi Praja, Yogyakarta Trus Mandhiri, yang artinya dengan berjuang penuh rasa optimisme membangun Daerah Istimewa Jogjakarta untuk tegak selama-lamanya: rasa (6) suka (7) ngesthi (8) praja (1) tahun jawa 1876, Jogja (5) karta (4) trus (9) mandhiri (1) tahun masehi 1945, yaitu tahun de facto berdirinya Daerah Istimewa Jogjakarta.\n" +
              "Tugu yang dilingkari dengan padi dan kapas, adalah lambang persatuan, adil dan makmur.\n" +
              "Ukiran, sungging dan prada yang indah, adalah lambang nilai-nilai peradaban yang luhur digambarkan secara menyeluruh berwujud.",
      "Daun lambang bentuk perisai, adalah lambang keamanan dan ketentraman serta kejujuran melambangkan dasar dan keinginan hidup rakyat Jawa Timur yang merupakan daerah yang termasuk aman.\n" +
              "Bintang dengan warna kuning emas, adalah lambang Ke Tuhanan Yang Maha Esa, bersudut lima dan bersinar lima adalah melambangkan Pancasila merupakan dasar dan falsafah Negara yang senantiasa dijunjung tinggi dan selalu menyinari jiwa rakyatnya (dalam hal ini rakyat Jawa Timur) khususnya jiwa Ke Tuhanan Yang Maha Esa.\n" +
              "Tugu Pahlawan, adalah lambang kepahlawanan, untuk melukiskan sifat dan semangat kepahlawanan rakyat Jawa Timur (khususnya Surabaya). Dalam mempertahankan kedaulatan dan wilayah tanah airnya.\n" +
              "Gunung berapi yang selalu mengepulkan asap, adalah lambang keteguhan dan kejayaan tekad Jawa Timur dengan semangat dinamis, revolusioner pantang mundur dalam menyelesaikan revolusi menuju cita-cita rakyat adil dan makmur, selain itu juga menggambarkan bahwa wilayah Jawa Timur mempunyai banyak gunung-gunung berapi.\n" +
              "Pintu gerbang (dari Candi) dengan warna abu-abu, adalah lambang cita-cita perjuangan serta keagungan khususnya Jawa Timur di masa silam yang masih nampak dan sebagai lambang batas perjuangan masa lampau dengan masa sekarang, yang semangatnya tetap berada di tiap-tiap patriot Indonesia yang berada di Jawa Timur.\n" +
              "Sawah dan ladang, yang dilukiskan pada bagian-bagian dengan warna kuning dan hijau, adalah lambang kemakmuran yaitu bahwa Jawa Timur memiliki sawah dan Iadang yang merupakan sumber dan alat untuk mencapai kemakmuran.\n" +
              "Padi dan kapas, adalah lambang sandang pangan, yang menjadi kebutuhan pokok rakyat sehari-hari, gambar padi berbutir 17 buah, sedangkan kapas tergambar 8 buah, melambangkan saat-\u00ADsaat keramat bagi bangsa Indonesia yaitu tanggal 17 – 8 – 1945.\n" +
              "Sungai yang bergelombang, menunjukkan bahwa Jawa Timur mempunyai banyak sungai yang mengalir untuk mengairi sawah dan sumber kemakmuran yang lainnya di Jawa Timur.\n" +
              "Roda dan rantai, melukiskan situasi Jawa Timur pada masa sekarang yang sudah mulai pesat pembangunan pabrik-pabrik dan lain-lain dalam rangka pembangunan Jawa Timur di bidang industri, dan melambangkan pula tekad yang tak kunjung padam serta rasa ikatan persahabatan yang biasa ditunjukkan oleh rakyat Jawa Timur kepada pendatang dan peninjau dari manapun.\n" +
              "Pita berisikan tulisan Jawa Timur, menunjukkan lambang daerah Provinsi Jawa Timur.\n" +
              "Pita dasar dengan warna putih berisi tulisan JER BASUKI MAWA BEYA, menunjukkan motto Jawa Timur yang mengandung makna bahwa untuk mencapai suatu kebahagiaan diperlukan pengorbanan.",
      "Lambang Bali berbentuk segi lima dan berlukiskan Bali Dwipa Jaya yang berarti Jayalah Pulau Bali. Di dalamnya terdapat gambar bintang, Candi Pahlawan Margarana, Candi Bentar, rantai, kipas, bunga teratai, padi dan kapas.\n" +
              "Bintang segi lima, melambangkan Ketuhanan Yang Maha Esa. Candi Pahlawan Margarana, menggambarkan jiwa kepahlawanan rakyat Bali. Candi Bentar, lambang keagamaan yang agung rakyat Bali. Rantai melambangkan persatuan. Kipas melambangkan kebudayaan Bali. Bunga teratai lambang Singgasana Batara Siwa. Sedangkan padi dan kapas melambangkan kemakmuran.",
      "Perisai, sebagai bentuk luar atau latar belakangnya, melambangkan kebudayaan/ kesenian Rakyat Propinsi Nusa Tenggara Barat dan juga melambangkan jiwa kepahlawanannya. Tulisan berbunyi Nusa Tenggara, ialah nama daerah yang berpemerintahan sendiri yang terdiri dari Pulau Lombok dan Sumbawa. Rantai, yang terdiri dari 4 berbentuk bundar dan yang 5 berbentuk segi empat : melambangkan kemerdekaan Republik Indonesia tahun 1945. Butiran padi sebanyak 58 butir, daun Kapas 17 dan Bunga Kapas 12 kuntum, yang kesemuanya adalah melambangkan kelahiran Provinsi Nusa Tenggara Barat tanggal 17 Desember 1958. Bintang Lima, melambangkan 5 sila dari pada Pancasila. Gunung yang berasap, menunjukkan Gunung Rinjani, Gunung Berapi yang tertinggi di Pulau Lombok. Menjangan, menunjukkan binatang yang banyak sekali terdapat di Pulau Sumbawa. Kubah, melambangkan penduduk Provinsi Nusa Tenggara Barat yang taat dan patuh melaksanakan perintah-perintah agamanya. Warna Biru, melambangkan Kesetiaan Daerah Nusa Tenggara Barat pada perjuangan bangsa Indonesia, serta kesetiaan kepada pemerintah RI. Warna Hijau, melambangkan kemakmuran, cita-cita kita semua dan juga tanda kesuburan dari daerah Provinsi Nusa Tenggara Barat. Warna Putih, melambangkan Kesucian, keluhuran rakyat Provinsi Nusa Tenggara Barat yang senantiasa taat, bertaqwa kepada Tuhan Yang Maha Esa yang langsung pula menjiwai rakyatnya, bercita-cita luhur dan suci serta tindak tanduk baik rohaniah maupun jasmaniah berdasarkan kesucian. Warna Kuning, melambangkan Kejayaan, keberanian berjuang atas dasar kesucian dan akan membawa kita pada kejayaan. Warna Hitam, melambangkan Abadi, kejayaan berdasarkan atas landasan yang luhur akan abadi. Warna Merah, melambangkan Keberanian, kepahlawanan berjiwa hidup dan dinamis untuk menegakkan kebenaran dan keadilan.",
      "Lambang Nusa Tenggara Timur berbentuk perisai dengan lima sudut yang memiliki arti perlindungan rakyat, juga berarti lima sila Pancasila. Dalam perisai tergambar bintang, Komodo, padi, kapas, tombak dan pohon beringin. Bintang melambangkan keagungan Tuhan Yang Maha Esa.\n" +
              "Komodo dalam lambang adalah satu-satunya reptil prasejarah yang hingga kini masih dilindungi. Binatang purba ini merupakan reptil raksasa yang oleh dunia dinyatakan dilindungi karena jenis hewan ini hanya terdapat di NTT, tepatnya di Pulau Komodo. Banyak wisatawan dari seluruh dunia datang ke pulau ini hanya untuk melihat Komodo.\n" +
              "Padi dan kapas melambangkan kemakmuran. Tombak berarti keagungan dan kejayaan. Sedangkan pohon beringin merupakan persatuan dan kesatuan yang tetap terpelihara. Hari terbentuknya provinsi Nusa Tenggara Timur dilukiskan melalui jumlah padi (14) dan tahun 1958 tertera langsung pada sudut bawah lambang.",
      "Lambang Daerah Provinsi Kalimantan Barat sebagaimana diatur dalam Peraturan Daerah TK I Kalimantan Barat No 4 Tahun 1964, Lembaran Daerah Provinsi Kalimantan Barat No. 2 Tahun 1967 tanggal 23 Mei 1967.\n" +
              "Lambang secara keseluruhan bersudut lima Perisai, Mandau dan Keris dengan satu garis melintang di tengahnya.\n" +
              "Bersudut lima berarti Pancasila, dimaksudkan Kalimantan Barat adalah bagian dari wilayah Negara Kesatuan Republik Indonesia yang bersendikan Pancasila.\n" +
              "Warna dasar hijau muda adalah lambang kesuburan.\n" +
              "Perisai, Mandau dan Keris adalah lambang pusaka dan kebudayaan warisan leluhur masyarakat Kalimantan Barat.\n" +
              "Padi dan Kapas bersimpul pita dengan sudut empat adalah lambang kemakmuran yang dijiwai oleh semangat catur karsa (empat kehendak) yaitu : kesungguhan, kejujuran, gotong-royong dan kekeluargaan.\n" +
              "Jumlah unsur kapas (17), nyala api (8), padi (45) adalah lambang lahirnya Republik Indonesia 17 Agustus 1945.\n" +
              "Kobaran api dalam tungku adalah lambang semangat perjuangan yang tak kunjung padam.\n" +
              "Tulisan AKCAYA adalah lambang Tak Kunjung Binasa atau dengan keuletan yang pantang menyerah.",
      "Lambang Daerah Provinsi Kalimantan Tengah berbentuk segilima, warna dasar\n" +
              "Merah dan di tengah lambang berwarna hijau, dengan moto ISEN MULANG (Pantang Mundur).\n" +
              "Segi lima, adalah lambang falsafah hidup bangsa Indonesia adalah Pancasila.\n" +
              "Merah, adalah lambang keberanian, keperkasaan dalam menghadapi berbagai tantangan yang memecah belah persatuan dan kesatuan.\n" +
              "Hijau, adalah lambang kesuburan bumi Tanbun Bungai dengan berbagai kekayaan alam yang terkandung di dalamnya.\n" +
              "Talawang (Perisai), adalah lambang alat penangkis serangan musuh yang melambangkan kewaspadaan dan ketahanan masyarakat terhadap anasir – anasir yang merusak baik dari luar maupun dari dalam.\n" +
              "Belanga (Guci), adalah lambang barang pusaka yang bernilai tinggi, yang melambangkan potensi kekayaan alam Kalimantan Tengah.\n" +
              "Tali Tengang (Tali yang terbuat dari kulit kayu), adalah lambang kekokohan dan kekompakan yang tidak mudah di cerai beraikan.\n" +
              "Kapas dan Parei (Kapas dan Padi), adalah lambang bahan sandang pangan yang melambangkan kemakmuran bangsa Indonesia pada umumnya dan rakyat Kalimantan Tengah pada khususnya.\n" +
              "Bintang Lapak Lime ( Bintang Segi Lima), adalah lambang Pancasila sebagai Dasar Negara Republik Indonesia.\n" +
              "Kambang Kapas (Bunga Kapas) 17 buah, Dawen (daun) 8 lembar dan Bua Parei (Buah Padi) 45 butir adalah lambang Hari Proklamasi Kemerdekaan RI 17 Agustus 1945.\n" +
              "Burung Tingang (Burung Enggang), adalah lambang pertanda kemakmuran dan kedinamisan serta tekat rakyat Kalimantan Tengah untuk ikut serta secara aktif pemeliharaan dan pelestarian lingkungan.\n" +
              "Mandau dan sipet (Parang dan Sumpit) adalah pasangan senjata yang di buat oleh nenek moyang Suku Dayak Kalimantan Tengah yang digunakan untuk bekerja, berburu dan menghadapi serangan musuh.\n" +
              "Garantung (gong) adalah lambang bahwa masyarakat Kalimantan Tengah menjunjung tinggi kesenian, kebudayaan, berpandangan optimis dalam menghadapi berbagai tugas dalam suasana gotong royong sebagai lambang persatuan dan kesatuan.",
      "Lambang Daerah Provinsi Kalimantan Selatan berbentuk “PERISAI” dengan warna merah dan hijau, bergaris sisi dengan warna kuning.\n" +
              "Perisai adalah alat penangkis dan bertahan yang melambangkan kewaspadaan dan kesanggupan mempertahankan diri;\n" +
              "Warna Merah, melambangkan keberanian dan kepahlawanan yang gagah perkasa, berjiwa hidup dan dinamis guna menegakkan kebenaran perjuangan yang dipimpin oleh hikmah kebijaksanaan dalam menuju “Masyarakat Adil dan Makmur yang Diridhai Allah”;\n" +
              "Warna Hijau, melambangkan kesuburan dan harapan bagi Daerah Tingkat I Kalimantan Selatan dihari yang akan datang;\n" +
              "Warna Kuning, pada sisi perisai, melambangkan bahwa penduduk Kalimantan mempunyai Keperibadian dan kerohanian yang luhur dengan penuh Keyakinan dan kepercayaan kepada Tuhan Yang Maha Esa.\n" +
              "Intan Berwarna Putih Berkilap Memancar\n" +
              "Intan, melambangkan penghasilan Daerah Kalimantan Selatan yang sudah terkenal karena mempunyai mutu dan nilai yang sangat tinggi, yang merupakan sumber mata pencaharian penduduk Daerah Kalimantan Selatan.\n" +
              "Warna Putih Berkilap Memancar, melambangkan bahwa penduduk Kalimantan Selatan kalau dipimpin dengan sungguh-sungguh akan sanggup mencapai kecerdasan dan kemajuan serta sanggup pula melaksanakan segala pembangunan menuju kepada kemuliaan dan keagungan Bangsa Indonesia.\n" +
              "Bintang Berwarna Kuning Emas\n" +
              "Melambangkan ke-Tuhanan Yang Maha Esa dan perlambang keyakinan bahwa Tuhan mengetahui segala-galanya tanpa ada yang tersembunyi bagi-Nya;\n" +
              "Rumah Banjar Berwarna Hitam\n" +
              "Rumah, berbentuk bangunan spesifik Kalimantan Selatan asli, melambangkan suatu unsur kebudayaan yang dapat dibanggakan.\n" +
              "Warna Hitam, melambangkan bahwa penduduk Kalimantan Selatan mempunyai kebulatan tekad dan keunggulan menuju kearah pelaksanaan Pembangunan Nasional Semesta Berencana.\n" +
              "Buah Padi dan Batang Karet\n" +
              "Melambangkan bagian terbesar dari penghasilan dan sumber kehidupan bagi penduduk Kalimantan Selatan.\n" +
              "Buah padi sebanyak 17 [tujuh belas] buah, intan dengan 8 [delapan] pancaran dan Batang Karet sebanyak 1 [satu] pohon dengan bergaris 9 [sembilan] yang tersusun 4 [empat] di sebelah kiri dan 5 [lima] di sebelah kanan adalah merupakan susunan angka 17-8-1945, angka ini melambangkan bahwa penduduk Kalimantan Selatan tetap setia dan tetap Teguh mendukung Proklamasi 17-8-1945.\n" +
              "Pita Warna Putih\n" +
              "Melambangkan bahwa penduduk Kalimantan Selatan sanggup mengikat apa yang dirasakan kesucian dan keikhlasan hati untuk berbuat secara jujur dan bertanggung jawab dengan disertai semanggat kerja sama dan gotong royong.\n" +
              "Tulisan berupa semboyan “WAJA SAMPAI KAPUTING”, melambangkan bahwa penduduk Kalimantan Selatan telah tekun dalam bekerja melaksanakan segala sesuatunya dengan penuh rasa kesanggupan dan konsekwen tanpa berhenti ditengah jalan.",
      "Lambang Perisai bersudut lima adalah lambang alat pelindung dalam mencapai cita-cita revolusi 17 Agustus 1945.\n" +
              "Bintang bersudut lima adalah lambang Pancasila sebagai dasar falsafah Negara Republik Indonesia.\n" +
              "Tulisan Kalimantan Timur adalah Provinsi Kalimantan Timur.\n" +
              "Telabang, mandau dan sumpitan adalah lambang kesiapsiagaan dan kemampuan.\n" +
              "Lingkaran dengan untaian minyak dan damar adalah lambang kekayaan alam.\n" +
              "Lilitan rotan yang tak terputus-putus sebanyak 24 lilitan adalah lambang kesatuan dan kesatuan serta saat terbentuknya Provinsi Kalimantan Timur tanggal 1 Januari 1957 (1+1+1+9+5+7).\n" +
              "Jumlah delapan untaian minyak, delapan untaian damar, dan satu tetesan akhir adalah tanggal proklamasi kemerdekaan. (8+8+1=17).\n" +
              "Untaian minyak dan damar masing-masing delapan tetesan adalah lambang bulan proklamasi kemerdekaan.\n" +
              " 4 titik terukir diujung mandau dan 5 lilitan pada ujung sumpitan adalah lambang tahun proklamasi kemerdekaan.\n" +
              "Tulisan “ruhui rahayu” di atas guci  berarti cita-\u00ADcita dan tujuan rakyat kalimantan timur dalam mencapai masyarakat bahagia, adil dan makmur, aman tentram yang di ridhoi oleh Allah SWT.\n" +
              "warna hijau                        = kemakmuran,kesuburan\n" +
              "warna kuning emas          =keluruhan,keagungan\n" +
              "warna kuning                     =kejayaan\n" +
              "warna merah                     =keberanian\n" +
              "warna putih                       =kesucian\n" +
              "warna hitam                      =kesungguhan",
      "Logo Daerah terdiri atas 9 (sembilan) bagian, yaitu :\n" +
              "Tulisan Kalimantan Utara\n" +
              "Bintang\n" +
              "Gerbang perbatasan merah putih\n" +
              "Perisai dengan ukiran khas budaya Dayak, Bulungan dan Tidung, dengan parang dan tombak bersilangan didepannya\n" +
              "Padi dan kapas yang diikat dengan pita, jumlah padi 22 butir, pita 4 (empat) simpul, dan kapas 13 buah\n" +
              "Laut bergelombang\n" +
              "4 (empat) garis gelombang yang menggambarkan sungai\n" +
              "Dibagian bawah ada tulisan “BENUANTA” diatas pita warna putih kuning\n" +
              "Bentuk keseluruhan Logo Daerah, bersudut 5 (lima) yang mengandung arti dan makna berazaskan falsafah Negara Pancasila, dengan warna dasar biru muda/biru langit yang melambangkan keindahan, kesejahteraan, kedamaian, kewibawaan.\n" +
              "Warna Logo Daerah mempunyai arti :\n" +
              "Warna Putih, melambangkan kesucian, keikhlasan, kejujuran;\n" +
              "Warna Biru, melambangkan keindahan, kesejahteraan, kedamaian, kewibawaan\n" +
              "Warna Hijau, melambangkan kesuburan, kemakmuran, ketaqwaan, pertembuhan\n" +
              "Warna Hitam, melambangkan ketegasan, perlindungan, ketokohan\n" +
              "Warna Merah, melambangkan keberanian, kekuatan\n" +
              "Warna Kuning, melambangkan kemuliaan, keagungan, kesuksesan.\n" +
              "Makna Logo Daerah :\n" +
              "Tulisan KALIMANTAN UTARA, melambangkan identitas Provinsi Kalimantan Utara sebagai daerah Otonomi Baru\n" +
              "Bintang, melambangkan ketuhanan Yang Maha Esa\n" +
              "Gerbang Perbatasan Warna Merah Putih, melambangkan bahwa Provinsi Kalimantan Utara merupakan wilayah yang berada di perbatasan Negara Republik Indonesia\n" +
              "Perisai dengan ukiran khas budaya Dayak, Bulungan dan Tidung, dengan parang dan tombak bersilang, melambangkan budaya masyarakat di Kalimantan Utara terdapat suku dan budaya yang beragam yang hidup saling berdampingan rukun, bersatu dan harmoni, penuh semangat pantang mundur untuk membangun dan selalu siap dalam menghadapi tantangan yang dating dari luar maupun dari dalam\n" +
              "Padi dan Kapas, melambangkan kesejahteraan dan kemakmuran yang merupakan tujuan seluruh masyarakat Provinsi Kalimantan Utara\n" +
              "Laut bergelombang, melambangkan potensi sumber daya alam yang ada di lautan yang dimiliki oleh Provinsi Kalimantan Utara, gelombang melambangkan kehidupan yang dinamis\n" +
              "4 (empat) buah sungai berwarna putih, bermakna sebagai urat nadi perekonomian dari 4 (empat) yang menghubungkan masyarakat di pedalaman dengan daerah pantai dan perbatasan (suangai kayan, sungai sesayap, sungai sembakung dan sungai sebuku)\n" +
              "Tulisan motto “BENUANTA” diatas pita kuning, merupakan motto/semboyan dari Provinsi Kalimantan Utara yaitu Kalimantan Utara adalah wilayah kita/daerah kita yang harus dibangun dan dipertahankan untuk kesejahteraan masyarakatnya.",
      "Lambang Provinsi Sulawesi Utara berbentuk segilima sama sisi melambangkan “Pancasila”  sebagai dasar dan falsafah hidup Bangsa dan Negara Indonesia.\n" +
              "Bentuk  warna dan bagian-bagian lambang:\n" +
              "Warna dasar biru langit, sisi luar berwarna kuning.\n" +
              "Sebelah kanan terdapat buah pala terbuka, berjumlah 8 (delapan) buah, kulitnya berwarna kuning, biji pala berwarna merah, dirangkaikan dengan buah cengkih 17 (tujuh betas) buah yang warnanya merupakan perpaduan Warna hijau kemuning dan warna hijau kecoklat-coklatan.Angka-angka pada cengkeh 17 (tujuh betas) buah, pala 8 (delapan) buah, dan padi 45 (empat puluh lima) butir adalah simbol yang menunjukkan “Hari Proklamasi Kemerdekaan Negara Republik Indonesia” yaitu 17-8-1945.\n" +
              "Ditengah-tengah lingkaran buah padi, cengkeh dan pala terdapat 23 (dua puluh tiga) untaian biji jagung yang berbentuk bulatan, terdapat 1 (satu) pohon kelapa berdaun 9 (sembilan) mempunyai akar 6 (enam) dan di bawah pohon kelapa terdapat 4 (empat) buah bibit kelapa melambangkan berdirinya Provinsi Sulawesi Utara tanggal 23 September 1964.\n" +
              "Pohon kelapa, padi, pala, jagung dan cengkeh menggambarkan keseluruhan kekayaan utama yang menjadi sumber hidup rakyat di daerah ini.\n" +
              "Dibagian bawah dari pohon kelapa terdapat pita putih berbaris merah dengan Warna hitam (warna bayangan) bertuliskan “Sulawesi Utara” dengan Warna merah.\n" +
              "Warna emas/orange melambangkan kekayaan, keagungan.\n" +
              "Warna biru/hijau melambangkan kemakmuran, kesuburan.\n" +
              "Warna kuning melambangkan kesejahteraan, kebesaran dan keluhuran.\n" +
              "Warna merah melambangkan keberanian, semangat yang menyala-nyala dan kecintaan kepada  Negara dan Agama.\n" +
              "Warna putih melambangkan kesucian, kedamaian.\n" +
              "Warna coklat melambangkan kecintaan kepada Tanah Air.\n" +
              "Warna hitam melambangkan kokoh, kuat, teguh dan kekal.\n" +
              " Warna ungu melambangkan kebanggaan.",
      "Lambang Sulawesi Barat berbunyi ‘Mellete Diatonganan’, yang berarti ‘Meniti di Atas Kebenaran’. Di tengah lambangnya, terdapat perahu sande. Arah perahu ke depan dengan layar di sebelah kanan, bermakna bahwa Sulbar mulai berlayar ke depan dengan arah yang benar (kanan). Di bagian atas, tertancap ‘Doe Pakka’ (Trisula) di gunung, melambangkan kepribadian orang Mandar, yang berarti keberanian, kejujuran, dan keadilan. Bingkai lambang Sulbar diambil dari bentuk dasar ‘balenga lita’ (panci yang terbuat dari tanah). Bagian atasnya merupakan simbol ‘sulapa appe’ (empat mata angin) yang di dalamnya bertuliskan Sulawesi Barat",
      "1.Lambang Daerah Provinsi Gorontalo pada bagian luar berbentuk atau jantung yang memberi makna kesetiaan sebagai pelindung kehidupan rakyat Gorontalo.\n" +
              "2.Lambang Daerah Provinsi Gorontalo pada bagian dalam berbentuk bulat lonjong atau bulat telur yang memberi makna adanya gaga san, ide atau cita cita yang indah, yang kelak menetas menjadi se suatu kesejahteraan hidup rakyat Gorontalo.\n" +
              "3.Lambang Daerah Provinsi Gorontalo dengan bentuk dalam yang menampakkan keserasian formasi gambar yang terdiri dari warna putih di tengah dan diikuti oleh posisi padi bintang, kapas rantai memberi makna adanya keteraturan adat, agama, hukum dalam semua pola kehidupan masyarakat.\n" +
              "4.Lambang Daerah Provinsi Gorontalo dapat dibuat dalam berbagai ukuran sehingga dapat disesuaikan dengan kebutuhan dimana lambang tersebut ditempatkan.\n" +
              "5.Lambang Daerah Provinsi Gorontalo memiliki nuansa Global :\n" +
              "Warna biru keunguan adalah warna yang memberi makna tenang, setia dan selalu ingin mempertahankan kebenaran dan harapan masa depan yang cerah.\n" +
              "Model pohon kelapa yang melengkung memberi makna gerak inamis dan tidak diam tetapi selalu berbuat untuk masa de pan.\n" +
              "Sayap maleo yang mengembang memberi makna dinamika siap untuk tinggal landas dan siap bersaing.\n" +
              "Buku yang terbuka melambangkan keinginan masyarakat untuk untuk siap meraih prestasi dalam Ilmu Pengetahuan dan Tek nologi serta Iman dan Taqwa secara terus menerus.\n" +
              "Bintang mengandung makna global jika dikaitkan dengan cita cita yang tinggi yaitu “Gantungkan cita cita setinggi bintang di langit”\n" +
              "Pita mempunyai makna keinginan masyrakat Gorontalo untuk menyerap, merekam dan memiliki ilmu pengetahuan dan tek nologi.\n" +
              " 6.Lambang Daerah Gorontalo memiliki nuansa Nasional :\n" +
              "Padi dan Kapas yang mengandung makna kemakmuran dan kesejahteraan seperti pada Pancasila.\n" +
              "Rantai mempunyai makna adanya pengakuan persatuan dan kesatuan dalam kerangka Bhineka Tunggal Ika.\n" +
              " 7.Lambang daerah Gorontalo memiliki nuansa Lokal :\n" +
              "Bintang adalah lambang keagamaan, sehingga selaras dengan filosofi “Adat bersendikan syara, syara bersendikan Kitabullah“.\n" +
              "Benteng.\n" +
              "Rantai mempunyai makna adanya pengakuan persatuan dan kesatuan dalam kerangka Bhineka Tunggal Ika.\n" +
              " 8.Pemaknaan warna dan simbol simbol lainnya dalam lambang\n" +
              "Simbol rantai yang memberi makna pada peristiwa patriotik\n" +
              ". Rantai yang berjumlah 23 butir melambangkan tanggal 23 Januari\n" +
              ". Kapas yang berjumlah 19 buah dan padi berjumlah 42 butir melambangkan tahun 1942\n" +
              "Sayap maleo yang berjumlah 16 helai melambangkan lahirnya Provinsi Gorontalo pada tanggal 16 Februari 2000\n" +
              "Warna :\n" +
              ". Hijau mempunyai makna kesuburan\n" +
              ". Kuning Mempunyai makna keagungan dan Kemuliaan\n" +
              ". Putih bermakna Kesucian dan Keluhuran\n" +
              ". Merah mempunyai makna keberanian dan perjuangan",
      "BENTUK: Bentuk dari Lambang Daerah Provinsi Sulawesi Tengah adalah simbol bentuk jantung, melambangkan bahwa isi dari pada lambang ini tertanam dan bersumber dari hati rakyat Sulawesi Tengah.\n" +
              "WARNA: Warna yang digunakan pada dasar Lambang Daerah Provinsi Sulawesi tengah ialah : Biru Langit dan Warna Kuning Emas pada Bintang dan Buah padi dan Warna Biru Laut pada gelombang.\n" +
              "Warna Biru Melambang kesetiaan (pada daerah,tanah air dan cita-cita) dan juga melambangkan cita-cita yang tinggi.\n" +
              "Warna Kuning melambangkan Kekayaan, keagungan dan keluhuran budi.\n" +
              "Warna Merah pada tulisan “Sulawesi Tengah” dengan dasar warna putih melambangkan keberanian dan kesatrian yang didasarkan atas hati yang suci, keiklasan dan kejujuran.\n" +
              "Warna Hijau pada buah dan daun kelapa serta kelopak kapas, melambangkan kesuburan, dan kemakmuran dengan bumi yang subur kita menuju pada kemakmuran.\n" +
              "Warna Coklat pada batang kelapa melambangkan ketenangan.\n" +
              "GAMBAR:\n" +
              "Lambang Daerah Sulawesi Tengah dilukiskan dengan pohon kelapa yang disamping merupakan modal untuk daerah ini, juga memberikan perlambangan :\n" +
              "Kesediaan untuk mengorbankan segala-galanya untuk mencapai cita-cita.\n" +
              "Seluruh bagian pohon kelapa sangat berguna bagi kehidupan manusia.\n" +
              "Ketenangan dan tawakal dalam mengadapi segala tantangan.\n" +
              "Pucuk yang lurus menunjuk bintang melambangkan keteguhan hati dalam usaha mencapai cita- cita hidup.\n" +
              "Lambang   Daerah Provinsi Sulawesi Tengah dijiwai oleh pancasila yang jelas terlukis pada bintang segi lima daun kelapa lima helai, dan buah kelapa lima buah. lebih jauh hal ini memberikan pengertian bahwa dengan jiwa pancasila, diatas relnya /jalannya pancasila, kita hendak mencapai cita-cita\n" +
              "Negara kebangsaan yang adil dan makmur diridhoi oleh Tuhan Yang Maha Esa.\n" +
              "Garis gelombang dua buah dengan masing-masing enam dan empat jalur gelombang memberikan pengertian akan sifat maritim dari daerah Sulawesi\n" +
              "Tengah dan disamping kekayaan alam kita, laut disekitarnya merupakan modal besar pula dalam usaha mendatangkan kemakmuran di Sulawesi Tengah.\n" +
              "Padi dan Kapas merupakan lambang umum kemakmuran.jumlah padi dan kapas masing-masing Sembilan belas dan tiga belas buah gerigi buah kapas ada empat buah.\n" +
              "Angka 13 pada jumlah buah kapas pada gerigi kelopak kapas, 19 dan serta 4 pada jumlah buah padi dan galur gelombang, memberikan pengertian tanggal 13, bulan april, tahun 1964 yaitu tanggal, bulam , dan tahun terbentuknya Provinsi Daerah Tingkat Sulawesi Tengah.",
      "Lambang Sulawesi Tenggara atau disebut perisai lima adalah lambang Sulawesi Tenggara yang terdiri dari lukisan kepala anoa (anuang), mata rantai, dan padi dan kapas.\n" +
              "Anoa adalah hewan khas Sulawesi Tenggara. Mata Rantai yang bersambung menjadi satu merupakan simbol persatuan yang kokoh. Sedangkan padi dan kapas merupakan cita-cita untuk memakmurkan rakyat\n",
      "Lambang Sulawesi Selatan terdiri dari unsur bintang, padi dan kapas, banteng sombu opu, badik, gunung dan petak sawah, dan perahu pinisi.\n" +
              "Bintang sebagai simbol kepercayaan terhadap Tuhan YME. Padi dan kapas melambangkan kemakmuran. Banteng sombu opu sebagai simbol kepahlawanan yang gagah berani. Badik merupakan senjata khas Sulawesi Selatan. Gunung dan sawah adalah pangkal menuju masyarakat sosialis Indonesia. Sedangkan perahu pinisi merupakan simbol jiwa bahari para pelaut Bugis yang terkenal",
      "“SIWALIMA” merupakan motto lambang Provinsi Maluku yang artinya milik bersama atas dasar Siwalima, memupuk persatuan dan kesatuan untuk mencapai kesejateraan bersama. Logo siwalima yang berlatar belakang perisai/salawaku didalamnya terdapat lukisan daun sagu dan daun kelapa, mutiara, cengkeh, dan pala, tombak, gunung, laut dan perahu.\n" +
              "Daun Sagu, menggambarkan bahwa makanan pokok di daerah Maluku adalah sagu yang melambangkan kehidupan.\n" +
              "Daun Kelapa, menggambarkan hasil bumi berupa kelapa, yang banyak terdapat di Maluku.\n" +
              "Mutiara, merupakan hasil laut yang khas dari daerah Maluku.\n" +
              "Tombak, menggambarkan sikap ksatria dan gagah berani.\n" +
              "Gunung, melambangkan kekayaan hasil hutan yang melimpah.\n" +
              "Laut dan perahu, melambangkan persatuan dan kesatuan yang abadi.\n" +
              "Jumlah pucuk daun kelapa sebanyak 17, melambangkan tanggal 17, sedangkan jumlah butir mutiara sebanyak 8, melambangkan bulan 8 (agustus), dan pucuk daun sagu sebanyak 45, melambangkan tahun 45 (1945). Kesemuanya itu melambangkan hari yang sangat bersejarah, yaitu Proklamasi Kemerdekaan RI, 17 Agustus 1945.",
      "Lambang Maluku Utara berbentuk perisai segilima, yang di dalamnya terdapat gambar bintang, gunung, laut, padi dan kapas, serta tulisan 1999 yang merupakan tahun berdirinya provinsi Maluku Utara. Adapun makna dari gambar tersebut adalah:\n" +
              "Bintang melambangkan Ketuhanan Yang Maha Esa.\n" +
              "Gunung sebagai symbol kekayaan hasil hutan yang melimpah.\n" +
              "Laut adalah lambing persatuan dan kesatuan.\n" +
              "Padi dan kapas adalah lambing kemakmuran.",
      "Wadah Lambang Daerah berbentuk PERISAI BERPAJU LIMA adalah menggambarkan kesiap-siagaan dan ketahanan. Paju lima menunjukkan jumlah sila dalam Pancasila. Warna dasar kuning emas pada bagian bawah perisai dan pita tersebut melambangkan keagungan yang mengandung pengertian sebagai gambaran cita usaha pengalian hasil – hasil kekayaan bumi dan alamnya. Warna dasar biru tua pada bagian atas perisai tersebut, melukiskan kekayaan lautan / perairan Papua. Jalur kuning melingkari tepian perisai tersebut menggambarkan keyakinan tercapainya segala usaha dan perjuangan. Jalur hitam yang melingkari pita dan warna tulisan hitam menggambarkan kemantapan dan kebulatan tekad untuk berkarya swadaya.\n" +
              "Tiga buah TUGU yang masing-masing berwarna abu-abu, sebelah kanan dan berwarna putih sebelah kiri di atas TUMPUKAN BATU persegi panjang, bersusun 2 (dua) masing-masing berderet 6 (enam) dan 9 (sembilan) yang berwarna putih bergaris-garis batas hitam: Perjuangan TRIKORA dan kemenangan PEPERA Tahun 1969. Tumpukan batu tersebut juga melambangkan Dinamika Pembangunan di Daerah ini. Warna abu-abu putih dan bergaris-garis hitam melambangkan ketenangan dan kesucian. Setangkai BUAH PADI yang berisi 17 (tujuh belas) butir padi berwarna kuning bertangkai kuning pula yang terdapat di sebelah kanan dan setangkai BUAH KAPAS yang terdiri dari 8 (delapan) buah berwarna putih bertangkai Hijau Tua yang terdapat disebelah kiri daripada tiga buah Tugu tersebut yang diikat dengan sehelai PITA berwarna merah berlekuk 4 (empat) dan berjurai 5 (lima) adalah melukiskan kesatuan dan persatuan Bangsa yang dijiwai oleh semangat Proklamasi 17 Agustus 1945 untuk mewujudkan masyarakat adil dan makmur. Tiga buah GUNUNG berjajar yang sama tingginya berwarna hijau tua dan berpuncak putih salju adalah menggambarkan ciri khas Daerah Papua. Warna hijau tua ketiga buah gunung dan tangkai dari buah kapas itu, melambangkan kesuburan tanah / kekayaan alam daratan Papua. Sedangkan tulisan “Papua” dalam huruf cetak yang berwarna kuning adalah menggambarkan keluhuran / keagungan cita.",
      "Tulisan Papua Barat menjelaskan nama Provinsi Papua Barat\n" +
              "Bintang berwarna putih bermakna Ketuhanan Yang Maha Esa dan cita-cita serta harapan yang akan diwujudkan.\n" +
              "Pohon dan ikan bermakna bahwa Provinsi Papua Barat memiliki sumber daya hutan dan sumber daya laut yang berpotensi untuk meningkatkan taraf hidup dan kesejahteraan masyarakat.\n" +
              "Menara kilang dengan semburan api berwarna merah bermakna bahwa Provinsi Papua Barat memiliki kekayaan bahan tambang yang melimpah.\n" +
              "Leher dan kepala burung Kasuari menghadap ke kanan dalam bidang lingkaran hijau bermakna bahwa Provinsi Papua Barat secara geografis terletak di wilayah leher dan kepala burung Pulau Papua, sekaligus memilki filosofi ketangguhan, keberanian, kekuatan dan ketahanan menghadapi tantangan pembangunan dimasa depan serta berkeyakinan bahwa dengan semangat persatuan dan kesatuan, kesinambungan pembangunan akan mewujudkan masa depan yang cerah.\n" +
              "Bidang Hijau yang diapit 3 (tiga) bidang biru bermakna kesatuan tekad dan perjuangan dari 3 (tiga) unsur: pemerintah, rakyat/adat dan agama mewujudkan keberadaan Provinsi Papua Barat.\n" +
              "Perisai dengan warna dasar biru bersudut lima bermakna bahwa provinsi Papua Barat berasaskan Pancasila yang mampu melindungi seluruh rakyat.\n" +
              "Sepasang pelepah daun sagu, masing-masing pelepah bagian kanan terdiri dari 12 (dua belas) pasang anak daun, bagian kiri terdiri dari 10 (sepuluh) pasang anak daun yang diikat oleh dua angka sembilan bermotif ukiran karerin budaya Papua, bermakna bahwa Provinsi Papua Barat dibentuk pada tanggal 12 Oktober 1999NKRI. Sagu merupakan makanan pokok masyarakat Provinsi Papua Barat yang melambangkan kesejehteraan dan kemakmuran. sebagai Provinsi ke-2 di Tanah Papua dan ke-31 di wilayah\n" +
              "Seutas pita berwarna kuning bertuliskan “CINTAKU NEGERIKU” terletak di bagian bawah perisai merupakan bagian yang tak terpisahkan dari perisai bermakna folosofis perjuangan seluruh komponen masyarakat untuk mempertahankan keberadaan Provinsi Papua Barat dalam bingkai NKRI."
    };


    private static int[] provinceImages = {
            R.drawable.aceh,
            R.drawable.sumatera_utara,
            R.drawable.sumatera_barat,
            R.drawable.riau,
            R.drawable.kepulauan_riau,
            R.drawable.jambi,
            R.drawable.bengkulu,
            R.drawable.sumatera_selatan,
            R.drawable.bangka_belitung,
            R.drawable.lampung,
            R.drawable.banten,
            R.drawable.jakarta,
            R.drawable.jawa_barat,
            R.drawable.jawa_tengah,
            R.drawable.diy,
            R.drawable.jawa_timur,
            R.drawable.bali,
            R.drawable.ntb,
            R.drawable.ntt,
            R.drawable.kalimantan_barat,
            R.drawable.kalimantan_tengah,
            R.drawable.kalimantan_selatan,
            R.drawable.kalimantan_timur,
            R.drawable.kalimantan_utara,
            R.drawable.sulawesi_utara,
            R.drawable.sulawesi_barat,
            R.drawable.gorontalo,
            R.drawable.sulawesi_tengah,
            R.drawable.sulawesi_tenggara,
            R.drawable.sulawesi_selatan,
            R.drawable.maluku,
            R.drawable.maluku_utara,
            R.drawable.papua,
            R.drawable.papua_barat
    };

    private static int[] petaProvinsi = {
            R.drawable.peta_aceh,
            R.drawable.peta_sumatera_utara,
            R.drawable.peta_sumatera_barat,
            R.drawable.peta_riau,
            R.drawable.peta_kepulauan_riau,
            R.drawable.peta_jambi,
            R.drawable.peta_bengkulu,
            R.drawable.peta_sumatera_selatan,
            R.drawable.peta_bangka_belitung,
            R.drawable.peta_lampung,
            R.drawable.peta_banten,
            R.drawable.peta_jakarta,
            R.drawable.peta_jawa_barat,
            R.drawable.peta_jawa_tengah,
            R.drawable.peta_diy,
            R.drawable.peta_jawa_timur,
            R.drawable.peta_bali,
            R.drawable.peta_ntb,
            R.drawable.peta_ntt,
            R.drawable.peta_kalimantan_barat,
            R.drawable.peta_kalimantan_tengah,
            R.drawable.peta_kalimantan_selatan,
            R.drawable.peta_kalimantan_timur,
            R.drawable.peta_kalimantan_utara,
            R.drawable.peta_sulawesi_utara,
            R.drawable.peta_sulawesi_barat,
            R.drawable.peta_gorontalo,
            R.drawable.peta_sulawesi_tengah,
            R.drawable.peta_sulawesi_tenggara,
            R.drawable.peta_sulawesi_selatan,
            R.drawable.peta_maluku,
            R.drawable.peta_maluku_utara,
            R.drawable.peta_papua,
            R.drawable.peta_papua_barat
    };

    static ArrayList<Province> getData(){
        ArrayList<Province> provinsi = new ArrayList<>();
        for (int i=0; i<provinceNames.length; i++){
            Province province = new Province();
            province.setProvinceName(provinceNames[i]);
            province.setGambarLogo(provinceImages[i]);
            province.setDetailLogo(artiLogo[i]);
            province.setGambarPeta(petaProvinsi[i]);
            province.setIbuKota(ibukotaProvinsi[i]);
            province.setJumlahJiwa(jumlahJiwa[i]);
            province.setLetakPosisi(posisiProvinsi[i]);
            province.setLuas(luasProvinsi[i]);
            province.setTanggalLahir(tanggallahirProvinsi[i]);
            provinsi.add(province);
        }
        return provinsi;
    }
}
