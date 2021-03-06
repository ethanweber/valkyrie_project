/* LCM type definition class file
 * This file was automatically generated by lcm-gen
 * DO NOT MODIFY BY HAND!!!!
 */

package bot_core;
 
import java.io.*;
import java.util.*;
import lcm.lcm.*;
 
public final class robot_urdf_t implements lcm.lcm.LCMEncodable
{
    public long utime;
    public String robot_name;
    public String urdf_xml_string;
    public byte left_hand;
    public byte right_hand;
 
    public robot_urdf_t()
    {
    }
 
    public static final long LCM_FINGERPRINT;
    public static final long LCM_FINGERPRINT_BASE = 0x0183a210f928d42bL;
 
    public static final byte LEFT_NONE = (byte) 0;
    public static final byte RIGHT_NONE = (byte) 1;
    public static final byte LEFT_SANDIA = (byte) 2;
    public static final byte RIGHT_SANDIA = (byte) 3;
    public static final byte LEFT_IROBOT = (byte) 4;
    public static final byte RIGHT_IROBOT = (byte) 5;
    public static final byte LEFT_ROBOTIQ = (byte) 6;
    public static final byte RIGHT_ROBOTIQ = (byte) 7;
    public static final byte LEFT_UNKNOWN = (byte) 8;
    public static final byte RIGHT_UNKNOWN = (byte) 9;

    static {
        LCM_FINGERPRINT = _hashRecursive(new ArrayList<Class<?>>());
    }
 
    public static long _hashRecursive(ArrayList<Class<?>> classes)
    {
        if (classes.contains(bot_core.robot_urdf_t.class))
            return 0L;
 
        classes.add(bot_core.robot_urdf_t.class);
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
 
        __strbuf = new char[this.robot_name.length()]; this.robot_name.getChars(0, this.robot_name.length(), __strbuf, 0); outs.writeInt(__strbuf.length+1); for (int _i = 0; _i < __strbuf.length; _i++) outs.write(__strbuf[_i]); outs.writeByte(0); 
 
        __strbuf = new char[this.urdf_xml_string.length()]; this.urdf_xml_string.getChars(0, this.urdf_xml_string.length(), __strbuf, 0); outs.writeInt(__strbuf.length+1); for (int _i = 0; _i < __strbuf.length; _i++) outs.write(__strbuf[_i]); outs.writeByte(0); 
 
        outs.writeByte(this.left_hand); 
 
        outs.writeByte(this.right_hand); 
 
    }
 
    public robot_urdf_t(byte[] data) throws IOException
    {
        this(new LCMDataInputStream(data));
    }
 
    public robot_urdf_t(DataInput ins) throws IOException
    {
        if (ins.readLong() != LCM_FINGERPRINT)
            throw new IOException("LCM Decode error: bad fingerprint");
 
        _decodeRecursive(ins);
    }
 
    public static bot_core.robot_urdf_t _decodeRecursiveFactory(DataInput ins) throws IOException
    {
        bot_core.robot_urdf_t o = new bot_core.robot_urdf_t();
        o._decodeRecursive(ins);
        return o;
    }
 
    public void _decodeRecursive(DataInput ins) throws IOException
    {
        char[] __strbuf = null;
        this.utime = ins.readLong();
 
        __strbuf = new char[ins.readInt()-1]; for (int _i = 0; _i < __strbuf.length; _i++) __strbuf[_i] = (char) (ins.readByte()&0xff); ins.readByte(); this.robot_name = new String(__strbuf);
 
        __strbuf = new char[ins.readInt()-1]; for (int _i = 0; _i < __strbuf.length; _i++) __strbuf[_i] = (char) (ins.readByte()&0xff); ins.readByte(); this.urdf_xml_string = new String(__strbuf);
 
        this.left_hand = ins.readByte();
 
        this.right_hand = ins.readByte();
 
    }
 
    public bot_core.robot_urdf_t copy()
    {
        bot_core.robot_urdf_t outobj = new bot_core.robot_urdf_t();
        outobj.utime = this.utime;
 
        outobj.robot_name = this.robot_name;
 
        outobj.urdf_xml_string = this.urdf_xml_string;
 
        outobj.left_hand = this.left_hand;
 
        outobj.right_hand = this.right_hand;
 
        return outobj;
    }
 
}

