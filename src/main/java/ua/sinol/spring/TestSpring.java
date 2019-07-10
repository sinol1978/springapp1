package ua.sinol.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        ClassicalMusic classicalMusic = context.getBean("musicBean3", ClassicalMusic.class);
//        System.out.println(classicalMusic.getSong());
//
//        ClassicalMusic classicalMusic2 = context.getBean("musicBean3", ClassicalMusic.class);
//        System.out.println(classicalMusic.getSong());

        RockMusic music = context.getBean("musicBean2", RockMusic.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);

        musicPlayer.playMusic();

//        Music music = context.getBean("musicBean", Music.class);
//
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();
//        System.out.println(musicPlayer.getName() + "\t" + musicPlayer.getVolume());
//
//        //MusicPlayer musicPlayer1 = new MusicPlayer();
//        //musicPlayer1.playMusic();
//
//
//
//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        System.out.println(firstMusicPlayer == secondMusicPlayer);
//        System.out.println(firstMusicPlayer.equals(secondMusicPlayer));
//        firstMusicPlayer.setVolume("20");
//        secondMusicPlayer.setVolume("30");
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());

        context.close();
    }
}
