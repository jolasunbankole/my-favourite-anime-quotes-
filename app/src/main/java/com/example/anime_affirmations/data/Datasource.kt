package com.example.anime_affirmations.data

import com.example.anime_affirmations.R
import com.example.anime_affirmations.model.Anime_Affirmations

class Datasource {

    fun loadAffirmations():List<Anime_Affirmations>{
        return listOf<Anime_Affirmations>(
            Anime_Affirmations(R.string.affirmations1, R.drawable.image1),
            Anime_Affirmations(R.string.affirmations2, R.drawable.image2),
            Anime_Affirmations(R.string.affirmations3, R.drawable.image3),
            Anime_Affirmations(R.string.affirmations4, R.drawable.image4),
            Anime_Affirmations(R.string.affirmations5, R.drawable.image5),
            Anime_Affirmations(R.string.affirmations6, R.drawable.image6),
            Anime_Affirmations(R.string.affirmations7, R.drawable.image7),
            Anime_Affirmations(R.string.affirmations8, R.drawable.image8),
            Anime_Affirmations(R.string.affirmations9, R.drawable.image9),
            Anime_Affirmations(R.string.affirmations10,R.drawable.image10)
        )

    }
}