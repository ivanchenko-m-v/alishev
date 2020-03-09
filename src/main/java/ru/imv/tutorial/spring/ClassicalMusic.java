package ru.imv.tutorial.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private static List<String> playList = new ArrayList<>();

    static {
        playList.add("CLASSICAL:\tBagatelle for Piano in A Minor \"Für Elise\", WoO 59 Людвиг ван Бетховен, Alfred Brendel");
        playList.add("CLASSICAL:\tPiano Sonata No. 11 in A major K331/K300i: III. Rondo alla turca Jean-Bernard Pommier, Вольфганг Амадей Моцарт");
        playList.add("CLASSICAL:\tSuite No.2 in B minor, BWV1067 (flute and strings): Badinerie Sir Neville Marriner, Иоганн Себастьян Бах");
        playList.add("CLASSICAL:\tConcerto No. 2 in G minor (L'estate/ Summer) RV315 (Op. 8 No. 2): III. Presto Anne-Sophie Mutter, Антонио Вивальди");
        playList.add("CLASSICAL:\tTchaikovsky: Swan Lake, Op. 20, Act 2: No. 14, Scene (Moderato) André Previn, Пётр Ильич Чайковский");
        playList.add("CLASSICAL:\tMasquerade Suite - Waltz Юрий Симонов");
        playList.add("CLASSICAL:\tSerenade No. 13 in G 'Eine kleine Nachtmusik' K525: I. Allegro 1990 Digital Remaster Sir Neville Marriner, Вольфганг Амадей Моцарт");
        playList.add("CLASSICAL:\tCarmina Burana: Fortuna Imperatrix Mundi: No.1 \"O Fortuna\" Carl Orff, Mozarteum Orchestra Salzburg & Kurt Prestel, Rudolf Knoll, Gerda Hartmann");
        playList.add("CLASSICAL:\tPeer Gynt - Incidental Music: 3. In the Hall of the Mountain King 1998 Digital Remaster Ilse Hollweg/Beecham Choral Society/Royal Philharmonic Orchestra/Sir Thomas Beecham, Sir Thomas Beecham, Royal Philharmonic Orchestra, Beecham Choral Society, Denis Vaughan, Эдвард Григ");
        playList.add("CLASSICAL:\tSonata No. 5 for Violin and Piano in F major - Spring Sonata, Op. 24 : I. Allegro Clara Haskil, Arthur Grumiaux, Людвиг ван Бетховен");
    }

    @Override
    public String getSong() {
        return playList.get(0);
    }

    @Override
    public String getRandomSong() {
        return playList.get((int) (Math.random() * (double) playList.size()));
    }
}
