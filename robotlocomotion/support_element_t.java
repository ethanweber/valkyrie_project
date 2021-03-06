/* LCM type definition class file
 * This file was automatically generated by lcm-gen
 * DO NOT MODIFY BY HAND!!!!
 */

package robotlocomotion;
 
import java.io.*;
import java.util.*;
import lcm.lcm.*;
 
public final class support_element_t implements lcm.lcm.LCMEncodable
{
    public long utime;
    public int num_bodies;
    public robotlocomotion.support_body_t support_bodies[];
 
    public support_element_t()
    {
    }
 
    public static final long LCM_FINGERPRINT;
    public static final long LCM_FINGERPRINT_BASE = 0x4a966f167f56cfc8L;
 
    static {
        LCM_FINGERPRINT = _hashRecursive(new ArrayList<Class<?>>());
    }
 
    public static long _hashRecursive(ArrayList<Class<?>> classes)
    {
        if (classes.contains(robotlocomotion.support_element_t.class))
            return 0L;
 
        classes.add(robotlocomotion.support_element_t.class);
        long hash = LCM_FINGERPRINT_BASE
             + robotlocomotion.support_body_t._hashRecursive(classes)
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
        outs.writeLong(this.utime); 
 
        outs.writeInt(this.num_bodies); 
 
        for (int a = 0; a < this.num_bodies; a++) {
            this.support_bodies[a]._encodeRecursive(outs); 
        }
 
    }
 
    public support_element_t(byte[] data) throws IOException
    {
        this(new LCMDataInputStream(data));
    }
 
    public support_element_t(DataInput ins) throws IOException
    {
        if (ins.readLong() != LCM_FINGERPRINT)
            throw new IOException("LCM Decode error: bad fingerprint");
 
        _decodeRecursive(ins);
    }
 
    public static robotlocomotion.support_element_t _decodeRecursiveFactory(DataInput ins) throws IOException
    {
        robotlocomotion.support_element_t o = new robotlocomotion.support_element_t();
        o._decodeRecursive(ins);
        return o;
    }
 
    public void _decodeRecursive(DataInput ins) throws IOException
    {
        this.utime = ins.readLong();
 
        this.num_bodies = ins.readInt();
 
        this.support_bodies = new robotlocomotion.support_body_t[(int) num_bodies];
        for (int a = 0; a < this.num_bodies; a++) {
            this.support_bodies[a] = robotlocomotion.support_body_t._decodeRecursiveFactory(ins);
        }
 
    }
 
    public robotlocomotion.support_element_t copy()
    {
        robotlocomotion.support_element_t outobj = new robotlocomotion.support_element_t();
        outobj.utime = this.utime;
 
        outobj.num_bodies = this.num_bodies;
 
        outobj.support_bodies = new robotlocomotion.support_body_t[(int) num_bodies];
        for (int a = 0; a < this.num_bodies; a++) {
            outobj.support_bodies[a] = this.support_bodies[a].copy();
        }
 
        return outobj;
    }
 
}

