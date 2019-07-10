package ua.sinol.spring;

import org.springframework.stereotype.Component;

@Component("someRockMusic")
public class RockMusic implements Music {

    private RockMusic(){}

//    public static RockMusic getRockMusic(){
//        System.out.println("Factory-Method");
//        return new RockMusic();
//    }
    @Override
    public String getSong() {
        return "Wind Cries Mary";
    }
}
