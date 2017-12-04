/* LCM type definition class file
 * This file was automatically generated by lcm-gen
 * DO NOT MODIFY BY HAND!!!!
 */

package bot_core;
 
import java.io.*;
import java.util.*;
import lcm.lcm.*;
 
public final class quaternion_t implements lcm.lcm.LCMEncodable
{
    public double w;
    public double x;
    public double y;
    public double z;
 
    public quaternion_t()
    {
    }
 
    public static final long LCM_FINGERPRINT;
    public static final long LCM_FINGERPRINT_BASE = 0x9b2deea5fc88050fL;
 
    static {
        LCM_FINGERPRINT = _hashRecursive(new ArrayList<Class<?>>());
    }
 
    public static long _hashRecursive(ArrayList<Class<?>> classes)
    {
        if (classes.contains(bot_core.quaternion_t.class))
            return 0L;
 
        classes.add(bot_core.quaternion_t.class);
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
        outs.writeDouble(this.w); 
 
        outs.writeDouble(this.x); 
 
        outs.writeDouble(this.y); 
 
        outs.writeDouble(this.z); 
 
    }
 
    public quaternion_t(byte[] data) throws IOException
    {
        this(new LCMDataInputStream(data));
    }
 
    public quaternion_t(DataInput ins) throws IOException
    {
        if (ins.readLong() != LCM_FINGERPRINT)
            throw new IOException("LCM Decode error: bad fingerprint");
 
        _decodeRecursive(ins);
    }
 
    public static bot_core.quaternion_t _decodeRecursiveFactory(DataInput ins) throws IOException
    {
        bot_core.quaternion_t o = new bot_core.quaternion_t();
        o._decodeRecursive(ins);
        return o;
    }
 
    public void _decodeRecursive(DataInput ins) throws IOException
    {
        this.w = ins.readDouble();
 
        this.x = ins.readDouble();
 
        this.y = ins.readDouble();
 
        this.z = ins.readDouble();
 
    }
 
    public bot_core.quaternion_t copy()
    {
        bot_core.quaternion_t outobj = new bot_core.quaternion_t();
        outobj.w = this.w;
 
        outobj.x = this.x;
 
        outobj.y = this.y;
 
        outobj.z = this.z;
 
        return outobj;
    }
 
}

