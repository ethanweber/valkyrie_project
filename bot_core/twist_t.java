/* LCM type definition class file
 * This file was automatically generated by lcm-gen
 * DO NOT MODIFY BY HAND!!!!
 */

package bot_core;
 
import java.io.*;
import java.util.*;
import lcm.lcm.*;
 
public final class twist_t implements lcm.lcm.LCMEncodable
{
    public bot_core.vector_3d_t linear_velocity;
    public bot_core.vector_3d_t angular_velocity;
 
    public twist_t()
    {
    }
 
    public static final long LCM_FINGERPRINT;
    public static final long LCM_FINGERPRINT_BASE = 0x558634eaba4f1769L;
 
    static {
        LCM_FINGERPRINT = _hashRecursive(new ArrayList<Class<?>>());
    }
 
    public static long _hashRecursive(ArrayList<Class<?>> classes)
    {
        if (classes.contains(bot_core.twist_t.class))
            return 0L;
 
        classes.add(bot_core.twist_t.class);
        long hash = LCM_FINGERPRINT_BASE
             + bot_core.vector_3d_t._hashRecursive(classes)
             + bot_core.vector_3d_t._hashRecursive(classes)
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
        this.linear_velocity._encodeRecursive(outs); 
 
        this.angular_velocity._encodeRecursive(outs); 
 
    }
 
    public twist_t(byte[] data) throws IOException
    {
        this(new LCMDataInputStream(data));
    }
 
    public twist_t(DataInput ins) throws IOException
    {
        if (ins.readLong() != LCM_FINGERPRINT)
            throw new IOException("LCM Decode error: bad fingerprint");
 
        _decodeRecursive(ins);
    }
 
    public static bot_core.twist_t _decodeRecursiveFactory(DataInput ins) throws IOException
    {
        bot_core.twist_t o = new bot_core.twist_t();
        o._decodeRecursive(ins);
        return o;
    }
 
    public void _decodeRecursive(DataInput ins) throws IOException
    {
        this.linear_velocity = bot_core.vector_3d_t._decodeRecursiveFactory(ins);
 
        this.angular_velocity = bot_core.vector_3d_t._decodeRecursiveFactory(ins);
 
    }
 
    public bot_core.twist_t copy()
    {
        bot_core.twist_t outobj = new bot_core.twist_t();
        outobj.linear_velocity = this.linear_velocity.copy();
 
        outobj.angular_velocity = this.angular_velocity.copy();
 
        return outobj;
    }
 
}
