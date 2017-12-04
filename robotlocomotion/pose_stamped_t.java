/* LCM type definition class file
 * This file was automatically generated by lcm-gen
 * DO NOT MODIFY BY HAND!!!!
 */

package robotlocomotion;
 
import java.io.*;
import java.util.*;
import lcm.lcm.*;
 
public final class pose_stamped_t implements lcm.lcm.LCMEncodable
{
    public robotlocomotion.header_t header;
    public robotlocomotion.pose_t pose;
 
    public pose_stamped_t()
    {
    }
 
    public static final long LCM_FINGERPRINT;
    public static final long LCM_FINGERPRINT_BASE = 0xe10feebec5c97663L;
 
    static {
        LCM_FINGERPRINT = _hashRecursive(new ArrayList<Class<?>>());
    }
 
    public static long _hashRecursive(ArrayList<Class<?>> classes)
    {
        if (classes.contains(robotlocomotion.pose_stamped_t.class))
            return 0L;
 
        classes.add(robotlocomotion.pose_stamped_t.class);
        long hash = LCM_FINGERPRINT_BASE
             + robotlocomotion.header_t._hashRecursive(classes)
             + robotlocomotion.pose_t._hashRecursive(classes)
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
        this.header._encodeRecursive(outs); 
 
        this.pose._encodeRecursive(outs); 
 
    }
 
    public pose_stamped_t(byte[] data) throws IOException
    {
        this(new LCMDataInputStream(data));
    }
 
    public pose_stamped_t(DataInput ins) throws IOException
    {
        if (ins.readLong() != LCM_FINGERPRINT)
            throw new IOException("LCM Decode error: bad fingerprint");
 
        _decodeRecursive(ins);
    }
 
    public static robotlocomotion.pose_stamped_t _decodeRecursiveFactory(DataInput ins) throws IOException
    {
        robotlocomotion.pose_stamped_t o = new robotlocomotion.pose_stamped_t();
        o._decodeRecursive(ins);
        return o;
    }
 
    public void _decodeRecursive(DataInput ins) throws IOException
    {
        this.header = robotlocomotion.header_t._decodeRecursiveFactory(ins);
 
        this.pose = robotlocomotion.pose_t._decodeRecursiveFactory(ins);
 
    }
 
    public robotlocomotion.pose_stamped_t copy()
    {
        robotlocomotion.pose_stamped_t outobj = new robotlocomotion.pose_stamped_t();
        outobj.header = this.header.copy();
 
        outobj.pose = this.pose.copy();
 
        return outobj;
    }
 
}
