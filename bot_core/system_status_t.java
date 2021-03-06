/* LCM type definition class file
 * This file was automatically generated by lcm-gen
 * DO NOT MODIFY BY HAND!!!!
 */

package bot_core;
 
import java.io.*;
import java.util.*;
import lcm.lcm.*;
 
public final class system_status_t implements lcm.lcm.LCMEncodable
{
    public long utime;
    public byte system;
    public byte importance;
    public byte frequency;
    public String value;
 
    public system_status_t()
    {
    }
 
    public static final long LCM_FINGERPRINT;
    public static final long LCM_FINGERPRINT_BASE = 0x1163e61b7484cf5bL;
 
    public static final byte MESSAGING = (byte) 0;
    public static final byte MOTION_ESTIMATION = (byte) 1;
    public static final byte TRACKING = (byte) 2;
    public static final byte CONTROL = (byte) 3;
    public static final byte GRASPING = (byte) 4;
    public static final byte DRIVING = (byte) 5;
    public static final byte PLANNING_BASE = (byte) 6;
    public static final byte PLANNING_ROBOT = (byte) 7;
    public static final byte FALL_DETECTOR = (byte) 8;
    public static final byte VERY_IMPORTANT = (byte) 0;
    public static final byte IMPORTANT = (byte) 1;
    public static final byte UNIMPORTANT = (byte) 2;
    public static final byte LOW_FREQUENCY = (byte) 0;
    public static final byte MEDIUM_FREQUENCY = (byte) 1;
    public static final byte HIGH_FREQUENCY = (byte) 2;

    static {
        LCM_FINGERPRINT = _hashRecursive(new ArrayList<Class<?>>());
    }
 
    public static long _hashRecursive(ArrayList<Class<?>> classes)
    {
        if (classes.contains(bot_core.system_status_t.class))
            return 0L;
 
        classes.add(bot_core.system_status_t.class);
        long hash = LCM_FINGERPRINT_BASE
            ;
        classes.remove(classes.size() - 1);
        return (hash<<1) + ((hash>>63)&1);
    }
 
    public void encode(DataOutput outs) throws IOException
    {
        outs.writeLong(LCM_FINGERPRINT);
        _encodeRecursive(outs);
    }
 
    public void _encodeRecursive(DataOutput outs) throws IOException
    {
        char[] __strbuf = null;
        outs.writeLong(this.utime); 
 
        outs.writeByte(this.system); 
 
        outs.writeByte(this.importance); 
 
        outs.writeByte(this.frequency); 
 
        __strbuf = new char[this.value.length()]; this.value.getChars(0, this.value.length(), __strbuf, 0); outs.writeInt(__strbuf.length+1); for (int _i = 0; _i < __strbuf.length; _i++) outs.write(__strbuf[_i]); outs.writeByte(0); 
 
    }
 
    public system_status_t(byte[] data) throws IOException
    {
        this(new LCMDataInputStream(data));
    }
 
    public system_status_t(DataInput ins) throws IOException
    {
        if (ins.readLong() != LCM_FINGERPRINT)
            throw new IOException("LCM Decode error: bad fingerprint");
 
        _decodeRecursive(ins);
    }
 
    public static bot_core.system_status_t _decodeRecursiveFactory(DataInput ins) throws IOException
    {
        bot_core.system_status_t o = new bot_core.system_status_t();
        o._decodeRecursive(ins);
        return o;
    }
 
    public void _decodeRecursive(DataInput ins) throws IOException
    {
        char[] __strbuf = null;
        this.utime = ins.readLong();
 
        this.system = ins.readByte();
 
        this.importance = ins.readByte();
 
        this.frequency = ins.readByte();
 
        __strbuf = new char[ins.readInt()-1]; for (int _i = 0; _i < __strbuf.length; _i++) __strbuf[_i] = (char) (ins.readByte()&0xff); ins.readByte(); this.value = new String(__strbuf);
 
    }
 
    public bot_core.system_status_t copy()
    {
        bot_core.system_status_t outobj = new bot_core.system_status_t();
        outobj.utime = this.utime;
 
        outobj.system = this.system;
 
        outobj.importance = this.importance;
 
        outobj.frequency = this.frequency;
 
        outobj.value = this.value;
 
        return outobj;
    }
 
}

