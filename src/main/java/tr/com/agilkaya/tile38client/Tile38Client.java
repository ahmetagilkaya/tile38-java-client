package tr.com.agilkaya.tile38client;

import tr.com.agilkaya.tile38client.core.enums.Tile38Command;
import tr.com.agilkaya.tile38client.model.Tile38CommandArgs;
import tr.com.agilkaya.tile38client.connection.Tile38Connection;

public class Tile38Client {

    public Object aof(Tile38Connection tile38Connection, Tile38CommandArgs tile38CommandArgs){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.AOF, tile38CommandArgs.toCommandArgs());
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

    public Object aofmd5(Tile38Connection tile38Connection, Tile38CommandArgs tile38CommandArgs){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.AOFMD5, tile38CommandArgs.toCommandArgs());
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

    public Object aofshrink(Tile38Connection tile38Connection){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.AOFSHRINK);
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

    public Object auth(Tile38Connection tile38Connection, Tile38CommandArgs tile38CommandArgs){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.AUTH, tile38CommandArgs.toCommandArgs());
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

    public Object bounds(Tile38Connection tile38Connection, Tile38CommandArgs tile38CommandArgs){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.BOUNDS, tile38CommandArgs.toCommandArgs());
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

    public Object chans(Tile38Connection tile38Connection, Tile38CommandArgs tile38CommandArgs){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.CHANS, tile38CommandArgs.toCommandArgs());
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

    public Object configGet(Tile38Connection tile38Connection, Tile38CommandArgs tile38CommandArgs){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.CONFIG_GET, tile38CommandArgs.toCommandArgs());
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

    public Object configRewrite(Tile38Connection tile38Connection){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.CONFIG_REWRITE);
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

    public Object configSet(Tile38Connection tile38Connection, Tile38CommandArgs tile38CommandArgs){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.CONFIG_SET, tile38CommandArgs.toCommandArgs());
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

    public Object del(Tile38Connection tile38Connection, Tile38CommandArgs tile38CommandArgs){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.DEL, tile38CommandArgs.toCommandArgs());
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

    public Object delchan(Tile38Connection tile38Connection, Tile38CommandArgs tile38CommandArgs){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.DELCHAN, tile38CommandArgs.toCommandArgs());
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

    public Object delhook(Tile38Connection tile38Connection, Tile38CommandArgs tile38CommandArgs){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.DELHOOK, tile38CommandArgs.toCommandArgs());
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

    public Object drop(Tile38Connection tile38Connection, Tile38CommandArgs tile38CommandArgs){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.DROP, tile38CommandArgs.toCommandArgs());
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

    public Object expire(Tile38Connection tile38Connection, Tile38CommandArgs tile38CommandArgs){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.EXPIRE, tile38CommandArgs.toCommandArgs());
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

    public Object flushDB(Tile38Connection tile38Connection){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.FLUSHDB);
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

    public Object follow(Tile38Connection tile38Connection, Tile38CommandArgs tile38CommandArgs){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.FOLLOW, tile38CommandArgs.toCommandArgs());
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

    public Object fset(Tile38Connection tile38Connection, Tile38CommandArgs tile38CommandArgs){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.FSET, tile38CommandArgs.toCommandArgs());
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

    public Object gc(Tile38Connection tile38Connection){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.GC);
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

    public Object get(Tile38Connection tile38Connection, Tile38CommandArgs tile38CommandArgs){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.GET, tile38CommandArgs.toCommandArgs());
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

    public Object hooks(Tile38Connection tile38Connection, Tile38CommandArgs tile38CommandArgs){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.HOOKS, tile38CommandArgs.toCommandArgs());
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

    public Object intersects(Tile38Connection tile38Connection, Tile38CommandArgs tile38CommandArgs){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.INTERSECTS, tile38CommandArgs.toCommandArgs());
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

    public Object jdel(Tile38Connection tile38Connection, Tile38CommandArgs tile38CommandArgs){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.JDEL, tile38CommandArgs.toCommandArgs());
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

    public Object jget(Tile38Connection tile38Connection, Tile38CommandArgs tile38CommandArgs){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.JGET, tile38CommandArgs.toCommandArgs());
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

    public Object jset(Tile38Connection tile38Connection, Tile38CommandArgs tile38CommandArgs){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.JSET, tile38CommandArgs.toCommandArgs());
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

    public Object keys(Tile38Connection tile38Connection, Tile38CommandArgs tile38CommandArgs){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.KEYS, tile38CommandArgs.toCommandArgs());
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

    public Object nearby(Tile38Connection tile38Connection, Tile38CommandArgs tile38CommandArgs){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.NEARBY, tile38CommandArgs.toCommandArgs());
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

    public Object output(Tile38Connection tile38Connection, Tile38CommandArgs tile38CommandArgs){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.OUTPUT, tile38CommandArgs.toCommandArgs());
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

    public Object pdel(Tile38Connection tile38Connection, Tile38CommandArgs tile38CommandArgs){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.PDEL, tile38CommandArgs.toCommandArgs());
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

    public Object pdelchan(Tile38Connection tile38Connection, Tile38CommandArgs tile38CommandArgs){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.PDELCHAN, tile38CommandArgs.toCommandArgs());
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

    public Object pdelhook(Tile38Connection tile38Connection, Tile38CommandArgs tile38CommandArgs){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.PDELHOOK, tile38CommandArgs.toCommandArgs());
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

    public Object persist(Tile38Connection tile38Connection, Tile38CommandArgs tile38CommandArgs){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.PERSIST, tile38CommandArgs.toCommandArgs());
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

    public Object ping(Tile38Connection tile38Connection){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.PING);
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

    public Object psubscribe(Tile38Connection tile38Connection, Tile38CommandArgs tile38CommandArgs){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.PSUBSCRIBE, tile38CommandArgs.toCommandArgs());
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

    public Object quit(Tile38Connection tile38Connection){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.QUIT);
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

    public Object readonly(Tile38Connection tile38Connection, Tile38CommandArgs tile38CommandArgs){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.READONLY, tile38CommandArgs.toCommandArgs());
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

    public Object rename(Tile38Connection tile38Connection, Tile38CommandArgs tile38CommandArgs){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.RENAME, tile38CommandArgs.toCommandArgs());
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

    public Object renamenx(Tile38Connection tile38Connection, Tile38CommandArgs tile38CommandArgs){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.RENAMENX, tile38CommandArgs.toCommandArgs());
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

    public Object scan(Tile38Connection tile38Connection, Tile38CommandArgs tile38CommandArgs){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.SCAN, tile38CommandArgs.toCommandArgs());
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

    public Object search(Tile38Connection tile38Connection, Tile38CommandArgs tile38CommandArgs){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.SEARCH, tile38CommandArgs.toCommandArgs());
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

    public Object server(Tile38Connection tile38Connection, Tile38CommandArgs tile38CommandArgs){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.SERVER, tile38CommandArgs.toCommandArgs());
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

    public Object set(Tile38Connection tile38Connection, Tile38CommandArgs tile38CommandArgs){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.SET, tile38CommandArgs.toCommandArgs());
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

    public Object setchan(Tile38Connection tile38Connection, Tile38CommandArgs tile38CommandArgs){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.SETCHAN, tile38CommandArgs.toCommandArgs());
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

    public Object sethook(Tile38Connection tile38Connection, Tile38CommandArgs tile38CommandArgs){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.SETHOOK, tile38CommandArgs.toCommandArgs());
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

    public Object stats(Tile38Connection tile38Connection, Tile38CommandArgs tile38CommandArgs){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.STATS, tile38CommandArgs.toCommandArgs());
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

    public Object subscribe(Tile38Connection tile38Connection, Tile38CommandArgs tile38CommandArgs){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.SUBSCRIBE, tile38CommandArgs.toCommandArgs());
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

    public Object test(Tile38Connection tile38Connection, Tile38CommandArgs tile38CommandArgs){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.TEST, tile38CommandArgs.toCommandArgs());
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

    public Object timeout(Tile38Connection tile38Connection, Tile38CommandArgs tile38CommandArgs){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.TIMEOUT, tile38CommandArgs.toCommandArgs());
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

    public Object ttl(Tile38Connection tile38Connection, Tile38CommandArgs tile38CommandArgs){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.TTL, tile38CommandArgs.toCommandArgs());
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

    public Object within(Tile38Connection tile38Connection, Tile38CommandArgs tile38CommandArgs){
        try {
            tile38Connection.connect();
            return tile38Connection.getJedis().sendCommand(Tile38Command.WITHIN, tile38CommandArgs.toCommandArgs());
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        finally {
            tile38Connection.disconnect();
        }
    }

}
