/* LCM type definition class file
 * This file was automatically generated by lcm-gen
 * DO NOT MODIFY BY HAND!!!!
 */

package bot_core;
 
import java.io.*;
import java.util.*;
import lcm.lcm.*;
 
public final class position_3d_t implements lcm.lcm.LCMEncodable
{
    public bot_core.vector_3d_t translation;
    public bot_core.quaternion_t rotation;
 
    public position_3d_t()
    {
    }
 
    public static final long LCM_FINGERPRINT;
    public static final long LCM_FINGERPRINT_BASE = 0x1275bd1ccbdaf47fL;
 
    static {
        LCM_FINGERPRINT = _hashRecursive(new ArrayList<Class<?>>());
    }
 
    public static long _hashRecursive(ArrayList<Class<?>> classes)
    {
        if (classes.contains(bot_core.position_3d_t.class))
            return 0L;
 
        classes.add(bot_core.position_3d_t.class);
        long hash = LCM_FINGERPRINT_BASE
             + bot_core.vector_3d_t._hashRecursive(classes)
             + bot_core.quaternion_t._hashRecursive(classes)
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
        this.translation._encodeRecursive(outs); 
 
        this.rotation._encodeRecursive(outs); 
 
    }
 
    public position_3d_t(byte[] data) throws IOException
    {
        this(new LCMDataInputStream(data));
    }
 
    public position_3d_t(DataInput ins) throws IOException
    {
        if (ins.readLong() != LCM_FINGERPRINT)
            throw new IOException("LCM Decode error: bad fingerprint");
 
        _decodeRecursive(ins);
    }
 
    public static bot_core.position_3d_t _decodeRecursiveFactory(DataInput ins) throws IOException
    {
        bot_core.position_3d_t o = new bot_core.position_3d_t();
        o._decodeRecursive(ins);
        return o;
    }
 
    public void _decodeRecursive(DataInput ins) throws IOException
    {
        this.translation = bot_core.vector_3d_t._decodeRecursiveFactory(ins);
 
        this.rotation = bot_core.quaternion_t._decodeRecursiveFactory(ins);
 
    }
 
    public bot_core.position_3d_t copy()
    {
        bot_core.position_3d_t outobj = new bot_core.position_3d_t();
        outobj.translation = this.translation.copy();
 
        outobj.rotation = this.rotation.copy();
 
        return outobj;
    }
 
}

