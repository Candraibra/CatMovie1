package com.candraibra.catmovie.utils;

import com.candraibra.catmovie.R;
import com.candraibra.catmovie.data.Movie;

import java.util.ArrayList;

public class DummyData {
    public static ArrayList<Movie> generateDummyMovies() {

        ArrayList<Movie> movies = new ArrayList<>();

        movies.add(new Movie(
                "Avengers: Infinity War (2018)",
                "Ketika Avengers dan sekutu mereka terus melindungi dunia dari ancaman yang terlalu besar untuk ditangani oleh satu pahlawan, bahaya baru telah muncul dari bayang-bayang kosmik: Thanos. Seorang lalim penghinaan intergalaksi, tujuannya adalah untuk mengumpulkan semua enam Batu Infinity, artefak kekuatan tak terbayangkan, dan menggunakannya untuk menimbulkan keinginannya yang terpelintir pada semua kenyataan. Segala yang Avengers telah perjuangkan telah mengarah ke saat ini - nasib Bumi dan keberadaannya sendiri tidak pernah lebih pasti.",
                R.drawable.poster_avengerinfinity
        ));
        movies.add(new Movie(
                "A Star Is Born (2018)",
                "Musisi kawakan Jackson Maine menemukan - dan jatuh cinta dengan - artis yang sedang berjuang Ally. Dia baru saja menyerah pada mimpinya untuk menjadi besar sebagai penyanyi - sampai Jack membujuknya menjadi sorotan. Tetapi bahkan ketika karier Ally lepas landas, sisi pribadi dari hubungan mereka hancur, ketika Jack berjuang terus-menerus dengan setan-setan internalnya sendiri.",
                R.drawable.poster_a_star
        ));
        movies.add(new Movie(
                "Venom (2018)",
                "Jurnalis investigasi Eddie Brock mencoba untuk kembali setelah skandal, tetapi secara tidak sengaja menjadi tuan rumah Venom, seorang simbiot alien yang sangat kuat dan sakti. Segera, ia harus mengandalkan kekuatan barunya untuk melindungi dunia dari organisasi bayangan yang mencari simbiosis mereka sendiri",
                R.drawable.poster_venom
        ));
        movies.add(new Movie(
                "Bohemian Rhapsody (2018)",
                "Penyanyi Freddie Mercury, gitaris Brian May, drummer Roger Taylor dan gitaris bass John Deacon mengambil dunia musik dengan badai ketika mereka membentuk band rock n roll Queen pada tahun 1970. Lagu-lagu hit menjadi klasik instan. Ketika gaya hidup Mercury yang semakin liar mulai lepas kendali, Queen segera menghadapi tantangan terbesarnya - menemukan cara untuk menjaga band bersama di tengah kesuksesan dan kelebihan.",
                R.drawable.poster_bohemian
        ));
        movies.add(new Movie(
                "Bumblebee (2018)",
                "Dalam pelarian pada tahun 1987, Bumblebee menemukan tempat perlindungan di tempat barang rongsokan di kota pantai kecil California. Charlie, di puncak usia 18 dan berusaha menemukan tempatnya di dunia, menemukan Bumblebee, bekas luka pertempuran dan patah. Ketika Charlie menghidupkannya, dia dengan cepat mengetahui bahwa ini bukan bug VW kuning biasa.",
                R.drawable.poster_bumblebee
        ));
        movies.add(new Movie(
                "Robin Hood (2018)",
                "Seorang pejuang perang yang keras dan komandan Moornya melakukan pemberontakan yang berani melawan mahkota Inggris yang korup.",
                R.drawable.poster_robinhood
        ));
        movies.add(new Movie(
                "Aquaman (2018)",
                "Dulunya merupakan rumah bagi peradaban paling maju di Bumi, Atlantis sekarang merupakan kerajaan bawah laut yang diperintah oleh Raja Orm yang haus kekuasaan. Dengan pasukan yang sangat besar, Orm berencana untuk menaklukkan orang-orang samudera yang tersisa dan kemudian ke permukaan dunia. Yang menghalangi jalannya adalah Arthur Curry, saudara tiri manusia setengah manusia Orm dan pewaris sejati takhta.",
                R.drawable.poster_aquaman
        ));
        movies.add(new Movie(
                "Bird Box (2018)",
                "Lima tahun setelah kehadiran tak terlihat yang tak menyenangkan membuat sebagian besar masyarakat bunuh diri, seorang yang selamat dan dua anaknya melakukan upaya putus asa untuk mencapai keselamatan.",
                R.drawable.poster_birdbox
        ));
        movies.add(new Movie(
                "Once Upon a Deadpool (2018)",
                "Fred Savage yang diculik dipaksa untuk menahan Deadpool PG-13 rendition of Deadpool 2 sebagai cerita Princess Bride-esque yang penuh dengan keajaiban, keajaiban dan nol F.",
                R.drawable.poster_deadpool
        ));
        return movies;
    }
}
