package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Kelinci;
import simple.example.hewanpedia.model.Kuda;
import simple.example.hewanpedia.model.Marmut;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kelinci> initDataKelinci(Context ctx) {
        List<Kelinci> kelincis = new ArrayList<>();
        kelincis.add(new Kelinci("Holland Lop", "Belanda",
                "Memiliki telinga besar menggantung dengan bulu berukuran sedang dalam motif solid atau broken (bercampur putih).", R.drawable.kelinci1));
        kelincis.add(new Kelinci("Mini Lop", "Inggris",
                "Tubuh sangat bulat dengan telinga panjang dan tebal serta kepala besar. Bulunya bermotif padat atau broken dalam berbagai warna.", R.drawable.kelinci2));
        kelincis.add(new Kelinci("Polish", "Birma/Myanmar",
                "Bulunya pendek, lembut, flyback dalam enam pewarnaan yang berbeda: putih bermata ruby, putih bermata biru, hitam, biru, coklat, dan pola broken.", R.drawable.kelinci3));
        kelincis.add(new Kelinci("Mini Rex", "Iran",
                "Telinganya tegak panjang dan lehernya pendek. Bulunya lembut dan pendek, sangat padat dan bisa bervariasi warnanya. Rex umumnya memiliki punggung bulat dengan bahu yang berkembang dengan baik.", R.drawable.kelinci4));
        kelincis.add(new Kelinci("Dutch", "Thailand",
                "Memiliki warna hitam dan putih yang jelas. Mereka memiliki telinga dan pantat berwarna gelap dan bahu, perut, serta kaki depan putih, ditambah gumpalan bulu putih di bagian depan wajah mereka.", R.drawable.kelinci5));
        kelincis.add(new Kelinci("Mini Satin", "Rusia",
                "Lapisan bulunya sangat mengkilap dalam berbagai pola dan warna. Tubuhnya pendek dan bulat dengan kepala bulat dan penuh.", R.drawable.kelinci6));
        return kelincis;
    }

    private static List<Marmut> initDataMarmut(Context ctx) {
        List<Marmut> marmuts = new ArrayList<>();
        marmuts.add(new Marmut("American", "Amerika",
                "Marmut lokal bentuknya hampir mirip seperti tikus namun tentu saja lebih lucu. Bulu marmut lokal juga sedikit tidak sebanyak bulu kelinci dan tikus", R.drawable.marmut1));
        marmuts.add(new Marmut("Abbysinian", "Alaska,Siberia,Finlandia (daerah bersalju) ",
                "jenis marmut yang berbulu panjang dan memiliki banyak pusaran di tubuhnya.", R.drawable.marmut2));
        marmuts.add(new Marmut("Peruvian", "Indonesia",
                "Jenis marmut peruvian ini termasuk marmut yang harganya cukup mahal.", R.drawable.marmut3));
        marmuts.add(new Marmut("Texel", "Rusia",
                "Marmut texel juga diminati banyak orang namun sayangnya sangat susah didapatkan alias jarang yang membudidayakannya.", R.drawable.marmut4));
        marmuts.add(new Marmut("Alpaca", "Jerman",
                "Jenis marmut alpaca juga bagus dan lucu hampir mirip dengan marmut texel. Hanya saja ia lebih pendek dan lebih bulat.", R.drawable.marmut5));
        marmuts.add(new Marmut("Coronet", "Jepang",
                "Ia mampu bertahan lama berada di suhu ruang yang dingin.", R.drawable.marmut6));
        return marmuts;
    }
    private static List<Kuda> initDataKuda(Context ctx) {
        List<Kuda> kudas = new ArrayList<>();
        kudas.add(new Kuda("Arab", "Arab",
                "kuda Arab adalah salah satu ras kuda tertua. Sesuai dengan namanya, kuda ini berasal dari Semenanjung Arab.", R.drawable.kuda1));
        kudas.add(new Kuda("Thoroughbred", "Amerika Utara",
                "Dengan posturnya yang gagah dan berotot, kuda thoroughbred memang cocok dibiakkan sebagai kuda pacu.", R.drawable.kuda2));
        kudas.add(new Kuda("Morgan", "Inggris",
                "Kuda berwarna hitam ini memang terlihat elegan dan misterius. Namanya pun keren, yaitu Morgan. Kuda ini memiliki tubuh yang padat, kaki yang kuat, mata yang ekspresif dan tubuh berotot.", R.drawable.kuda3));
        kudas.add(new Kuda("Kuda kuartal Amerika", "Amerika",
                "Kuda kuartal Amerika adalah pelari sprint yang hebat. Bukan hanya itu, ia bisa berlari dengan kecepatan 55 mil/jam atau 88,5 km/jam, jelas laman Horses and Foals", R.drawable.kuda4));
        kudas.add(new Kuda("Appaloosa", "Spanyol",
                "Kuda ini memiliki bintik-bintik di tubuhnya seperti anjing dalmatian. Di samping penampilannya yang mencuri perhatian, kuda ini juga dikenal berkat kelembutan, keramahan dan loyalitasnya, ujar laman The Spruce Pets.", R.drawable.kuda5));
        kudas.add(new Kuda("Clydesdale", "Skotlandia",
                "Ciri khas kuda Clydesdale adalah memiliki juntaian rambut putih di pergelangan kakinya. Berkat keindahannya, kuda ini sering ditampilkan di acara seperti festival atau parade.", R.drawable.kuda6));
        return kudas;
    }
    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKelinci(ctx));
        hewans.addAll(initDataKuda(ctx));
        hewans.addAll(initDataMarmut(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
