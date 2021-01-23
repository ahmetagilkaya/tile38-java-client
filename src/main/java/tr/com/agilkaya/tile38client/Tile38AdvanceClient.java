package tr.com.agilkaya.tile38client;

import redis.clients.jedis.Pipeline;
import tr.com.agilkaya.tile38client.model.Tile38PipelineCommand;
import tr.com.agilkaya.tile38client.connection.Tile38Connection;

import java.util.List;

public class Tile38AdvanceClient {

    public void pipelineSendCommands(Tile38Connection tile38Connection, List<Tile38PipelineCommand> tile38PipelineCommands){
        try {
            Pipeline pipeline = tile38Connection.getPipeline();

            for(Tile38PipelineCommand tile38PipelineCommand : tile38PipelineCommands){
                pipeline.sendCommand(tile38PipelineCommand.getTile38Command(), tile38PipelineCommand.getTile38CommandArgs().toCommandArgs());
            }

            pipeline.sync();
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }

}
