import java.util.HashMap;

public class hashmaps {
    public void music(){
        HashMap<String, String> trackList = new HashMap<String, String>(); 

        trackList.put("Its Friday!", "Its friday friday, its finally friday!");
        trackList.put("last friday night (TGIF)", "Last Friday night Yeah, we danced on tabletops And we took too many shots");
        trackList.put("SelfCare", "I switched the time zone, but what do I know?");
        trackList.put("Blinding Lights", "I've been tryin' to call ");
        trackList.remove("Its Friday!");
        for(HashMap.Entry<String, String> entry : trackList.entrySet()){

            System.out.println("Track: " + entry.getKey()+ " Lyrics: " + entry.getValue());

        }


    }
}
