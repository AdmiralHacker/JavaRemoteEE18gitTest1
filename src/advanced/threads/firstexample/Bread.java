package advanced.threads.firstexample;

import java.util.Random;

public class Bread implements Runnable {
//etot kod prosto pokazat kakim obrazom rabotaet odnovremenno kod
    //toest sokrawenie vremeni raboti koda

    private String name;
    private int time;
    Random r = new Random();


    public Bread(String name) {
        this.name = name;
        time = r.nextInt(5000);

    }

//tut mi zastavljaem spat rabotnika 4to bi pokazat raznicu

    @Override
    public void run() {
        try {
            System.out.printf("%s is sleeping for %d\n", name, time);
            Thread.sleep(time);
            //.sleep komanda ispolzueca o4en 4asto .
            //kogda tvoj kod otkrivaet naprimer excel i on ewe ne uspeet otkrica
            //togda budet owibka ,poetomu mi daem komandu spat ,4to bi
            //fail uspel otkrica kak primer naw kod otkrivaet database
            //ili 4to to ewe . Ina4e naw kod vidast owibku tak kak budet
            //dumat 4to to powlo ne tak.
            System.out.printf("%s is done\n", name);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
