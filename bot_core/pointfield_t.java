/* LCM type definition class file
 * This file was automatically generated by lcm-gen
 * DO NOT MODIFY BY HAND!!!!
 */

package bot_core;
 
import java.io.*;
import java.util.*;
import lcm.lcm.*;
 
public final class pointfield_t implements lcm.lcm.LCMEncodable
{
    public String name;
    public int offset;
    public byte datatype;
    public int count;
 
    public pointfield_t()
    {
    }
 
    public static final long LCM_FINGERPRINT;
    public static final long LCM_FINGERPRINT_BASE = 0xd92708412f05a3b6L;
 
    public static final byte INT8 = (byte) 1;
    public static final byte UINT8 = (byte) 2;
    public static final byte INT16 = (byte) 3;
    public static final byte UINT16 = (byte) 4;
    public static final byte INT32 = (byte) 5;
    public static final byte UINT32 = (byte) 6;
    public static final byte FLOAT32 = (byte) 7;
    public static final byte FLOAT64 = (byte) 8;

    static {
        LCM_FINGERPRINT = _hashRecursive(new ArrayList<Class<?>>());
    }
 
    public static long _hashRecursive(ArrayList<Class<?>> classes)
    {
        if (classes.contains(bot_core.pointfield_t.class))
            return 0L;
 
        classes.add(bot_core.pointfield_t.class);
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
        __strbuf = new char[this.name.length()]; this.name.getChars(0, this.name.length(), __strbuf, 0); outs.writeInt(__strbuf.length+1); for (int _i = 0; _i < __strbuf.length; _i++) outs.write(__strbuf[_i]); outs.writeByte(0); 
 
        outs.writeInt(this.offset); 
 
        outs.writeByte(this.datatype); 
 
        outs.writeInt(this.count); 
 
    }
 
    public pointfield_t(byte[] data) throws IOException
    {
        this(new LCMDataInputStream(data));
    }
 
    public pointfield_t(DataInput ins) throws IOException
    {
        if (ins.readLong() != LCM_FINGERPRINT)
            throw new IOException("LCM Decode error: bad fingerprint");
 
        _decodeRecursive(ins);
    }
 
    public static bot_core.pointfield_t _decodeRecursiveFactory(DataInput ins) throws IOException
    {
        bot_core.pointfield_t o = new bot_core.pointfield_t();
        o._decodeRecursive(ins);
        return o;
    }
 
    public void _decodeRecursive(DataInput ins) throws IOException
    {
        char[] __strbuf = null;
        __strbuf = new char[ins.readInt()-1]; for (int _i = 0; _i < __strbuf.length; _i++) __strbuf[_i] = (char) (ins.readByte()&0xff); ins.readByte(); this.name = new String(__strbuf);
 
        this.offset = ins.readInt();
 
        this.datatype = ins.readByte();
 
        this.count = ins.readInt();
 
    }
 
    public bot_core.pointfield_t copy()
    {
        bot_core.pointfield_t outobj = new bot_core.pointfield_t();
        outobj.name = this.name;
 
        outobj.offset = this.offset;
 
        outobj.datatype = this.datatype;
 
        outobj.count = this.count;
 
        return outobj;
    }
 
}
