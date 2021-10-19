package com.example.recyclerview1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.hulk,
                "hulk",
                "Mark Ruffalo mengatakan bahwa ketakutan terbesar Hulk bukanlah Thanos. Hal ini telah dia diskusikan dengan Sutradara Joss Whedon bertahun-tahun sebelum Infinity War dirilis. Satu hal yang paling ditakutkan oleh Hulk adalah Bruce Banner, alter ego-nya sendiri, lapor CBR."
            ),
            Superhero(
                R.drawable.hawkeye,
                "Hawkeye",
                "Avengers: Infinity War dipastikan bakal diisi oleh karakter superhero yang sangat banyak jumlahnya. Namun, selama ini nama Black Panther tak kunjung disebut sampai akhirnya sang pemeran, Chadwick Boseman, mengumumkannya sendiri."
            ),
            Superhero(
                R.drawable.thanos,
                "thanos",
                "Thanos sendiri merupakan salah satu supervillain di film Avengers yang mampu menghilangkan setengah populasi alam semesta. Kekuatan Thanos ini berasal dari gauntlet berisi keenam Infinity Stones."
            ),
            Superhero(
                R.drawable.thor,
                "thor",
                "Fans Marvel dibuat terkejut dengan pernyataan salah seorang bos Marvel baru-baru ini terkait film Thor. Charlie Wen yang menjadi Head of Visual Development tersebut menuliskan dalam instagramnya jika seharusnya yang menjadi bintang Thor bukanlah Chris Hemsworth."
            ),
            Superhero(
                R.drawable.ironman,
                "iron man",
                "Tony Stark dikenal sebagai seorang inventor yang gemar membuat apapun dan juga memodifikasi apapun. Semua kostum atau armor Iron Man dan Iron Patriot, merupakan hasil karya dari seorang Tony Stark. Berbagai teknologi canggih coba dimasukan dan diaplikasikan ke armor buatannya."
            ),
            Superhero(
                R.drawable.blackpanter,
                "black panter",
                "Avengers: Infinity War dipastikan bakal diisi oleh karakter superhero yang sangat banyak jumlahnya. Namun, selama ini nama Black Panther tak kunjung disebut sampai akhirnya sang pemeran, Chadwick Boseman, mengumumkannya sendiri."
            ),
            Superhero(
                R.drawable.captainamerica,
                "captain america",
                "Petualangan Steve Rogers/Captain America yang diperankan Chris Evans di Marvel Cinematic Universe (MCU) memang sudah berakhir. Namun, kaitan antara kisah Steve dengan MCU yang lebih luas masih bisa ditemukan. Salah satu yang menarik adalah tentang serum tentara super yang mengubah Steve menjadi sosok kuat sebagai Captain America. Banyak penggemar yang mengira-ira, bahan apa yang dipakai Dr Erskine untuk membuat serum itu."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList){
            val intent = Intent(this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}