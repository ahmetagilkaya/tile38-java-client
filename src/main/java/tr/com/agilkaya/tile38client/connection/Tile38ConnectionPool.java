package tr.com.agilkaya.tile38client.connection;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.net.URI;

public class Tile38ConnectionPool {

    private JedisPool jedisPool;

    public Tile38ConnectionPool(String host, int port){
        jedisPool = new JedisPool(new JedisPoolConfig(), host, port);
    }

    public Tile38ConnectionPool(JedisPoolConfig jedisPoolConfig, String host, int port){
        jedisPool = new JedisPool(jedisPoolConfig, host, port);
    }

    public Tile38ConnectionPool(String host, int port, int timeout){
        jedisPool = new JedisPool(new JedisPoolConfig(), host, port, timeout);
    }

    public Tile38ConnectionPool(JedisPoolConfig jedisPoolConfig, String host, int port, int timeout){
        jedisPool = new JedisPool(jedisPoolConfig, host, port, timeout);
    }

    public Tile38ConnectionPool(URI uri){
        jedisPool = new JedisPool(new JedisPoolConfig(), uri);
    }

    public Tile38ConnectionPool(JedisPoolConfig jedisPoolConfig, URI uri){
        jedisPool = new JedisPool(jedisPoolConfig, uri);
    }

    public Tile38ConnectionPool(URI uri, int timeout){
        jedisPool = new JedisPool(new JedisPoolConfig(), uri, timeout);
    }

    public Tile38ConnectionPool(JedisPoolConfig jedisPoolConfig, URI uri, int timeout){
        jedisPool = new JedisPool(jedisPoolConfig, uri, timeout);
    }

    public Tile38Connection getResource(){
        return new Tile38Connection(jedisPool.getResource());
    }

}
