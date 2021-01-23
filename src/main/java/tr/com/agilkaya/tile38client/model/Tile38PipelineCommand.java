package tr.com.agilkaya.tile38client.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import tr.com.agilkaya.tile38client.core.enums.Tile38Command;

@Getter
@AllArgsConstructor
public class Tile38PipelineCommand {

    private Tile38Command tile38Command;
    private Tile38CommandArgs tile38CommandArgs;

}
