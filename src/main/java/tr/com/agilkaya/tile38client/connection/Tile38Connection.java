package tr.com.agilkaya.tile38client.connection;

import lombok.Getter;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Pipeline;
import redis.clients.jedis.exceptions.JedisConnectionException;

import java.net.URI;

public class Tile38Connection {

    @Getter
    private Jedis jedis;

    public Tile38Connection(Jedis resource){ jedis = resource; }

    public Tile38Connection(String host, int port){
        jedis = new Jedis(host, port);
    }

    public Tile38Connection(String host, int port, int timeout){
        jedis = new Jedis(host, port, timeout);
    }

    public Tile38Connection(URI uri){
        jedis = new Jedis(uri);
    }

    public Tile38Connection(URI uri, int timeout){
        jedis = new Jedis(uri, timeout);
    }

    public void connect(){
        try {
            if(!jedis.isConnected()){
                jedis.connect();
            }
        }
        catch (JedisConnectionException jce){
            throw new JedisConnectionException(jce);
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }

    public void disconnect(){
        try {
            if(jedis.isConnected()){
                jedis.disconnect();
            }
        }
        catch (JedisConnectionException jce){
            throw new JedisConnectionException(jce);
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }

    public Pipeline getPipeline(){
        try {
            return jedis.pipelined();
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }

}
