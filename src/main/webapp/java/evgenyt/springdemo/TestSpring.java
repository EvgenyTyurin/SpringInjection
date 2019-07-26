package evgenyt.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        // Get app context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        // Music injected in constructor
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        // Injection in setter
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer2", MusicPlayer.class);
        System.out.println("Player " + musicPlayer2.getName() + " at volume " +
                musicPlayer2.getVolume());
        musicPlayer2.playMusic();
        // Injection in properties file
        MusicPlayer musicPlayer3 = context.getBean("musicPlayer3", MusicPlayer.class);
        System.out.println("Player " + musicPlayer3.getName() + " at volume " +
                musicPlayer3.getVolume());
        musicPlayer3.playMusic();
        context.close();
    }
}
