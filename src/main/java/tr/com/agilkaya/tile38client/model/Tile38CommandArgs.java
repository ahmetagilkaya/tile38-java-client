package tr.com.agilkaya.tile38client.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Tile38CommandArgs implements Serializable {

    private List<String> tile38CommandArgs;

    public Tile38CommandArgs(){
        tile38CommandArgs = new ArrayList<>();
    }

    public void add(String parameter){
        tile38CommandArgs.add(parameter);
    }

    public String[] toCommandArgs() {
        return tile38CommandArgs.toArray(new String[tile38CommandArgs.size()]);
    }

}
