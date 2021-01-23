package tr.com.agilkaya.tile38client.core.enums;

import lombok.Getter;
import redis.clients.jedis.commands.ProtocolCommand;
import redis.clients.jedis.util.SafeEncoder;

public enum Tile38Command implements ProtocolCommand {

    AOF("AOF"),
    AOFMD5("AOFMD5"),
    AOFSHRINK("AOFSHRINK"),
    AUTH("AUTH"),
    BOUNDS("BOUNDS"),
    CHANS("CHANS"),
    CONFIG_GET("CONFIG GET"),
    CONFIG_REWRITE("CONFIG REWRITE"),
    CONFIG_SET("CONFIG SET"),
    DEL("DEL"),
    DELCHAN("DELCHAN"),
    DELHOOK("DELHOOK"),
    DROP("DROP"),
    //EVAL("EVAL"),
    //EVALNA("EVALNA"),
    //EVALNASHA("EVALNASHA"),
    //EVALRO("EVALRO"),
    //EVALROSHA("EVALROSHA"),
    //EVALSHA("EVALSHA"),
    EXPIRE("EXPIRE"),
    FLUSHDB("FLUSHDB"),
    FOLLOW("FOLLOW"),
    FSET("FSET"),
    GC("GC"),
    GET("GET"),
    HOOKS("HOOKS"),
    INTERSECTS("INTERSECTS"),
    JDEL("JDEL"),
    JGET("JGET"),
    JSET("JSET"),
    KEYS("KEYS"),
    NEARBY("NEARBY"),
    OUTPUT("OUTPUT"),
    PDEL("PDEL"),
    PDELCHAN("PDELCHAN"),
    PDELHOOK("PDELHOOK"),
    PERSIST("PERSIST"),
    PING("PING"),
    PSUBSCRIBE("PSUBSCRIBE"),
    QUIT("QUIT"),
    READONLY("READONLY"),
    RENAME("RENAME"),
    RENAMENX("RENAMENX"),
    SCAN("SCAN"),
    //SCRIPT_EXISTS("SCRIPT EXISTS"),
    //SCRIPT_FLUSH("SCRIPT FLUSH"),
    //SCRIPT_LOAD("SCRIPT LOAD"),
    SEARCH("SEARCH"),
    SERVER("SERVER"),
    SET("SET"),
    SETCHAN("SETCHAN"),
    SETHOOK("SETHOOK"),
    STATS("STATS"),
    SUBSCRIBE("SUBSCRIBE"),
    TEST("TEST"),
    TIMEOUT("TIMEOUT"),
    TTL("TTL"),
    WITHIN("WITHIN");

    private final byte[] raw;

    @Getter
    private String command;

    Tile38Command(String command) {
        this.raw = SafeEncoder.encode(command);
        this.command = command;
    }

    public byte[] getRaw() {
        return this.raw;
    }

}
